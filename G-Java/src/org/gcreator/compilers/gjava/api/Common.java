/**
 *
 * Copyright (C) 2008 Luís Reis <luiscubal@gmail.com>
 *
 * This file is part of G-Java.
 * G-Java is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.compilers.gjava.api;

import org.gcreator.compilers.gjava.lwjgl.*;

/**
 * @author Luís Reis
 */
public class Common {

    public static class Scene {

        public static void gotoNext() {
           // Basicgame.nextScene();
        }

        public static void gotoPrevious() {
            Basicgame.prevScene();
        }
    }
}
