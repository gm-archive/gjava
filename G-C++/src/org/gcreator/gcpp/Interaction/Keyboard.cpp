#ifndef _GCPP_INTERACTION_KEYBOARD_
#define _GCPP_INTERACTION_KEYBOARD_

#include "../declare.h"
#include <SDL/SDL.h>


String* org::gcreator::Interaction::Keyboard::getKeyState()
{

///bad code, crashed stuff
//when or if rewritten use a vector not old c style
return 0;
}

 
boolean org::gcreator::Interaction::Keyboard::isKeyPressed(std::string key)
{

SDL_Event event;

    while(SDL_PollEvent(&event))
     {

        if(event.type==SDL_KEYDOWN)
	 {

		SDLKey current;
		//TODO: make this one big function
		if(key=="Esc")
			current=SDLK_ESCAPE;
		//else if(key=="..  ony Esc currenty supported

           if(event.key.keysym.sym==current)
		{
		return true;
		}
	return false;

        }
    }


	///removed a lot of junk code yuck nasty stuff

	

    return false;
}

#endif
