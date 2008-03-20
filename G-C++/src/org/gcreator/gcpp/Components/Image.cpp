#ifndef _GCPP_COMPONENTS_IMAGE_
#define _GCPP_COMPONENTS_IMAGE_

#include "../declare.h"

org::gcreator::Components::Image::Image(SDL_Surface* bitmap)
{
	img = bitmap;
}

org::gcreator::Components::Image::Image(String& str){
        SDL_Surface* optimize=NULL;
        img=SDL_LoadBMP(str.c_str());
        if(img!=NULL){
            optimize=SDL_DisplayFormat(img);
            SDL_FreeSurface(img);
            if (img==NULL)
            {
                img=optimize;
                SDL_FreeSurface(optimize);
            }
			//There used to be some "return true" and "return false" here, but they were removed because constructors do not return booleans.
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
