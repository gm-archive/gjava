package org.gcreator.components;

import javax.swing.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;
import java.awt.event.*;

/**
 * Component to be used as tabComponent;
 * Contains a JLabel to show the text and 
 * a JButton to close the tab it belongs to 
 */ 
public class ButtonTabComponent extends JPanel {
    private final JTabbedPane pane;
    public static ImageIcon close = new ImageIcon(ButtonTabComponent.class.getResource("/org/gcreator/resources/close.png"));
    public static ImageIcon closehover = new ImageIcon(ButtonTabComponent.class.getResource("/org/gcreator/resources/closehover.png"));
    public static ImageIcon closepressed = new ImageIcon(ButtonTabComponent.class.getResource("/org/gcreator/resources/closepressed.png"));

    public ButtonTabComponent(final JTabbedPane pane) {
        //unset default FlowLayout' gaps
        super(new FlowLayout(FlowLayout.LEFT, 0, 0));
        if (pane == null) {
            throw new NullPointerException("TabbedPane is null");
        }
        this.pane = pane;
        setOpaque(false);
        
        //make JLabel read titles from JTabbedPane
        JLabel label = new JLabel() {
            public String getText() {
                int ver = Integer.parseInt(org.gcreator.core.gcreator.getJavaVersion().replaceAll("1\\.([0-9])\\..*", "$1"));
                if (ver >= 6) {
                    int i = pane.indexOfTabComponent(ButtonTabComponent.this); //possible error as removed Tab from inside method name (1.5)
                    if (i != -1) {
                        return pane.getTitleAt(i);
                    }
                }
                return null;
            }
        };
        
        add(label);
        //add more space between the label and the button
        label.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
        //tab button
        TabButton button = new TabButton();
        button.addActionListener(button);
        add(button);
        //add more space to the top of the component
        setBorder(BorderFactory.createEmptyBorder(2, 0, 0, 0));
    }

    private class TabButton extends JButton implements ActionListener {
        public TabButton() {
            int size = 17;
            setPreferredSize(new Dimension(size, size));
            setToolTipText("Close this tab");
            //Make the button looks the same for all Laf's
            setUI(new BasicButtonUI());
            //Make it transparent
            setContentAreaFilled(false);
            //No need to be focusable
            setFocusable(false);
            setBorder(BorderFactory.createEtchedBorder());
            setBorderPainted(true);
            setBorder(null);
            //Making nice rollover effect
            //we use the same listener for all buttons
            addMouseListener(buttonMouseListener);
            setRolloverEnabled(true);
            //Close the proper tab by clicking the button
        }
        
        public void actionPerformed(ActionEvent e) {
            int ver = Integer.parseInt(org.gcreator.core.gcreator.getJavaVersion().replaceAll("1\\.([0-9])\\..*", "$1"));
            if (ver >= 6) {
                int i = pane.indexOfTabComponent(ButtonTabComponent.this); //remove tab for 1.5
                if (i != -1) {
                    TabPanel panel = (TabPanel) pane.getComponentAt(i);
                    panel.dispose();
                }
            }
        }

        //we don't want to update UI for this button
        public void updateUI() {
        }

        //paint the cross
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g.create();
            /*if(getModel().isPressed())
                g2.drawImage(ButtonTabComponent.closepressed.getImage(), 0, 0, ButtonTabComponent.closepressed.getImageObserver());
            else if(getModel().isRollover())
                g2.drawImage(ButtonTabComponent.closehover.getImage(), 0, 0, ButtonTabComponent.closehover.getImageObserver());
            else
                g2.drawImage(ButtonTabComponent.close.getImage(), 0, 0, ButtonTabComponent.close.getImageObserver());
            //shift the image for pressed buttons*/
            if (getModel().isPressed()) {
                g2.translate(1, 1);
            }
            if(getModel().isRollover())
                setBorder(BorderFactory.createEtchedBorder());
            else
                setBorder(null);
            g2.setStroke(new BasicStroke(2));
            g2.setColor(Color.BLACK);
            int delta = 6;
            g2.drawLine(delta, delta, getWidth() - delta - 1, getHeight() - delta - 1);
            g2.drawLine(getWidth() - delta - 1, delta, delta, getHeight() - delta - 1);
	    
            g2.dispose();
        }
    }

    public void hover(){
        //setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }
    public void out(){
        //setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }
    
    private MouseListener buttonMouseListener = new MouseAdapter() {
        public void mouseEntered(MouseEvent e) {
            hover();
            Component component = e.getComponent();
            if (component instanceof AbstractButton) {
                AbstractButton button = (AbstractButton) component;
                button.setBorderPainted(true);
            }
        }

        public void mouseExited(MouseEvent e) {
            out();
            Component component = e.getComponent();
            if (component instanceof AbstractButton) {
                AbstractButton button = (AbstractButton) component;
                button.setBorderPainted(false);
            }
        }
    };
}


