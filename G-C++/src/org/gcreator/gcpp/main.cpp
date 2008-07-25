//Seagulls test

#include <SDL/SDL.h>
#include <SDL/SDL_image.h>
#include <SDL/SDL_mixer.h>

#include "declare.h"

int static loop=0;

int main(int argc, char** argv)
{
    //Initializing Game
    std::string theName ="Test";
    org::gcreator::Components::Application theTest(argc,argv);
    cout<<"created game"<<endl;  

    //Video Components
    SDL_Surface* load=theTest.gameInit(640,480,32,theName);
    cout<<"game initialized"<<endl;
    //Actor's Sprite
    org::gcreator::Components::Image::Image* test = new  org::gcreator::Components::Image::Image("test.bmp");
    org::gcreator::Components::Sprite::Sprite* sprite;
    org::gcreator::Components::Image::Image* images[1];
    images[0]=test;
    if(sprite->setImageArray(images))//This should work now
    {
    cout<<"set image array"<<endl;
    }
    else
    {
    cout<<"returned false"<<endl;
    }
    //Background Sprite
    /*org::gcreator::Components::Image::Image* iBack = new org::gcreator::Components::Image::Image("test.bmp");
    cout<<"Background loaded"<<endl;
    org::gcreator::Components::Sprite::Sprite* back;
    cout<<"back Sprite created"<<endl;
    org::gcreator::Components::Image::Image* bimg[1];
    cout<<"bimg created"<<endl;
    bimg[0]=iBack;
    cout<<"bimg assigned"<<endl;
    if(back->setImageArray(bimg))
    {
    cout<<"set image array"<<endl;
    }
    else
    {
    cout<<"returned false"<<endl;
    }*/

    //Sound Components
    //org::gcreator::Components::SFX::SFX sound("test.wav");
    //org::gcreator::Components::Audio::Audio song("song.wav");

    //Actor Components
    org::gcreator::Components::Actor::Actor obj(sprite,100,100,0);
    obj.setDirection(0);  
    org::gcreator::Interaction::Handler event;

    cout<<"Entering game loop"<<endl;
		//int i = 0;
	while(!theTest.stopped())
	{
	event.step();
	//back->blit(0,0,-1, theTest.getScreenSurface());
	SDL_FillRect(load,&load->clip_rect,SDL_MapRGB(load->format,0,0,0));  
	sprite->blit(obj.getX(), obj.getY(), -1, theTest.getScreenSurface());
	//cout<<"background drawn"<<endl;
	cout<<"sprite drawn"<<endl;
     if( SDL_Flip(theTest.getScreenSurface()) == -1 )
        {
            return 1;
        }
	cout<<"surface flipped"<<endl;

	
	if (event.getKeyPressed(SDLK_RIGHT))
	{
		obj.setX(obj.getX()+5);
		obj.setDirection(0);
	}
	if (event.getKeyPressed(SDLK_UP))
	{
		obj.setY(obj.getY()-5);
		obj.setDirection(90);
	}
	if (event.getKeyPressed(SDLK_LEFT))
	{
		obj.setX(obj.getX()-5);
		obj.setDirection(180);
	}
	if (event.getKeyPressed(SDLK_DOWN))
	{
		obj.setY(obj.getY()+5);
		obj.setDirection(270);
	}
	
	if(event.getMousePressed(MOUSE_R))
	{
		cout<<"mouseX="<<event.getMouseX()<<endl;
		cout<<"mouseY="<<event.getMouseY()<<endl;
		theTest.gameEnd();
	}
        
     if(event.getKeyPressed(SDLK_ESCAPE)) 
        {
            theTest.gameEnd();
            cout<<"escape pressed"<<endl;
        }

	theTest.regulateFPS();
	}
}
