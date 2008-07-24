/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.sgcl.example;

import java.util.Vector;
import org.antlr.runtime.Token;
import org.gcreator.sgcl.*;

/**
 *
 * @author luis
 */
public class JavaManager implements SGCLManager{
    private int target = 0;
    private String code = "";
    private boolean partial = false;
    private String clsname = "";
    private int indent = 0;
    public JavaManager(int target){
        this.target = target;
        if(target!=4&&target!=5&&target!=6)
            throw new Error("Unsupported version");
    }
    
    public boolean supportsExtension(String extension){
        if(extension.equals("System.Extensions.Generics")&&target>4)
            return true;
        return false;
    }
    
    public void outputCode(Vector<Token> tokens){
        for(int i = 0; i < tokens.size(); i++){
            Token t = tokens.get(i);
            int type = t.getType();
            String content = t.getText();
            //System.out.println(type + "=" + content);
            if(content.equals("partial")){
                partial = true;
                continue;
            }
            if(content.equals("class")){
                code += "public class ";
                i++;
                t = tokens.get(i);
                code += (clsname = t.getText());
                t = tokens.get(i+1);
                if(t.getText().equals("extends")){
                    i++;
                    code += " extends ";
                    i++;
                    code += tokens.get(i).getText();
                }
                continue;
            }
            if(content.equals("{")){
                code += content;
                code += "\n";
                indent++;
                for(int j = 0; j < indent; j++){
                    code += "\t";
                }
                continue;
            }
            if(content.equals("}")){
                code = code.substring(0, code.length()-1);
                code += content;
                code += "\n";
                indent--;
                for(int j = 0; j < indent; j++){
                    code += "\t";
                }
                continue;
            }
            if(content.equals(";")){
                code += content;
                code += "\n";
                for(int j = 0; j < indent; j++){
                    code += "\t";
                }
                continue;
            }
            if(content.equals("(")||content.equals(")")||content.equals("super")){
                code += content;
                continue;
            }
            if(content.equals("public")||content.equals("private")){
                code += content;
                i++;
                t = tokens.get(i);
                content = t.getText();
                if(content.equals("this")){
                    code += " " + clsname;
                }
                if(content.equals("static")){
                    code += " static";
                    i++;
                    t = tokens.get(i);
                    content = t.getText();
                    type = t.getType();
                }
                if(content.equals("final")){
                    code += " final";
                    i++;
                    t = tokens.get(i);
                    content = t.getText();
                    type = t.getType();
                }
                if(type==sgclParser.WORD||type==sgclLexer.TYPE){
                    code += " " + content;
                }
                
                code += " ";
                continue;
            }
            if(type==sgclLexer.WORD
                    &&tokens.get(i+1).getText().equals(".")
                    &&tokens.get(i+2).getText().equals("new")){
                code += "new ";
                i+=2;
            }
            if(type==sgclLexer.STRING){
                String str = SGCLTranslator.parseString(content);
                str = str.replaceAll("\\\\", "\\\\");
                str = str.replaceAll("\"", "\\\"");
                str = str.replaceAll("\n", "\\\\n");
                str = "\"" + str + "\"";
                code += str;
                continue;
            }
            code += content + " ";
        }
    }
    
    public String getText(){
        return code;
    }
}
