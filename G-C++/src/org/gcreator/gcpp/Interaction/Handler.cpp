#ifndef _GCPP_INTERACTION_HANDLER_
#define _GCPP_INTERACTION_HANDLER_

#include "../declare.h"
#include <SDL/SDL.h>

org::gcreator::Interaction::Handler::Handler()
{
    lastKey=SDL_GetKeyState(NULL);
    currentKey=lastKey;
    SDL_Event loop;
    while(SDL_PollEvent(&loop))
    {
        if(loop.type==SDL_MOUSEMOTION)
        {
            mouseX=event.motion.x;
            mouseY=event.motion.y;
        }
        if(loop.type==SDL_MOUSEBUTTONDOWN)
        {
            if(loop.button.button=SDL_BUTTON_LEFT)
            {
                mouseNow[0]=true;
            }
            if(loop.button.button=SDL_BUTTON_RIGHT)
            {
                mouseNow[1]=true;
            }
        }
    }
}

SDL_Event org::gcreator::Interaction::Handler::getEvent()
{
	return event;
}

int org::gcreator::Interaction::Handler::getMouseX()
{
    return mouseX;
}

int org::gcreator::Interaction::Handler::getMouseY()
{
    return mouseY;
}

bool org::gcreator::Interaction::Handler::getKeyPressed(SDLKey key)
{
    if (currentKey[key])
    {
        return true;
    }
    else
    {
        return false;
    }
}

bool org::gcreator::Interaction::Handler::getKeyReleased(SDLKey key)
{
    if(!currentKey[key] && lastKey[key])
    {
        return true;
    }
    else
    {
        return false;
    }
}

bool org::gcreator::Interaction::Handler::getMousePressed(int btn)
{
    if (mouseNow[btn])
    {
        return true;
    }
    else
    {
        return false;
    }
}

bool org::gcreator::Interaction::Handler::getMouseReleased(int btn)
{
    if (!mouseNow[btn] && mouseBeen[btn])
    {
        return true;
    }
    else
    {
        return false;
    }
}

bool org::gcreator::Interaction::Handler::getMiscEvent(int msc)
{
    if(misc[msc])
    {
        return true;
    }
    else
    {
        return false;
    }
}

void org::gcreator::Interaction::Handler::step()
{
    mouseBeen=mouseNow;
    lastKey=currentKey;
    currentKey=SDL_GetKeyState(NULL);
    SDL_Event loop;
    loop=getEvent();
    while (SDL_PollEvent(&loop)) 
    {
            //Miscelaneous Events
         if(loop.type==SDL_QUIT)
         {
             misc[X_OUT]=true;
         }
            //Mouse Events
         if(loop.type==SDL_MOUSEBUTTONDOWN)
         {
             if(loop.button.button=SDL_BUTTON_LEFT)
             {
                 mouseNow[0]=true;
             }
             if(loop.button.button=SDL_BUTTON_RIGHT)
             {
                 mouseNow[1]=true;
             }
         }
         if(loop.type==SDL_MOUSEMOTION)
         {
             mouseX=event.motion.x;
             mouseY=event.motion.y;
         }
         if(loop.type==SDL_MOUSEBUTTONUP)
         {
             if(loop.button.button=SDL_BUTTON_LEFT)
             {
                 mouseNow[0]=false;
             }
             if(loop.button.button=SDL_BUTTON_RIGHT)
             {
                 mouseNow[1]=false;
             }
         }   
    }
}
#endif
