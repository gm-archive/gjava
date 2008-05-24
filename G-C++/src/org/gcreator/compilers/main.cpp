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
    org::gcreator::Components::Image::Image* test = new org::gcreator::Components::Image::Image("test.bmp");
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
    /*org::gcreator::Components::Image::Image* iBack = new org::gcreator::Components::Image::Image("back.bmp");
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
    org::gcreator::Components::SFX::SFX sound("test.wav");
    org::gcreator::Components::Audio::Audio song("song.wav");

    //Actor Components
    org::gcreator::Components::Actor::Actor obj(sprite,100,100,0);
    obj.setDirection(0);

    cout<<"Entering game loop"<<endl;
		//int i = 0;
	while(!theTest.stopped())
	{
    SDL_Rect r;
    r.x = 0;
    r.y = 0;
    r.w = 640;
    r.h = 480;
    SDL_Rect d;
    d.x = 0;
    d.y = 0;
    d.w = 32;
    d.h = 32;
	//SDL_BlitSurface(test->getImage(), &r, load, &d);
	//back->blit(0,0,-1,theTest);
	SDL_FillRect (theTest.getScreenSurface(), NULL,SDL_MapRGB ((theTest.getScreenSurface())->format, 0, 0, 0));
	sprite->blit(obj.getX(),obj.getY(),-1, theTest);
	cout<<"sprite drawn"<<endl;
        if( SDL_Flip(theTest.getScreenSurface()) == -1 )
        {
            return 1;
        }
	cout<<"surface flipped"<<endl;

	switch(obj.getDirection())
	{
	case 0:
		obj.setX(obj.getX()+5);
		break;
	case 90:
		obj.setY(obj.getY()-5);
		break;
	case 180:
		obj.setX(obj.getX()-5);
		break;
	case 270:
		obj.setY(obj.getY()+5);
		break;
	}
	//Testing other components
        /*if((theTest.getMouse())->buttonPressed("left"))
        {
             sound.playSFX(0,1);
             cout<<"lmb pressed"<<endl;
        }
        if((theTest.getMouse())->buttonPressed("right"))
        {
             if (song.audioPlaying())
             {
                  song.stopAudio();
             }
             else
             {
                  song.playAudio(-1);
             }
             cout<<"rmb pressed"<<endl;
        }*/
        if((theTest.getKeyboard())->isKeyPressed("Esc")) 
        {
            theTest.gameEnd();
            cout<<"escape pressed"<<endl;
        }

	loop++;
	if(loop==20)
	{
		switch(obj.getDirection())
		{
		case 0:
		obj.setDirection(270);
		loop=0;
		break;
		case 90:
		obj.setDirection(0);
		loop=0;
		break;
		case 180:
		obj.setDirection(90);
		loop=0;
		break;
		case 270:
		obj.setDirection(180);
		loop=0;
		break;
		}
	}
	SDL_Delay(100);
	}
}