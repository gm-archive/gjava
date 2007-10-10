#ifndef _GCPP_SCRIPTING_GM4_
#define _GCPP_SCRIPTING_GM4_

#include "../../declare.h"

int org::gcreator::Scripting::GM4::min3(int a, int b, int c)
{
	if(a<=b&&a<=c)
		return a;
	if(b<c)
		return b;
	return c;
}

int org::gcreator::Scripting::GM4::max3(int a, int b, int c)
{
	if(a>=b&&a>=c)
		return a;
	if(b>c)
		return b;
	return c;
}

int org::gcreator::Scripting::GM4::mean3(int a, int b, int c)
{
	return (a+b+c)/3;
}

float org::gcreator::Scripting::GM4::min3(float a, float b, float c)
{
	if(a<=b&&a<=c)
		return a;
	if(b<c)
		return b;
	return c;
}

float org::gcreator::Scripting::GM4::max3(float a, float b, float c)
{
	if(a>=b&&a>=c)
		return a;
	if(b>c)
		return b;
	return c;
}

float org::gcreator::Scripting::GM4::mean3(float a, float b, float c)
{
	return (a+b+c)/3;
}

double org::gcreator::Scripting::GM4::min3(double a, double b, double c)
{
	if(a<=b&&a<=c)
		return a;
	if(b<c)
		return b;
	return c;
}

double org::gcreator::Scripting::GM4::max3(double a, double b, double c)
{
	if(a>=b&&a>=c)
		return a;
	if(b>c)
		return b;
	return c;
}

double org::gcreator::Scripting::GM4::mean3(double a, double b, double c)
{
	return (a+b+c)/3;
}

#endif
