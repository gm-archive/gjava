/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.threading;

/**
 *
 * @author luis
 */
public class SafeThread {
    private volatile boolean _isrunning = true;
    public static final int STATE_RUNNING = 0;
    public static final int STATE_PAUSED = 1;
    public static final int STATE_STOPPED = 2;
    
    private Thread t = new Thread(){
        public void run(){
            while(_isrunning)
                loop();
        }
    };
    
    protected void loop(){}
    public int getState(){
        if(t==null)
            return STATE_STOPPED;
        return _isrunning ? STATE_RUNNING : STATE_PAUSED;
    }
    public void play() throws TerminatedThreadException{
        if(t==null)
            throw new TerminatedThreadException();
        if(!_isrunning){
            _isrunning = true;
            t.run();
        }
    }
    public void pause() throws TerminatedThreadException{
        if(t==null)
            throw new TerminatedThreadException();
        _isrunning = false;
    }
    public void stop() throws TerminatedThreadException{
        if(t==null)
            throw new TerminatedThreadException();
        _isrunning = false;
        t = null;
    }
}
