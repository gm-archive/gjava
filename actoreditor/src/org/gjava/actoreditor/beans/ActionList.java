/*
 * ActionList.java
 *
 * Created on 27 de Fevereiro de 2007, 22:00
 */

package org.gjava.actoreditor.beans;

import java.awt.Color;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceDropEvent;
import java.awt.dnd.DragSourceEvent;
import org.gjava.actoreditor.ActionValue;
import java.awt.Component;
import java.awt.datatransfer.StringSelection;
import org.gjava.actoreditor.*;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragSource;
import java.awt.dnd.DragSourceListener;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListCellRenderer;
import org.gjava.actoreditor.Action.ActionData;
import org.gjava.actoreditor.Utilz;


/**
 *
 * @author  Porfirio
 */
public class ActionList extends javax.swing.JList implements DragSourceListener,
    DragGestureListener
{
    public static DefaultListModel model = new DefaultListModel();
    public final Actoreditor aa;
    
    DragSource ds;


  StringSelection transferable;
    
    public void dragGestureRecognized(DragGestureEvent dge) {
    System.out.println("Drag Gesture Recognized!");
    transferable = new StringSelection(this.getSelectedValue().toString());
    ds.startDrag(dge, DragSource.DefaultCopyDrop, transferable, this);
  }

  public void dragEnter(DragSourceDragEvent dsde) {
    System.out.println("Drag Enter");
  }

  public void dragExit(DragSourceEvent dse) {
    System.out.println("Drag Exit");
  }

  public void dragOver(DragSourceDragEvent dsde) {
    System.out.println("Drag Over");
  }

  public void dragDropEnd(DragSourceDropEvent dsde) {
    System.out.print("Drag Drop End: ");
    if (dsde.getDropSuccess()) {
      System.out.println("Succeeded");
    } else {
      System.out.println("Failed");
    }
  }

  public void dropActionChanged(DragSourceDragEvent dsde) {
    System.out.println("Drop Action Changed");
  }
    
    /** Creates new form ActionList */
    public ActionList(Actoreditor a)
    {
        this.aa = a;
        
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
                    
                   
                    //check for event
                   if (aa.eventList.getSelectedValue() == null)
                   {
                       JOptionPane.showMessageDialog(null,"No event selected");
                       System.out.println("No event selected");
                   } else {
                    
                        data.refresh();
                    //add to actions
                    DefaultListModel mod = (DefaultListModel) getModel();
                            mod.addElement(new ActionValue(data.getDisplayName(),data.img,data.code,data.args )) ;
                    
                    aa.a.setModified(true);
                   }
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
            ActionValue val = (ActionValue)value;
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

        setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        setDragEnabled(true);
    }// </editor-fold>//GEN-END:initComponents
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    
}
