#ifndef _GCPP_COMPONENTS_SCENE_
#define _GCPP_COMPONENTS_SCENE_

#include "../../declare.h"

GApi::Components::Scene::Scene(){}

GApi::Components::Scene::Scene(GApi::Components::View** views, GApi::Components::Actor** actors){
    viewArray = views;
    actorArray = actors;
}

String GApi::Components::Scene::getName(){
    return name;
}

String GApi::Components::Scene::getCaption(){
    return caption;
}

GApi::Components::View** GApi::Components::Scene::getViewArray(){
    return viewArray;
}

void GApi::Components::Scene::setViewArray(GApi::Components::View** views){
    viewArray = views;
}

GApi::Components::View* GApi::Components::Scene::getView(int pos){
    return viewArray[pos];
}

void GApi::Components::Scene::setView(int pos, GApi::Components::View* view){
    viewArray[pos] = view;
}

int GApi::Components::Scene::addActor(GApi::Components::Actor* actor){
    int i = 0;
    while(actorArray[i] != NULL){
        i++;
        if(i==sizeof(actorArray)/sizeof(actorArray[0]))
            return -1;
    }
    actorArray[i] = actor;
    return i;
}

GApi::Components::Actor** GApi::Components::Scene::getActors(){
    return actorArray;
}

GApi::Components::Actor* GApi::Components::Scene::getActor(int pos){
    return actorArray[pos];
}

int GApi::Components::Scene::getTileArrayLength(){
    if(tilesetArray[0]==NULL)
        return 0;
    if(tilesetArray[(sizeof(tilesetArray)/sizeof(tilesetArray[0]))-1]!=NULL)
        return -1; //TO MANY ARGUMENTS
    int i;
    for(i = 1; tilesetArray[i]!=NULL; i++)
        ;
    return i;
}

int GApi::Components::Scene::addTile(GApi::Components::Tileset* tileset, int xres, int yres, int xout, int yout, int w, int h, int depth){
    int a = getTileArrayLength();
    if(a==-1)
        return -1;
    tilesetArray[a] = tileset;
    xresarray[a] = xres;
    yresarray[a] = yres;
    xoutarray[a] = xout;
    youtarray[a] = yout;
    warray[a] = w;
    harray[a] = h;
    deptharray[a] = depth;
    return a;
}

#endif
