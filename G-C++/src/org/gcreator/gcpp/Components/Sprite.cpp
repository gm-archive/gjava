#ifndef _GCPP_COMPONENTS_SPRITE_
#define _GCPP_COMPONENTS_SPRITE_

#include "../declare.h"

org::gcreator::Components::Sprite::Sprite()
{
	images = NULL;
	frame = 0;
}

int org::gcreator::Components::Sprite::getImageCount()
{
	if(images==NULL)
		return 0;
	return sizeof(images)/sizeof(images[0]);
}

boolean org::gcreator::Components::Sprite::setImage(int num, org::gcreator::Components::Image* image)
{
	if(images==NULL)
		return false;
	if(num<0)
		return false;
	images[num] = image;
}

boolean org::gcreator::Components::Sprite::freeImage(int num)
{
	return images[num]->free();
}

boolean org::gcreator::Components::Sprite::freeSprite()
{
	for(int i = 0; i < this->getImageCount(); i++)
		if(images[i]!=NULL)
			if(!this->freeImage(i))
				return false;
	return true;
}

org::gcreator::Components::Image** org::gcreator::Components::Sprite::getImageArray()
{
	return images;
}

boolean org::gcreator::Components::Sprite::setImageArray(org::gcreator::Components::Image** array)
{
	if(array==NULL)
		return false;
	images = array;
	return true;
}

int org::gcreator::Components::Sprite::getWidth()
{
	if(images[0]==NULL)
		return -1;
	return images[0]->img->w;
}

int org::gcreator::Components::Sprite::getHeight()
{
	if(images[0]==NULL)
		return -1;
	return images[0]->img->h;
}

int org::gcreator::Components::Sprite::getFrame()
{
        return frame;
}

void org::gcreator::Components::Sprite::setFrame(int _frame)
{
        frame=_frame;
}

int org::gcreator::Components::Sprite::blit(org::gcreator::Components::Sprite* img, int x, int y, int _frame)
{
        SDL_Rect s;
        s.x=x;
        s.y=y;
        if(_frame==-1)
        {
            SDL_BlitSurface((img->getImageArray()[0])->img,NULL, Application::getScreenSurface(), &s);
        }
        else
        {
            SDL_BlitSurface((img->getImageArray()[frame])->img,NULL, Application::getScreenSurface(), &s);
            setFrame(_frame++);
            if(getFrame()>getImageCount())
            {
                setFrame(0);
            }
        }
}

#endif
