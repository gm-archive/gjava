#ifndef _GCPP_COMPONENTS_APPLICATION_
#define _GCPP_COMPONENTS_APPLICATION_

#include "../declare.h"

org::gcreator::Components::Application::Application(int _argc, char** _argv){
        this->argc = argc;
	this->argv = argv;
	while(!org::gcreator::Interaction::Keyboard::isKeyPressed("Esc"))
	{
		;
	}
}

SDL_Surface* org::gcreator::Components::Application::gameInit(int W, int H, int BPP, String& caption){
        if(SDL_Init(SDL_INIT_EVERYTHING)==-1){
            return NULL;
        }
        screen=SDL_SetVideoMode(W,H,BPP,SDL_SWSURFACE);
        Mix_OpenAudio(22050, MIX_DEFAULT_FORMAT, 2, 4096)
        if(screen==NULL){
            return NULL;
        }
        SDL_WM_SetCaption(caption.c_str(), NULL);
        return screen;
}

SDL_Surface* org::gcreator::Components::Application::getScreenSurface()
{
	return screen;
}

org::gcreator::Components::Application* Game;

#endif
