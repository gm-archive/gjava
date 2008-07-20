package org.gcreator.compilers.gjava.api.components;

import org.gcreator.compilers.gjava.gtge.Basicgame;
import org.gcreator.compilers.gjava.api.res.TimedAudioClip;

/**
 * Sound object to play a sound, not used in g-java 2.0 yet
 * @author G-Java development team
 * @version 1.0
 */
public class sound extends Thread
	{

	public String sound_name; // sound name including extension

	int preload, Effects;

	double Volume, Panning;

	TimedAudioClip onceClip, loopClip, sound;

	boolean looping;

	/**
	 * Create a sound object
	 * @param sound_name 
	 * @param Effects 
	 * @param Volume 
	 * @param Panning 
	 * @param preload 
	 */
	public sound(String sound_name,int Effects,double Volume,double Panning,int preload)
		{
		this.sound_name = sound_name;
		this.Volume = Volume;
		this.Panning = Panning;
		// load the sound
		setPriority(MIN_PRIORITY);
		start();
		try
			{
			join();
			}
		catch (java.lang.InterruptedException ev)
			{
			}
		}



	public void play()
		{
		onceClip = sound;
		onceClip.play();
		}

	public void loop()
		{
		looping = true;
		}

	public void snd_stop()
		{
		onceClip.stop(); // Cut short the one-time sound.
		if (looping)
			{
			loopClip.stop(); // Stop the sound loop.
			}
		}

	public void run()
		{
		// AudioClip audioClip = applet.getAudioClip(baseURL, relativeURL);
		sound = new TimedAudioClip(Basicgame.applet.newAudioClip(getClass().getResource(sound_name)));
		// soundList.putClip(audioClip, relativeURL);
		}

	}