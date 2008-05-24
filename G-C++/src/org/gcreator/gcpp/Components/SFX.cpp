#ifndef _GCPP_COMPONENTS_SFX_
#define _GCPP_COMPONENTS_SFX_

#include "../compilers/declare.h"

org::gcreator::Components::SFX::SFX()
{
    sound=NULL;
}

org::gcreator::Components::SFX::SFX(Mix_Chunk* _s)
{
    sound=_s;
}

org::gcreator::Components::SFX::SFX(std::string file)
{
    sound=Mix_LoadWAV(file.c_str());
}

bool org::gcreator::Components::SFX::loadFile(std::string file)
{
    sound=Mix_LoadWAV(file.c_str());
}

bool org::gcreator::Components::SFX::setSFX(Mix_Chunk* _s)
{
    sound=_s;
}

Mix_Chunk* org::gcreator::Components::SFX::getSFX()
{
    return sound;
}
void org::gcreator::Components::SFX::playSFX(int channel, int repeat)
{
    Mix_PlayChannel(channel, sound, repeat);
}

void org::gcreator::Components::SFX::release()
{
    Mix_FreeChunk(sound);
    sound=NULL;
}

#endif
