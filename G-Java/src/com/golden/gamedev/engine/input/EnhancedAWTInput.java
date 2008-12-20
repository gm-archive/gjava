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
 */
package com.golden.gamedev.engine.input;

// JFC
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.util.BitSet;
//import org.gcreator.compilers.gjava.Game;
import org.dolphin.game.Game;
import org.dolphin.game.api.exceptions.DestroyException;

public class EnhancedAWTInput extends AWTInput {

    private BitSet keyDown;

    public EnhancedAWTInput(Component comp) {
        super(comp);

        this.keyDown = new BitSet();
    }

    protected InputListener createInputListener() {
        return new EnhancedInputListener();
    }

    public void refresh() {
        super.refresh();

        this.keyDown.clear();
    }

    public boolean[] getKeyDown() {
        throw new UnsupportedOperationException(
                "Enhanced AWT Input use BitSet boolean, " + "use getKeyDownBitSet() instead.");
    }

    public BitSet getKeyDownBitSet() {
        return this.keyDown;
    }

    public boolean isKeyDown(int keyCode) {
        return this.keyDown.get(keyCode);
    }

    protected class EnhancedInputListener extends InputListener {

        public void keyPressed(KeyEvent e) {
            //Game.lastkey=e.getKeyCode();
            //Game.lastchar=""+e.getKeyChar();

            if (!EnhancedAWTInput.this.keyDown.get(e.getKeyCode())) {
                EnhancedAWTInput.this.keyDown.set(e.getKeyCode());

                EnhancedAWTInput.this.keyPressed[EnhancedAWTInput.this.pressedKey] = e.getKeyCode();
                EnhancedAWTInput.this.pressedKey++;
                
                for (int i = 0; i < Game.currentRoom.instances.size(); i++) {
                try {

                    (Game.currentRoom.instances.elementAt(i)).KeyPressed(e.getKeyCode());

                } catch (DestroyException ex) {
                    // Logger.getLogger(AWTInput.class.getName()).log(Level.SEVERE, null, ex);
                    ex.printStackTrace();
                }
            }
            }
            
            e.consume();
        }

        public void keyReleased(KeyEvent e) {
            EnhancedAWTInput.this.keyDown.clear(e.getKeyCode());

            EnhancedAWTInput.this.keyReleased[EnhancedAWTInput.this.releasedKey] = e.getKeyCode();
            EnhancedAWTInput.this.releasedKey++;
            
            for (int i = 0; i < Game.currentRoom.instances.size(); i++) {
                try {

                    (Game.currentRoom.instances.elementAt(i)).KeyReleased(e.getKeyCode());

                } catch (DestroyException ex) {
                    // Logger.getLogger(AWTInput.class.getName()).log(Level.SEVERE, null, ex);
                    ex.printStackTrace();
                }
            }

            e.consume();
        }
    }
}
