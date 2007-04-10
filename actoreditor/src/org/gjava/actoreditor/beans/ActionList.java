/*
 * ActionList.java
 *
 * Created on 27 de Fevereiro de 2007, 22:00
 */

package org.gjava.actoreditor.beans;

import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import org.gjava.actoreditor.Action.ActionData;
import org.gjava.actoreditor.Utilz;
import org.openide.util.Utilities;


/**
 *
 * @author  Porfirio
 */
public class ActionList extends javax.swing.JList
{
    public static DefaultListModel model = new DefaultListModel();
    
    
    
    /** Creates new form ActionList */
    public ActionList()
    {
        
        
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
                if( dtde.isDataFlavorSupported(Utilz.ACTION_DATA_FLAVOR ) )
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
                if( !dtde.isDataFlavorSupported( Utilz.ACTION_DATA_FLAVOR ) )
                {
                    dtde.rejectDrop();
                }
                //accept the drop so that we can access the Transferable
                dtde.acceptDrop( DnDConstants.ACTION_COPY_OR_MOVE );
                ActionData data = null;
                try
                {
                    //get the dragged data from the transferable
                    //get the dragged data from the transferable
                    //get the dragged data from the transferable
                    //get the dragged data from the transferable
                    data = (ActionData) dtde.getTransferable().getTransferData(Utilz.ACTION_DATA_FLAVOR);
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
                    
                    //model.setSize(model.getSize()+10);
                    
                    //model.addElement(new Value("Move Action", new ImageIcon(Utilities.loadImage("org/gjava/actoreditor/actions/GM_Move.gif")) ));
                    
                    DefaultListModel mod = (DefaultListModel) getModel();
                            mod.addElement(new Value(data.getDisplayName(),new ImageIcon(data.getBigImage()) )) ;
                    
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
        setTransferHandler(new ArrayListTransferHandler());
        
        
        // model.addElement(new Value("the road", new ImageIcon(Utilities.loadImage("org/gjava/actoreditor/object.png")) ));
        
        setModel(model);
        setFixedCellHeight(50);
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
    
    
    private class Value
    {
        public String value;
        public ImageIcon image;
        Value(String value, ImageIcon image)
        {
            this.value = value;
            this.image = image;
        }
        
    }
    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {

        setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        setDragEnabled(true);
    }// </editor-fold>//GEN-END:initComponents
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    
}
