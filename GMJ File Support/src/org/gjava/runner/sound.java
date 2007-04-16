package org.gjava.runner;

public class sound extends Thread
	{

	String sound_name; // sound name including extension

	int preload, Effects;

	double Volume, Panning;

	TimedAudioClip onceClip, loopClip, sound;

	boolean looping;

	sound(String sound_name,int Effects,double Volume,double Panning,int preload)
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
		sound = new TimedAudioClip(basicgame.Eapplet.newAudioClip(getClass().getResource(sound_name)));
		// soundList.putClip(audioClip, relativeURL);
		}

	}