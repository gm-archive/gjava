#ifndef _GCPP_COMPONENTS_IMAGE_
#define _GCPP_COMPONENTS_IMAGE_

#include "../declare.h"

org::gcreator::Components::Image::Image(SDL_Surface* bitmap)
{
	img = bitmap;
}

org::gcreator::Components::Image::Image(std::string str){
        SDL_Surface* tmp=NULL;
        tmp=SDL_LoadBMP(str.c_str());
        img = SDL_DisplayFormat(tmp);
        SDL_FreeSurface(tmp);
        //if(img!=NULL){
        //    optimize=SDL_DisplayFormat(img);
        //    SDL_FreeSurface(img);
        //    if (img==NULL)
        //    {
        //        img=optimize;
        //        SDL_FreeSurface(optimize);
        //    }
            //There used to be some "return true" and "return false" here, but they were removed because constructors do not return booleans.
        //}
}

org::gcreator::Components::Image::Image()
{
	img = NULL;
}

String org::gcreator::Components::Image::getName()
{
	return NULL;
}

SDL_Surface* org::gcreator::Components::Image::getImage()
{
    return img;
}

boolean org::gcreator::Components::Image::freeImage()
{
	SDL_FreeSurface(img);
	if(img==NULL)
		return true;
	return false;
}

#endif
