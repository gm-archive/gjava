#ifndef _GCPP_COMPONENTS_IMAGE_
#define _GCPP_COMPONENTS_IMAGE_

#include "../compilers/declare.h"

org::gcreator::Components::Image::Image(SDL_surface* bitmap)
{
	img = bitmap;
}

org::gcreator::Components::Image::Image(String str){
        SDL_Surface* optimize=NULL;
        img=SDL_LoadBMP(str);
        if(img!=NULL){
            optimize=SDL_DisplayFormat(img);
            SDL_FreeSurface(img)
        }
}

org::gcreator::Components::Image::Image()
{
	img = NULL;
}

String org::gcreator::Components::Image::getName()
{
	return NULL;
}

boolean org::gcreator::Components::Image::free()
{
	SDL_FreeSurface(img);
	if(img==NULL)
		return true;
	return false;
}

#endif
