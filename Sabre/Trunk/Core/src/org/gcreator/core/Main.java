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
