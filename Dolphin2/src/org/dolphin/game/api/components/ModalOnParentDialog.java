package org.dolphin.game.api.components;

import java.awt.Component;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
 
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
 
import java.awt.Container;
 
public class ModalOnParentDialog extends JDialog implements ComponentListener,
		WindowListener {
 
	private static final long serialVersionUID = 1L;
	private Component mOwner;
	private boolean mParentOnly = false;
 
	public ModalOnParentDialog() throws HeadlessException {
		super();
		init(null);
	}
 
	public ModalOnParentDialog(Frame arg0) throws HeadlessException {
		super(arg0);
		init(arg0);
	}
 
	public ModalOnParentDialog(Frame arg0, boolean arg1)
			throws HeadlessException {
		super(arg0, arg1);
		init(arg0);
	}
 
	public ModalOnParentDialog(Frame arg0, String arg1)
			throws HeadlessException {
		super(arg0, arg1);
		init(arg0);
	}
 
	public ModalOnParentDialog(Frame arg0, String arg1, boolean arg2)
			throws HeadlessException {
		super(arg0, arg1, arg2);
		init(arg0);
	}
 
	public ModalOnParentDialog(Frame arg0, String arg1, boolean arg2,
			GraphicsConfiguration arg3) {
		super(arg0, arg1, arg2, arg3);
		init(arg0);
	}
 
	public ModalOnParentDialog(Dialog arg0) throws HeadlessException {
		super(arg0);
		init(arg0);
	}
 
	public ModalOnParentDialog(Dialog arg0, boolean arg1)
			throws HeadlessException {
		super(arg0, arg1);
		init(arg0);
	}
 
	public ModalOnParentDialog(Dialog arg0, String arg1)
			throws HeadlessException {
		super(arg0, arg1);
		init(arg0);
	}
 
	public ModalOnParentDialog(Dialog arg0, String arg1, boolean arg2)
			throws HeadlessException {
		super(arg0, arg1, arg2);
		init(arg0);
	}
 
	public ModalOnParentDialog(Dialog arg0, String arg1, boolean arg2,
			GraphicsConfiguration arg3) throws HeadlessException {
		super(arg0, arg1, arg2, arg3);
		init(arg0);
	}
	
	private void init(Component c) {
		mOwner = c;
		addComponentListener(this);
		addWindowListener(this);
	}
 
	public void componentResized(ComponentEvent arg0) {}
 
	public void componentMoved(ComponentEvent arg0) {}
 
	public void componentShown(ComponentEvent arg0) {
		doModalOp();
	}
 
	public void componentHidden(ComponentEvent arg0) {
		doModalOp();
	}
		
	public boolean isParentOnly() {
		return mParentOnly;
	}
	
	public void setParentOnly(boolean b) {
		mParentOnly = b;
	}
	
	public void setModal(boolean b) {
		super.setModal(b);
		//mModal = b;
		doModalOp();
	}
	
	private void doModalOp() {
		if (mOwner != null) {
			mOwner.setEnabled(!super.isModal() || !isVisible());
		}
	}
	
	/**
	 * @overridden so that the dialog with function like a non-modal dialog
	 * except to the owner if isParentOnly() is true
	 */
	public boolean isModal() {
		return super.isModal() && !mParentOnly;
	}
	
//	public boolean isParentModel() {
//		return mModal;
//	}
	
 
	public void windowOpened(WindowEvent arg0) {
		doModalOp();
	}
 
	public void dispose() {
		//setVisible(false);
		//doModalOp();
		if (mOwner != null) {
			mOwner.setEnabled(true);
		}
		removeComponentListener(this);
		removeWindowListener(this);
		super.dispose();
	}
	
	public void pack() {
		super.pack();
		addListeners();
	}
 
	private boolean addListeners() {
		WindowListener[] listeners = this.getWindowListeners();
		if (listeners != null) {
			for (int i = 0; i < listeners.length; i++) {
				if (listeners[i] == this) return false;
			}
		}
		addComponentListener(this);
		addWindowListener(this);
		return true;
	}
	
	public void show() {
		super.show();
		addListeners();
		if(super.isModal() && mOwner != null) {
			mOwner.setEnabled(false);
		}
	}
	
	public void show(boolean b) {
		super.show(b);
		addListeners();
		if(super.isModal() && mOwner != null) {
			mOwner.setEnabled(false);
		}
	}
	
	public void windowClosing(WindowEvent arg0) {}
 
	public void windowClosed(WindowEvent arg0) {
		doModalOp();
	}
 
	public void windowIconified(WindowEvent arg0) {}
 
	public void windowDeiconified(WindowEvent arg0) {}
 
	public void windowActivated(WindowEvent arg0) {}
 
	public void windowDeactivated(WindowEvent arg0) {}
	
	public static void main(String[] args) {
		JFrame jf1 = new JFrame("1"), jf2 = new JFrame("2");
		final ModalOnParentDialog d = new ModalOnParentDialog(jf1, "3");
		d.setModal(true);
		d.setParentOnly(true);
		JButton b = new JButton("Show");
		JButton b2 = new JButton("Show2");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				d.setVisible(!d.isVisible());
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				d.show();
			}
		});
		jf1.setBounds(0,0,40,40);
		jf1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		jf2.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		d.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		jf2.setBounds(40,40,40,40);
		Container c = jf2.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(b);
		c.add(b2);
		d.setBounds(80,80,40,40);
		jf1.setVisible(true);
		jf2.setVisible(true);
		d.setVisible(true);
	}	
}
