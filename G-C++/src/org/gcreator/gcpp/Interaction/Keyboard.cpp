#ifndef _GCPP_INTERACTION_KEYBOARD_
#define _GCPP_INTERACTION_KEYBOARD_

#include "../compilers/declare.h"
#include <SDL/SDL.h>


String* org::gcreator::Interaction::Keyboard::getKeyState(){
    String* a = (String*) malloc(sizeof(String)*100);
    int b = 0;
    Uint8 *key=SDL_GetKeyStates(NULL);
    if(key[SDLK_a])
        a[b++] = "A";
    if(key[SDLK_b])
        a[b++] = "B";
    if(key[SDLK_c])
        a[b++] = "C";
    if(key[SDLK_d])
        a[b++] = "D";
    if(key[SDLK_e])
        a[b++] = "E";
    if(key[SDLK_f])
        a[b++] = "F";
    if(key[SDLK_g])
        a[b++] = "G";
    if(key[SDLK_h])
        a[b++] = "H";
    if(key[SDLK_i])
        a[b++] = "I";
    if(key[SDLK_j])
        a[b++] = "J";
    if(key[SDLK_k])
        a[b++] = "K";
    if(key[SDLK_l])
        a[b++] = "L";
    if(key[SDLK_m])
        a[b++] = "M";
    if(key[SDLK_n])
        a[b++] = "N";
    if(key[SDLK_o])
        a[b++] = "O";
    if(key[SDLK_p])
        a[b++] = "P";
    if(key[SDLK_q])
        a[b++] = "Q";
    if(key[SDLK_r])
        a[b++] = "R";
    if(key[SDLK_s])
        a[b++] = "S";
    if(key[SDLK_t])
        a[b++] = "T";
    if(key[SDLK_u])
        a[b++] = "U";
    if(key[SDLK_v])
        a[b++] = "V";
    if(key[SDLK_w])
        a[b++] = "W";
    if(key[SDLK_x])
        a[b++] = "X";
    if(key[SDLK_y])
        a[b++] = "Y";
    if(key[SDLK_z])
        a[b++] = "Z";
    if(key[KEY_0]||key[SDL_KP0])
        a[b++] = "0";
    if(key[KEY_1]||key[SDL_KP1])
        a[b++] = "1";
    if(key[KEY_2]||key[SDL_KP2])
        a[b++] = "2";
    if(key[KEY_3]||key[SDL_KP3])
        a[b++] = "3";
    if(key[KEY_4]||key[SDL_KP4])
        a[b++] = "4";
    if(key[KEY_5]||key[SDL_KP5])
        a[b++] = "5";
    if(key[KEY_6]||key[SDL_KP6])
        a[b++] = "6";
    if(key[KEY_7]||key[SDL_KP7])
        a[b++] = "7";
    if(key[KEY_8]||key[SDL_KP8])
        a[b++] = "8";
    if(key[KEY_9]||key[SDL_KP9])
        a[b++] = "9";
    if(key[SDLK_ESCAPE])
        a[b++] = "Esc";
    //if(key[KEY_TILDE]) NO SDL SUPPORT
    //    a[b++] = "~";
    if(key[SDLK_MINUS])
        a[b++] = "-";
    if(key[SDLK_EQUALS])
        a[b++] = "=";
    if(key[SDLK_BACKSPACE])
        a[b++] = "Backspace";
    if(key[SDLK_TAB])
        a[b++] = "Tab";
    if(key[SDLK_RETURN])
        a[b++] = "\n";
    if(key[SDLK_SPACE])
        a[b++] = " ";
    if(key[SDLK_INSERT])
        a[b++] = "Insert";
    if(key[SDLK_DELETE])
        a[b++] = "Delete";
    if(key[SDLK_ALT])
        a[b++] = "Alt";
    if(key[SDLK_LSHIFT]||key[SDLK_RSHIFT])
        a[b++] = "Shift";
    if(key[SDLK_F1])
        a[b++] = "F1";
    if(key[SDLK_F2])
        a[b++] = "F2";
    if(key[SDLK_F3])
        a[b++] = "F3";
    if(key[SDLK_F4])
        a[b++] = "F4";
    if(key[SDLK_F5])
        a[b++] = "F5";
    if(key[SDLK_F6])
        a[b++] = "F6";
    if(key[SDLK_F7])
        a[b++] = "F7";
    if(key[SDLK_F8])
        a[b++] = "F8";
    if(key[SDLK_F9])
        a[b++] = "F9";
    if(key[SDLK_F10])
        a[b++] = "F10";
    if(key[SDLK_F11])
        a[b++] = "F11";
    if(key[SDLK_F12])
        a[b++] = "F12";
    if(key[SDLK_LEFT])
        a[b++] = "Left";
    if(key[SDLK_RIGHT])
        a[b++] = "Right";
    if(key[SDLK_DOWN])
        a[b++] = "Down";
    if(key[SDLK_UP])
        a[b++] = "Up";
}

boolean org::gcreator::Interaction::Keyboard::isKeyPressed(String key){
    //First, let's do a fast checking
    /*SDL_Event event;

    if(SDL_PollEvent(&event)) {
        if(event.type==SDL_KEYDOWN) {
            switch(event.key.keysym.sym) {
                case SDLK_UP:if(key=="Up")return 1;break;
                case SDLK_DOWN:if(key=="Down")return 1;break;
                case SDLK_LEFT:if(key=="Left")return 1;break;
                case SDLK_RIGHT:if(key=="Right")return 1;break;
            }
        }
    }*/

    //This fast checking should be increased
    String* a = getGetState();
    for(int i = 0; i < sizeof(a)/sizeof(a[0]); i++){
        if(key==a[i])
            return true;
    }
    return false;
}

#endif
