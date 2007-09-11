package org.gcreator.gjava.gscript.res;
import java.applet.AudioClip;

/** This class represents a sound clip that extends the functionality
  * of the Java Applet <code>AudioClip</code> class.
  *
  * <p><code>TimedAudioClip</code> objects can be played just like regular
  * <code>AudioClip</code> objects.  The call to <code>play()</code> returns
  * immediately.  <code>TimedAudioClip</code> has the additional feature that
  * it can be played using the <code>playAndWait()</code> method, which will not
  * return until the clip has entirely finished playing.
  *
  * <p>The ability to play and wait can be a useful feature when one wants the
  * execution of the program to pause until the sound clip has finished for
  * some reason.  The way the <code>TimedAudioClip</code> object knows how long
  * it takes to play itself is by the passing of a duration field to its 
  * constructor.
  */
public class TimedAudioClip implements AudioClip {
	private AudioClip myClip;
	private long myPlayTime, myDuration;
	private boolean myIsLooping = false;
	
	
	/** Constructs a new <code>TimedAudioClip</code> to play the given 
	  * <code>AudioClip</code>, which is the given duration in length.
	  *
	  * @param clip The <code>AudioClip</code> to play; may not be null.
	  * @param duration The length in milliseconds of the given clip;
	  *                 may not be less than zero.
	  */
	public TimedAudioClip(AudioClip clip, long duration) {
		if (clip == null)
			throw new IllegalArgumentException("null AudioClip passed");
		else if (duration < 0)
			throw new IllegalArgumentException("negative duration passed");
		else {
			myClip = clip;
			myDuration = duration;
		}
	}
	
	
	/** Constructs a new <code>TimedAudioClip</code> to play the given AudioClip;
	  * since no duration is passed, it is assumed to be 0ms, and the clip does 
	  * not wait if its <code>playAndWait</code> method is called.
	  */
	public TimedAudioClip(AudioClip clip) {
		this(clip, 0);
	}
	
	
	/** Plays this <code>TimedAudioClip</code>; returns instantly. */
	public void play() {
		myPlayTime = System.currentTimeMillis();
		myClip.play();
	}
	

	/** Begins repeated playing of this <code>TimedAudioClip</code>.  Returns instantly. */
	public void loop() {
		myIsLooping = true;
		myClip.loop();
	}
	

	/** Halts the playing and/or looping of this <code>TimedAudioClip</code>. */
	public void stop() {
		myIsLooping = false;
		myClip.stop();
	}
	
	
	/** Plays this <code>TimedAudioClip</code>; does not return until playing has completed. */
	public void playAndWait() {
		play();
		
		while (isPlaying())
			try {
				Thread.sleep(10);
			} catch (InterruptedException ie) {
				break;
			}
	}
	

	/** Returns this <code>TimedAudioClip</code>'s base AudioClip object.
	  * @return this <code>TimedAudioClip</code>'s base AudioClip object.
	  */
	public AudioClip getClip() {
		return myClip;
	}
	
	
	/** Returns this <code>TimedAudioClip</code>'s duration in milliseconds.
	  * @return this <code>TimedAudioClip</code>'s duration in milliseconds.
	  */
	public long getDuration() {
		return myDuration;
	}
	
	
	/** Returns whether or not this <code>TimedAudioClip</code> is currently
	  * playing.  The value will be false unless the <code>TimedAudioClip</code>
	  * has been played recently and has not yet finished.
	  * @return whether or not this <code>TimedAudioClip</code> is currently playing.
	  */
	public boolean isPlaying() {
		return myIsLooping  ||  myPlayTime + myDuration > System.currentTimeMillis();
	}
}