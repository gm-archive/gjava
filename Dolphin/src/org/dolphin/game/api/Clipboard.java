package org.dolphin.game.api;

import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import org.dolphin.game.api.types.String;

public class Clipboard {

	private static java.awt.datatransfer.Clipboard systemClipboard;

	static {
		/*
		 * Setup the clipboard
		 */
		systemClipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	}

	/**
	 * Returns whether there is any text on the clipboard.
	 * 
	 * @return
	 */
	public static boolean hasText() {
		Transferable clipboardContents = systemClipboard.getContents(null);
		return clipboardContents.isDataFlavorSupported(DataFlavor.stringFlavor);
	}

	/**
	 * Returns the current text on the clipboard.
	 * 
	 * @return
	 */
	public static String getText() {
		Transferable clipboardContents = systemClipboard.getContents(null);
		if (clipboardContents == null) {
			return new String("");
		} else {
			try {
				if (clipboardContents
						.isDataFlavorSupported(DataFlavor.stringFlavor)) {
					String returnText = new String(""
							+ clipboardContents
									.getTransferData(DataFlavor.stringFlavor));
					return returnText;
				}
			} catch (UnsupportedFlavorException ufe) {
			} catch (IOException ioe) {
			}
		}
		return new String("");
	}

	/**
	 * Sets the Clipboard to string s.
	 * 
	 * @param s
	 *            String to set clipboard to
	 */
	public static void setText(String s) {
		Transferable transferableText = new StringSelection("" + s);
		systemClipboard.setContents(transferableText, null);
	}
}
