#ifndef _GCPP_COMPONENTS_SCENE_
#define _GCPP_COMPONENTS_SCENE_

#include "../compilers/declare.h"

org::gcreator::Components::Scene::Scene(){}

org::gcreator::Components::Scene::Scene
(org::gcreator::Components::View** views, org::gcreator::Components::Actor** actors){
    viewArray = views;
    actorArray = actors;
}

String org::gcreator::Components::Scene::getName(){
    return name;
}

String org::gcreator::Components::Scene::getCaption(){
    return caption;
}

org::gcreator::Components::View** org::gcreator::Components::Scene::getViewArray(){
    return viewArray;
}

void org::gcreator::Components::Scene::setViewArray(org::gcreator::Components::View** views){
    viewArray = views;
}

org::gcreator::Components::View* org::gcreator::Components::Scene::getView(int pos){
    return viewArray[pos];
}

void org::gcreator::Components::Scene::setView(int pos, org::gcreator::Components::View* view){
    viewArray[pos] = view;
}

int org::gcreator::Components::Scene::addActor(org::gcreator::Components::Actor* actor){
    int i = 0;
    while(actorArray[i] != NULL){
        i++;
        if(i==sizeof(actorArray)/sizeof(actorArray[0]))
            return -1;
    }
    actorArray[i] = actor;
    return i;
}

org::gcreator::Components::Actor** org::gcreator::Components::Scene::getActors(){
    return actorArray;
}

org::gcreator::Components::Actor* org::gcreator::Components::Scene::getActor(int pos){
    return actorArray[pos];
}

int org::gcreator::Components::Scene::getTileArrayLength(){
    if(tilesetArray[0]==NULL)
        return 0;
    if(tilesetArray[(sizeof(tilesetArray)/sizeof(tilesetArray[0]))-1]!=NULL)
        return -1; //TO MANY ARGUMENTS
    int i;
    for(i = 1; tilesetArray[i]!=NULL; i++)
        ;
    return i;
}

int org::gcreator::Components::Scene::addTile
(org::gcreator::Components::Tileset* tileset, int xres, int yres, int xout, int yout, int w, int h, int depth){
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
