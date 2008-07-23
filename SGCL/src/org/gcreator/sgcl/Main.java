/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.sgcl;

import java.io.InputStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;

/**
 *
 * @author luis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            InputStream s = Main.class.getResourceAsStream("/org/gcreator/sgcl/test1.sgcl");
            sgclLexer lex = new sgclLexer(new ANTLRInputStream(s));
            CommonTokenStream tokens = new CommonTokenStream(lex);
            sgclParser p = new sgclParser(tokens);
            p.doc();
            
            System.out.println("End");
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }

}
