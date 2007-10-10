#ifndef _GCPP_SCRIPTING_STRING_
#define _GCPP_SCRIPTING_STRING_

#include "../../declare.h"

String org::gcreator::Scripting::string::chr(int num)
{
	String* x = new String();
	x[0] = num;
	return *x;
}

int org::gcreator::Scripting::string::ord(String str)
{
	return str[0];
}

double org::gcreator::Scripting::string::real(String str)
{
	return atof(str.c_str());
}

String org::gcreator::Scripting::string::string_char_at(String str, int pos)
{
	String* x = new String();
	x[0] = str[pos];
	return *x;
}

String org::gcreator::Scripting::string::string_copy(String str, int start, int length)
{
	String *x = new String(str.substr(start, length));
	return *x;
}

int org::gcreator::Scripting::string::string_count(String substr, String str)
{
	int a = 0;
	int pos = 0;
	while(str.find(substr)!=String::npos)
	{
		a++;
		pos = str.find(substr) + strlen(substr.c_str());
	}
	return a;
}

String org::gcreator::Scripting::string::string_delete(String str, int start, int len)
{
	String *x = new String();
	
	int xpos = 0;
	int kpos = 0;
	while(xpos < start && str[kpos]!=0)
	{
		x[xpos] = str[kpos];
		xpos++;
		kpos++;
	}
	while(kpos < start + len && str[kpos] != 0)
	{
		kpos++;
	}
	while(str[kpos] != 0)
	{
		x[xpos] = str[kpos];
		xpos++;
		kpos++;
	}
	
	return *x;
}

String org::gcreator::Scripting::string::string_digits(String str)
{
	String *x = new String();
	int xpos = 0;
	int kpos = 0;
	while(str[kpos]!=0)
	{
		switch(str[kpos]){
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9': x[xpos] = str[kpos]; xpos++;
			default: kpos++;
		}
	}
	return *x;
}

#endif
