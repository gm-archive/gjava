#ifndef _GCPP_COMPONENTS_VIEW_
#define _GCPP_COMPONENTS_VIEW_

#include "../../declare.h"

GApi::Components::View::View()
{
	view = NULL;
	port = NULL;
	follow = NULL;
	xtolerance = 0;
	ytolerance = 0;
}

GApi::Components::View::View(GApi::Support::Rectangle* v, GApi::Support::Rectangle* p, GApi::Components::Actor* f, int xt, int yt)
{
	view = v;
	port = p;
	follow = f;
	xtolerance = xt;
	ytolerance = yt;
}

#endif
