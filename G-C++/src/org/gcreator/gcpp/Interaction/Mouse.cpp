#ifndef _GCPP_INTERACTION_MOUSE_
#define _GCPP_INTERACTION_MOUSE_

#include "../declare.h"
#include <SDL/SDL.h>

int org::gcreator::Interaction::Mouse::getX(){
    SDL_Event event;

    if(SDL_PollEvent(&event)) {
        if(event.type==SDL_MOUSEMOTION)
        {
            return event.motion.x;
        }
    }
}

int org::gcreator::Interaction::Mouse::getY(){
	SDL_Event event;
	
    if(SDL_PollEvent(&event)) {
        if(event.type==SDL_MOUSEMOTION)
        {
            return event.motion.y;
        }
    }
}

#endif
