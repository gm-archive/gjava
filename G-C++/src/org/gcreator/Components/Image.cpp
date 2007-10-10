#ifndef _GCPP_COMPONENTS_IMAGE_
#define _GCPP_COMPONENTS_IMAGE_

#include "../../declare.h"

org::gcreator::Components::Image::Image(ALLEGRO_BITMAP* bitmap)
{
	img = bitmap;
}

org::gcreator::Components::Image::Image()
{
	img = NULL;
}

String GApi::Components::Image::getName()
{
	return NULL;
}

boolean GApi::Components::Image::free()
{
	destroy_bitmap(img);
	if(img==NULL)
		return true;
	return false;
}

#endif
