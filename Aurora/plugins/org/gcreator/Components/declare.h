#ifndef _GCPP_COMPONENTS_DECLARE_
#define _GCPP_COMPONENTS_DECLARE_

#define BITMAP ALLEGRO_BITMAP
#include <allegro.h>
#undef BITMAP

class org::gcreator::Components::Image
{
	private:
		ALLEGRO_BITMAP* img;
		Image(ALLEGRO_BITMAP*);
	public:
		Image();
		virtual String getName();
		boolean free();
		friend class org::gcreator::Components::Sprite;
		friend class org::gcreator::Components::Tileset;
};

class org::gcreator::Components::Sprite
{
	private:
		org::gcreator::Components::Image** images;
	public:
		Sprite();
		int getImageCount();
		org::gcreator::Components::Image* getImage(int);
		boolean setImage(int, org::gcreator::Components::Image*);
		boolean freeImage(int);
		boolean freeSprite();
		org::gcreator::Components::Image** getImageArray();
		boolean setImageArray(org::gcreator::Components::Image**);
		int getWidth();
		int getHeight();
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
		void setX(int);
		void setY(int);
		void setDepth(int);
		boolean isSolid();
		void setSolid(boolean);
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
		Scene(org::gcreatorGApi::Components::View**, org::gcreator::Components::Actor**);
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

#endif
