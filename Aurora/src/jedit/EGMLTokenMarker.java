/*
 * Copyright (C) 2007 Quadduc <quadduc@gmail.com>
 *
 * This file is part of Lateral GM.
 * Lateral GM is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for details.
 */

package jedit;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.swing.text.Segment;

public class EGMLTokenMarker extends TokenMarker
	{
	private static KeywordMap gmlKeywords;

	private KeywordMap stdKeywords, customKeywords;
	private int lastOffset;
	private int lastKeyword;
	private static final String EGML_TYPEDEFINERS, EGML_KNOWNCLASSES, EGML_STATEMENTS;
	private static final byte DQSTRING = Token.INTERNAL_FIRST;
	private static final byte SQSTRING = Token.INTERNAL_FIRST + 1;

	static
		{
		InputStream is = EGMLTokenMarker.class.getResourceAsStream("egmlkeywords.properties");
		Properties p = new Properties();
		try
			{
			p.load(is);
			}
		catch (IOException e)
			{
			e.printStackTrace();
			}
		EGML_TYPEDEFINERS = p.getProperty("TYPEDEFINERS");
		EGML_KNOWNCLASSES = p.getProperty("KNOWNCLASSES");
		EGML_STATEMENTS = p.getProperty("STATEMENTS");
		p.clear();
		}

	public EGMLTokenMarker()
		{
		stdKeywords = getKeywords();
		customKeywords = null;
		}

	 
    //SuppressWarnings("fallthrough")
	protected byte markTokensImpl(byte token, Segment line, int lineIndex)
		{
		char[] array = line.array;
		int offset = line.offset;
		lastOffset = offset;
		lastKeyword = offset;
		int length = line.count + offset;
		loop: for (int i = offset; i < length; i++)
			{
			int i1 = (i + 1);
			char c = array[i];
			switch (token)
				{
				case Token.NULL:
					switch (c)
						{
						case '"':
							doKeyword(line,i,c);
							addToken(i - lastOffset,token);
							token = DQSTRING;
							lastOffset = lastKeyword = i;
							break;
						case '\'':
							doKeyword(line,i,c);
							addToken(i - lastOffset,token);
							token = SQSTRING;
							lastOffset = lastKeyword = i;
							break;
						case '/':
							doKeyword(line,i,c);
							if (length - i > 1)
								{
								switch (array[i1])
									{
									case '*':
										addToken(i - lastOffset,token);
										lastOffset = lastKeyword = i;
										if (length - i > 2 && array[i + 2] == '*')
											token = Token.COMMENT2;
										else
											token = Token.COMMENT1;
										break;
									case '/':
										addToken(i - lastOffset,token);
										addToken(length - i,Token.COMMENT1);
										lastOffset = lastKeyword = length;
										break loop;
									}
								}
							break;
						case '{':
						case '}':
							addToken(i - lastOffset,token);
							addToken(1,Token.KEYWORD1);
							token = Token.NULL;
							lastOffset = lastKeyword = i1;
							break;
						default:
							if (!Character.isLetterOrDigit(c) && c != '_') doKeyword(line,i,c);
							break;
						}
				case Token.COMMENT1:
				case Token.COMMENT2:
					if (c == '*' && length - i > 1)
						{
						if (array[i1] == '/')
							{
							i++;
							addToken((i + 1) - lastOffset,token);
							token = Token.NULL;
							lastOffset = lastKeyword = i + 1;
							}
						}
					break;
				case DQSTRING:
					if (c == '"')
						{
						addToken(i1 - lastOffset,Token.LITERAL1);
						token = Token.NULL;
						lastOffset = lastKeyword = i1;
						}
					break;
				case SQSTRING:
					if (c == '\'')
						{
						addToken(i1 - lastOffset,Token.LITERAL1);
						token = Token.NULL;
						lastOffset = lastKeyword = i1;
						}
					break;
				default:
					throw new InternalError("Invalid state: " + token);
				}
			}
		if (token == Token.NULL) doKeyword(line,length,'\0');

		switch (token)
			{
			case DQSTRING:
			case SQSTRING:
				addToken(length - lastOffset,Token.LITERAL1);
				break;
			default:
				addToken(length - lastOffset,token);
				break;
			}
		return token;
		}

	public void setCustomKeywords(KeywordMap km)
		{
		customKeywords = km;
		}

	public static KeywordMap getKeywords()

		{
		if (gmlKeywords == null)
			{
			gmlKeywords = new KeywordMap(false);
			// Operators
			gmlKeywords.add("and",Token.OPERATOR);
			gmlKeywords.add("or",Token.OPERATOR);
                        gmlKeywords.add("xor",Token.OPERATOR);
			gmlKeywords.add("div",Token.OPERATOR);
			gmlKeywords.add("mod",Token.OPERATOR);
			// Constants
                        String[] s = EGML_TYPEDEFINERS.split(" ");
                        for (int ii =0; ii<s.length;ii++) //1.4
			//for (String keyword : EGML_TYPEDEFINERS.split(" ")) 1.5+
				{
				gmlKeywords.add(s[ii],Token.KEYWORD2);
				}
			// Variables
                        s = EGML_KNOWNCLASSES.split(" ");
                        for (int ii =0; ii<s.length;ii++) //1.4
			//for (String keyword : EGML_KNOWNCLASSES.split(" "))
				{
				gmlKeywords.add(s[ii],Token.LITERAL1);
				}
			// Functions
                        s = EGML_STATEMENTS.split(" ");
                        for (int ii =0; ii<s.length;ii++) //1.4
			//for (String keyword : EGML_STATEMENTS.split(" ")) 1.5+
				{
				gmlKeywords.add(s[ii],Token.KEYWORD3);
				}
			}
		return gmlKeywords;
		}

	private boolean doKeyword(Segment line, int i, char c)
		{
		int i1 = i + 1;

		int len = i - lastKeyword;
		byte id = stdKeywords.lookup(line,lastKeyword,len);
		if (id == Token.NULL && customKeywords != null)
			id = customKeywords.lookup(line,lastKeyword,len);
		if (id != Token.NULL)
			{
			if (lastKeyword != lastOffset) addToken(lastKeyword - lastOffset,Token.NULL);
			addToken(len,id);
			lastOffset = i;
			}
		lastKeyword = i1;
		return false;
		}
	}
