#ifndef _GCPP_COMPONENTS_ACTOR_
#define _GCPP_COMPONENTS_ACTOR_

#include "../declare.h"

org::gcreator::Components::Actor::Actor()
{
	sprite = NULL;
	x = 0;
	y = 0;
	depth = 0;
	direction = 0;
	spritepos = 0;
	curspritepos = 0;
	spritedelay = 0;
	gravity = 0;
	gravitydirection = 0;
	solid = true;
}

org::gcreator::Components::Actor::Actor(int _x, int _y, int _depth)
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

org::gcreator::Components::Actor::Actor(org::gcreator::Components::Sprite* _sprite)
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

org::gcreator::Components::Actor::Actor(org::gcreator::Components::Sprite* _sprite, int _x, int _y, int _depth)
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

org::gcreator::Components::Sprite* org::gcreator::Components::Actor::getSprite()
{
	return sprite;
}

void org::gcreator::Components::Actor::setSprite(org::gcreator::Components::Sprite* _sprite)
{
	sprite = _sprite;
}

int org::gcreator::Components::Actor::getSpritePosition()
{
	return spritepos;
}

void org::gcreator::Components::Actor::setSpritePosition(int _spritepos)
{
	curspritepos = 0;
	spritepos = _spritepos;
}

int org::gcreator::Components::Actor::getCurrentSpritePosition()
{
	if(spritepos!=-1)
		return spritepos;
	return curspritepos;
}

int org::gcreator::Components::Actor::getSpriteMovingDelay()
{
	return spritedelay;
}

void org::gcreator::Components::Actor::setSpriteMovingDelay(int _spritedelay, boolean change)
{
	spritedelay = _spritedelay;
	if(change)
		spritepos = -1;
}

int org::gcreator::Components::Actor::getX()
{
	return x;
}

int org::gcreator::Components::Actor::getY()
{
	return y;
}

int org::gcreator::Components::Actor::getDepth()
{
	return depth;
}

int org::gcreator::Components::Actor::getDirection()
{
	return direction;
}

void org::gcreator::Components::Actor::setX(int _x)
{
	x = _x;
}

void org::gcreator::Components::Actor::setY(int _y)
{
	y = _y;
}

void org::gcreator::Components::Actor::setDepth(int _depth)
{
	depth = _depth;
}

void org::gcreator::Components::Actor::setDirection(int _direction)
{
	direction = _direction;
}

boolean org::gcreator::Components::Actor::isSolid()
{
	return solid;
}

void org::gcreator::Components::Actor::setSolid(boolean _solid)
{
	solid = _solid;
}

void org::gcreator::Components::Actor::onCreate()
{
    ;
}

void org::gcreator::Components::Actor::onDestroy()
{
    ;
}

void org::gcreator::Components::Actor::onTimer(int Timer)
{
    ;
}

void org::gcreator::Components::Actor::onBeginStep()
{
    ;
}

void org::gcreator::Components::Actor::onStep()
{
    ;
}

void org::gcreator::Components::Actor::onEndStep()
{
    ;
}

void org::gcreator::Components::Actor::onCollision(org::gcreator::Components::Actor who)
{
    ;
}

void org::gcreator::Components::Actor::onKeyboard(std::string key)
{
    ;
}

void org::gcreator::Components::Actor::onMouse(std::string button)
{
    ;
}

void org::gcreator::Components::Actor::onKeyPress(std::string key)
{
    ;
}

void org::gcreator::Components::Actor::onKeyRelease(std::string key)
{
    ;
}

void org::gcreator::Components::Actor::onDraw()
{
    ;
}

#endif

