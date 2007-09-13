#ifndef _GCPP_COMPONENTS_SCENE_
#define _GCPP_COMPONENTS_SCENE_

#include "../../declare.h"

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

#endif
