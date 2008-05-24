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

boolean org::gcreator::Components::Sprite::freeImage(int num)
{
	return images[num]->freeImage();
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
    /*if(array==NULL){ // YOU HAVE TO PUT THE {
        cout<<"array==NULL"; //THE "IF" WAS ASSIGNED TO "log", SO IT ALWAYS RETURNED false!
        cout<<"returning false"; //you should put this BEFORE the return statement
        return false;
    }
    cout<<"assigning array";
    for(int i=0;i<sizeof(array)/sizeof(array[0])-1;i++){
    images[i]=array[i];
    cout<<"returning true";
    }*/
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

int org::gcreator::Components::Sprite::blit(int x, int y, int _frame, org::gcreator::Components::Application game)
{
        SDL_Rect s;
        s.x=0;
        s.y=0;
	s.w = 32;
	s.h = 32;
	SDL_Rect d;
	d.x = x;
	d.y = y;
	d.w = 32;
	d.h = 32;
        if(_frame==-1)
        {
           SDL_BlitSurface(((getImageArray())[0])->getImage(),&s,game.getScreenSurface(), &d);
        }
        else
        {
            SDL_BlitSurface(((getImageArray())[frame])->getImage(),NULL,game.getScreenSurface(), &s);
            setFrame(_frame++);
            if(getFrame()>getImageCount())
            {
                setFrame(0);
            }
        }
}

#endif
