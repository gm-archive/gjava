#ifndef _GCPP_COMPONENTS_DECLARE_
#define _GCPP_COMPONENTS_DECLARE_

#define BITMAP ALLEGRO_BITMAP
#include <allegro.h>
#undef BITMAP

class GApi::Components::Image
{
	private:
		ALLEGRO_BITMAP* img;
		Image(ALLEGRO_BITMAP*);
	public:
		Image();
		virtual String getName();
		boolean free();
		friend class GApi::Components::Sprite;
		friend class GApi::Components::Tileset;
};

class GApi::Components::Sprite
{
	private:
		GApi::Components::Image** images;
	public:
		Sprite();
		int getImageCount();
		GApi::Components::Image* getImage(int);
		boolean setImage(int, GApi::Components::Image*);
		boolean freeImage(int);
		boolean freeSprite();
		GApi::Components::Image** getImageArray();
		boolean setImageArray(GApi::Components::Image**);
		int getWidth();
		int getHeight();
};

class GApi::Components::Tileset
{
	private:
		GApi::Components::Image* image;
		int startx;
		int starty;
		int tilew;
		int tileh;
		int sepw;
		int seph;
	public:
		Tileset();
		GApi::Components::Image* getImage();
		boolean setImage(GApi::Components::Image*);
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
		GApi::Components::Image* getTileAt(int,int);
		int getWidth();
		int getHeight();
};

class GApi::Components::Actor
{
	private:
		GApi::Components::Sprite* sprite;
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
		Actor(GApi::Components::Sprite*);
		Actor(GApi::Components::Sprite*,int,int,int);
		GApi::Components::Sprite* getSprite();
		void setSprite(GApi::Components::Sprite*);
		int getSpritePosition();
		void setSpritePosition(int);
		int getCurrentSpritePosition();
		int getSpriteMovingDelay();
		void setSpriteMovingDelay(int,boolean);
		GApi::Components::Image* getImage();
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

class GApi::Components::View
{
	public:
		View();
		View(GApi::Support::Rectangle*, GApi::Support::Rectangle*, GApi::Components::Actor*, int, int);
		GApi::Support::Rectangle* view;
		GApi::Support::Rectangle* port;
		GApi::Components::Actor* follow;
		int xtolerance;
		int ytolerance;
};

class GApi::Components::Scene
{
	private:
		GApi::Components::View** viewArray;
		GApi::Components::Actor** actorArray;
		GApi::Components::Tileset** tilesetArray;
		int* xarray;
		int* yarray;
		int* warray;
		int* harray;
		int* deptharray;
                String name;
                String caption;
	public:
		Scene();
		Scene(GApi::Components::View**, GApi::Components::Actor**);
		String getName();
		String getCaption();
		GApi::Components::View** getViewArray();
		void setViewArray(GApi::Components::View**);
		GApi::Components::View* getView(int);
		void setView(int, GApi::Components::View*);
		int addActor(GApi::Components::Actor*);
		GApi::Components::Actor** getActors();
		GApi::Components::Actor* getActor(int);
		int getActorPosition(GApi::Components::Actor*);
		void removeActor(int);
		void setActors(GApi::Components::Actor**);
		int addTile(GApi::Components::Tileset*, int, int, int, int, int, int, int);
		GApi::Components::Image* getTile(int);
		boolean removeTile(int);
};

#endif
