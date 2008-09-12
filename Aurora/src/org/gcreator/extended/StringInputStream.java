package org.gcreator.extended;

import java.io.InputStream;

/**
 *
 * @author  Luís
 */
public class StringInputStream extends InputStream {

    private String s;
    private int pos = 0;

    public StringInputStream(String s) {
        if (s == null) {
            throw new NullPointerException("String may not be null");
        }

        this.s = s;
    }

    @Override
    public int read() {
        if (pos >= s.length()) {
            return -1;
        }

        return s.charAt(pos++);
    }
}
