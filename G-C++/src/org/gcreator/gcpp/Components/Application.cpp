#ifndef _GCPP_COMPONENTS_APPLICATION_
#define _GCPP_COMPONENTS_APPLICATION_

#include "../compilers/declare.h"

org::gcreator::Components::Application::Application(int _argc, char** _argv){
	this->argc = argc;
	this->argv = argv;
	while(!key[KEY_ESC])
		;
}

org::gcreator::Components::Application* Game;

#endif
