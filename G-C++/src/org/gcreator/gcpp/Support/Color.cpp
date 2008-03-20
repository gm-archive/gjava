#ifndef _GCPP_SUPPORT_COLOR_
#define _GCPP_SUPPORT_COLOR_

#include "../declare.h"

org::gcreator::Support::Color::Color(int r, int g, int b){
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

int org::gcreator::Support::Color::getRed(){
	return red;
}

int org::gcreator::Support::Color::getGreen(){
	return green;
}

int org::gcreator::Support::Color::getBlue(){
	return blue;
}

org::gcreator::Support::Color* org::gcreator::Support::Color::Darker(org::gcreator::Support::Color* color, int dark){
	return new org::gcreator::Support::Color(color->getRed()-dark,color->getGreen()-dark,color->getBlue()-dark);
}

org::gcreator::Support::Color* org::gcreator::Support::Color::Lighter(org::gcreator::Support::Color* color, int light){
	return new org::gcreator::Support::Color(color->getRed()+light,color->getGreen()+light,color->getBlue()+light);
}

org::gcreator::Support::Color* org::gcreator::Support::Color::Merge(org::gcreator::Support::Color* c1, org::gcreator::Support::Color* c2){
	return new org::gcreator::Support::Color((c1->getRed()+c2->getRed()) / 2, (c1->getGreen()+c2->getRed()) / 2, (c1->getBlue()+c2->getRed()) / 2);
}

org::gcreator::Support::Color* Red = new org::gcreator::Support::Color(255,0,0);
org::gcreator::Support::Color* Green = new org::gcreator::Support::Color(0,255,0);
org::gcreator::Support::Color* Blue = new org::gcreator::Support::Color(0,0,255);
org::gcreator::Support::Color* Yellow = new org::gcreator::Support::Color(255,255,0);
org::gcreator::Support::Color* Purple = new org::gcreator::Support::Color(255,0,255);
org::gcreator::Support::Color* LightBlue = new org::gcreator::Support::Color(0,255,255);
org::gcreator::Support::Color* Black = new org::gcreator::Support::Color(0,0,0);
org::gcreator::Support::Color* White = new org::gcreator::Support::Color(255,255,255);

#endif
