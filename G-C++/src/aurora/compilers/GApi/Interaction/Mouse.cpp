#ifndef _GCPP_INTERACTION_MOUSE_
#define _GCPP_INTERACTION_MOUSE_

#include "../../declare.h"
#include <allegro.h>

int GApi::Interaction::Mouse::getX(){
    return mouse_x;
}

int GApi::Interaction::Mouse::getY(){
    return mouse_y;
}

#endif
