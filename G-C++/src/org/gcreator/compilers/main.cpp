#include "declare.h"

int main(int argc, char** argv){
	allegro_init();
	int depth = desktop_color_depth();
	if (depth == 0) depth = 32;
	set_color_depth(depth);
	set_gfx_mode(GFX_AUTODETECT_WINDOWED, 640, 480, 0, 0);
	install_keyboard();
	install_mouse();
	Game = new org::gcreator::Components::Application::Application(argc, argv);
}

END_OF_MAIN()
