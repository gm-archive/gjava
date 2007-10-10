#ifndef _GCPP_COMPONENTS_TILESET_
#define _GCPP_COMPONENTS_TILESET_

#include "../../declare.h"

org::gcreator::Components::Tileset::Tileset()
{
	image = NULL;
	startx = 0;
	starty = 0;
	tilew = 0;
	tileh = 0;
	sepw = 0;
	seph = 0;
}

org::gcreator::Components::Image* org::gcreator::Components::Tileset::getImage()
{
	return image;
}

boolean org::gcreator::Components::Tileset::setImage(org::gcreator::Components::Image* img)
{
	image = img;
}

int org::gcreator::Components::Tileset::getStartingX()
{
	return startx;
}

int org::gcreator::Components::Tileset::getStartingY()
{
	return starty;
}

int org::gcreator::Components::Tileset::getTileWidth()
{
	return tilew;
}

int org::gcreator::Components::Tileset::getTileHeight()
{
	return tileh;
}

int org::gcreator::Components::Tileset::getSeparatorWidth()
{
	return sepw;
}

int org::gcreator::Components::Tileset::getSeparatorHeight()
{
	return seph;
}

void org::gcreator::Components::Tileset::setStartingX(int value)
{
	startx = value;
}

void org::gcreator::Components::Tileset::setStartingY(int value)
{
	starty = value;
}

void org::gcreator::Components::Tileset::setTileWidth(int value)
{
	tilew = value;
}

void org::gcreator::Components::Tileset::setTileHeight(int value)
{
	tileh = value;
}

void org::gcreator::Components::Tileset::setSeparatorWidth(int value)
{
	sepw = value;
}

org::gcreator::Components::Image* org::gcreator::Components::Tileset::getTileAt(int x,int y)
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

int org::gcreator::Components::Tileset::getWidth()
{
	if(image==NULL)
		return -1;
	return image->img->w;
}

int org::gcreator::Components::Tileset::getHeight()
{
	if(image==NULL)
		return -1;
	return image->img->h;
}

#endif
