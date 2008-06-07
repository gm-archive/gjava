/*
 * PlatformCore.java
 */

package org.gcreator.plugins;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.gcreator.core.gcreator;
import org.gcreator.fileclass.Folder;
import org.gcreator.fileclass.GFile;
import org.gcreator.fileclass.Project;
import org.gcreator.fileclass.res.Actor;
import org.gcreator.fileclass.res.GImage;
import org.gcreator.fileclass.res.Scene;
import org.gcreator.fileclass.res.Sprite;
import org.gcreator.plugins.platform.gscriptLexer;
import org.gcreator.plugins.platform.gscriptParser;

/**
 * The main PlaformCore class, all converters should extend this class!
 * @author TGMG
 */
public class PlatformCore extends PluginCore {

    public Progress p;// = new Progress(gcreator.window,false);
    public static String returncode = "";
    int usingwith = 0;
    Vector localVariables  = new Vector(1);
    Vector fieldVariables  = new Vector(1);
    Vector globalVariables = new Vector(1);
    Vector<String> with = new Vector<String>(1);
    public String current="",event="";
    public String updateURL="";//,compilername="";
    public double version = 1.0;
    
    public void update(){
        String nextLine;
       URL url = null;
       URLConnection urlConn = null;
       InputStreamReader  inStream = null;
       BufferedReader buff = null;
       try{
          // Create the URL obect that points
          // at the default file index.html
          url  = new URL(updateURL );
          urlConn = url.openConnection();
         inStream = new InputStreamReader( 
                           urlConn.getInputStream());
           buff= new BufferedReader(inStream);
        
       // Read and print the lines from index.html
        while (true){
            nextLine =buff.readLine();  
            if (nextLine !=null){
                String v="";
                if (nextLine.contains("<version>"))
                {
                    v = nextLine.replaceAll("<version>", "").replaceAll("</version>", "");
                    double d = Double.parseDouble(v);
                    //check if it is a new version
                if (d>version) {
                //JOptionPane.showMessageDialog(gcreator.window, "A New version is available. Latest version is "+version+". Download it from http://www.g-creator.org"); //will make multilingual when message finalized
                int update = JOptionPane.showConfirmDialog(null, getPluginName()+" update is available. Are you sure you want to update "+ getPluginName());
        if (update == JOptionPane.NO_OPTION || update == JOptionPane.CANCEL_OPTION) {
                                return;
                            }
                }
                else {
                            return;
                        }
                }
                if (nextLine.contains("<zip>")){
                    //download and unzip the zip
                    v = nextLine.replaceAll("<zip>", "").replaceAll("</zip>", "");
                    download(v,"plugins" + File.separator + getPluginName() +".zip");
                    unzip("plugins" + File.separator + getPluginName() +".zip");
                    System.out.println("unzipped");
                    JOptionPane.showMessageDialog(gcreator.window, "Finished updating "+ getPluginName()); //will make multilingual when message finalized

                }
                org.gcreator.core.utilities.addStringMessage(nextLine);
               // System.out.println(nextLine); 
            } else{
               break;
            } 
        }
     } catch(MalformedURLException e){
       System.out.println("Please check the URL:" + 
                                           e.toString() );
     } catch(IOException  e1){
      System.out.println("Can't read  from the Internet: "+ 
                                          e1.toString() ); 
  }
    }
    
    public void unzip(String zipfile)
    {
        try {
            ZipFile zipFile = new ZipFile(zipfile);
            for (Enumeration entries = zipFile.entries(); entries.hasMoreElements();) {
                ZipEntry entry = (ZipEntry) entries.nextElement();
                if (entry.isDirectory()) {
                    //System.out.println("Folder:" + entry.getName());
                    (new File("plugins"+File.separator+entry.getName())).mkdirs();
                } else {
                    //System.out.println("File:" + entry.getName());
                    copyInputStream(zipFile.getInputStream(entry), new BufferedOutputStream(new FileOutputStream("plugins"+File.separator+entry.getName())));
                }
            }
            zipFile.close();
        } catch (IOException ioe) {
        
            ioe.printStackTrace();

        }
    }
    
    public static final void copyInputStream(InputStream in, OutputStream out)
            throws IOException {
        byte buffer[] = new byte[1024];
        int len;
        while ((len = in.read(buffer)) >= 0) {
            out.write(buffer, 0, len);
        }
        in.close();
        out.close();
    }
    
       public void download(String address, String localFileName) {
        try {
            OutputStream out = null;
            InputStream in = null;
            URLConnection conn = null;

            URL url = new URL(address);
            out = new BufferedOutputStream(new FileOutputStream(localFileName));
            conn = url.openConnection();
            in = conn.getInputStream();
            byte[] buffer = new byte[1024];
            int numRead;
            int numWritten;
            for (numWritten = 0; (numRead = in.read(buffer)) != -1; numWritten += numRead) {
                out.write(buffer, 0, numRead);
            }
            
            
            //System.out.println((new StringBuilder()).append(localFileName).append(" loaded...(").append(numWritten).append(" bytes)").toString());
            System.out.println("Downloaded zip");
            {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            }
        } catch (Exception ex) {
            
            System.out.println("" + ex.getLocalizedMessage());
        }

    }

       
    public void putFolder(Folder folder) {
        org.gcreator.fileclass.GObject childNode;

        for (int i = 0; i < folder.getChildArrayNum(); i++) {
            if ((childNode = folder.childAt(i)) != null) {
                if (childNode instanceof org.gcreator.fileclass.GFile) {
                    try {
                        System.out.println(""+((org.gcreator.fileclass.GFile) childNode).type);
                        
                        if (((org.gcreator.fileclass.GFile) childNode).type.equals("settings")) {
                            parseSettings((String) ((org.gcreator.fileclass.GFile) childNode).value,((org.gcreator.fileclass.GFile) childNode).name);
                        }
                        
                        if (((org.gcreator.fileclass.GFile) childNode).type.equals("sprite")) {
                            p.jProgressBar1.setValue(20);
                            p.jLabel2.setText("Task: Converting sprite:"+((org.gcreator.fileclass.GFile) childNode).name);
                            current="Sprite: "+((GFile) childNode).name;
                            p.repaint();
                            parseSprite((Sprite) ((GFile) childNode).value, (GFile) childNode);
                        } else if (((GFile) childNode).type.equals("actor")) {
                            current="Actor: "+((GFile) childNode).name;
                            parseActor((Actor) ((GFile) childNode).value, (GFile) childNode);
                            //p.jProgressBar1.setValue(50);
                            p.jLabel2.setText("Task: Converting actor:"+((GFile) childNode).name);
                            
                            p.repaint();
                        } else if (((org.gcreator.fileclass.GFile) childNode).type.equals("scene")) {
                            p.jProgressBar1.setValue(80);
                            p.jLabel2.setText("Task: Converting scene:"+((GFile) childNode).name);
                            current="Scene: "+((GFile) childNode).name;
                            parseScene((Scene) ((GFile) childNode).value, (GFile) childNode);
                            p.repaint();
                        } else if (((GFile) childNode).type.equals("jpg")) {
                            p.jProgressBar1.setValue(10);
                            p.jLabel2.setText("Task: Converting image:"+((GFile) childNode).name);
                            parseImage((GImage) ((org.gcreator.fileclass.GFile) childNode).value, (org.gcreator.fileclass.GFile) childNode);
                        } else if (((org.gcreator.fileclass.GFile) childNode).type.equals("png")) {
                            p.jProgressBar1.setValue(10);
                            p.jLabel2.setText("Task: Converting image:"+((GFile) childNode).name);
                            parseImage((GImage) ((org.gcreator.fileclass.GFile) childNode).value, (org.gcreator.fileclass.GFile) childNode);
                        } else if (((org.gcreator.fileclass.GFile) childNode).type.equals("gif")) {
                            parseImage((GImage) ((org.gcreator.fileclass.GFile) childNode).value, (org.gcreator.fileclass.GFile) childNode);
                            p.jProgressBar1.setValue(10);
                            p.jLabel2.setText("Task: Converting image:"+((org.gcreator.fileclass.GFile) childNode).name);
                        } else if (((org.gcreator.fileclass.GFile) childNode).type.equals("gs")) {
                            current="Script: "+((org.gcreator.fileclass.GFile) childNode).name;
                            p.jProgressBar1.setValue(40);
                            p.jLabel2.setText("Task: Converting scripts:"+((org.gcreator.fileclass.GFile) childNode).name);
                            System.out.println("parsing script!");
                            parseScript((String) ((org.gcreator.fileclass.GFile) childNode).value,((org.gcreator.fileclass.GFile) childNode).name);
                       } else if (((org.gcreator.fileclass.GFile) childNode).type.equals("settings")) {
                            parseSettings((String) ((org.gcreator.fileclass.GFile) childNode).value,((org.gcreator.fileclass.GFile) childNode).name);
                        } else {
                            PluginHelper.println("Invalid type:" + ((org.gcreator.fileclass.GFile) childNode).type);
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                } else if (childNode instanceof org.gcreator.fileclass.Folder) {
                    putFolder((Folder) childNode);
                }
            }
        }
//p.setVisible(false);
    }
    
    public static void recursivelyDeleteDirectory(File dir) throws IOException {	       
  if ((dir == null) || !dir.isDirectory()) {
            throw new IllegalArgumentException(dir + " not a directory");
        }	  	      
  final File[] files = dir.listFiles();
  final int size = files.length; 
  for (int i = 0; i < size; i++) {
    if(files[i].isDirectory()) {
      recursivelyDeleteDirectory(files[i]);
    } else {
                files[i].delete();
            }	    
  }	     
  dir.delete();
}
    
    public boolean checkvariable(String name)
    {
        return false;
       
    }
    
    public boolean checkfunction(String name)
    {
        return true;
    }

    /**
     * @param s 
     * @param f 
     * @deprecated*/
    public void parseSprite(Sprite s, GFile f) {
        //System.out.println("" + s.name);
        parseSprite(s);
    }
    
    /**
     * @param s 
     * @deprecated*/
    public void parseSprite(Sprite s){
        
    }
    /**
     * @param i 
     * @param f 
     * @deprecated*/
    public void parseImage(ImageIcon i, GFile f) {
        System.out.println("called wrong method!");
    }
    /**
     * @param i 
     * @param f
     * @deprecated*/
    public void parseImage(GImage i, GFile f){
        parseImage(i.getImage(), f);
    }

    /**
     * @param a 
     * @throws java.io.IOException 
     * @deprecated*/
    public void parseActor(Actor a) throws IOException {
    }
    /**
     * @param a 
     * @param f 
     * @throws java.io.IOException
     * @deprecated*/
    public void parseActor(Actor a, GFile f) throws IOException {
        parseActor(a);
    }

    /**
     * @param s 
     * @throws java.io.IOException 
     * @deprecated*/
    public void parseScene(Scene s) throws IOException {
    }
    /**
     * @param s 
     * @param f 
     * @throws java.io.IOException 
     * @deprecated*/
    public void parseScene(Scene s, GFile f) throws IOException {
        parseScene(s);
    }
    /**
     * @param s 
     * @param name
     * @throws java.io.IOException 
     * @deprecated*/
    public void parseClass(String s,String name) throws IOException {
    System.out.println("called wrong method!");
    }
    
    

    /**
     * Varstatement called when a varstatement is parsed, returns the language code
     * @param type - type of variable
     * @param vars
     * @return the language code for this statement
     */
    public String varstatement(String type, String vars) {
        //System.out.println("Var statement: " + type + vars);
        if (type.equals("var")) {
            type = "Object";
        } else if (type.equals("globalvar")) {
            type = "Object";
        }
        return "/*var statement*/{"+vars+"}";//type + " "+vars;
    }

    /*
     * Currently unused, don't bother with it
     */
    public String fieldstatement(String m, String varstatement) {
        return m+" "+varstatement+";";
    }

    /**
     * Replace this with return statement, converts:
     * return value;
     * @param exp - the value to return
     * @return
     */
    public String returnstatement(String exp) {
        return "return " + exp + ";";
    }

    /**
     * Replace this with exist statment, converts:
     * exit;
     * @return
     */
    public String exitstatement() {
        return "return null;";
    }

    /**
     * Replace with if statement
     * @param exp - the expression to decide wither it is true or false
     * @param statement 
     * @param elses 
     * @return A String
     */
    public String ifstatement(String exp, String statement, String elses) {
        return "if (" + exp + ".getBoolean()) \n" + statement + " \n " + elses;
    }

    /**
     * else statement
     * @param statement - statement to run if else is called
     * @return
     */
    public String elsestatement(String statement) {
        return " else " + statement;
    }
    
    /**
     * block statement { }
     * @param st - statement inside block
     * @return
     */
    public String bstatement(String st) {
        return "{ \n"+st+"\n }";
    }

    /**
     * Expression
     * @param ex - the expression
     * @return
     */
    public String expression(String ex) {
       // System.out.println("Expression:"+ex);
        return ex;
    }
    
    /**
     * Not expression
     * @param exp - the expression that should not be true
     * @return
     */
    public String notexpression(String exp) {
        return " ("+exp+").not()";
    }
    
    /**
     * Expression inside parenthesis
     * @param exp
     * @return
     */
    public String pexpression(String exp) {
        return " ("+exp+")";
    }
    
    /**
     * And expression
     * @return
     */
    public String andexpression() {
        return " .and ";
    }
    
    /**
     * Or expression
     * @return
     */
    public String orexpression() {
        return " .or ";
    }
    
    /**
     * xor expression
     * @return
     */
    public String xorexpression() {
        return " .xor ";
    }
    
    /**
     * repeat statement
     * @param ex
     * @param st
     * @return
     */
    public String repeatstatement(String ex, String st) {
        return "G_CREATOR__repeat=new Double(0); \n while(G_CREATOR__repeat.lt("+ex+").getBoolean()){\n"+st+" G_CREATOR__repeat.add(new Integer(1));}"; 
    }
    
    /**
     * Break statement
     * @return
     */
    public String breakstatement() {
        return "break;";
    }
    
    /**
     * Contine statement
     * @return
     */
    public String continuestatement() {
        return "continue;";
    }
    
    /**
     * Do statement
     * @param statement - statement to do in loop
     * @param expression - expression to check loop
     * @return
     */
    public String dostatement(String statement, String expression) {
        return "do "+statement+"while("+expression+".getBoolean());"; //todo
    }
    
    /**
     * While statement
     * @param exp
     * @param st
     * @return
     */
    public String whilestatement(String exp, String st) {
        return "while ("+exp + ".getBoolean()) "+ st;
    }
    
    /**
     * For statement
     * @param statement1 - variable to set initital value
     * @param exp - expression to check for loop
     * @param statement2 - statement to add one to variable
     * @param statements - statements inside for loop
     * @return
     */
    public String forstatement(String statement1, String exp, String statement2, String statements) {
        //System.out.println(statement2.substring(statement2.length()-1,statement2.length()));
        if ((statement2.substring(statement2.length()-1,statement2.length())).equals(";")) {
            statement2 = statement2.substring(0, statement2.length() - 1);
        }
        return "for (Object "+statement1+exp+".getBoolean(); "+statement2+") "+statements;
    }
    
    /**
     * Not done yet so don't use
     * @return
     */
    public String switchstatement() {
        return ""; //TODO
    }    
    
    /**
     * not finished yet
     * @param exp - The actor to use in with statement
     * @param statement - statements inside with statement
     * @return
     */
    public String withstatement(String exp, String statement) {
        usingwith++;
        with.add(exp);
        return "\n{\n" + statement+"\n}\n";
    }    
    
    /**
     * Assignment statement
     * @param variable - variable to set value of
     * @param operator - operator (+,-)
     * @param expression - value to set variable
     * @return
     */
    public String assignmentstatement(String variable, String operator, String expression) {
        //System.out.println("assignment:"+expression);
        
        String instance="",value="";
        String tempvar=variable;
        
        if(variable.contains("all.")) {
            instance = "(new All())";
        } else if(variable.contains("other.")) {
            instance = "other";
        } else if(variable.contains("noone.")) {
            instance = "(new Object())";
        } else if(variable.contains("self.")) {
            instance = "self";
        } else if(variable.contains("global.")) {
            instance = "Global";
        } else if(variable.contains("(")) {
            instance = "(new All" + variable.substring(0, variable.indexOf(".") - 1) + "))";
        } else if(variable.contains(".")){
            instance="(new All("+variable.substring(0,variable.indexOf(".")-1)+"))";
            tempvar = variable.substring(0,variable.indexOf(".")-1);
        } else {
            instance = "self";
        }
        
        //if (actorlocal.contains(","+tempvar+",")){
        if (checkvariable(tempvar)){
            String var=(""+variable.charAt(0)).toUpperCase()+variable.substring(1, variable.length());
       
            value=instance+".set"+var+"(";

            if (operator.equals("=")) {
                value += expression;
            } else if (operator.equals(":=")) {
                value += expression;
            } else if (operator.equals("+=")) {
                value += instance + ".get" + var + "().setadd(" + expression + ")";
            } else if (operator.equals("*=")) {
                value += instance + ".get" + var + "().setmult(" + expression + ")";
            } else if (operator.equals("-=")) {
                value += instance + ".get" + var + "().setsub(" + expression + ")";
            } else if (operator.equals("/=")) {
                value += instance + ".get" + var + "().setdiv(" + expression + ")";
            } else if (operator.equals("&=")) {
                value += instance + ".get" + var + "().setband(" + expression + ")";
            } else if (operator.equals("|=")) {
                value += instance + ".get" + var + "().setbor(" + expression + ")";
            } else if (operator.equals("^=")) {
                value += instance + ".get" + var + "().setbxor(" + expression + ")";
            }
        return value+")";
        }
        
        variable = variable.substring(variable.indexOf(".")+1,variable.length());
           value = instance+".setVariable(\""+variable+"\"," ;
        
        if (operator.equals("=")) {
            value += expression;
        } else if (operator.equals(":=")) {
            value += expression;
        } else if (operator.equals("+=")) {
            value += instance + ".getVariable(\"" + variable + "\").setadd(" + expression + ")";
        } else if (operator.equals("*=")) {
            value += instance + ".getVariable(\"" + variable + "\").setmult(" + expression + ")";
        } else if (operator.equals("-=")) {
            value += instance + ".getVariable(\"" + variable + "\").setsub(" + expression + ")";
        } else if (operator.equals("/=")) {
            value += instance + ".getVariable(\"" + variable + "\").setdiv(" + expression + ")";
        }
        else if (operator.equals("&=")) {
            value += instance + ".getVariable(\"" + variable + "\").setband(" + expression + ")";
        } else if (operator.equals("|=")) {
            value += instance + ".getVariable(\"" + variable + "\").setbor(" + expression + ")";
        }
        else if (operator.equals("^=")) {
            value += instance + ".getVariable(\"" + variable + "\").setbxor(" + expression + ")";
        }
        return value+")";
    }
    
    /**
     * Function statement
     * @param name - name of function
     * @param parameters - paramters of function
     * @return
     */
    public String functionstatement(String name, String parameters) {
        if (parameters == null) {
            parameters = "";
        }
        if (!checkfunction(name)){
            this.showError("No function named: "+name+"("+parameters+")");
            return name+ "("+parameters+")";
        }
        return name+ "("+parameters+")";
    }
    
    /**
     * Parses scripts
     * @param code
     * @param name
     */
    public void parseScript(String code,String name)
    {
     //parses scripts   
    }
    
    /**
     * ignore this for now
     * @param name
     * @param parameters
     * @return
     */
    public String otherclassfunctionstatement(String name, String parameters) {
        return name+ "("+parameters+")";
    }

    /**
     * Nor compeltely working, array statement
     * @param name - name of array
     * @param exp - number of array element
     * @return
     */
    public String array(String name, String exp) {
        return name + "[" + exp + "]";
    }
    
    /**
     * IGNORE
     * @param m
     * @param retvalue
     * @param name
     * @param st
     * @param args
     * @return
     */
    public String methodstatement(String m, String retvalue, String name, String st, String args) {
        return m+ " " + retvalue + " "+ name + " ("+ args + ") " + st; 
    } 
    
    /**
     * Variable, converts "" to (new String("")) etc
     * @param variable
     * @return
     */
    public String variable(String variable)
    {
        String instance="",value="";
        
        ///////////////////////////////////////////
        /// Constants
        ///////////////////////////////////////////
        if (variable.equals("true")) {
            return "(new Boolean(true))";
        }
        else if (variable.equals("false")) {
            return "(new Boolean(false))";
        }
        else if (variable.equals("pi")) {
            return "(new Double(false))";
        }
        
        if(variable.contains("all.")) {
            instance = "(new All())";
        }
        else if(variable.contains("other.")) {
            instance = "other";
        }
        else if(variable.contains("noone.")) {
            instance = "(new Object())";
        }
        else if(variable.contains("self.")) {
            instance = "self";
        }
        else if(variable.contains("global.")) {
            instance = "Global";
        }
        else if(variable.contains(".")) {
            instance = "(new All(new " + variable + "()))";
        }
        else if(variable.contains("(")) {
            instance = "()";
        }
        else {
            instance = "self";
        }
        
//        if (actorlocal.contains(","+variable+","))
        if (checkvariable(variable)) {
            return instance + ".get" + ("" + variable.charAt(0)).toUpperCase() + variable.substring(1, variable.length()) + "()";
        }
        variable = variable.substring(variable.indexOf(".")+1,variable.length());
        
        value=instance+".getVariable(\""+variable+"\")";
        return value;
    }
    
    /**
     * Assignment expression, e.g 3+4*8
     * For c++ change the '.' to '->'
     * @param operator
     * @param expression
     * @return
     */
    public String aexpression(String operator, String expression)
    {
        //System.out.println("aexpression: "+operator+" "+expression);
        if (operator.equals("+")) {
            return ".add(" + expression + ")";
        }
        else if (operator.equals("-")) {
            return ".sub(" + expression + ")";
        }
        else if (operator.equals("*")) {
            return ".mult(" + expression + ")";
        }
        else if (operator.equals("/")) {
            return ".div(" + expression + ")";
        }
        else if (operator.equals("|")) {
            return ".bor(" + expression + ")";
        }
        else if (operator.equals("&")) {
            return ".band(" + expression + ")";
        }
        else if (operator.equals("^")) {
            return ".bxor(" + expression + ")";
        }
        else if (operator.equals(">>")) {
            return ".bright(" + expression + ")";
        }
        else if (operator.equals("<<")) {
            return ".bleft(" + expression + ")";
        }
        else if (operator.equals("div")) {
            return ".div(" + expression + ")";
        }
        else if (operator.equals("mod")) {
            return ".mod(" + expression + ")";
        }
        return "aexpression";
    }
    
    /**
     * relationalExpression - checks if true or false
     * @param name - name of first expression/variable
     * @param operator - == != > < etc
     * @param name2 - name of second expression/variable
     * @return
     */
    public String relationalExpression(String name, String operator, String name2)
    {
       // System.out.println("relationalExpression:"+name+" "+operator+" "+name2);
        if (operator.equals("==")) {
            return name + ".equals(" + name2 + ")";
        }
        else if (operator.equals("=")) {
            return name + ".equals(" + name2 + ")";
        }
        else if (operator.equals(":=")) {
            return name + ".equals(" + name2 + ")";
        }
        else if (operator.equals("!=")) {
            return name + ".notequals(" + name2 + ")";
        }
        else if (operator.equals(">")) {
            return name + ".gt(" + name2 + ")";
        }
        else if (operator.equals(">=")) {
            return name + ".gte(" + name2 + ")";
        }
        else if (operator.equals("<")) {
            return name + ".lt(" + name2 + ")";
        }
        else if (operator.equals("<=")) {
            return name + ".lte(" + name2 + ")";
        }
        else {
            return name;
        }
    }
    
    /**
     * Shows syntax error to user.
     * @param msg
     */
    public void showError(String msg)
    {
        JOptionPane.showMessageDialog(null, "Syntax Error while parsing "+current+":"+event+"\n"+msg+"");
    }

    /**
     * Parses code, you don't need to override this.
     * @param code
     * @param p
     * @return
     * @throws java.io.IOException
     */
    public String parseGCL(String code, PlatformCore p) throws IOException {
        //change code simply for testing
        gscriptParser parser;
        gscriptLexer lex = null;

        //code = "int i; int ii; int iii; { me = 3; if (5==2) {}} /* hey */  return 8;";
        System.out.println("CODE:"+code);
        FileWriter ftempcode = new FileWriter("tempcode.gcl");
        BufferedWriter tempcode = new BufferedWriter(ftempcode);
        tempcode.write(code);
        tempcode.close();
        //System.out.println("test");
        lex = new gscriptLexer(new ANTLRFileStream(new File("tempcode.gcl").getAbsolutePath()));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        try {
        parser = new gscriptParser(tokens);
        //parser.DEFAULT_TOKEN_CHANNEL=80;
        
        parser.setPlatform(p);
        
        
            parser.code();
            
            System.out.println("Finished! Code output:"+returncode);
        } catch (Exception e) {
            System.out.println("Error with parser:"+e + e.getLocalizedMessage() + " " + e.getMessage());
        }
        return returncode;
    }
    
    /**
     * Ignore this, unused fo now
     * @param code
     * @param p
     * @return
     * @throws java.io.IOException
     */
    public static String parseGCLClass(String code, PlatformCore p) throws IOException {
        //change code simply for testing
        gscriptParser parser;
        gscriptLexer lex = null;

        //code = "int i; int ii; int iii; { me = 3; if (5==2) {}} /* hey */  return 8;";

        FileWriter ftempcode = new FileWriter("tempcode.gcl");
        BufferedWriter tempcode = new BufferedWriter(ftempcode);
        tempcode.write(code);
        tempcode.close();
        System.out.println("test");
        lex = new gscriptLexer(new ANTLRFileStream(new File("tempcode.gcl").getAbsolutePath()));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        parser = new gscriptParser(tokens);
        parser.setPlatform(p);
        try {
            parser.classes();
            System.out.println("Finished! Code output:"+returncode);
        } catch (Exception e) {
            System.out.println("Error:" + e.getLocalizedMessage() + " " + e.getMessage());
        }
        return "";
    }
    
    /**
     * Start progress bar, under development
     */
    public void startprogress()
    { 
        p = new Progress(gcreator.window,false, this);
        p.repaint();
        p.run(this);
        //p.setVisible(true);
    }

    public void run(Project project) {
        
        if (project != null) {
           // p.setVisible(true);
            putFolder(project);
            //p.setVisible(false);
        }
    }

    // Print a line to the bufferedwriter
    public static void print(BufferedWriter file, String printString) throws IOException {
        file.write(printString);
        file.newLine();
    }

    public static String[] environmentVars() {
        Map variables = System.getenv();
        Set variableNames = variables.keySet();
        Iterator nameIterator = variableNames.iterator();

        String[] v = new String[variableNames.size()];
        for (int index = 0; index < variableNames.size(); index++) {
            String name = (String) nameIterator.next();
            String value = (String) variables.get(name);
            v[index] = name + "=" + value;
        }
        return v;
    }
    
    public static void openbrowser(String location) {
        if (System.getProperty("os.name").indexOf("Windows") == 0) {
            try {
                Runtime.getRuntime().exec("explorer.exe \"" + location + "\"");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try{
                System.out.println("nautilus"  + location);
                Runtime.getRuntime().exec("nautilus " + location, environmentVars(), null); //GNOME
            }
            catch(Exception e){
            }
            // Unsupported OS for opening the browser
        }
    }

    public void copyDirectory(File srcDir, File dstDir) throws IOException {
        if (srcDir.isDirectory()) {
            if (!dstDir.exists()) {
                dstDir.mkdir();
            }

            String[] children = srcDir.list();
            for (int i = 0; i < children.length; i++) {
                copyDirectory(new File(srcDir, children[i]), new File(dstDir, children[i]));
            }
        } else {
            copyFile(srcDir, dstDir);
        }
    }

    // Copies src file to dst file.
    // If the dst file does not exist, it is created
    void copyFile(File src, File dst) throws IOException {
        InputStream in = new FileInputStream(src);
        OutputStream out = new FileOutputStream(dst);

        // Transfer bytes from in to out
        byte[] buf = new byte[1024];
        int len;
        while ((len = in.read(buf)) > 0) {
            out.write(buf, 0, len);
        }
        in.close();
        out.close();
    }

    /**
     * parses the settings
     * @param string
     * @param name
     */
    public void parseSettings(String string, String name) {
  //      System.out.println(string+"got here");
        
    }
}
