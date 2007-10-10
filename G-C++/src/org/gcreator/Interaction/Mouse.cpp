#ifndef _GCPP_INTERACTION_MOUSE_
#define _GCPP_INTERACTION_MOUSE_

#include "../../declare.h"
#include <allegro.h>

int org::gcreator::Interaction::Mouse::getX(){
    return mouse_x;
}

int org::gcreator::Interaction::Mouse::getY(){
    return mouse_y;
}

#endif
