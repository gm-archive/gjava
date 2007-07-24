/*
 * EGMLTokenId.java
 * 
 * Created on 19-Jul-2007, 16:41:00
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gjava.egmllexer;

import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import org.netbeans.api.lexer.Language;
import org.netbeans.api.lexer.TokenId;
import org.netbeans.spi.lexer.LanguageHierarchy;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author Administrator
 */
public enum EGMLTokenId implements TokenId {
ERROR(null, "error"),
    IDENTIFIER(null, "identifier"),

    ABSTRACT("abstract", "keyword"),
    ASSERT("assert", "keyword-directive"),
    BOOLEAN("boolean", "keyword"),
    BREAK("break", "keyword-directive"),
    BYTE("byte", "keyword"),
    CASE("case", "keyword-directive"),
    CATCH("catch", "keyword-directive"),
    CHAR("char", "keyword"),
    CLASS("class", "keyword"),
    CONST("const", "keyword"),
    CONTINUE("continue", "keyword-directive"),
    DEFAULT("default", "keyword-directive"),
    DO("do", "keyword-directive"),
    DOUBLE("double", "keyword"),
    ELSE("else", "keyword-directive"),
    ENUM("enum", "keyword"),
    EXTENDS("extends", "keyword"),
    FINAL("final", "keyword"),
    FINALLY("finally", "keyword-directive"),
    FLOAT("float", "keyword"),
    FOR("for", "keyword-directive"),
    GOTO("goto", "keyword-directive"),
    IF("if", "keyword-directive"),
    IMPLEMENTS("implements", "keyword"),
    IMPORT("import", "keyword"),
    INSTANCEOF("instanceof", "keyword"),
    INT("int", "keyword"),
    INTERFACE("interface", "keyword"),
    LONG("long", "keyword"),
    NATIVE("native", "keyword"),
    NEW("new", "keyword"),
    PACKAGE("package", "keyword"),
    PRIVATE("private", "keyword"),
    PROTECTED("protected", "keyword"),
    PUBLIC("public", "keyword"),
    RETURN("return", "keyword-directive"),
    SHORT("short", "keyword"),
    STATIC("static", "keyword"),
    STRICTFP("strictfp", "keyword"),
    SUPER("super", "keyword"),
    SWITCH("switch", "keyword-directive"),
    SYNCHRONIZED("synchronized", "keyword"),
    THIS("this", "keyword"),
    THROW("throw", "keyword-directive"),
    THROWS("throws", "keyword"),
    TRANSIENT("transient", "keyword"),
    TRY("try", "keyword-directive"),
    VOID("void", "keyword"),
    VOLATILE("volatile", "keyword"),
    WHILE("while", "keyword-directive"),

    INT_LITERAL(null, "number"),
    LONG_LITERAL(null, "number"),
    FLOAT_LITERAL(null, "number"),
    DOUBLE_LITERAL(null, "number"),
    CHAR_LITERAL(null, "character"),
    STRING_LITERAL(null, "string"),
    
    TRUE("true", "literal"),
    FALSE("false", "literal"),
    NULL("null", "literal"),
    
    LPAREN("(", "separator"),
    RPAREN(")", "separator"),
    LBRACE("{", "separator"),
    RBRACE("}", "separator"),
    LBRACKET("[", "separator"),
    RBRACKET("]", "separator"),
    SEMICOLON(";", "separator"),
    COMMA(",", "separator"),
    DOT(".", "separator"),

    EQ("=", "operator"),
    GT(">", "operator"),
    LT("<", "operator"),
    BANG("!", "operator"),
    TILDE("~", "operator"),
    QUESTION("?", "operator"),
    COLON(":", "operator"),
    EQEQ("==", "operator"),
    LTEQ("<=", "operator"),
    GTEQ(">=", "operator"),
    BANGEQ("!=","operator"),
    AMPAMP("&&", "operator"),
    BARBAR("||", "operator"),
    PLUSPLUS("++", "operator"),
    MINUSMINUS("--","operator"),
    PLUS("+", "operator"),
    MINUS("-", "operator"),
    STAR("*", "operator"),
    SLASH("/", "operator"),
    AMP("&", "operator"),
    BAR("|", "operator"),
    CARET("^", "operator"),
    PERCENT("%", "operator"),
    LTLT("<<", "operator"),
    GTGT(">>", "operator"),
    GTGTGT(">>>", "operator"),
    PLUSEQ("+=", "operator"),
    MINUSEQ("-=", "operator"),
    STAREQ("*=", "operator"),
    SLASHEQ("/=", "operator"),
    AMPEQ("&=", "operator"),
    BAREQ("|=", "operator"),
    CARETEQ("^=", "operator"),
    PERCENTEQ("%=", "operator"),
    LTLTEQ("<<=", "operator"),
    GTGTEQ(">>=", "operator"),
    GTGTGTEQ(">>>=", "operator"),
    
    ELLIPSIS("...", "special"),
    AT("@", "special"),
    
    WHITESPACE(null, "whitespace"),
    LINE_COMMENT(null, "comment"),
    BLOCK_COMMENT(null, "comment"),
    JAVADOC_COMMENT(null, "comment"),
    
    // Errors
    INVALID_COMMENT_END("*/", "error"),
    FLOAT_LITERAL_INVALID(null, "number");



private String primaryCategory;

private String fixedText;

private EGMLTokenId(String fixedtext, String primaryCategory) {
    this.primaryCategory = primaryCategory;
    this.fixedText = fixedtext;
}

public String fixedText() {
        return fixedText;
    }

    public String primaryCategory() {
        return primaryCategory;
    }
    
    private static final Language<EGMLTokenId> language = new LanguageHierarchy<EGMLTokenId>(){
    @Override
        protected Collection<EGMLTokenId> createTokenIds() {
            return EnumSet.allOf(EGMLTokenId.class);
        }
        @Override
        protected Lexer<EGMLTokenId> createLexer(LexerRestartInfo<EGMLTokenId> arg0) {
            return new EGMLLexer(arg0);
        }
        @Override
        protected String mimeType() {
            return "text/x-egml";
        }
        
        @Override
        protected Map<String,Collection<EGMLTokenId>> createTokenCategories() {
            Map<String,Collection<EGMLTokenId>> cats = new HashMap<String,Collection<EGMLTokenId>>();
            // Additional literals being a lexical error
            cats.put("error", EnumSet.of(
                EGMLTokenId.FLOAT_LITERAL_INVALID
            ));
            // Literals category
            EnumSet<EGMLTokenId> l = EnumSet.of(
                EGMLTokenId.INT_LITERAL,
                EGMLTokenId.LONG_LITERAL,
                EGMLTokenId.FLOAT_LITERAL,
                EGMLTokenId.DOUBLE_LITERAL,
                EGMLTokenId.CHAR_LITERAL
            );
            l.add(EGMLTokenId.STRING_LITERAL);
            cats.put("literal", l);

            return cats;
        }
    
    }.language();
    
    public static Language<EGMLTokenId> language(){
        return language;
    }
}
