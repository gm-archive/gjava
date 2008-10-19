/*
Copyright (C) 2008 Luís Reis<luiscubal@gmail.com>
Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
*/
package org.gcreator.core;

/**
 * The Main class.
 * This handles command-line input and launches the Core on startup.
 * 
 * @author Serge Humphrey
 */
public class Main {

    /** Don't allow instantation
     */
    private Main() {
    }

    /**
     * Called by the JVM when the application is started.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean safe = parseArgs(args);
        Core.load(safe);
    }

    /**
     * Parses any command-line agruments.
     * 
     * @param args The arguments to parse.
     * @see main(String[])
     * @return Whether to start in safe mode.
     */
    private static boolean parseArgs(String[] args) {
        if (args.length == 0) {
            return false;
        }
        if (args[0].equalsIgnoreCase("--help") || args[0].equalsIgnoreCase("-help") || args[0].equalsIgnoreCase("-h")) {
            System.out.println("G-Creator version " + Core.version());
            System.out.println("Usage: gcreator [options] [file]");
            System.out.println("-h --help          Displays this help message");
            System.out.println("-v --version       Displays the G-Creator version");
            System.out.println("-s --safe          Doesn't load plug-ins and settings (Safe mode)");
            System.exit(0);
        }
        if (args[0].equalsIgnoreCase("--version") || args[0].equalsIgnoreCase("-version") || args[0].equalsIgnoreCase("-v")) {
            System.out.println("G-Creator version " + Core.version());
            System.out.println("Copyright © 2005-2008 The G-Creator Organization");
            System.out.println("http://www.g-creator.org");
            System.exit(0);
        }
        if (args[0].equalsIgnoreCase("--safe") || args[0].equalsIgnoreCase("-s") || args[0].equalsIgnoreCase("-safe")) {
            return true;
        }
        return false;
    }
}
