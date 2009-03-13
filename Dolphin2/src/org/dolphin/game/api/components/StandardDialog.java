package org.dolphin.game.api.components;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
 
import javax.swing.*;
 
/** 
 * Standard Dialog is a basic dialog with Apply/Ok/Cancel buttons<p>
 *  To implement it, you have to implement apply() which gets run
 *  when the user hits either apply or ok, and showApplyButton(),
 *  which says whether or not to show the apply button
 */
 
//public abstract class StandardDialog extends JDialog {
public abstract class StandardDialog extends ModalOnParentDialog {
    public StandardDialog() throws HeadlessException {
        super();
        _init();
    }
 
    public StandardDialog(Dialog owner) throws HeadlessException {
        super(owner);
        _init();
    }
 
    public StandardDialog(Dialog owner, boolean modal) throws HeadlessException {
        super(owner, modal);
        _init();
    }
 
    public StandardDialog(Frame owner) throws HeadlessException {
        super(owner);
        _init();
    }
 
    public StandardDialog(Frame owner, boolean modal) throws HeadlessException {
        super(owner, modal);
        _init();
    }
 
    public StandardDialog(Dialog owner, String title) throws HeadlessException {
        super(owner, title);
        _init();
    }
 
    public StandardDialog(Dialog owner, String title, boolean modal)
            throws HeadlessException {
        super(owner, title, modal);
        _init();
    }
 
    public StandardDialog(Frame owner, String title) throws HeadlessException {
        super(owner, title);
        _init();
    }
 
    public StandardDialog(Frame owner, String title, boolean modal)
            throws HeadlessException {
        super(owner, title, modal);
        _init();
    }
 
    public StandardDialog(Dialog owner, String title, boolean modal,
            GraphicsConfiguration gc) throws HeadlessException {
        super(owner, title, modal, gc);
        _init();
    }
 
    public StandardDialog(Frame owner, String title, boolean modal,
            GraphicsConfiguration gc) {
        super(owner, title, modal, gc);
        _init();
    }
/*    
	public void setVisible(boolean b) {
		super.setVisible(b);
		if (b) StandardFrame.Watch(this); else StandardFrame.RemoveWatch(this);
	}
 */
    
    public void setMainContent(Component c) {
    	getContentPane().add(c, BorderLayout.CENTER);
    	//mMainPane = c;
    }
    
    protected void _init() {
        Container con = getContentPane();
        con.setLayout(new BorderLayout());
        mButtonPane = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        con.add(mButtonPane, BorderLayout.SOUTH);
        mButtonListener = new ButtonListener();
        if (showApplyButton()) {
            mApply = new JButton("Apply");
            mButtonPane.add(mApply);
            mApply.addActionListener(mButtonListener);
        }
        mOk = new JButton("OK");
        mButtonPane.add(mOk);
        mOk.addActionListener(mButtonListener);
        mCancel = new JButton("Cancel");
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE );
        //mButtonPane.add(mCancel);
        //mCancel.addActionListener(mButtonListener);
    }
    
//    public Component getMainPane() {
//        return mMainPane;
//    }
        
    public void ok (){
    	mCancelState = OK;
        apply();
        close();
    }
    
    public void cancel() {
    	mCancelState = CANCEL;
        close();
    }
    
    public void close () {
        dispose();
    }
    /**
     * Either override this or call setShowApplyButton(true) to
     * show the applyButton
     * @return
     */
    public boolean showApplyButton() {
    	return mShowApply;
    }
    
    public void setShowApplyButton(boolean b) {
    	mShowApply = b;
    }
    
    public abstract void apply();
    
    public void dispose() {
    	if (mCancelState != OK) {
    		mCancelState = CANCEL;
    	}
    	synchronized(this) {
    		notifyAll();
    	}
    	super.dispose();
    }
    
    protected class ButtonListener implements ActionListener {
        public void actionPerformed (ActionEvent ae) {
            JButton b = (JButton) ae.getSource();
            if (b == mApply) {
                apply();
            }
            else if (b == mOk) {
                ok();
            }
            else if (b == mCancel) {
                cancel();
            }
        }
    }
    
    public int getCancelState() {
    	return mCancelState;
    }
    
    public static StandardDialog createStandardDialog(final Component content, final Runnable okAction, final boolean showApply) {
    	StandardDialog sd = new StandardDialog() {
    		public void apply() {
    			if (okAction != null) {
    				okAction.run();
    			}
    		}
    		
    		public boolean showApplyButton() {
    			return showApply;
    		}
    	};
    	if (content.getName() != null) {
    		sd.setTitle(content.getName());
    	}
    	sd.setMainContent(content);
    	return sd;
    }
    
    public static int showStandardDialog(Component content, Runnable okAction, boolean showApply) {
    	StandardDialog sd = createStandardDialog(content, okAction, showApply);
    	sd.setModal(true);
    	return showStandardDialog(sd);
    }
    
	public static int showStandardDialog(StandardDialog sd) {
		Window w = sd.getOwner();
		if (w == null) {
			Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
			Dimension ps = sd.getPreferredSize();
			return showStandardDialog(sd, (d.width - ps.width) / 2, (d.height - ps.height) / 2);
		}
		else {
			Point p = w.getLocation();
			@SuppressWarnings("unused")
			Dimension d = w.getSize();
			return showStandardDialog(sd, p.x + 100, p.y + 20);
		}
	}
	
    public static int showStandardDialog(final StandardDialog sd, int x, int y) {
		sd.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				sd.cancel();
			}
        });
		
		sd.setLocation(x, y);
    	sd.pack();
    	sd.setVisible(true);
//    	synchronized(sd) {
//			try {
//				sd.wait();
//			}
//			catch (InterruptedException ex) {}
//		}
    	return sd.getCancelState();
    }
    
    public static final int OK = 1;
    public static final int SHOWN = 0;
    public static final int CANCEL = -1;
    
    private boolean mShowApply = false;
    private int mCancelState = 0;
    protected boolean mBlockInCode;
    //protected Container mContent;
    //protected Component mMainPane;
    protected JButton mApply;
    protected JButton mOk;
    protected JButton mCancel;
    protected JPanel mButtonPane;
    protected ActionListener mButtonListener;

 
	private static void StandardDialogTest() {
		JPanel jp = new JPanel(new GridLayout(3,1));
		jp.setName("Standard Dialog Test");
		final JTextField a = new JTextField("A"), b = new JTextField("B"), c = new JTextField("C");
		jp.add(a);
		jp.add(b);
		jp.add(c);
		final StringBuilder sb = new StringBuilder("Start - ");
		Runnable r = new Runnable() {
			public void run() {
				sb.append(a.getText() + " , " + b.getText() + " , " + c.getText());
			}
		};
		StandardDialog.showStandardDialog(jp, r, false);
		System.out.println(sb.toString());
	}
}
 

