#ifndef _GCPP_COMPONENTS_APPLICATION_
#define _GCPP_COMPONENTS_APPLICATION_

#include "../declare.h"

org::gcreator::Components::Application::Application(int _argc, char** _argv){
    this->argc = argc;
	this->argv = argv;
    done=false;
}

SDL_Surface* org::gcreator::Components::Application::gameInit(int W, int H, int BPP, std::string& caption, int _fps)
{
        if(SDL_Init(SDL_INIT_EVERYTHING)==-1){
            return NULL;
        }
        screen=SDL_SetVideoMode(W,H,BPP,SDL_SWSURFACE);
        Mix_OpenAudio(22050, MIX_DEFAULT_FORMAT, 2, 4096);
        if(screen==NULL){
            return NULL;
        }
        fps=_fps;
        SDL_WM_SetCaption(caption.c_str(), NULL);
	return screen;
}

SDL_Surface* org::gcreator::Components::Application::getScreenSurface()
{
	return screen;
}

org::gcreator::Interaction::Keyboard* org::gcreator::Components::Application::getKeyboard()
{
    return keyboard;
}

org::gcreator::Interaction::Mouse* org::gcreator::Components::Application::getMouse()
{
    return mouse;
}

boolean org::gcreator::Components::Application::gameEnd()
{
    done=true;
}

boolean org::gcreator::Components::Application::stopped()
{
    return done;
}

void org::gcreator::Components::Application::setFPS(int _fps)
{
	fps=_fps;
}

int org::gcreator::Components::Application::getFPS()
{
	return fps;
}

void org::gcreator::Components::Application::regulateFPS()
{
	SDL_Delay((1000/getFPS()));
}

#endif
