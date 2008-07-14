package org.gcreator.bob.boblook;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.plaf.synth.SynthLookAndFeel;

public class BobLookAndFeel extends SynthLookAndFeel
{
    private static final long serialVersionUID = 1;
    
    public BobLookAndFeel() {
        try {
            load(getClass().getResourceAsStream("/org/gcreator/bob/boblook/laf.xml"), getClass());
        } catch (ParseException ex) {
            Logger.getLogger(BobLookAndFeel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public String getName() {
        return "Bob Look";
    }

    @Override
    public String getID() {
        return "Bob";
    }

    @Override
    public String getDescription() {
        return "The Bob Look and Feel";
    }


    @Override
    public boolean isNativeLookAndFeel() {
        return false;
    }


    @Override
    public boolean isSupportedLookAndFeel() {
        return true;
    }
}