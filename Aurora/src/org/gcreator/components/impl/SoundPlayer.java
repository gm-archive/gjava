/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.components.impl;

import java.io.*;
import javax.sound.sampled.*;
import org.gcreator.threading.*;
//import sun.audio.*;

/**
 *
 * @author luis
 */
public class SoundPlayer/* extends SafeThread*/{
    /*private File soundFile;
    private AudioInputStream audioInputStream;
    private AudioFormat format;
    private SourceDataLine auline;
    private FloatControl pan;
    private int nBytesRead;
    private byte[] abData;
    private static final int EXTERNAL_BUFFER_SIZE = 524288;*/
    //private AudioStream au;
    //private AudioData aud;
    //private ContinuousAudioDataStream cau;
    
    public SoundPlayer(String fname) throws IOException, UnsupportedAudioFileException, LineUnavailableException{
        /*soundFile = new File(fname);
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
	abData = new byte[EXTERNAL_BUFFER_SIZE];*/
    }
    
    public SoundPlayer(File f) throws IOException, NullPointerException, UnsupportedAudioFileException, LineUnavailableException{
        /*if(f==null||!f.exists()||f.isDirectory())
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
	abData = new byte[EXTERNAL_BUFFER_SIZE];*/
    }
    
    public SoundPlayer(byte[] bytearray) throws IOException, NullPointerException, UnsupportedAudioFileException, LineUnavailableException{
        if(bytearray==null)
            throw new NullPointerException();
        ByteInputStream stream = new ByteInputStream(bytearray);
        /*audioInputStream = AudioSystem.getAudioInputStream(stream);
        format = audioInputStream.getFormat();
	auline = null;
        DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
        auline = (SourceDataLine) AudioSystem.getLine(info);
	auline.open(format);
        pan = (FloatControl) auline.getControl(FloatControl.Type.PAN);
        pan.setValue(0f);
        auline.start();
        nBytesRead = 0;
	abData = new byte[EXTERNAL_BUFFER_SIZE];*/
        //au = new AudioStream(stream);
        //aud = au.getData();
        //cau = new ContinuousAudioDataStream(aud);
        
    }
    
    public SoundPlayer(InputStream stream) throws IOException, NullPointerException, UnsupportedAudioFileException, LineUnavailableException{
        if(stream==null)
            throw new NullPointerException();
        /*audioInputStream = AudioSystem.getAudioInputStream(stream);
        format = audioInputStream.getFormat();
	auline = null;
        DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
        auline = (SourceDataLine) AudioSystem.getLine(info);
	auline.open(format);
        pan = (FloatControl) auline.getControl(FloatControl.Type.PAN);
        pan.setValue(0f);
        auline.start();
        nBytesRead = 0;
	abData = new byte[EXTERNAL_BUFFER_SIZE];*/
        //au = new AudioStream(stream);
        //aud = au.getData();
        //cau = new ContinuousAudioDataStream(aud);
        
    }
    
    /*public void setPanValue(float val){
        pan.setValue(val);
    }
    
    public float getPanValue(){
        return pan.getValue();
    }*/
    
    //private boolean continuous = false;
    
    public void loop() throws TerminatedThreadException{
        /*try{
            if(nBytesRead==-1)
                stop();
            else{
                nBytesRead = audioInputStream.read(abData, 0, abData.length);
		if (nBytesRead >= 0)
                    auline.write(abData, 0, nBytesRead);
            }
        }
        catch(Exception e){}*/
        //stop();
        //AudioPlayer.player.start(cau);
        //continuous = true;
    }
    
    public void play() throws TerminatedThreadException{
        //stop();
        //AudioPlayer.player.start(au);
        //continuous = false;
    }
    
    public void stop() throws TerminatedThreadException{
        /*super.stop();
        auline.drain();
        auline.close();*/
        //if(continuous)
        //    AudioPlayer.player.stop(cau);
        //else
        //    AudioPlayer.player.stop(au);
    }
}
