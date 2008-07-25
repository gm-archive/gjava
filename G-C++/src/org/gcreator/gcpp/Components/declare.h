#ifndef _GCPP_COMPONENTS_DECLARE_
#define _GCPP_COMPONENTS_DECLARE_

#include <SDL/SDL.h>
#include "SDL/SDL_image.h"

class org::gcreator::Components::Image
{
	private:
		SDL_Surface* img;
		
		friend class org::gcreator::Components::Sprite;
		friend class org::gcreator::Components::Tileset;
	public:
		Image();
		Image(SDL_Surface*);
                Image(String);
		virtual String getName();
                SDL_Surface* getImage();
		boolean freeImage();
};

class org::gcreator::Components::Sprite
{
	private:
		org::gcreator::Components::Image** images;
        int frame;
	public:
		Sprite();
		int getImageCount();
		org::gcreator::Components::Image* getImage(int);
		boolean freeImage(int);
		boolean freeSprite();
		org::gcreator::Components::Image** getImageArray();
		boolean setImageArray(org::gcreator::Components::Image**);
		int getWidth();
		int getHeight();
        int blit(int,int,int,org::gcreator::Components::Application);
        int getFrame();
        void setFrame(int);
};

class org::gcreator::Components::Tileset
{
	private:
		org::gcreator::Components::Image* image;
		int startx;
		int starty;
		int tilew;
		int tileh;
		int sepw;
		int seph;
	public:
		Tileset();
		org::gcreator::Components::Image* getImage();
		boolean setImage(org::gcreator::Components::Image*);
		int getStartingX();
		int getStartingY();
		int getTileWidth();
		int getTileHeight();
		int getSeparatorWidth();
		int getSeparatorHeight();
		void setStartingX(int);
		void setStartingY(int);
		void setTileWidth(int);
		void setTileHeight(int);
		void setSeparatorWidth(int);
		void setSeparatorHeight(int);
		org::gcreator::Components::Image* getTileAt(int,int);
		int getWidth();
		int getHeight();
};

class org::gcreator::Components::Actor
{
	private:
		org::gcreator::Components::Sprite* sprite;
		int x;
		int y;
		int depth;
		int direction;
		int spritepos;
		int curspritepos;
		int spritedelay;
		double gravity;
		double gravitydirection;
		boolean solid;
	public:
		Actor();
		Actor(int,int,int);
		Actor(org::gcreator::Components::Sprite*);
		Actor(org::gcreator::Components::Sprite*,int,int,int);
		org::gcreator::Components::Sprite* getSprite();
		void setSprite(org::gcreator::Components::Sprite*);
		int getSpritePosition();
		void setSpritePosition(int);
		int getCurrentSpritePosition();
		int getSpriteMovingDelay();
		void setSpriteMovingDelay(int,boolean);
		org::gcreator::Components::Image* getImage();
		double getGravity();
		void setGravity();
		double getGravityDirection();
		void setGravityDirection(double);
		int getX();
		int getY();
		int getDepth();
		int getDirection();
		void setX(int);
		void setY(int);
		void setDepth(int);
		void setDirection(int);
		boolean isSolid();
		void setSolid(boolean);
                void onCreate();
                void onDestroy();
                void onTimer(int);
                void onBeginStep();
                void onStep();
                void onEndStep();
                void onCollision(org::gcreator::Components::Actor);
                void onKeyboard(std::string);
                void onMouse(std::string);
                void onKeyPress(std::string);
                void onKeyRelease(std::string);
                void onDraw();
};

class org::gcreator::Components::View
{
	public:
		View();
		View(org::gcreator::Support::Rectangle*
			, org::gcreator::Support::Rectangle*
			, org::gcreator::Components::Actor*, int, int);
		org::gcreator::Support::Rectangle* view;
		org::gcreator::Support::Rectangle* port;
		org::gcreator::Components::Actor* follow;
		int xtolerance;
		int ytolerance;
};

class org::gcreator::Components::Scene
{
	private:
		org::gcreator::Components::View** viewArray;
		org::gcreator::Components::Actor** actorArray;
		org::gcreator::Components::Tileset** tilesetArray;
		int* xresarray;
		int* yresarray;
                int* xoutarray;
                int* youtarray;
		int* warray;
		int* harray;
		int* deptharray;
                String name;
                String caption;
                int getTileArrayLength();
	public:
		Scene();
		Scene(org::gcreator::Components::View**, org::gcreator::Components::Actor**);
		String getName();
		String getCaption();
		org::gcreator::Components::View** getViewArray();
		void setViewArray(org::gcreator::Components::View**);
		org::gcreator::Components::View* getView(int);
		void setView(int, org::gcreator::Components::View*);
		int addActor(org::gcreator::Components::Actor*);
		org::gcreator::Components::Actor** getActors();
		org::gcreator::Components::Actor* getActor(int);
		int getActorPosition(org::gcreator::Components::Actor*);
		void removeActor(int);
		void setActors(org::gcreator::Components::Actor**);
		int addTile(org::gcreator::Components::Tileset*, int, int, int, int, int, int, int);
		org::gcreator::Components::Image* getTile(int);
		boolean removeTile(int);
};

class org::gcreator::Components::Application
{
	public:
	   Application(int argc, char** argv);
        SDL_Surface* gameInit(int,int,int,string&,int);
	   SDL_Surface* getScreenSurface();
        boolean gameEnd();
        boolean stopped();
        void setFPS(int);
	   int getFPS();
	   void regulateFPS();
	private:
	   int fps;
	   int argc;
	   char** argv;
        boolean done;
	   SDL_Surface* screen;
};

class org::gcreator::Components::Audio
{
        private:
            Mix_Music* sound;
        public:
            Audio();
            Audio(Mix_Music*);
            Audio(std::string);
            bool loadAudio(std::string);
            bool setAudio(Mix_Music*);
            Mix_Music* getAudio();
            bool audioPlaying();
            void playAudio(int);
            void pauseAudio();
            void unpauseAudio();
            bool audioPaused();
            void stopAudio();
            void release();
};

class org::gcreator::Components::SFX
{
        private:
            Mix_Chunk* sound;
        public:
            SFX();
            SFX(Mix_Chunk*);
            SFX(std::string);
            bool loadFile(std::string);
            bool setSFX(Mix_Chunk*);
            Mix_Chunk* getSFX();
            void playSFX(int,int);
            void release();
};

#ifndef _GCPP_COMPONENTS_APPLICATION_
extern org::gcreator::Components::Application* Game;
#endif

#endif
