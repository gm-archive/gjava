#ifndef _GCPP_INTERACTION_DECLARE_
#define _GCPP_INTERACTION_DECLARE_

class GApi::Interaction::Mouse
{
	public:
		static int getX();
		static int getY();
};

class GApi::Interaction::KeyBoard
{
	public:
		static String* getPressedKeys();
};

#endif
