#ifndef _GCPP_INTERACTION_DECLARE_
#define _GCPP_INTERACTION_DECLARE_

class org::gcreator::Interaction::Mouse
{
	public:
		static int getX();
		static int getY();
        static boolean buttonPressed(std::string);
};

class org::gcreator::Interaction::Keyboard
{
	public:
		static String* getKeyState();
        static boolean isKeyPressed(std::string);
};

#endif
