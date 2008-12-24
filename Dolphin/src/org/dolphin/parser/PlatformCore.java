/*
 * PlatformCore.java
 */

package org.dolphin.parser;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
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
import org.dolphin.DolphinWriter;
import org.dolphin.game.api.Constants;
import org.dolphin.game.api.Variables;
import org.lateralgm.resources.GmObject;


/**
 * The main PlaformCore class, all converters should extend this class!
 * @author TGMG
 */
public class PlatformCore  {

    
    public static String returncode = "";
    //static ParserError pe = new ParserError();
    int usingwith = 0;
    Vector localVariables  = new Vector(1);
    Vector fieldVariables  = new Vector(1);
    Vector globalVariables = new Vector(1);
    Vector<String> with = new Vector<String>(1);
    public String current="",event="";
    public String updateURL="";//,compilername="";
    public double version = 1.0;
    public boolean inscript = false; //only scripts use return a value
    
    public Vector<String> resources=new Vector(),stringResources=new Vector();

   

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
                int update = JOptionPane.showConfirmDialog(null, "Dolphin update is available. Are you sure you want to update? ");
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
                    download(v,"plugins" + File.separator  +"Dolphin.zip");
                    unzip("plugins" + File.separator + "Dolphin.zip");
                    System.out.println("unzipped");
                    JOptionPane.showMessageDialog(null, "Finished updating Dolphin"); //will make multilingual when message finalized

                }
                
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

        java.lang.String nm = name;
        try {

            Method m = org.dolphin.game.api.components.Actor.class.getDeclaredMethod("get" + ("" + nm.charAt(0)).toUpperCase() + nm.substring(1) + "", new Class[]{});
            return true;
        } catch (NoSuchMethodException ex) {
            //System.out.println("not in actor: " + ex);
            try {
                Method m = org.dolphin.game.api.Variables.class.getDeclaredMethod("get" + ("" + nm.charAt(0)).toUpperCase() + nm.substring(1) + "", new Class[]{});
                return true;
            } catch (Exception e) {
                //System.out.println("not in variables" + e);
                try {
                    Method m = Constants.class.getDeclaredMethod("get" + ("" + nm.charAt(0)).toUpperCase() + nm.substring(1) + "", new Class[]{});
                    return true;
                } catch (Exception ee) {
                    //System.out.println("no method" + ee);
                }
            }

        } catch (SecurityException ex) {
            System.out.println("security:" + ex);

        }
        return false;
       
    }

    public boolean checkarray(String name)
    {
        java.lang.String nm = name.substring(0,name.indexOf("["));
       // System.out.println("checkarray:"+nm+" "+"get" + ("" + nm.charAt(0)).toUpperCase() + nm.substring(1) + "");
        
        try {

            Method m = org.dolphin.game.api.components.Actor.class.getDeclaredMethod("get" + ("" + nm.charAt(0)).toUpperCase() + nm.substring(1) + "", new Class[]{int.class});
            return true;
        } catch (NoSuchMethodException ex) {
            //System.out.println("not in actor: " + ex);
            try {
                Method m = org.dolphin.game.api.Variables.class.getDeclaredMethod("get" + ("" + nm.charAt(0)).toUpperCase() + nm.substring(1) + "", new Class[]{int.class});
                return true;
            } catch (Exception e) {
                //System.out.println("not in variables" + e);
                try {
                    Method m = Constants.class.getDeclaredMethod("get" + ("" + nm.charAt(0)).toUpperCase() + nm.substring(1) + "", new Class[]{int.class});
                    return true;
                } catch (Exception ee) {
                    //System.out.println("no method" + ee);
                }
            }

        } catch (SecurityException ex) {
            System.out.println("security:" + ex);

        }
        return false;

    }


    public boolean checkfunction(String name)
    {
        return true;
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
        String s;
        if (inscript)
        	s= "if(true) return " + exp + ";";
        else
        	s="return;";
        return s;
    }

    /**
     * Replace this with exist statment, converts:
     * exit;
     * @return
     */
    public String exitstatement() {
    	String s;
        if (inscript)
        	s= "return Boolean.FALSE;";
        else
        	s="return;";
        return s;
    }

    /**
     * Replace with if statement
     * @param exp - the expression to decide wither it is true or false
     * @param statement 
     * @param elses 
     * @return A String
     */
    public String ifstatement(String exp, String statement, String elses) {
    	//System.out.println("if statement:"+exp);
        return "if ((" + exp + ").getBoolean()) \n" + statement + " \n " + elses;
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
        return "{ \n"+st+"}";
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
        return "for(G_CREATOR__repeat=new Double(0); G_CREATOR__repeat.lt("+ex+").getBoolean(); G_CREATOR__repeat.add(new Integer(1))){\n"+st+" }"; 
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
        return "for ("+statement1+exp+".getBoolean(); "+statement2+") "+statements;
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
        //usingwith++;
        //with.add(exp);
        String s="";
        s+="{Actor[] ac = Game.currentRoom.with("+exp+");";
        s+="for (int i = 0; i < ac.length; i++){";
        s+="    selfs.push(self);";
        s+="    self = ac[i]; if(self!=null){\n";
        s+=statement;
        s+="\n}self = selfs.pop();}}\n";

        return s;
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
        String tempvar="";
        
        if(variable.contains("all.")) {
            instance = "{for (int i = 0; i < Game.currentRoom.instances.size(); i++)   Game.currentRoom.instances.get(i)";
            tempvar=variable;
            variable = variable.substring(variable.indexOf(".")+1);
        } else if(variable.contains("other.")) {
            instance = "other";
        } else if(variable.contains("noone.")) {
            instance = "noone";
        } else if(variable.contains("self.")) {
            instance = "self";
        } else if(variable.contains("global.")) {
            instance = "Global";
        } else if(variable.startsWith("("))  {
            instance = "(self)";//actually instance variable
        } else if (countOccurrences(variable,".")>1){
            //mopre than one .
            System.out.println("more than one . variable!");
        }
         else if(variable.contains(".")){
            //instance="for (int i = 0; i < Game.currentRoom.setActorwithname("+variable.substring(0, variable.indexOf("."))+".class).length; i++) Game.currentRoom.setActorwithname("+variable.substring(0, variable.indexOf("."))+".class)[i]";
            instance="{Actor[] ac =Game.currentRoom.setActorwithname("+variable(variable.substring(0, variable.indexOf(".")))+".getActor().getClass()); for (int i = 0; i < ac.length; i++) ac[i]";
             tempvar=variable;
            variable = variable.substring(variable.indexOf(".")+1);
            
        } else {
            instance = "self";
        }

        //not needed as you can't set constants anyway
//        if (images.contains(tempvar) || resources.contains(tempvar)){
//        value="Game."+tempvar+" = "+expression;
//        return value;
//        }

        //check if it is an array
        if (variable.contains("[")){
            
            if (checkarray(variable)) {
                
                if (operator.equals("=") || operator.equals("=")){
                String s= instance + ".set" + ("" + variable.charAt(0)).toUpperCase() + variable.substring(1, variable.length()).substring(0,variable.indexOf("[")-1) + "("+variable.substring(variable.indexOf("[")+1,variable.indexOf("]"))+","+expression+")";
                if(tempvar.contains(".")){
                	s+=";}";//close instance.*/all.* statement
                	}
                return s;
                } else {
                    
                String s=instance + ".set" + ("" + variable.charAt(0)).toUpperCase() + variable.substring(1, variable.length()).substring(0,variable.indexOf("[")-1) + "("+variable.substring(variable.indexOf("[")+1,variable.indexOf("]"))+",";
                if(tempvar.contains(".")){
                	s+=variable(tempvar+".");//make sure other instance vars work
                	} else {
                s+=instance + ".get" + (""+variable.charAt(0)).toUpperCase() + variable.substring(1, variable.length()).substring(0,variable.indexOf("[")-1) + "("+variable.substring(variable.indexOf("[")+1,variable.indexOf("]"))+").";
                }
                if (operator.equals("+=")) {
                s += "setadd(" + expression + ")";
            } else if (operator.equals("*=")) {
                s += "setmult(" + expression + ")";
            } else if (operator.equals("-=")) {
                s += "setsub(" + expression + ")";
            } else if (operator.equals("/=")) {
                s += "setdiv(" + expression + ")";
            } else if (operator.equals("&=")) {
                s +=  "setband(" + expression + ")";
            } else if (operator.equals("|=")) {
                s +=  "setbor(" + expression + ")";
            } else if (operator.equals("^=")) {
                s += "setbxor(" + expression + ")";
            }
                s+=")";
                if(tempvar.contains(".")){
                	s+=";}";
                	}
                return s;
                }
            }
        }

        //check if it is a built in variable
        if (checkvariable(variable)){
            String var="";
            if(tempvar.contains(".")){
            	var+=variable(tempvar);//make sure other instance vars work
            	} else {
            var=(""+variable.charAt(0)).toUpperCase()+variable.substring(1, variable.length());
            value=instance+".set"+var+"(";
            	}
            

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
        value+=")";
        if(tempvar.contains("."))value+=";}";
        return value;
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
        value+=")";
        if(tempvar.contains(".")){
        	value+=";}";
        	}
        return value;
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
#
      * Count number of occurrences of arg2 in arg1.
#
      * @param arg1
#
      * @param arg2
#
      * @return int
#
      */

     public static int countOccurrences(String arg1, String arg2) {

          int count = 0;

          int index = 0;

          while ((index = arg1.indexOf(arg2, index)) != -1) {

               index++;

               count++;

          }

          return count;

     }

     public String oivariable(String variable,String variable2){
    	 
    	 if (variable.equals("self")) {
             return variable("self."+variable2);
         }
         else if (variable.equals("all")) {
        	 return variable("all."+variable2);
         }
         else if (variable.equals("noone")) {
        	 return variable("noone."+variable2);
         }
         else if (variable.equals("other")) {
        	 return variable("other."+variable2);
         }
         else if (variable.equals("global")) {
        	 return variable("global."+variable2);
         }
         else {
        	 //instance variables
        	 return "Game.currentRoom.getActorwithname("+variable(variable.substring(0, variable.indexOf(".")))+".class)";

         }
    	 
    	 //return variable;
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
            return "(Boolean.TRUE)";
        }
        else if (variable.equals("false")) {
            return "(Boolean.FALSE)";
        }
        else if (variable.equals("pi")) {
            return "(new Double(PI))";
        }
        else if (variable.equals("self")) {
            return "(self)";
        }
        else if (variable.equals("all")) {
            return "(all)";
        }
        else if (variable.equals("noone")) {
            return "(noone)";
        }
        else if (variable.equals("other")) {
            return "(other)";
        }

        /*
        
        */
        if(variable.startsWith("self.")) {
            instance = "self";
        }
        else if(variable.startsWith("other.")) {
            instance = "other";
        }
        else if(variable.startsWith("noone.")) {
            instance = "noone";
        }
        else if(variable.startsWith("global.")) {
            instance = "Global";
            System.out.println("it is a global variable!");
        }
        else if(variable.startsWith("all.")) {
            instance = "Game.currentRoom.getfirst()";
        }
        else if (countOccurrences(variable,".")>1){
            instance = "Game.currentRoom.getActorwithname("+variable(variable.substring(0, variable.indexOf(".")))+".getActor().getClass())";
            System.out.println("more than one . variable!");
        }
        else if(variable.contains(".")) {
            instance = "Game.currentRoom.getActorwithname("+variable(variable.substring(0, variable.indexOf(".")))+".getActor().getClass())";
        }
        else if(variable.startsWith("(")) {
            instance = "(self)";
            System.out.println("It thinks the variable is instance() but is it?"+variable);
        }
        else {
            instance = "self";
        }

        if (variable.contains("[")){
            //System.out.println("array detected!");
            if (checkarray(variable)) {
                //System.out.println("it is a built in array!");
            	
                return instance + ".get" + ("" + variable.charAt(0)).toUpperCase() + variable.substring(1, variable.length()).substring(0,variable.indexOf("[")-1) + "("+variable.substring(variable.indexOf("[")+1,variable.indexOf("]"))+".getInt())";
            } else {
            	variable = variable.substring(variable.indexOf(".")+1,variable.length()); //get rid of . as in global. or other.
            	System.out.println("variable for unbuilt in array:instance:"+instance);
            	try{
            	//System.out.println("variable name:"+variable.substring(0,variable.indexOf("[")));
            	//System.out.println("variable inside:"+variable.substring(variable.indexOf("[")+1,variable.indexOf("]")));
            	}catch(Exception e){
            		e.printStackTrace();
            		System.out.println("The error occured with:"+variable);
            	}
            		return instance+".getVariable(\""+variable.substring(0,variable.indexOf("[")+1)+"\"+" + variable.substring(variable.indexOf("[")+1,variable.indexOf("]"))+ "+\"]\")";
            }
        }

        if(DolphinWriter.gmFile !=null){
        /*check if it is a timeline*/
        if (DolphinWriter.gmFile.timelines.get(variable)!=null)
        {
        return "new "+DolphinWriter.gmFile.timelines.get(variable).getName()+"()";
        }

        /*check if it is a room*/
        if (DolphinWriter.gmFile.rooms.get(variable)!=null)
        {
        return "new Integer("+DolphinWriter.gmFile.rooms.get(variable).getId()+")";
        }

        /*check if it is an object*/
        if (DolphinWriter.gmFile.gmObjects.get(variable)!=null)
        {
        return "new GMResource("+variable+".class)";
        }
        }
        


        if (stringResources.contains(variable))
        {
        return "new String(\""+variable+"\")";
        }
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
        //System.out.println("relationalExpression:"+name+" ,"+operator+" ,"+name2);
        if (operator.equals("==")) {
            return name + ".equals(" + name2 + ")";
        }
        else if (operator.equals("=")) {
            return name + ".equals(" + name2 + ")";
        }
        else if (operator.equals(":=")) {
            return name + ".equals(" + name2 + ")";
        }
        else if (operator.equals("!=") || operator.equals("<>")) {
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
        try{
            String code="";
            if ((new File("tempcode.gcl").exists())){
        FileReader ftempcode = new FileReader("tempcode.gcl");
        BufferedReader tempcode = new BufferedReader(ftempcode);
        String s = tempcode.readLine();
        
        while(s !=null){
        s = tempcode.readLine();
        code+=s+"\n";
        }
        tempcode.close();
        JOptionPane.showMessageDialog(null, "Syntax Error while parsing "+current+":"+event+"\n"+msg+"\n See the Dolphin Progress frame for more information.");
        //JOptionPane.showMessageDialog(null, "Syntax Error while parsing "+current+":"+event+"\n"+msg+"\nIn code:\n"+code);
        DolphinWriter.df.ta.append("Syntax Error while parsing "+current+":"+event+"\n"+msg+"\n In code:\n"+code);
        
            }
        }catch(Exception e){e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Syntax Error while parsing "+current+":"+event+"\n"+msg);
        }
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
        //System.out.println("CODE:"+code);
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
            System.out.println("Error with parser:"+e + e.getLocalizedMessage() + " " + e.getMessage()+"\n code:"+code);
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
    
    public static String intval(String value){
        return "(Game.getValueOf(" + value + "))";
    }
    
    public static String doubleval(String value){
        return "(Game.getValueOf(" + value + "))";
    }
    
    public static String stringval(String value){
        return ("(new String(\"" + value + "\"))").replaceAll("\n", "");
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
    void copyFile(File src, File dst)  {
        try{
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
        }catch(Exception e){e.printStackTrace();}
    }
    
    /*
     * 
     * This will attempt to fix resource names
     * 
     */
    public static String fixName(String s)
	{
    	String original = s;
	s = s.replaceAll(" ","___");
	s = s.replaceAll("-","___");
	s = s.replaceAll("/","___");
	s = s.replaceAll("!","___");
	//s = s.replaceAll("/?","___");
	// s = s.replaceAll("*","_");
	// s = s.replaceAll("\\","_");
	if ((s.indexOf("0") == 0) || (s.indexOf("0") == 0) || (s.indexOf("0") == 0) || (s.indexOf("0") == 0)
			|| (s.indexOf("0") == 0) || (s.indexOf("0") == 0) || (s.indexOf("0") == 0) || (s.indexOf("0") == 0)
			|| (s.indexOf("0") == 0) || (s.indexOf("0") == 0)) s = "DOLPHIN____" + s;
	if (!original.equals(s)){
		//JOptionPane.showMessageDialog(null, "WARNING: One of your Resources has an illegal character in it, this will cause errors. Please change it from :"+original+" to "+s);
		DolphinWriter.df.ta.append("WARNING: One of your Resources has an illegal character in it, this will cause errors. Please change it from :"+original+" to "+s);
		
	}
	return s;
	}

   
}
