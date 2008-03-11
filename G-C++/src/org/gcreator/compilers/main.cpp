#include "declare.h"

int main(int argc, char** argv){
	org::gcreator::Components::Application::game_Init(640,480,32,"Test");
        org::gcreator::Components::Image::Image test("test.bmp");
        org::gcreator::Components::Sprite::Sprite img;
        img.(org::gcreator::Components::Image::setImageArray(test))
	Game = new org::gcreator::Components::Application::Application(argc, argv);
}