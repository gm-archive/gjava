#ifndef _GCPP_INTERACTION_DECLARE_
#define _GCPP_INTERACTION_DECLARE_

class org::gcreator::Interaction::Handler
{
private:
    SDL_Event event;
    
    int mouseX;
    int mouseY;
    
    bool *mouseBeen;
    bool *mouseNow;
    
    bool misc[1];
    
    Uint8 *lastKey;
    Uint8 *currentKey;
public:
    Handler();
    
    SDL_Event getEvent();
    
    int getMouseX();
    int getMouseY();
    
    bool getKeyPressed(SDLKey);
    bool getKeyReleased(SDLKey);
    
    bool getMousePressed(int);
    bool getMouseReleased(int);
    
    bool getMiscEvent(int);
    
    void step();
};

#endif
