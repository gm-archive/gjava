#ifndef _GCPP_INTERACTION_KEYBOARD_
#define _GCPP_INTERACTION_KEYBOARD_

#include "../compilers/declare.h"
#include <allegro.h>

String* org::gcreator::Interaction::Keyboard::getPressedKeys(){
    String* a = (String*) malloc(sizeof(String)*100);
    int b = 0;
    if(key[KEY_A])
        a[b++] = "A";
    if(key[KEY_B])
        a[b++] = "B";
    if(key[KEY_C])
        a[b++] = "C";
    if(key[KEY_D])
        a[b++] = "D";
    if(key[KEY_E])
        a[b++] = "E";
    if(key[KEY_F])
        a[b++] = "F";
    if(key[KEY_G])
        a[b++] = "G";
    if(key[KEY_H])
        a[b++] = "H";
    if(key[KEY_I])
        a[b++] = "I";
    if(key[KEY_J])
        a[b++] = "J";
    if(key[KEY_K])
        a[b++] = "K";
    if(key[KEY_L])
        a[b++] = "L";
    if(key[KEY_M])
        a[b++] = "M";
    if(key[KEY_N])
        a[b++] = "N";
    if(key[KEY_O])
        a[b++] = "O";
    if(key[KEY_P])
        a[b++] = "P";
    if(key[KEY_Q])
        a[b++] = "Q";
    if(key[KEY_R])
        a[b++] = "R";
    if(key[KEY_S])
        a[b++] = "S";
    if(key[KEY_T])
        a[b++] = "T";
    if(key[KEY_U])
        a[b++] = "U";
    if(key[KEY_V])
        a[b++] = "V";
    if(key[KEY_W])
        a[b++] = "W";
    if(key[KEY_X])
        a[b++] = "X";
    if(key[KEY_Y])
        a[b++] = "Y";
    if(key[KEY_Z])
        a[b++] = "Z";
    if(key[KEY_0]||key[KEY_0_PAD])
        a[b++] = "0";
    if(key[KEY_1]||key[KEY_1_PAD])
        a[b++] = "1";
    if(key[KEY_2]||key[KEY_2_PAD])
        a[b++] = "2";
    if(key[KEY_3]||key[KEY_3_PAD])
        a[b++] = "3";
    if(key[KEY_4]||key[KEY_4_PAD])
        a[b++] = "4";
    if(key[KEY_5]||key[KEY_5_PAD])
        a[b++] = "5";
    if(key[KEY_6]||key[KEY_6_PAD])
        a[b++] = "6";
    if(key[KEY_7]||key[KEY_7_PAD])
        a[b++] = "7";
    if(key[KEY_8]||key[KEY_8_PAD])
        a[b++] = "8";
    if(key[KEY_9]||key[KEY_9_PAD])
        a[b++] = "9";
    if(key[KEY_ESC])
        a[b++] = "Esc";
    if(key[KEY_TILDE])
        a[b++] = "~";
    if(key[KEY_MINUS])
        a[b++] = "-";
    if(key[KEY_EQUALS])
        a[b++] = "=";
    if(key[KEY_BACKSPACE])
        a[b++] = "Backspace";
    if(key[KEY_TAB])
        a[b++] = "Tab";
    if(key[KEY_ENTER])
        a[b++] = "\n";
    if(key[KEY_SPACE])
        a[b++] = " ";
    if(key[KEY_INSERT])
        a[b++] = "Insert";
    if(key[KEY_DEL])
        a[b++] = "Delete";
    if(key[KEY_ALT])
        a[b++] = "Alt";
    if(key[KEY_LSHIFT]||key[KEY_RSHIFT])
        a[b++] = "Shift";
    if(key[KEY_F1])
        a[b++] = "F1";
    if(key[KEY_F2])
        a[b++] = "F2";
    if(key[KEY_F3])
        a[b++] = "F3";
    if(key[KEY_F4])
        a[b++] = "F4";
    if(key[KEY_F5])
        a[b++] = "F5";
    if(key[KEY_F6])
        a[b++] = "F6";
    if(key[KEY_F7])
        a[b++] = "F7";
    if(key[KEY_F8])
        a[b++] = "F8";
    if(key[KEY_F9])
        a[b++] = "F9";
    if(key[KEY_F10])
        a[b++] = "F10";
    if(key[KEY_F11])
        a[b++] = "F11";
    if(key[KEY_F12])
        a[b++] = "F12";
    if(key[KEY_LEFT])
        a[b++] = "Left";
    if(key[KEY_RIGHT])
        a[b++] = "Right";
    if(key[KEY_DOWN])
        a[b++] = "Down";
    if(key[KEY_UP])
        a[b++] = "Up";
}

boolean org::gcreator::Interaction::Keyboard::isKeyPressed(String key){
    //First, let's do a fast checking
    if(key == "Up")
        return (key[KEY_UP]!=0);
    if(key == "Down")
        return (key[KEY_DOWN]!=0);
    if(key == "Left")
        return (key[KEY_LEFT]!=0);
    if(key == "Right")
        return (key[KEY_RIGHT]!=0);
    //This fast checking should be increased
    String* a = getPressedKeys();
    for(int i = 0; i < sizeof(a)/sizeof(a[0]); i++){
        if(key==a[i])
            return true;
    }
    return false;
}

#endif
