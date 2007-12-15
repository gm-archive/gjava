/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components.impl;

import java.io.*;
import javax.sound.sampled.*;
import org.gcreator.threading.*;

/**
 *
 * @author luis
 */
public class SoundPlayer extends SafeThread{
    private File soundFile;
    private AudioInputStream audioInputStream;
    private AudioFormat format;
    private SourceDataLine auline;
    private FloatControl pan;
    private int nBytesRead;
    private byte[] abData;
    private static final int EXTERNAL_BUFFER_SIZE = 524288;
    
    public SoundPlayer(String fname) throws IOException, UnsupportedAudioFileException, LineUnavailableException{
        soundFile = new File(fname);
        if (!soundFile.exists())
            throw new IOException("Sound file not found: " + fname);
        audioInputStream = AudioSystem.getAudioInputStream(soundFile);
        format = audioInputStream.getFormat();
	auline = null;
        DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
        auline = (SourceDataLine) AudioSystem.getLine(info);
	auline.open(format);
        pan = (FloatControl) auline.getControl(FloatControl.Type.PAN);
        pan.setValue(0f);
        auline.start();
        nBytesRead = 0;
	abData = new byte[EXTERNAL_BUFFER_SIZE];
    }
    
    public SoundPlayer(File f) throws IOException, NullPointerException, UnsupportedAudioFileException, LineUnavailableException{
        if(f==null||!f.exists()||f.isDirectory())
            throw new NullPointerException();
        audioInputStream = AudioSystem.getAudioInputStream(f);
        format = audioInputStream.getFormat();
	auline = null;
        DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
        auline = (SourceDataLine) AudioSystem.getLine(info);
	auline.open(format);
        pan = (FloatControl) auline.getControl(FloatControl.Type.PAN);
        pan.setValue(0f);
        auline.start();
        nBytesRead = 0;
	abData = new byte[EXTERNAL_BUFFER_SIZE];
    }
    
    public SoundPlayer(byte[] bytearray) throws IOException, NullPointerException, UnsupportedAudioFileException, LineUnavailableException{
        if(bytearray==null)
            throw new NullPointerException();
        ByteInputStream stream = new ByteInputStream(bytearray);
        audioInputStream = AudioSystem.getAudioInputStream(stream);
        format = audioInputStream.getFormat();
	auline = null;
        DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
        auline = (SourceDataLine) AudioSystem.getLine(info);
	auline.open(format);
        pan = (FloatControl) auline.getControl(FloatControl.Type.PAN);
        pan.setValue(0f);
        auline.start();
        nBytesRead = 0;
	abData = new byte[EXTERNAL_BUFFER_SIZE];
    }
    
    public void setPanValue(float val){
        pan.setValue(val);
    }
    
    public float getPanValue(){
        return pan.getValue();
    }
    
    public void loop(){
        try{
            if(nBytesRead==-1)
                stop();
            else{
                nBytesRead = audioInputStream.read(abData, 0, abData.length);
		if (nBytesRead >= 0)
                    auline.write(abData, 0, nBytesRead);
            }
        }
        catch(Exception e){}
    }
    
    public void stop() throws TerminatedThreadException{
        super.stop();
        auline.drain();
        auline.close();
    }
}
