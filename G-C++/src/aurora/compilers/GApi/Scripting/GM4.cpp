#ifndef _GCPP_SCRIPTING_GM4_
#define _GCPP_SCRIPTING_GM4_

#include "../../declare.h"

int GApi::Scripting::GM4::min3(int a, int b, int c)
{
	if(a<=b&&a<=c)
		return a;
	if(b<c)
		return b;
	return c;
}

int GApi::Scripting::GM4::max3(int a, int b, int c)
{
	if(a>=b&&a>=c)
		return a;
	if(b>c)
		return b;
	return c;
}

int GApi::Scripting::GM4::mean3(int a, int b, int c)
{
	return (a+b+c)/3;
}

float GApi::Scripting::GM4::min3(float a, float b, float c)
{
	if(a<=b&&a<=c)
		return a;
	if(b<c)
		return b;
	return c;
}

float GApi::Scripting::GM4::max3(float a, float b, float c)
{
	if(a>=b&&a>=c)
		return a;
	if(b>c)
		return b;
	return c;
}

float GApi::Scripting::GM4::mean3(float a, float b, float c)
{
	return (a+b+c)/3;
}

double GApi::Scripting::GM4::min3(double a, double b, double c)
{
	if(a<=b&&a<=c)
		return a;
	if(b<c)
		return b;
	return c;
}

double GApi::Scripting::GM4::max3(double a, double b, double c)
{
	if(a>=b&&a>=c)
		return a;
	if(b>c)
		return b;
	return c;
}

double GApi::Scripting::GM4::mean3(double a, double b, double c)
{
	return (a+b+c)/3;
}

#endif
