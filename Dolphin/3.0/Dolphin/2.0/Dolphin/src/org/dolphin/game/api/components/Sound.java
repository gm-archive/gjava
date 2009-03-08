/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.dolphin.game.api.components;

import com.golden.gamedev.engine.BaseAudio;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import org.dolphin.game.Game;

/**
 *
 * @author Ali
 */
public class Sound {
public LinkedList id=new LinkedList();
String name="";
    public Sound(String name){
        this.name=name;
    }

    public void play(){
        id.push(Game.thegame.playSound(name));//Game.class.getResource("Sample.wav").getPath());
    }

    public void loop(){
        int i=Game.thegame.bsSound.play(name);
    id.push(i);
    Game.thegame.bsSound.getAudioRenderer(i).setLoop(true);
    }

    public void stop(){
        for(int i=0;i<id.size();i++){
    //Game.thegame.bsSound.stop(name);
    Game.thegame.bsSound.getAudioRenderer(i).stop();

    id.pop();
        }
    }

    public boolean isPlaying(){
        for(int i=0;i<id.size();i++){
        if (Game.thegame.bsSound.getAudioRenderer(i).getStatus()==1)
            return true;

            //System.out.println("status:"+Game.thegame.bsSound.getAudioRenderer(id).getStatus());
        }
    return false;
    }
}
