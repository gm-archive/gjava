/*
 * Copyright (c) 2008 Golden T Studios.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * 
 * This class is needed because com.golden.gamedev.engine.audio.MidiRenderer does
 * not allow you to play a sound from a stream.
 * Erase any unneded methods if you see them.
 * 
 */
package org.gcreator.extended;

// JFC
import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.Synthesizer;

import com.golden.gamedev.engine.BaseAudioRenderer;
import com.golden.gamedev.engine.audio.MidiRenderer;
import java.io.InputStream;

/**
 * Play midi sound (*.mid).
 * <p>
 * 
 * Note: Midi sound use soundbank that not delivered in JRE, only JDK can play
 * midi sound properly. <br>
 * In order to play midi sound properly in JRE you must explicitly install
 * soundbank. <br>
 * Download soundbank from java sun website (<a
 * href="http://java.sun.com/products/java-media/sound/soundbanks.html">
 * http://java.sun.com/products/java-media/sound/soundbanks.html</a>) and refer
 * to the manual how to install it.
 */
public class GMidiRenderer extends MidiRenderer implements MetaEventListener {

    /** ************************* MIDI CONSTANTS ******************************** */
    // end of song event
    private static final int MIDI_EOT_MESSAGE = 47;
    // volume
    private static final int GAIN_CONTROLLER = 7;
    /** *************************** MIDI SEQUENCER ****************************** */
    private Sequencer sequencer;
    /** ************************************************************************* */
    /** ******************** VALIDATING MIDI SEQUENCER ************************** */
    /** ************************************************************************* */
    private static boolean available;
    private static final int UNINITIALIZED = 0;
    private static final int INITIALIZING = 1;
    private static final int INITIALIZED = 2;
    private static int rendererStatus = GMidiRenderer.UNINITIALIZED;

    /** ************************************************************************* */
    /** ***************************** CONSTRUCTOR ******************************* */
    /** ************************************************************************* */
    /**
     * Creates new midi audio renderer.
     */
    public GMidiRenderer() {
        super();
    }

    /** ************************************************************************* */
    /** ********************** AUDIO PLAYBACK FUNCTION ************************** */
    /** ************************************************************************* */
    protected void playSound(InputStream in) {
        try {
            if (this.sequencer == null) {
                this.sequencer = MidiSystem.getSequencer();
                if (!this.sequencer.isOpen()) {
                    this.sequencer.open();
                }
            }

            Sequence seq = MidiSystem.getSequence(in);
            this.sequencer.setSequence(seq);
            this.sequencer.start();
            this.sequencer.addMetaEventListener(GMidiRenderer.this);

            // the volume of newly loaded audio is always 1.0f
            if (this.volume != 1.0f) {
                this.setSoundVolume(this.volume);
            }
        } catch (Exception e) {
            e.printStackTrace();
            this.status = BaseAudioRenderer.ERROR;
        }
    }

    protected void replaySound() {
        this.sequencer.start();
        this.sequencer.addMetaEventListener(this);
    }

    /** ************************************************************************* */
    /** *********************** MIDI EVENT LISTENER ***************************** */
    /** ************************************************************************* */
    /**
     * Notified when the sound has finished playing.
     */
    public void meta(MetaMessage msg) {
        if (msg.getType() == GMidiRenderer.MIDI_EOT_MESSAGE) {
            this.status = BaseAudioRenderer.END_OF_SOUND;
            this.sequencer.setMicrosecondPosition(0);
            this.sequencer.removeMetaEventListener(this);
        }
    }

    /** ************************************************************************* */
    /** ************************ AUDIO VOLUME SETTINGS ************************** */
    /** ************************************************************************* */
    protected void setSoundVolume(float volume) {
        if (this.sequencer == null) {
            return;
        }

        MidiChannel[] channels = ((Synthesizer) this.sequencer).getChannels();
        for (int i = 0; i < channels.length; i++) {
            channels[i].controlChange(GMidiRenderer.GAIN_CONTROLLER,
                    (int) (volume * 127));
        }
    }

    /**
     * Stops currently played audio and begins playback of specified audio file.
     * 
     * @param audiofile the audio file to be played by this renderer.
     */
    public void play(InputStream s) {
        this.status = BaseAudioRenderer.PLAYING;
        this.playSound(s);
    }

    public void stop() {
        if (this.status == BaseAudioRenderer.PLAYING) {
            this.status = BaseAudioRenderer.STOPPED;
            this.stopSound();
        }
    }
}
