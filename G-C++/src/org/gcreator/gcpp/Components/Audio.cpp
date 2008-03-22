#ifndef _GCPP_COMPONENTS_AUDIO_
#define _GCPP_COMPONENTS_AUDIO_

#include "../compilers/declare.h"

org::gcreator::Components::Audio::Audio();
{
    sound=NULL;
}

org::gcreator::Components::Audio::Audio(Mix_Chunk* _s);
{
    sound=_s;
}

org::gcreator::Components::Audio::Audio(std::string file);
{
    sound=loadAudio(file);
}

org::gcreator::Components::Audio::bool loadAudio(std::string file);
{
    sound=Mix_LoadMUS(file);
    if (getAudio()==NULL)
    {
        return false;
    }
    else
    {
        return true;
    }
}

org::gcreator::Components::Audio::bool setAudio(Mix_Music* _s);
{
    sound=_s
    if (getAudio()==NULL)
    {
        return false;
    }
    else
    {
        return true;
    }
}

org::gcreator::Components::Audio::Mix_Chunk* getAudio();
{
    return sound;
}

org::gcreator::Components::Audio::boolean audioPlaying();
{
    return (Mix_PlayingMusic());
}

void org::gcreator::Components::Audio::playAudio(Mix_Chunk* _s,int num);
{
    Mix_PlayMusic(_s,num);
}

org::gcreator::Components::Audio::void pauseAudio();
{
    Mix_PauseMusic();
}

org::gcreator::Components::Audio::void unpauseAudio();
{
    Mix_ResumeMusic();
}

org::gcreator::Components::Audio::boolean audioPaused();
{
    return (Mix_PausedMusic());
}

org::gcreator::Components::Audio::void stopAudio();
{
    Mix_HaltMusic();
}

#endif
