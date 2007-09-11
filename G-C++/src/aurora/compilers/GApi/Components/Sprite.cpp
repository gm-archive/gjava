#ifndef _GCPP_COMPONENTS_SPRITE_
#define _GCPP_COMPONENTS_SPRITE_

#include "../../declare.h"

GApi::Components::Sprite::Sprite()
{
	images = NULL;
}

int GApi::Components::Sprite::getImageCount()
{
	if(images==NULL)
		return 0;
	return sizeof(images)/sizeof(images[0]);
}

boolean GApi::Components::Sprite::setImage(int num, GApi::Components::Image* image)
{
	if(images==NULL)
		return false;
	if(num<0)
		return false;
	images[num] = image;
}

boolean GApi::Components::Sprite::freeImage(int num)
{
	return images[num]->free();
}

boolean GApi::Components::Sprite::freeSprite()
{
	for(int i = 0; i < this->getImageCount(); i++)
		if(images[i]!=NULL)
			if(!this->freeImage(i))
				return false;
	return true;
}

GApi::Components::Image** GApi::Components::Sprite::getImageArray()
{
	return images;
}

boolean GApi::Components::Sprite::setImageArray(GApi::Components::Image** array)
{
	if(array==NULL)
		return false;
	images = array;
	return true;
}

int GApi::Components::Sprite::getWidth()
{
	if(images[0]==NULL)
		return -1;
	return images[0]->img->w;
}

int GApi::Components::Sprite::getHeight()
{
	if(images[0]==NULL)
		return -1;
	return images[0]->img->h;
}

#endif
