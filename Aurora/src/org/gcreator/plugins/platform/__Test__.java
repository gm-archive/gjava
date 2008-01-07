import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        parsegmlfunctionlistLexer lex = new parsegmlfunctionlistLexer(new ANTLRFileStream("C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\__Test___input.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        parsegmlfunctionlistParser g = new parsegmlfunctionlistParser(tokens, 49174);
        try {
            g.start();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}