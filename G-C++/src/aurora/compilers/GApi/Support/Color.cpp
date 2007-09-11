#ifndef _GCPP_SUPPORT_COLOR_
#define _GCPP_SUPPORT_COLOR_

#include "../../declare.h"

GApi::Support::Color::Color(int r, int g, int b){
	int _r = r;
	int _g = g;
	int _b = b;
	if(_r<0)
		_r = 0;
	if(_r>255)
		_r = 255;
	if(_g<0)
		_g = 0;
	if(_g>255)
		_g = 255;
	if(_b>255)
		_b = 255;
	red = _r;
	green = _g;
	blue = _b;
}

int GApi::Support::Color::getRed(){
	return red;
}

int GApi::Support::Color::getGreen(){
	return green;
}

int GApi::Support::Color::getBlue(){
	return blue;
}

GApi::Support::Color* GApi::Support::Color::Darker(GApi::Support::Color* color, int dark){
	return new GApi::Support::Color(color->getRed()-dark,color->getGreen()-dark,color->getBlue()-dark);
}

GApi::Support::Color* GApi::Support::Color::Lighter(GApi::Support::Color* color, int light){
	return new GApi::Support::Color(color->getRed()+light,color->getGreen()+light,color->getBlue()+light);
}

GApi::Support::Color* GApi::Support::Color::Merge(GApi::Support::Color* c1, GApi::Support::Color* c2){
	return new GApi::Support::Color((c1->getRed()+c2->getRed()) / 2, (c1->getGreen()+c2->getRed()) / 2, (c1->getBlue()+c2->getRed()) / 2);
}

GApi::Support::Color* Red = new GApi::Support::Color(255,0,0);
GApi::Support::Color* Green = new GApi::Support::Color(0,255,0);
GApi::Support::Color* Blue = new GApi::Support::Color(0,0,255);
GApi::Support::Color* Yellow = new GApi::Support::Color(255,255,0);
GApi::Support::Color* Purple = new GApi::Support::Color(255,0,255);
GApi::Support::Color* LightBlue = new GApi::Support::Color(0,255,255);
GApi::Support::Color* Black = new GApi::Support::Color(0,0,0);
GApi::Support::Color* White = new GApi::Support::Color(255,255,255);

#endif
