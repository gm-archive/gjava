import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;

import org.gcreator.plugins.platform.*;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        gscriptLexer lex = new gscriptLexer(new ANTLRFileStream("C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\__Test___input.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        System.out.println("1");
        gscriptParser g = new gscriptParser(tokens);
        System.out.println("2");
        try {
            g.code();
            System.out.println("done");
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}