package org.gjava.runner.runner;

import java.awt.*;
import java.awt.event.*;



/**
 * Provides a reusable window that presents a message and
 * choice buttons to the user. A modal dialog is used.
 * Since a thread is used to set the dialog to visible,
 * when the client calls ask() it will not block.
 *
 * The client may implement ActionListener, which has:
 *      public void actionPerformed(ActionEvent evt)
 * if user response notification is desired.
 *
 * @author Jack Harich
 */
public class MessageBox implements Runnable,
    ActionListener, WindowListener, KeyListener {

//---------- Private Fields ------------------------------
private ActionListener listener;
private Dialog  dialog;
private String  closeWindowCommand = "CloseRequested";
private String  title;
private Frame   frame;
private boolean frameNotProvided;
private Panel   buttonPanel = new Panel();
private Canvas  imageCanvas;

//---------- Initialization ------------------------------
/**
 * This convenience constructor is used to delare the
 * listener that will be notified when a button is clicked.
 * The listener must implement ActionListener.
 */
public MessageBox(ActionListener listener) {
    this();
    this.listener = listener;
}
/**
 * This constructor is used for no listener, such as for
 * a simple okay dialog.
 */
public MessageBox() {
}
// Unit test. Shows only simple features.
public static void main(String args[]) {
    MessageBox box = new MessageBox();
    box.setTitle("Test MessageBox");
    box.useImageCanvas("LightBulb.gif");
    box.askYesNo("Tell me now.#Do you like Java?");
}

// show_message by gm_guru (www.g-java.com)
public static void show_message(String message) {
	MessageBox box = new MessageBox();
	box.setTitle("Message");
	box.addChoice("OK");
    box.ask(message);
}
//---------- Runnable Implementation ---------------------
/**
 * This prevents the caller from blocking on ask(), which
 * if this class is used on an awt event thread would
 * cause a deadlock.
 */
public void run() {
    dialog.setVisible(true);
}
//---------- ActionListener Implementation ---------------
public void actionPerformed(ActionEvent evt) {
    String command = evt.getActionCommand();
    System.out.println(""+command);
    dialog.setVisible(false);
    dialog.dispose();
    if (frameNotProvided) frame.dispose();
    if (listener != null) {
        listener.actionPerformed(evt);
    }
}
//---------- WindowListener Implementatons ---------------
public void windowClosing(WindowEvent evt) {
    // User clicked on X or chose Close selection
    fireCloseRequested();
}
public void windowClosed(WindowEvent evt) { }
public void windowDeiconified(WindowEvent evt) { }
public void windowIconified(WindowEvent evt) { }
public void windowOpened(WindowEvent evt) { }
public void windowActivated(WindowEvent evt) {  }
public void windowDeactivated(WindowEvent evt) { }

//---------- KeyListener Implementation ------------------
public void keyTyped(KeyEvent evt) { }
public void keyPressed(KeyEvent evt) {
    if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        fireCloseRequested();
    }
}
public void keyReleased(KeyEvent evt) { }

private void fireCloseRequested() {
    ActionEvent event = new ActionEvent(this,
        ActionEvent.ACTION_PERFORMED, closeWindowCommand);
    actionPerformed(event);
}
//---------- Public Methods ------------------------------
/**
 * This set the listener to be notified of button clicks
 * and WindowClosing events.
 */
public void setActionListener(ActionListener listener) {
    this.listener = listener;
}
public void setTitle(String title) {
    this.title = title;
}
/**
 * If a Frame is provided then it is used to instantiate
 * the modal Dialog. Otherwise a temporary Frame is used.
 * Providing a Frame will have the effect of putting the
 * focus back on that Frame when the MessageBox is closed
 * or a button is clicked.
 */
public void setFrame(Frame frame) { // Optional
    this.frame = frame;
}
/**
 * Sets the ActionCommand used in the ActionEvent when the
 * user attempts to close the window. The window may be
 * closed by clicking on "X", choosing Close from the
 * window menu, or pressing the Escape key. The default
 * command is "CloseRequested", which is just what a Close
 * choice button would probably have as a command.
 */
public void setCloseWindowCommand(String command) {
    closeWindowCommand = command;
}
/**
 * This is handy for providing a small image that will be
 * displayed to the left of the message.
 */
public void useImageCanvas(Canvas imageCanvas) {
    this.imageCanvas = imageCanvas;
}
/**
 * This loads the image from the specified @param fileName,
 * which must be in the same directory as this class.
 * For example @param fileName might be "LightBulb.gif".
 */
public void useImageCanvas(String fileName) {
    try {
        ImageCanvas imageCanvas = new ImageCanvas(MessageBox.class, fileName);
        useImageCanvas(imageCanvas);
    } catch(Exception ex) {
        print("MessageBox.helpfulHint() - Cannot load image " + fileName);
        ex.printStackTrace();
    }
}
/**
 * The @param label will be used for the button and the
 * @param command will be returned to the listener.
 */
public void addChoice(String label, String command) {
    Button button = new Button(label);
    button.setActionCommand(command);
    button.addActionListener(this);
    button.addKeyListener(this);
    buttonPanel.add(button);
}
/**
 * A convenience method that assumes the command is the
 * same as the label.
 */
public void addChoice(String label) {
    addChoice(label, label);
}
/**
 * One of the "ask" methods must be the last call when
 * using a MessageBox. This is the simplest "ask" method.
 * It presents the provided @param message.
 */
public void ask(String message) {
    if (frame == null) {
        frame = new Frame();
        frameNotProvided = true;
    } else {
        frameNotProvided = false;
    }
    dialog = new Dialog(frame, true); // Modal
    dialog.addWindowListener(this);
    dialog.addKeyListener(this);
    dialog.setTitle(title);
    dialog.setLayout(new BorderLayout(5, 5));

    Panel messagePanel = createMultiLinePanel(message);
    if (imageCanvas == null) {
        dialog.add("Center", messagePanel);
    } else {
        Panel centerPanel = new Panel();
        centerPanel.add(imageCanvas);
        centerPanel.add(messagePanel);
        dialog.add("Center", centerPanel);
    }
    dialog.add("South", buttonPanel);
    dialog.pack();
    enforceMinimumSize(dialog, 200, 100);
    centerWindow(dialog);
    Toolkit.getDefaultToolkit().beep();

    // Start a new thread to show the dialog
    Thread thread = new Thread(this);
    thread.start();
}
/**
 * Same as ask(String message) except adds an "Okay" button.
 */
public void askOkay(String message) {
    addChoice("Okay");
    ask(message);
}
/**
 * Same as ask(String message) except adds "Yes" and "No"
 * buttons.
 */
public void askYesNo(String message) {
    addChoice("Yes");
    addChoice("No");
    ask(message);
}

/**
 * This will return true if the answer is yes
 * by gm_guru www.g-java.com
 */
public boolean action_if_question(String message) {
		// return true if the answer is yes
		//basicgame.Current_room.Paused = true;
		askYesNo(message);
		//basicgame.Current_room.Paused = false;
		return true;
} 

//---------- Private Methods -----------------------------
private Panel createMultiLinePanel(String message) {
    Panel mainPanel = new Panel();
    GridBagLayout gbLayout = new GridBagLayout();
    mainPanel.setLayout(gbLayout);
    addMultilineString(message, mainPanel);
    return mainPanel;
}
// There are a variaty of ways to do this....
private void addMultilineString(String message,
        Container container) {

    GridBagConstraints constraints = getDefaultConstraints();
    constraints.gridwidth = GridBagConstraints.REMAINDER;
        // Insets() args are top, left, bottom, right
    constraints.insets   = new Insets(0,0,0,0);
    GridBagLayout gbLayout = (GridBagLayout)container.getLayout();

    while (message.length() > 0) {
        int newLineIndex = message.indexOf('#');
        String line;
        if (newLineIndex >= 0) {
            line = message.substring(0, newLineIndex);
            message = message.substring(newLineIndex + 1);
        } else {
            line = message;
            message = "";
        }
        Label label = new Label(line);
        gbLayout.setConstraints(label, constraints);
        container.add(label);
    }
}
private GridBagConstraints getDefaultConstraints() {
    GridBagConstraints constraints = new GridBagConstraints();
    constraints.weightx  = 1.0;
    constraints.weighty  = 1.0;
    constraints.gridheight = 1; // One row high
        // Insets() args are top, left, bottom, right
    constraints.insets   = new Insets(4,4,4,4);
        // fill of NONE means do not change size
    constraints.fill = GridBagConstraints.NONE;
        // WEST means align left
    constraints.anchor = GridBagConstraints.WEST;

    return constraints;
}
private void centerWindow(Window win) {
    Dimension screenDim = Toolkit.getDefaultToolkit().getScreenSize();
    // If larger than screen, reduce window width or height
    if (screenDim.width < win.getSize().width) {
        win.setSize(screenDim.width, win.getSize().height);
    }
    if (screenDim.height < win.getSize().height) {
        win.setSize(win.getSize().width, screenDim.height);
    }
    // Center Frame, Dialogue or Window on screen
    int x = (screenDim.width - win.getSize().width) / 2;
    int y = (screenDim.height - win.getSize().height) / 2;
    win.setLocation(x, y);
}
private void enforceMinimumSize(Component comp,
        int minWidth, int minHeight) {
    if (comp.getSize().width < minWidth) {
        comp.setSize(minWidth, comp.getSize().height);
    }
    if (comp.getSize().height < minHeight) {
        comp.setSize(comp.getSize().width, minHeight);
    }
}
//--- Std
private static void print(String text) {
    System.out.println(text);
}

} // End class
