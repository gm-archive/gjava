/*
 * EGMLLexer.java
 * 
 * Created on 19-Jul-2007, 21:01:15
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gjava.egmllexer;

import org.netbeans.api.lexer.PartType;
import org.netbeans.api.lexer.Token;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerInput;
import org.netbeans.spi.lexer.LexerRestartInfo;
import org.netbeans.spi.lexer.TokenFactory;

/**
 *
 * @author Administrator
 */
public class EGMLLexer implements Lexer<EGMLTokenId> { 
private static final int EOF = LexerInput.EOF;
private final LexerInput input;
private final TokenFactory<EGMLTokenId> tokenFactory;
    
    private final int version;

    
    public EGMLLexer(LexerRestartInfo<EGMLTokenId> info) {
        this.input = info.input();
        this.tokenFactory = info.tokenFactory();
        assert (info.state() == null); // never set to non-null value in state()
        
        Integer ver = (Integer)info.getAttributeValue("version");
        this.version = (ver != null) ? ver.intValue() : 5; // Use Java 1.5 by default
    }
    
    public Object state() {
        return null; // always in default state after token recognition
    }
    
    public Token<EGMLTokenId> nextToken() {
        while(true) {
            int c = input.read();
            switch (c) {
                case '"': // string literal
                    while (true)
                        switch (input.read()) {
                            case '"': // NOI18N
                                return token(EGMLTokenId.STRING_LITERAL);
                            case '\\':
                                input.read();
                                break;
                            case '\r': input.consumeNewline();
                            case '\n':
                            case EOF:
                                return tokenFactory.createToken(EGMLTokenId.STRING_LITERAL,
                                        input.readLength(), PartType.START);
                        }

                case '\'': // char literal
                    while (true)
                        switch (input.read()) {
                            case '\'': // NOI18N
                                return token(EGMLTokenId.CHAR_LITERAL);
                            case '\\':
                                input.read(); // read escaped char
                                break;
                            case '\r': input.consumeNewline();
                            case '\n':
                            case EOF:
                                return tokenFactory.createToken(EGMLTokenId.CHAR_LITERAL,
                                        input.readLength(), PartType.START);
                        }

                case '/':
                    switch (input.read()) {
                        case '/': // in single-line comment
                            while (true)
                                switch (input.read()) {
                                    case '\r': input.consumeNewline();
                                    case '\n':
                                    case EOF:
                                        return token(EGMLTokenId.LINE_COMMENT);
                                }
                        case '=': // found /=
                            return token(EGMLTokenId.SLASHEQ);
                        case '*': // in multi-line or javadoc comment
                            c = input.read();
                            if (c == '*') { // either javadoc comment or empty multi-line comment /**/
                                    c = input.read();
                                    if (c == '/')
                                        return token(EGMLTokenId.BLOCK_COMMENT);
                                    while (true) { // in javadoc comment
                                        while (c == '*') {
                                            c = input.read();
                                            if (c == '/')
                                                return token(EGMLTokenId.JAVADOC_COMMENT);
                                            else if (c == EOF)
                                                return tokenFactory.createToken(EGMLTokenId.JAVADOC_COMMENT,
                                                        input.readLength(), PartType.START);
                                        }
                                        if (c == EOF)
                                            return tokenFactory.createToken(EGMLTokenId.JAVADOC_COMMENT,
                                                        input.readLength(), PartType.START);
                                        c = input.read();
                                    }

                            } else { // in multi-line comment (and not after '*')
                                while (true) {
                                    c = input.read();
                                    while (c == '*') {
                                        c = input.read();
                                        if (c == '/')
                                            return token(EGMLTokenId.BLOCK_COMMENT);
                                        else if (c == EOF)
                                            return tokenFactory.createToken(EGMLTokenId.BLOCK_COMMENT,
                                                    input.readLength(), PartType.START);
                                    }
                                    if (c == EOF)
                                        return tokenFactory.createToken(EGMLTokenId.BLOCK_COMMENT,
                                                input.readLength(), PartType.START);
                                }
                            }
                    } // end of switch()
                    input.backup(1);
                    return token(EGMLTokenId.SLASH);

                case '=':
                    if (input.read() == '=')
                        return token(EGMLTokenId.EQEQ);
                    input.backup(1);
                    return token(EGMLTokenId.EQ);

                case '>':
                    switch (input.read()) {
                        case '>': // after >>
                            switch (c = input.read()) {
                                case '>': // after >>>
                                    if (input.read() == '=')
                                        return token(EGMLTokenId.GTGTGTEQ);
                                    input.backup(1);
                                    return token(EGMLTokenId.GTGTGT);
                                case '=': // >>=
                                    return token(EGMLTokenId.GTGTEQ);
                            }
                            input.backup(1);
                            return token(EGMLTokenId.GTGT);
                        case '=': // >=
                            return token(EGMLTokenId.GTEQ);
                    }
                    input.backup(1);
                    return token(EGMLTokenId.GT);

                case '<':
                    switch (input.read()) {
                        case '<': // after <<
                            if (input.read() == '=')
                                return token(EGMLTokenId.LTLTEQ);
                            input.backup(1);
                            return token(EGMLTokenId.LTLT);
                        case '=': // <=
                            return token(EGMLTokenId.LTEQ);
                    }
                    input.backup(1);
                    return token(EGMLTokenId.LT);

                case '+':
                    switch (input.read()) {
                        case '+':
                            return token(EGMLTokenId.PLUSPLUS);
                        case '=':
                            return token(EGMLTokenId.PLUSEQ);
                    }
                    input.backup(1);
                    return token(EGMLTokenId.PLUS);

                case '-':
                    switch (input.read()) {
                        case '-':
                            return token(EGMLTokenId.MINUSMINUS);
                        case '=':
                            return token(EGMLTokenId.MINUSEQ);
                    }
                    input.backup(1);
                    return token(EGMLTokenId.MINUS);

                case '*':
                    switch (input.read()) {
                        case '/': // invalid comment end - */
                            return token(EGMLTokenId.INVALID_COMMENT_END);
                        case '=':
                            return token(EGMLTokenId.STAREQ);
                    }
                    input.backup(1);
                    return token(EGMLTokenId.STAR);

                case '|':
                    switch (input.read()) {
                        case '|':
                            return token(EGMLTokenId.BARBAR);
                        case '=':
                            return token(EGMLTokenId.BAREQ);
                    }
                    input.backup(1);
                    return token(EGMLTokenId.BAR);

                case '&':
                    switch (input.read()) {
                        case '&':
                            return token(EGMLTokenId.AMPAMP);
                        case '=':
                            return token(EGMLTokenId.AMPEQ);
                    }
                    input.backup(1);
                    return token(EGMLTokenId.AMP);

                case '%':
                    if (input.read() == '=')
                        return token(EGMLTokenId.PERCENTEQ);
                    input.backup(1);
                    return token(EGMLTokenId.PERCENT);

                case '^':
                    if (input.read() == '=')
                        return token(EGMLTokenId.CARETEQ);
                    input.backup(1);
                    return token(EGMLTokenId.CARET);

                case '!':
                    if (input.read() == '!')
                        return token(EGMLTokenId.BANGEQ);
                    input.backup(1);
                    return token(EGMLTokenId.BANG);

                case '.':
                    if ((c = input.read()) == '.')
                        if (input.read() == '.') { // ellipsis ...
                            return token(EGMLTokenId.ELLIPSIS);
                        } else
                            input.backup(2);
                    else if ('0' <= c && c <= '9') { // float literal
                        return finishNumberLiteral(input.read(), true);
                    } else
                        input.backup(1);
                    return token(EGMLTokenId.DOT);

                case '~':
                    return token(EGMLTokenId.TILDE);
                case ',':
                    return token(EGMLTokenId.COMMA);
                case ';':
                    return token(EGMLTokenId.SEMICOLON);
                case ':':
                    return token(EGMLTokenId.COLON);
                case '?':
                    return token(EGMLTokenId.QUESTION);
                case '(':
                    return token(EGMLTokenId.LPAREN);
                case ')':
                    return token(EGMLTokenId.RPAREN);
                case '[':
                    return token(EGMLTokenId.LBRACKET);
                case ']':
                    return token(EGMLTokenId.RBRACKET);
                case '{':
                    return token(EGMLTokenId.LBRACE);
                case '}':
                    return token(EGMLTokenId.RBRACE);
                case '@':
                    return token(EGMLTokenId.AT);

                case '0': // in a number literal
		    c = input.read();
                    if (c == 'x' || c == 'X') { // in hexadecimal (possibly floating-point) literal
                        boolean inFraction = false;
                        while (true) {
                            switch (input.read()) {
                                case '0': case '1': case '2': case '3': case '4':
                                case '5': case '6': case '7': case '8': case '9':
                                case 'a': case 'b': case 'c': case 'd': case 'e': case 'f':
                                case 'A': case 'B': case 'C': case 'D': case 'E': case 'F':
                                    break;
                                case '.': // hex float literal
                                    if (!inFraction) {
                                        inFraction = true;
                                    } else { // two dots in the float literal
                                        return token(EGMLTokenId.FLOAT_LITERAL_INVALID);
                                    }
                                    break;
                                case 'p': case 'P': // binary exponent
                                    return finishFloatExponent();
                                default:
                                    input.backup(1);
                                    // if float then before mandatory binary exponent => invalid
                                    return token(inFraction ? EGMLTokenId.FLOAT_LITERAL_INVALID
                                            : EGMLTokenId.INT_LITERAL);
                            }
                        } // end of while(true)
                    }
                    return finishNumberLiteral(c, false);
                    
                case '1': case '2': case '3': case '4':
                case '5': case '6': case '7': case '8': case '9':
                    return finishNumberLiteral(input.read(), false);

                    
                // Keywords lexing    
                case 'a':
                    switch (c = input.read()) {
                        case 'b':
                            if ((c = input.read()) == 's'
                             && (c = input.read()) == 't'
                             && (c = input.read()) == 'r'
                             && (c = input.read()) == 'a'
                             && (c = input.read()) == 'c'
                             && (c = input.read()) == 't')
                                return keywordOrIdentifier(EGMLTokenId.ABSTRACT);
                            break;
                        case 's':
                            if ((c = input.read()) == 's'
                             && (c = input.read()) == 'e'
                             && (c = input.read()) == 'r'
                             && (c = input.read()) == 't')
                                return (version >= 4)
                                        ? keywordOrIdentifier(EGMLTokenId.ASSERT)
                                        : finishIdentifier();
                            break;
                    }
                    return finishIdentifier(c);

                case 'b':
                    switch (c = input.read()) {
                        case 'o':
                            if ((c = input.read()) == 'o'
                             && (c = input.read()) == 'l'
                             && (c = input.read()) == 'e'
                             && (c = input.read()) == 'a'
                             && (c = input.read()) == 'n')
                                return keywordOrIdentifier(EGMLTokenId.BOOLEAN);
                            break;
                        case 'r':
                            if ((c = input.read()) == 'e'
                             && (c = input.read()) == 'a'
                             && (c = input.read()) == 'k')
                                return keywordOrIdentifier(EGMLTokenId.BREAK);
                            break;
                        case 'y':
                            if ((c = input.read()) == 't'
                             && (c = input.read()) == 'e')
                                return keywordOrIdentifier(EGMLTokenId.BYTE);
                            break;
                    }
                    return finishIdentifier(c);

                case 'c':
                    switch (c = input.read()) {
                        case 'a':
                            switch (c = input.read()) {
                                case 's':
                                    if ((c = input.read()) == 'e')
                                        return keywordOrIdentifier(EGMLTokenId.CASE);
                                    break;
                                case 't':
                                    if ((c = input.read()) == 'c'
                                     && (c = input.read()) == 'h')
                                        return keywordOrIdentifier(EGMLTokenId.CATCH);
                                    break;
                            }
                            break;
                        case 'h':
                            if ((c = input.read()) == 'a'
                             && (c = input.read()) == 'r')
                                return keywordOrIdentifier(EGMLTokenId.CHAR);
                            break;
                        case 'l':
                            if ((c = input.read()) == 'a'
                             && (c = input.read()) == 's'
                             && (c = input.read()) == 's')
                                return keywordOrIdentifier(EGMLTokenId.CLASS);
                            break;
                        case 'o':
                            if ((c = input.read()) == 'n') {
                                switch (c = input.read()) {
                                    case 's':
                                        if ((c = input.read()) == 't')
                                            return keywordOrIdentifier(EGMLTokenId.CONST);
                                        break;
                                    case 't':
                                        if ((c = input.read()) == 'i'
                                         && (c = input.read()) == 'n'
                                         && (c = input.read()) == 'u'
                                         && (c = input.read()) == 'e')
                                            return keywordOrIdentifier(EGMLTokenId.CONTINUE);
                                        break;
                                }
                            }
                            break;
                    }
                    return finishIdentifier(c);

                case 'd':
                    switch (c = input.read()) {
                        case 'e':
                            if ((c = input.read()) == 'f'
                             && (c = input.read()) == 'a'
                             && (c = input.read()) == 'u'
                             && (c = input.read()) == 'l'
                             && (c = input.read()) == 't')
                                return keywordOrIdentifier(EGMLTokenId.DEFAULT);
                            break;
                        case 'o':
                            switch (c = input.read()) {
                                case 'u':
                                    if ((c = input.read()) == 'b'
                                     && (c = input.read()) == 'l'
                                     && (c = input.read()) == 'e')
                                        return keywordOrIdentifier(EGMLTokenId.DOUBLE);
                                    break;
                                default:
                                    return keywordOrIdentifier(EGMLTokenId.DO, c);
                            }
                            break;
                    }
                    return finishIdentifier(c);

                case 'e':
                    switch (c = input.read()) {
                        case 'l':
                            if ((c = input.read()) == 's'
                             && (c = input.read()) == 'e')
                                return keywordOrIdentifier(EGMLTokenId.ELSE);
                            break;
                        case 'n':
                            if ((c = input.read()) == 'u'
                             && (c = input.read()) == 'm')
                                return (version >= 5)
                                        ? keywordOrIdentifier(EGMLTokenId.ENUM)
                                        : finishIdentifier();
                            break;
                        case 'x':
                            if ((c = input.read()) == 't'
                             && (c = input.read()) == 'e'
                             && (c = input.read()) == 'n'
                             && (c = input.read()) == 'd'
                             && (c = input.read()) == 's')
                                return keywordOrIdentifier(EGMLTokenId.EXTENDS);
                            break;
                    }
                    return finishIdentifier(c);

                case 'f':
                    switch (c = input.read()) {
                        case 'a':
                            if ((c = input.read()) == 'l'
                             && (c = input.read()) == 's'
                             && (c = input.read()) == 'e')
                                return keywordOrIdentifier(EGMLTokenId.FALSE);
                            break;
                        case 'i':
                            if ((c = input.read()) == 'n'
                             && (c = input.read()) == 'a'
                             && (c = input.read()) == 'l')
                                switch (c = input.read()) {
                                    case 'l':
                                        if ((c = input.read()) == 'y')
                                            return keywordOrIdentifier(EGMLTokenId.FINALLY);
                                        break;
                                    default:
                                        return keywordOrIdentifier(EGMLTokenId.FINAL, c);
                                }
                            break;
                        case 'l':
                            if ((c = input.read()) == 'o'
                             && (c = input.read()) == 'a'
                             && (c = input.read()) == 't')
                                return keywordOrIdentifier(EGMLTokenId.FLOAT);
                            break;
                        case 'o':
                            if ((c = input.read()) == 'r')
                                return keywordOrIdentifier(EGMLTokenId.FOR);
                            break;
                    }
                    return finishIdentifier(c);

                case 'g':
                    if ((c = input.read()) == 'o'
                     && (c = input.read()) == 't'
                     && (c = input.read()) == 'o')
                        return keywordOrIdentifier(EGMLTokenId.GOTO);
                    return finishIdentifier(c);
                    
                case 'i':
                    switch (c = input.read()) {
                        case 'f':
                            return keywordOrIdentifier(EGMLTokenId.IF);
                        case 'm':
                            if ((c = input.read()) == 'p') {
                                switch (c = input.read()) {
                                    case 'l':
                                        if ((c = input.read()) == 'e'
                                         && (c = input.read()) == 'm'
                                         && (c = input.read()) == 'e'
                                         && (c = input.read()) == 'n'
                                         && (c = input.read()) == 't'
                                         && (c = input.read()) == 's')
                                            return keywordOrIdentifier(EGMLTokenId.IMPLEMENTS);
                                        break;
                                    case 'o':
                                        if ((c = input.read()) == 'r'
                                         && (c = input.read()) == 't')
                                            return keywordOrIdentifier(EGMLTokenId.IMPORT);
                                        break;
                                }
                            }
                            break;
                        case 'n':
                            switch (c = input.read()) {
                                case 's':
                                    if ((c = input.read()) == 't'
                                     && (c = input.read()) == 'a'
                                     && (c = input.read()) == 'n'
                                     && (c = input.read()) == 'c'
                                     && (c = input.read()) == 'e'
                                     && (c = input.read()) == 'o'
                                     && (c = input.read()) == 'f')
                                        return keywordOrIdentifier(EGMLTokenId.INSTANCEOF);
                                    break;
                                case 't':
                                    switch (c = input.read()) {
                                        case 'e':
                                            if ((c = input.read()) == 'r'
                                             && (c = input.read()) == 'f'
                                             && (c = input.read()) == 'a'
                                             && (c = input.read()) == 'c'
                                             && (c = input.read()) == 'e')
                                                return keywordOrIdentifier(EGMLTokenId.INTERFACE);
                                            break;
                                        default:
                                            return keywordOrIdentifier(EGMLTokenId.INT, c);
                                    }
                                    break;
                            }
                            break;
                    }
                    return finishIdentifier(c);

                case 'l':
                    if ((c = input.read()) == 'o'
                     && (c = input.read()) == 'n'
                     && (c = input.read()) == 'g')
                        return keywordOrIdentifier(EGMLTokenId.LONG);
                    return finishIdentifier(c);

                case 'n':
                    switch (c = input.read()) {
                        case 'a':
                            if ((c = input.read()) == 't'
                             && (c = input.read()) == 'i'
                             && (c = input.read()) == 'v'
                             && (c = input.read()) == 'e')
                                return keywordOrIdentifier(EGMLTokenId.NATIVE);
                            break;
                        case 'e':
                            if ((c = input.read()) == 'w')
                                return keywordOrIdentifier(EGMLTokenId.NEW);
                            break;
                        case 'u':
                            if ((c = input.read()) == 'l'
                             && (c = input.read()) == 'l')
                                return keywordOrIdentifier(EGMLTokenId.NULL);
                            break;
                    }
                    return finishIdentifier(c);

                case 'p':
                    switch (c = input.read()) {
                        case 'a':
                            if ((c = input.read()) == 'c'
                             && (c = input.read()) == 'k'
                             && (c = input.read()) == 'a'
                             && (c = input.read()) == 'g'
                             && (c = input.read()) == 'e')
                                return keywordOrIdentifier(EGMLTokenId.PACKAGE);
                            break;
                        case 'r':
                            switch (c = input.read()) {
                                case 'i':
                                    if ((c = input.read()) == 'v'
                                     && (c = input.read()) == 'a'
                                     && (c = input.read()) == 't'
                                     && (c = input.read()) == 'e')
                                        return keywordOrIdentifier(EGMLTokenId.PRIVATE);
                                    break;
                                case 'o':
                                    if ((c = input.read()) == 't'
                                     && (c = input.read()) == 'e'
                                     && (c = input.read()) == 'c'
                                     && (c = input.read()) == 't'
                                     && (c = input.read()) == 'e'
                                     && (c = input.read()) == 'd')
                                        return keywordOrIdentifier(EGMLTokenId.PROTECTED);
                                    break;
                            }
                            break;
                        case 'u':
                            if ((c = input.read()) == 'b'
                             && (c = input.read()) == 'l'
                             && (c = input.read()) == 'i'
                             && (c = input.read()) == 'c')
                                return keywordOrIdentifier(EGMLTokenId.PUBLIC);
                            break;
                    }
                    return finishIdentifier(c);

                case 'r':
                    if ((c = input.read()) == 'e'
                     && (c = input.read()) == 't'
                     && (c = input.read()) == 'u'
                     && (c = input.read()) == 'r'
                     && (c = input.read()) == 'n')
                        return keywordOrIdentifier(EGMLTokenId.RETURN);
                    return finishIdentifier(c);

                case 's':
                    switch (c = input.read()) {
                        case 'h':
                            if ((c = input.read()) == 'o'
                             && (c = input.read()) == 'r'
                             && (c = input.read()) == 't')
                                return keywordOrIdentifier(EGMLTokenId.SHORT);
                            break;
                        case 't':
                            switch (c = input.read()) {
                                case 'a':
                                    if ((c = input.read()) == 't'
                                     && (c = input.read()) == 'i'
                                     && (c = input.read()) == 'c')
                                        return keywordOrIdentifier(EGMLTokenId.STATIC);
                                    break;
                                case 'r':
                                    if ((c = input.read()) == 'i'
                                     && (c = input.read()) == 'c'
                                     && (c = input.read()) == 't'
                                     && (c = input.read()) == 'f'
                                     && (c = input.read()) == 'p')
                                        return keywordOrIdentifier(EGMLTokenId.STRICTFP);
                                    break;
                            }
                            break;
                        case 'u':
                            if ((c = input.read()) == 'p'
                             && (c = input.read()) == 'e'
                             && (c = input.read()) == 'r')
                                return keywordOrIdentifier(EGMLTokenId.SUPER);
                            break;
                        case 'w':
                            if ((c = input.read()) == 'i'
                             && (c = input.read()) == 't'
                             && (c = input.read()) == 'c'
                             && (c = input.read()) == 'h')
                                return keywordOrIdentifier(EGMLTokenId.SWITCH);
                            break;
                        case 'y':
                            if ((c = input.read()) == 'n'
                             && (c = input.read()) == 'c'
                             && (c = input.read()) == 'h'
                             && (c = input.read()) == 'r'
                             && (c = input.read()) == 'o'
                             && (c = input.read()) == 'n'
                             && (c = input.read()) == 'i'
                             && (c = input.read()) == 'z'
                             && (c = input.read()) == 'e'
                             && (c = input.read()) == 'd')
                                return keywordOrIdentifier(EGMLTokenId.SYNCHRONIZED);
                            break;
                    }
                    return finishIdentifier(c);

                case 't':
                    switch (c = input.read()) {
                        case 'h':
                            switch (c = input.read()) {
                                case 'i':
                                    if ((c = input.read()) == 's')
                                        return keywordOrIdentifier(EGMLTokenId.THIS);
                                    break;
                                case 'r':
                                    if ((c = input.read()) == 'o'
                                     && (c = input.read()) == 'w')
                                        switch (c = input.read()) {
                                            case 's':
                                                return keywordOrIdentifier(EGMLTokenId.THROWS);
                                            default:
                                                return keywordOrIdentifier(EGMLTokenId.THROW, c);
                                        }
                                    break;
                            }
                            break;
                        case 'r':
                            switch (c = input.read()) {
                                case 'a':
                                    if ((c = input.read()) == 'n'
                                     && (c = input.read()) == 's'
                                     && (c = input.read()) == 'i'
                                     && (c = input.read()) == 'e'
                                     && (c = input.read()) == 'n'
                                     && (c = input.read()) == 't')
                                        return keywordOrIdentifier(EGMLTokenId.TRANSIENT);
                                    break;
                                case 'u':
                                    if ((c = input.read()) == 'e')
                                        return keywordOrIdentifier(EGMLTokenId.TRUE);
                                    break;
                                case 'y':
                                    return keywordOrIdentifier(EGMLTokenId.TRY);
                            }
                            break;
                    }
                    return finishIdentifier(c);

                case 'v':
                    if ((c = input.read()) == 'o') {
                        switch (c = input.read()) {
                            case 'i':
                                if ((c = input.read()) == 'd')
                                    return keywordOrIdentifier(EGMLTokenId.VOID);
                                break;
                            case 'l':
                                if ((c = input.read()) == 'a'
                                 && (c = input.read()) == 't'
                                 && (c = input.read()) == 'i'
                                 && (c = input.read()) == 'l'
                                 && (c = input.read()) == 'e')
                                    return keywordOrIdentifier(EGMLTokenId.VOLATILE);
                                break;
                        }
                    }
                    return finishIdentifier(c);

                case 'w':
                    if ((c = input.read()) == 'h'
                     && (c = input.read()) == 'i'
                     && (c = input.read()) == 'l'
                     && (c = input.read()) == 'e')
                        return keywordOrIdentifier(EGMLTokenId.WHILE);
                    return finishIdentifier(c);

                // Rest of lowercase letters starting identifiers
                case 'h': case 'j': case 'k': case 'm': case 'o':
                case 'q': case 'u': case 'x': case 'y': case 'z':
                // Uppercase letters starting identifiers
                case 'A': case 'B': case 'C': case 'D': case 'E':
                case 'F': case 'G': case 'H': case 'I': case 'J':
                case 'K': case 'L': case 'M': case 'N': case 'O':
                case 'P': case 'Q': case 'R': case 'S': case 'T':
                case 'U': case 'V': case 'W': case 'X': case 'Y':
                case 'Z':
                case '$': case '_':
                    return finishIdentifier();
                    
                // All Character.isWhitespace(c) below 0x80 follow
                // ['\t' - '\r'] and [0x1c - ' ']
                case '\t':
                case '\n':
                case 0x0b:
                case '\f':
                case '\r':
                case 0x1c:
                case 0x1d:
                case 0x1e:
                case 0x1f:
                    return finishWhitespace();
                case ' ':
                    c = input.read();
                    if (c == EOF || !Character.isWhitespace(c)) { // Return single space as flyweight token
                        input.backup(1);
                        return tokenFactory.getFlyweightToken(EGMLTokenId.WHITESPACE, " ");
                    }
                    return finishWhitespace();

                case EOF:
                    return null;

                default:
                    if (c >= 0x80) { // lowSurr ones already handled above
                        c = translateSurrogates(c);
                        if (Character.isJavaIdentifierStart(c))
                            return finishIdentifier();
                        if (Character.isWhitespace(c))
                            return finishWhitespace();
                    }

                    // Invalid char
                    return token(EGMLTokenId.ERROR);
            } // end of switch (c)
        } // end of while(true)
    }

    private int translateSurrogates(int c) {
        if (Character.isHighSurrogate((char)c)) {
            int lowSurr = input.read();
            if (lowSurr != EOF && Character.isLowSurrogate((char)lowSurr)) {
                // c and lowSurr form the integer unicode char.
                c = Character.toCodePoint((char)c, (char)lowSurr);
            } else {
                // Otherwise it's error: Low surrogate does not follow the high one.
                // Leave the original character unchanged.
                // As the surrogates do not belong to any
                // specific unicode category the lexer should finally
                // categorize them as a lexical error.
                input.backup(1);
            }
        }
        return c;
    }

    private Token<EGMLTokenId> finishWhitespace() {
        while (true) {
            int c = input.read();
            // There should be no surrogates possible for whitespace
            // so do not call translateSurrogates()
            if (c == EOF || !Character.isWhitespace(c)) {
                input.backup(1);
                return tokenFactory.createToken(EGMLTokenId.WHITESPACE);
            }
        }
    }
    
    private Token<EGMLTokenId> finishIdentifier() {
        return finishIdentifier(input.read());
    }
    
    private Token<EGMLTokenId> finishIdentifier(int c) {
        while (true) {
            if (c == EOF || !Character.isJavaIdentifierPart(c = translateSurrogates(c))) {
                // For surrogate 2 chars must be backed up
                input.backup((c >= Character.MIN_SUPPLEMENTARY_CODE_POINT) ? 2 : 1);
                return tokenFactory.createToken(EGMLTokenId.IDENTIFIER);
            }
            c = input.read();
        }
    }

    private Token<EGMLTokenId> keywordOrIdentifier(EGMLTokenId keywordId) {
        return keywordOrIdentifier(keywordId, input.read());
    }

    private Token<EGMLTokenId> keywordOrIdentifier(EGMLTokenId keywordId, int c) {
        // Check whether the given char is non-ident and if so then return keyword
        if (c == EOF || !Character.isJavaIdentifierPart(c = translateSurrogates(c))) {
            // For surrogate 2 chars must be backed up
            input.backup((c >= Character.MIN_SUPPLEMENTARY_CODE_POINT) ? 2 : 1);
            return token(keywordId);
        } else // c is identifier part
            return finishIdentifier();
    }
    
    private Token<EGMLTokenId> finishNumberLiteral(int c, boolean inFraction) {
        while (true) {
            switch (c) {
                case '.':
                    if (!inFraction) {
                        inFraction = true;
                    } else { // two dots in the literal
                        return token(EGMLTokenId.FLOAT_LITERAL_INVALID);
                    }
                    break;
                case 'l': case 'L': // 0l or 0L
                    return token(EGMLTokenId.LONG_LITERAL);
                case 'd': case 'D':
                    return token(EGMLTokenId.DOUBLE_LITERAL);
                case 'f': case 'F':
                    return token(EGMLTokenId.FLOAT_LITERAL);
                case '0': case '1': case '2': case '3': case '4':
                case '5': case '6': case '7': case '8': case '9':
                    break;
                case 'e': case 'E': // exponent part
                    return finishFloatExponent();
                default:
                    input.backup(1);
                    return token(inFraction ? EGMLTokenId.DOUBLE_LITERAL
                            : EGMLTokenId.INT_LITERAL);
            }
            c = input.read();
        }
    }
    
    private Token<EGMLTokenId> finishFloatExponent() {
        int c = input.read();
        if (c == '+' || c == '-') {
            c = input.read();
        }
        if (c < '0' || '9' < c)
            return token(EGMLTokenId.FLOAT_LITERAL_INVALID);
        do {
            c = input.read();
        } while ('0' <= c && c <= '9'); // reading exponent
        switch (c) {
            case 'd': case 'D':
                return token(EGMLTokenId.DOUBLE_LITERAL);
            case 'f': case 'F':
                return token(EGMLTokenId.FLOAT_LITERAL);
            default:
                input.backup(1);
                return token(EGMLTokenId.DOUBLE_LITERAL);
        }
    }
    
    private Token<EGMLTokenId> token(EGMLTokenId id) {
        String fixedText = id.fixedText();
        return (fixedText != null)
                ? tokenFactory.getFlyweightToken(id, fixedText)
                : tokenFactory.createToken(id);
    }
    
    public void release() {
    }

    
}
