/*
 * EventList.java
 *
 * Created on 27 de Fevereiro de 2007, 21:59
 */

package org.gjava.actoreditor.beans;

import java.awt.Color;
import java.awt.Component;
import org.gjava.actoreditor.*;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.io.IOException;
import java.util.Enumeration;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListCellRenderer;
import org.gjava.actoreditor.Utilz;
import org.gjava.actoreditor.Value;
import org.gjava.actoreditor.events.eventData;

/**
 *
 * @author  Porfirio and TGMG
 */
public class EventList extends javax.swing.JList
{
    
    public DefaultListModel events = new DefaultListModel();
    static private final String REAL_NUMBER = "^[-+]?\\d+(\\.\\d+)?$";
    
    //----------------------------------------------------------------------------------------------
/**
 * Determines if a string contains only digits, decimal points & hyphens.
 * @param string The string to check.
 * @return <code>True</code> if it has only digits, else <code>false</code>.
 * @since J2SE 1.4
 */
static public boolean isNumeric(String string)
{
   return string.matches(REAL_NUMBER);
}

public Actoreditor a;
    
    /** Creates new form EventList */
    public EventList(Actoreditor aa)
    {
        this.a = aa;
             
        setDropTarget(new DropTarget(this,new DropTargetListener()
        {
            public void dragEnter(DropTargetDragEvent dropTargetDragEvent)
            {
                //not needed
            }
            public void dragExit(DropTargetEvent dropTargetEvent)
            {
                //not needed
            }
            public void dragOver(DropTargetDragEvent dtde)
            {
                if( dtde.isDataFlavorSupported( Utilz.EVENT_DATA_FLAVOR ) )
                {
                    //only accept object of our type
                    dtde.acceptDrag( DnDConstants.ACTION_COPY_OR_MOVE );
                }
                else
                {
                    //reject everything else
                    dtde.rejectDrag();
                }
            }
            public void drop(DropTargetDropEvent dtde)
            {
                //first check if we support this type of data
                if( !dtde.isDataFlavorSupported( Utilz.EVENT_DATA_FLAVOR ) )
                {
                    dtde.rejectDrop();
                }
                //accept the drop so that we can access the Transferable
                dtde.acceptDrop( DnDConstants.ACTION_COPY_OR_MOVE );
                eventData data = null;
                try
                {
                    //get the dragged data from the transferable
                    //get the dragged data from the transferable
                    data = (eventData) dtde.getTransferable().getTransferData(Utilz.EVENT_DATA_FLAVOR);
                }
                catch (IOException ex)
                {
                    ex.printStackTrace();
                }
                catch (UnsupportedFlavorException ex)
                {
                    ex.printStackTrace();
                }
                
                dtde.dropComplete( null != data );
                if( null != data )
                {
                    int idx = locationToIndex(dtde.getLocation());
                    String tempname=data.getDisplayName();
                    
                    
                    if (data.getDisplayName().equals("Alarm Event"))
                    {
                     String alarm = "";
                        do {
                  alarm = JOptionPane.showInputDialog("Which alarm event? (Number only <20)", "0");
                        } while((isNumeric(alarm) == false) || (Integer.parseInt(alarm) > 20));
                     tempname = "Alarm"+alarm+" Event";
                    }
                    
                    if (data.getDisplayName().equals("Keyboard Event"))
                    {
                     String key = "";
                        do {
                  key = JOptionPane.showInputDialog("Which keyboard event? (Keyboard character code only (See docs for keyboard char codes))", "0");
                        } while(isNumeric(key) == false);
                     tempname = "Keyboard: "+key+" Event";
                    }
                    
                    if (data.getDisplayName().equals("Keypress Event"))
                    {
                     String key = "";
                        do {
                  key = JOptionPane.showInputDialog("Which keyboard press event? (Keyboard character code only (See docs for keyboard char codes))", "0");
                        } while(isNumeric(key) == false);
                     tempname = "KeyPress: "+key+" Event";
                    }
                    
                    if (data.getDisplayName().equals("Keyrelease Event"))
                    {
                     String key = "";
                        do {
                  key = JOptionPane.showInputDialog("Which keyboard release event? (Keyboard character code only (See docs for keyboard char codes))", "0");
                        } while(isNumeric(key) == false);
                     tempname = "KeyRelease: "+key+" Event";
                    }
                    
                    if (data.getDisplayName().equals("Mouse Event"))
                    {
                     String key = "";
                        do {
                  key = JOptionPane.showInputDialog("Which mouse event? (mouse character code only (See docs for mouse char codes))", "0");
                        } while(isNumeric(key) == false);
                     tempname = "Mouse: "+key+" Event";
                    }
                    
                    boolean dup = false;
                    //check if duplicate
                    for (Enumeration e = events.elements(); e.hasMoreElements() ;)
                    {
                      Value v = (Value)e.nextElement();
                     if(v.value.equals(tempname))
                     {
                         dup = true;
                     }
                    }
                    if (dup == false)
                    {
                    events.addElement(new Value(tempname,data.img, new DefaultListModel() )) ;
                    a.a.setModified(true);
                    }
                    System.out.println(""+idx);
                    //dropTargetDropEvent.getSource().
                }
            }
            public void dropActionChanged(DropTargetDragEvent dropTargetDragEvent)
            {
            }
        }));
        this.setCellRenderer(new SimpleCellRenderer());
        initComponents();
        setModel(events);
    }
    

    
    class SimpleCellRenderer extends JLabel implements ListCellRenderer
    {
        public SimpleCellRenderer()
        {
            setOpaque(true);
        }
        
        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus)
        {
            Value val = (Value)value;
            setText(val.value);
            setIcon(val.image);
            
            setBackground(isSelected ? Color.black : (index & 1) == 0 ? Color.white : Color.LIGHT_GRAY);
            setForeground(isSelected ? Color.white : Color.black);
            return this;
        }
        
        
    }
    
    
    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDragEnabled(true);
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    
}
