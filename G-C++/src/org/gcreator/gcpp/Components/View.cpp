#ifndef _GCPP_COMPONENTS_VIEW_
#define _GCPP_COMPONENTS_VIEW_

#include "../compilers/declare.h"

org::gcreator::Components::View::View()
{
	view = NULL;
	port = NULL;
	follow = NULL;
	xtolerance = 0;
	ytolerance = 0;
}

org::gcreator::Components::View::View
(org::gcreator::Support::Rectangle* v, org::gcreator::Support::Rectangle* p, org::gcreator::Components::Actor* f, int xt, int yt)
{
	view = v;
	port = p;
	follow = f;
	xtolerance = xt;
	ytolerance = yt;
}

#endif
