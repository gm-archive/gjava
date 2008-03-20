#ifndef _GCPP_DECLARE_
#define _GCPP_DECLARE_

#include "types.h"
#include <SDL/SDL.h>
#include <SDL/SDL_mixer.h>

namespace org
{
namespace gcreator
{
	namespace Components
	{
		class Image;
		class Sprite;
		class Tileset;
		class Audio;
		class Actor;
		class Scene;
		class View;
		class Application;
	}
	
	namespace Support
	{
		class Color;
		class Rectangle;
	}
	
	namespace Scripting
	{
		namespace GM4
		{
			int min3(int,int,int);
			int max3(int,int,int);
			int mean3(int,int,int);
			float min3(float,float,float);
			float max3(float,float,float);
			float mean3(float,float,float);
			double min3(double,double,double);
			double max3(double,double,double);
			double mean3(double,double,double);
		}
		namespace string
		{
			String chr(int);
			int ord(String);
			double real(String);
			String string_char_at(String, int);
			String string_copy(String, int, int);
			int string_count(String, String);
			String string_delete(String, int, int);
			String string_digits(String);
		}
	}
	namespace Interaction
	{
		class Mouse;
		class Keyboard;
	}
}
}

#include "Components/declare.h"
#include "Support/declare.h"
#include "Interaction/declare.h"

#endif
