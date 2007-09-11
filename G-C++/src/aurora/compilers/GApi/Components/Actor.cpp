#ifndef _GCPP_COMPONENTS_ACTOR_
#define _GCPP_COMPONENTS_ACTOR_

#include "../../declare.h"

GApi::Components::Actor::Actor()
{
	sprite = NULL;
	x = 0;
	y = 0;
	depth = 0;
	spritepos = 0;
	curspritepos = 0;
	spritedelay = 0;
	gravity = 0;
	gravitydirection = 0;
	solid = true;
}

GApi::Components::Actor::Actor(int _x, int _y, int _depth)
{
	sprite = NULL;
	x = _x;
	y = _y;
	depth = _depth;
	spritepos = 0;
	curspritepos = 0;
	spritedelay = 0;
	gravity = 0;
	gravitydirection = 0;
	solid = true;
}

GApi::Components::Actor::Actor(GApi::Components::Sprite* _sprite)
{
	sprite = _sprite;
	x = 0;
	y = 0;
	depth = 0;
	spritepos = 0;
	curspritepos = 0;
	spritedelay = 0;
	gravity = 0;
	gravitydirection = 0;
	solid = true;
}

GApi::Components::Actor::Actor(GApi::Components::Sprite* _sprite, int _x, int _y, int _depth)
{
	sprite = _sprite;
	x = _x;
	y = _y;
	depth = _depth;
	spritepos = 0;
	curspritepos = 0;
	spritedelay = 0;
	gravity = 0;
	gravitydirection = 0;
	solid = true;
}

GApi::Components::Sprite* GApi::Components::Actor::getSprite()
{
	return sprite;
}

void GApi::Components::Actor::setSprite(GApi::Components::Sprite* _sprite)
{
	sprite = _sprite;
}

int GApi::Components::Actor::getSpritePosition()
{
	return spritepos;
}

void GApi::Components::Actor::setSpritePosition(int _spritepos)
{
	curspritepos = 0;
	spritepos = _spritepos;
}

int GApi::Components::Actor::getCurrentSpritePosition()
{
	if(spritepos!=-1)
		return spritepos;
	return curspritepos;
}

int GApi::Components::Actor::getSpriteMovingDelay()
{
	return spritedelay;
}

void GApi::Components::Actor::setSpriteMovingDelay(int _spritedelay, boolean change)
{
	spritedelay = _spritedelay;
	if(change)
		spritepos = -1;
}

int GApi::Components::Actor::getX()
{
	return x;
}

int GApi::Components::Actor::getY()
{
	return y;
}

int GApi::Components::Actor::getDepth()
{
	return depth;
}

void GApi::Components::Actor::setX(int _x)
{
	x = _x;
}

void GApi::Components::Actor::setY(int _y)
{
	y = _y;
}

void GApi::Components::Actor::setDepth(int _depth)
{
	depth = _depth;
}

boolean GApi::Components::Actor::isSolid()
{
	return solid;
}

void GApi::Components::Actor::setSolid(boolean _solid)
{
	solid = _solid;
}

#endif
