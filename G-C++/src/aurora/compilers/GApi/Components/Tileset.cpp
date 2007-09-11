#ifndef _GCPP_COMPONENTS_TILESET_
#define _GCPP_COMPONENTS_TILESET_

#include "../../declare.h"

GApi::Components::Tileset::Tileset()
{
	image = NULL;
	startx = 0;
	starty = 0;
	tilew = 0;
	tileh = 0;
	sepw = 0;
	seph = 0;
}

GApi::Components::Image* GApi::Components::Tileset::getImage()
{
	return image;
}

boolean GApi::Components::Tileset::setImage(GApi::Components::Image* img)
{
	image = img;
}

int GApi::Components::Tileset::getStartingX()
{
	return startx;
}

int GApi::Components::Tileset::getStartingY()
{
	return starty;
}

int GApi::Components::Tileset::getTileWidth()
{
	return tilew;
}

int GApi::Components::Tileset::getTileHeight()
{
	return tileh;
}

int GApi::Components::Tileset::getSeparatorWidth()
{
	return sepw;
}

int GApi::Components::Tileset::getSeparatorHeight()
{
	return seph;
}

void GApi::Components::Tileset::setStartingX(int value)
{
	startx = value;
}

void GApi::Components::Tileset::setStartingY(int value)
{
	starty = value;
}

void GApi::Components::Tileset::setTileWidth(int value)
{
	tilew = value;
}

void GApi::Components::Tileset::setTileHeight(int value)
{
	tileh = value;
}

void GApi::Components::Tileset::setSeparatorWidth(int value)
{
	sepw = value;
}

GApi::Components::Image* GApi::Components::Tileset::getTileAt(int x,int y)
{
	if(image==NULL)
		return NULL;
	if(tilew<0)
		return NULL;
	if(tileh<0)
		return NULL;
	ALLEGRO_BITMAP* bitmap = create_bitmap(tilew,tileh);
	blit(image->img, bitmap, x * (tilew + sepw) + startx, y * (tileh + seph) + starty, 0, 0, tilew, tileh);
	return new GApi::Components::Image(bitmap);
}

int GApi::Components::Tileset::getWidth()
{
	if(image==NULL)
		return -1;
	return image->img->w;
}

int GApi::Components::Tileset::getHeight()
{
	if(image==NULL)
		return -1;
	return image->img->h;
}

#endif
