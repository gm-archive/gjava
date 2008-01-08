/*
 * PlatformCore.java
 */

package org.gcreator.plugins;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import javax.swing.ImageIcon;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.gcreator.fileclass.Folder;
import org.gcreator.fileclass.Project;
import org.gcreator.fileclass.res.Actor;
import org.gcreator.fileclass.res.Scene;
import org.gcreator.fileclass.res.Sprite;
import org.gcreator.plugins.platform.gscriptLexer;
import org.gcreator.plugins.platform.gscriptParser;

/**
 * The main PlaformCore class, all converters should extend this class!
 * @author TGMG
 */
public class PlatformCore extends PluginCore {

    public static String returncode = "";
    int usingwith = 0;
    Vector localVariables = new Vector(1),fieldVariables= new Vector(1),globalVariables= new Vector(1),with = new Vector(1);

    public void putFolder(Folder folder) {
        org.gcreator.fileclass.Object childNode;


        for (int i = 0; i < folder.getChildArrayNum(); i++) {
            if ((childNode = folder.childAt(i)) != null) {
                if (childNode instanceof org.gcreator.fileclass.File) {
                    try {
                        System.out.println(""+((org.gcreator.fileclass.File) childNode).type);
                        
                        if (((org.gcreator.fileclass.File) childNode).type.equals("settings")) {
                            parseSettings((String) ((org.gcreator.fileclass.File) childNode).value,((org.gcreator.fileclass.File) childNode).name);
                        }
                        
                        if (((org.gcreator.fileclass.File) childNode).type.equals("sprite")) {
                            parseSprite((Sprite) ((org.gcreator.fileclass.File) childNode).value);
                        } else if (((org.gcreator.fileclass.File) childNode).type.equals("actor")) {
                            parseActor((Actor) ((org.gcreator.fileclass.File) childNode).value);
                        } else if (((org.gcreator.fileclass.File) childNode).type.equals("scene")) {
                            parseScene((Scene) ((org.gcreator.fileclass.File) childNode).value);
                        } else if (((org.gcreator.fileclass.File) childNode).type.equals("jpg")) {
                            parseImage((ImageIcon) ((org.gcreator.fileclass.File) childNode).value, (org.gcreator.fileclass.File) childNode);
                        } else if (((org.gcreator.fileclass.File) childNode).type.equals("png")) {
                            parseImage((ImageIcon) ((org.gcreator.fileclass.File) childNode).value, (org.gcreator.fileclass.File) childNode);
                        } else if (((org.gcreator.fileclass.File) childNode).type.equals("gif")) {
                            parseImage((ImageIcon) ((org.gcreator.fileclass.File) childNode).value, (org.gcreator.fileclass.File) childNode);
                        } else if (((org.gcreator.fileclass.File) childNode).type.equals("egml")) {
                            parseClass((String) ((org.gcreator.fileclass.File) childNode).value,((org.gcreator.fileclass.File) childNode).name);
                       } else if (((org.gcreator.fileclass.File) childNode).type.equals("settings")) {
                            parseSettings((String) ((org.gcreator.fileclass.File) childNode).value,((org.gcreator.fileclass.File) childNode).name);
                        }
                    } catch (Exception e) {
                    }
                } else if (childNode instanceof org.gcreator.fileclass.Folder) {
                    putFolder((Folder) childNode);
                }
            }
        }
    }
    
    public static void recursivelyDeleteDirectory(File dir) throws IOException {	       
  if ((dir == null) || !dir.isDirectory()) throw new IllegalArgumentException(dir + " not a directory");	  	      
  final File[] files = dir.listFiles();
  final int size = files.length; 
  for (int i = 0; i < size; i++) {
    if(files[i].isDirectory()) {
      recursivelyDeleteDirectory(files[i]);
    } else files[i].delete();	    
  }	     
  dir.delete();
}


    public void parseSprite(Sprite s) {
        System.out.println("" + s.name);
    }

    public void parseImage(ImageIcon i, org.gcreator.fileclass.File f) {
        System.out.println("called wrong method!");
    }

    public void parseActor(Actor a) throws IOException {
    }

    public void parseScene(Scene s) throws IOException {
    }

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
        if (type.equals("var"))
            type = "Object";
        else if (type.equals("globalvar"))
            type = "Object";
        return "/*var statement*/{"+vars+"}";//type + " "+vars;
    }

    public String fieldstatement(String m, String varstatement) {
        return m+" "+varstatement+";";
    }

    public String returnstatement(String exp) {
        return "return " + exp + ";";
    }

    public String exitstatement() {
        return "return null;";
    }

    public String ifstatement(String exp, String statement, String elses) {
        return "if (" + exp + ".getBoolean()) \n" + statement + " \n " + elses;
    }

    public String elsestatement(String statement) {
        return " else " + statement;
    }
    
    public String bstatement(String st) {
        return "{ \n"+st+"\n }";
    }

    public String expression(String ex) {
       // System.out.println("Expression:"+ex);
        return ex;
    }
    
    public String notexpression(String exp) {
        return " ("+exp+").not()";
    }
    
    public String pexpression(String exp) {
        return " ("+exp+")";
    }
    
    public String andexpression() {
        return " .and ";
    }
    
    public String orexpression() {
        return " .or ";
    }
    
    public String xorexpression() {
        return " .xor ";
    }
    
    public String repeatstatement(String ex, String st) {
        return "G_CREATOR__repeat=new Double(0); \n while(G_CREATOR__repeat.lt("+ex+").getBoolean()){\n"+st+" G_CREATOR__repeat.add(new Integer(1));}"; 
    }
    
    public String breakstatement() {
        return "break;";
    }
    
    public String continuestatement() {
        return "continue;";
    }
    
    public String dostatement(String statement, String expression) {
        return "do "+statement+"while("+expression+".getBoolean());"; //todo
    }
    
    public String whilestatement(String exp, String st) {
        return "while ("+exp + ".getBoolean()) "+ st;
    }
    
    public String forstatement(String statement1, String exp, String statement2, String statements) {
        System.out.println(statement2.substring(statement2.length()-1,statement2.length()));
        if ((statement2.substring(statement2.length()-1,statement2.length())).equals(";"))
        statement2 = statement2.substring(0, statement2.length()-1);
        return "for (Object "+statement1+exp+".getBoolean(); "+statement2+") "+statements;
    }
    
    public String switchstatement() {
        return ""; //TODO
    }    
    
    public String withstatement(String exp, String statement) {
        usingwith++;
        with.add(exp);
        return "\n{\n" + statement+"\n}\n";
    }    
    
    public String assignmentstatement(String variable, String operator, String expression) {
        //System.out.println("assignment:"+expression);
        
        String instance="",value="";
        
        if(variable.contains("all."))
            instance="(new All())";
        else if(variable.contains("other."))
            instance="other";
        else if(variable.contains("noone."))
             instance="(new Object())";
        else if(variable.contains("self."))
            instance="self";
        else if(variable.contains("global."))
            instance="Global";
        else if(variable.contains("("))
            instance="(new All"+variable.substring(0,variable.indexOf(".")-1)+"))";
        else if(variable.contains("."))
            instance="(new All("+variable.substring(0,variable.indexOf(".")-1)+"))";
        
        else
            instance="self";
        variable = variable.substring(variable.indexOf(".")+1,variable.length());
           value = instance+".setVariable(\""+variable+"\"," ;
        
        if (operator.equals("="))
            value+=expression;
        else if (operator.equals(":="))
            value+=expression;
        else if (operator.equals("+="))
            value += instance+".getVariable(\""+variable+"\").setadd("+expression+")";
        else if (operator.equals("*="))
            value += instance+".getVariable(\""+variable+"\").setmult("+expression+")";
        else if (operator.equals("-="))
            value += instance+".getVariable(\""+variable+"\").setsub("+expression+")";
        else if (operator.equals("/="))
            value += instance+".getVariable(\""+variable+"\").setdiv("+expression+")";
        else if (operator.equals("&="))
            value += instance+".getVariable(\""+variable+"\").setband("+expression+")";
        else if (operator.equals("|="))
            value += instance+".getVariable(\""+variable+"\").setbor("+expression+")";
        else if (operator.equals("^="))
            value += instance+".getVariable(\""+variable+"\").setbxor("+expression+")";
        return value+")";
    }
    
    public String functionstatement(String name, String parameters) {
        return name+ "("+parameters+")";
    }
    
    public String otherclassfunctionstatement(String name, String parameters) {
        return name+ "("+parameters+")";
    }

    public String array(String name, String exp) {
        return name + "[" + exp + "]";
    }
    
    public String methodstatement(String m, String retvalue, String name, String st, String args) {
        return m+ " " + retvalue + " "+ name + " ("+ args + ") " + st; 
    } 
    
    public String variable(String variable)
    {
        String instance="",value="";
        
        if(variable.contains("all."))
            instance="(new All())";
        else if(variable.contains("other."))
            instance="other";
        else if(variable.contains("noone."))
            instance="(new Object())";
        else if(variable.contains("self."))
            instance="self";
        else if(variable.contains("global."))
            instance="Global";
        else if(variable.contains("."))
            instance="(new All(new "+variable+"()))";
        else if(variable.contains("("))
            instance="()";
        else
            instance="self";
        
        variable = variable.substring(variable.indexOf(".")+1,variable.length());
        
        value=instance+".getVariable(\""+variable+"\")";
        return value;
    }
    
    /**
     * For c++ change the '.' to '->'
     * @param operator
     * @param expression
     * @return
     */
    public String aexpression(String operator, String expression)
    {
        //System.out.println("aexpression: "+operator+" "+expression);
        if (operator.equals("+"))
        return ".add("+expression+")";
        else if (operator.equals("-"))
        return ".sub("+expression+")";
        else if (operator.equals("*"))
        return ".mult("+expression+")";
        else if (operator.equals("/"))
        return ".div("+expression+")";
        else if (operator.equals("|"))
        return ".bor("+expression+")";
        else if (operator.equals("&"))
        return ".band("+expression+")";
        else if (operator.equals("^"))
        return ".bxor("+expression+")";
        else if (operator.equals(">>"))
        return ".bright("+expression+")";
        else if (operator.equals("<<"))
        return ".bleft("+expression+")";
        else if (operator.equals("div"))
        return ".div("+expression+")";
        else if (operator.equals("mod"))
        return ".mod("+expression+")";
        return "aexpression";
    }
    
    public String relationalExpression(String name, String operator, String name2)
    {
       // System.out.println("relationalExpression:"+name+" "+operator+" "+name2);
        if (operator.equals("=="))
        return name+".equals("+name2+")";
        else if (operator.equals("="))
        return name+".equals("+name2+")";
        else if (operator.equals(":="))
        return name+".equals("+name2+")";
        else if (operator.equals("!="))  
        return name+".notequals("+name2+")";
        else if (operator.equals(">"))
        return name+".gt("+name2+")";
        else if (operator.equals(">="))
        return name+".gte("+name2+")";
        else if (operator.equals("<"))
        return name+".lt("+name2+")";
        else if (operator.equals("<="))
        return name+".lte("+name2+")";
        else 
            return name;
    }

    public String parseGCL(String code, PlatformCore p) throws IOException {
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
            parser.code();
            System.out.println("Finished! Code output:"+returncode);
        } catch (Exception e) {
            System.out.println("Error:" + e.getLocalizedMessage() + " " + e.getMessage());
        }
        return returncode;
    }
    
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

    public void run(Project project) {
        if (project != null) {
            putFolder(project);
        }
    }

    // Print a line to the bufferedwriter
    public static void print(BufferedWriter file, String printString) throws IOException {
        file.write(printString);
        file.newLine();
    }

    public static void openbrowser(String location) {
        if (System.getProperty("os.name").indexOf("Windows") == 0) {
            try {
                Runtime.getRuntime().exec("explorer.exe " + location);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
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

    public void parseSettings(String string, String name) {
        System.out.println(string+"got here");
        
    }
}