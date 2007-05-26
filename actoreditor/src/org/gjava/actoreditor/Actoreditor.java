/*
 * Actoreditor.java
 *
 * Created on 06 May 2007, 01:05
 *
 * If you edit this file via form editor then you will have to make a few changes
 * in another unguarded editor:
 * put:
 * public ActionList actionList1;
    public EventList eventList;
 * instead of JLists
 * Also remove: actionList1.setModel(null);
 */

package org.gjava.actoreditor;


import java.awt.Container;
import java.awt.Point;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import org.gjava.actoreditor.beans.EventList;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Enumeration;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.text.EditorKit;
import org.gjava.actoreditor.Action.ActionData;
import org.gjava.actoreditor.beans.ActionList;
import org.netbeans.spi.palette.PaletteActions;
import org.netbeans.spi.palette.PaletteController;
import org.netbeans.spi.palette.PaletteFactory;
import org.openide.explorer.ExplorerManager;
import org.openide.filesystems.FileLock;
import org.openide.nodes.Node;
import org.openide.text.CloneableEditorSupport;
import org.openide.util.Exceptions;
import org.openide.util.Lookup;
import org.openide.util.lookup.InstanceContent;
import org.openide.windows.TopComponent;

/**
 *
 * @author  ali1
 */
public class Actoreditor extends TopComponent implements PropertyChangeListener {
    public actorDataObject a;
    public actorDataObject ado;
    public String path = "";
    public String image="";
    public ActionValue oldav;
    private int draggingIndex = -1;
    static final String ICON_PATH = "org/gjava/actoreditor/object.png";
    // public EventList eventList;
    //  public ActionList actionList1;
    
    public String oldDisplayName;
    private ExplorerManager explorerManager;
    /** Creates new form Actoreditor */
    public Actoreditor(actorDataObject a) {
        this(new InstanceContent());
        this.a = a;
        this.oldDisplayName = this.getHtmlDisplayName();
        this.a.ae = this;
        path = a.getPrimaryFile().getPath();
        this.ado = a;
        setDropTarget(new DropTarget(this,new DropTargetListener() {
            public void dragEnter(DropTargetDragEvent dropTargetDragEvent) {
                //not needed
            }
            public void dragExit(DropTargetEvent dropTargetEvent) {
                //not needed
            }
            public void dragOver(DropTargetDragEvent dtde) {
                if( dtde.isDataFlavorSupported(Utilz.IMAGE_DATA_FLAVOR ) ) {
                    //only accept object of our type
                    dtde.acceptDrag( DnDConstants.ACTION_COPY_OR_MOVE );
                } else {
                    //reject everything else
                    dtde.rejectDrag();
                }
            }
            public void drop(DropTargetDropEvent dtde) {
                //first check if we support this type of data
                if( !dtde.isDataFlavorSupported( Utilz.IMAGE_DATA_FLAVOR ) ) {
                    dtde.rejectDrop();
                }
                //accept the drop so that we can access the Transferable
                dtde.acceptDrop( DnDConstants.ACTION_COPY_OR_MOVE );
                ImageData data = null;
                try {
                    //get the dragged data from the transferable
                    //get the dragged data from the transferable
                    //get the dragged data from the transferable
                    //get the dragged data from the transferable
                    data = (ImageData) dtde.getTransferable().getTransferData(Utilz.IMAGE_DATA_FLAVOR);
                } catch (IOException ex) {
                    ex.printStackTrace();
                } catch (UnsupportedFlavorException ex) {
                    ex.printStackTrace();
                }
                
                dtde.dropComplete( null != data );
                if( null != data ) {
                    
                }
                ado.data.img = data.path;
                Icon image = new ImageIcon( data.path );
                setimage(data.path);
                jLabel4.setIcon(image);
            }
            
            
            
            public void dropActionChanged(DropTargetDragEvent dropTargetDragEvent) {
            }
        }));
    }
    
    
    
    public Actoreditor(InstanceContent content) {
        
        super(new org.openide.util.lookup.AbstractLookup(content));
        
        explorerManager = new org.openide.explorer.ExplorerManager();
        explorerManager.addPropertyChangeListener(this);
        content.add(explorerManager);
        final org.netbeans.spi.palette.PaletteController controller = initializePalette();
        
        content.add(controller);
        content.add(new SpriteeditorTopComponent());
        controller.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            
            public void propertyChange(java.beans.PropertyChangeEvent arg0) {
            }
        });
        initComponents();
        EditorKit kit = CloneableEditorSupport.getEditorKit("text/x-java");
        
        
        // jEditorPane1.setEditorKit(kit);
        
        actionList1.setDragEnabled(true);
        setName(org.openide.util.NbBundle.getMessage(org.gjava.actoreditor.OLD_ActorEditorTopComponent.class,
                "CTL_ActorEditorTopComponent"));
        setToolTipText(org.openide.util.NbBundle.getMessage(org.gjava.actoreditor.OLD_ActorEditorTopComponent.class,
                "HINT_ActorEditorTopComponent"));
        setIcon(org.openide.util.Utilities.loadImage(ICON_PATH, true));
        
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        actionList1 = new org.gjava.actoreditor.beans.ActionList(this);
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        eventList = new EventList(this);
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jTextField9 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();

        jSplitPane1.setDividerSize(8);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("Actions: ");

        //actionList1.setModel(null);
        actionList1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                actionList1MouseDragged(evt);
            }
        });
        actionList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                actionList1ValueChanged(evt);
            }
        });
        actionList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                actionList1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                actionList1MouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(actionList1);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel3)
                .addContainerGap(372, Short.MAX_VALUE))
            .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Events: ");

        //eventList.setModel(null);
        eventList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                eventListValueChanged(evt);
            }
        });
        eventList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eventListMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(eventList);

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel2)
                .add(153, 153, 153))
            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        jButton1.setText("Save");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jCheckBox1.setText("Solid");
        jCheckBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox1.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jCheckBox2.setText("Visible");
        jCheckBox2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox2.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jLabel4.setText("Drop Image here");
        jScrollPane3.setViewportView(jLabel4);

        jLabel1.setText("<html>To Add image drag and drop image file here.</html>");

        jLabel5.setText("Depth:");

        jTextField1.setText("0");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel6.setForeground(new java.awt.Color(0, 51, 255));
        jLabel6.setText("Arguments:");

        jCheckBox3.setText("Relative");
        jCheckBox3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox3.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jLabel15.setText("Action description will go here!");

        jLabel10.setText("argument3:");

        jLabel9.setText("argument2:");

        jLabel8.setText("argument1:");

        jLabel7.setText("argument0:");

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel7)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jTextField2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(jLabel8)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jTextField3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(jLabel9)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jTextField4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(jLabel10)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jTextField5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel7))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel8)
                    .add(jTextField3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel9)
                    .add(jTextField4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel10)
                    .add(jTextField5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel14.setText("argument7:");

        jLabel13.setText("argument6:");

        jLabel12.setText("argument5:");

        jLabel11.setText("argument4:");

        org.jdesktop.layout.GroupLayout jPanel5Layout = new org.jdesktop.layout.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel12)
                    .add(jLabel11)
                    .add(jLabel13)
                    .add(jLabel14))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jTextField9)
                    .add(jTextField8)
                    .add(jTextField7)
                    .add(jTextField6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 247, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextField6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel11))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextField7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel12))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextField8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel13))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextField9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel14))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                                .add(jLabel15, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
                                .add(20, 20, 20))
                            .add(jPanel3Layout.createSequentialGroup()
                                .add(jCheckBox3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 121, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(jLabel15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jCheckBox3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .add(jScrollPane3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .add(jButton1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(4, 4, 4)
                        .add(jLabel5)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 109, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jCheckBox1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .add(jCheckBox2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jSplitPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 647, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel6))
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(151, 151, 151)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 158, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jCheckBox1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jCheckBox2)
                        .add(11, 11, 11)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel5)
                            .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jSplitPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 287, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jButton1)
                    .add(jLabel6))
                .add(8, 8, 8)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
private void eventListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventListMousePressed
    if (evt.getButton() == evt.BUTTON3) {
        eventList.setSelectedIndex(eventList.locationToIndex(evt.getPoint()));
        final Point p = evt.getPoint();
        JPopupMenu popup = new JPopupMenu();
        JMenuItem menuItem = new JMenuItem("Delete");
        menuItem.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("Delete"))
                    eventList.events.remove(eventList.locationToIndex(p));
            }
        });
        popup.add(menuItem);
        popup.setVisible(true);
        popup.show(eventList, evt.getX(), evt.getY());
        //popup.setLocation(evt.getPoint());
    }
}//GEN-LAST:event_eventListMousePressed

private void actionList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_actionList1ValueChanged
    if (actionList1.getSelectedValue() == null) {
        return;
    }
    if (oldav !=null) {
        oldav.arg0 = this.jTextField2.getText();
        oldav.arg1 = this.jTextField3.getText();
        oldav.arg2 = this.jTextField4.getText();
        oldav.arg3 = this.jTextField5.getText();
        oldav.arg4 = this.jTextField6.getText();
        oldav.arg5 = this.jTextField7.getText();
        oldav.arg6 = this.jTextField8.getText();
        oldav.arg7 = this.jTextField9.getText();
        oldav.relative = this.jCheckBox3.isSelected();
    }
    oldav = (ActionValue)actionList1.getSelectedValue();
    this.jTextField2.setText(((ActionValue)actionList1.getSelectedValue()).arg0);
    this.jTextField3.setText(((ActionValue)actionList1.getSelectedValue()).arg1);
    this.jTextField4.setText(((ActionValue)actionList1.getSelectedValue()).arg2);
    this.jTextField5.setText(((ActionValue)actionList1.getSelectedValue()).arg3);
    this.jTextField6.setText(((ActionValue)actionList1.getSelectedValue()).arg4);
    this.jTextField7.setText(((ActionValue)actionList1.getSelectedValue()).arg5);
    this.jTextField8.setText(((ActionValue)actionList1.getSelectedValue()).arg6);
    this.jTextField9.setText(((ActionValue)actionList1.getSelectedValue()).arg7);
    if (((ActionValue)actionList1.getSelectedValue()).caption0.equals(" ")) {
        jLabel7.setVisible(false);
        jTextField2.setVisible(false);
    } else
    {
        jLabel7.setVisible(true);
        jTextField2.setVisible(true);
        this.jLabel7.setText(((ActionValue)actionList1.getSelectedValue()).caption0);
    }
    
    if (((ActionValue)actionList1.getSelectedValue()).caption1.equals("")) {
        jLabel8.setVisible(false);
        jTextField3.setVisible(false);
    } else
    {
        jLabel8.setVisible(true);
        jTextField3.setVisible(true);
        this.jLabel8.setText(((ActionValue)actionList1.getSelectedValue()).caption1);
    }
        if (((ActionValue)actionList1.getSelectedValue()).caption2.equals("")) {
        jLabel9.setVisible(false);
        jTextField4.setVisible(false);
    } else
    {
        jLabel9.setVisible(true);
        jTextField4.setVisible(true);
        this.jLabel9.setText(((ActionValue)actionList1.getSelectedValue()).caption2);
    }
    
    if (((ActionValue)actionList1.getSelectedValue()).caption3.equals("")) {
        jLabel10.setVisible(false);
        jTextField5.setVisible(false);
    } else
    {
        jLabel10.setVisible(true);
        jTextField5.setVisible(true);
        this.jLabel10.setText(((ActionValue)actionList1.getSelectedValue()).caption3);
    }
    
    if (((ActionValue)actionList1.getSelectedValue()).caption4.equals("")) {
        jLabel11.setVisible(false);
        jTextField6.setVisible(false);
    } else {
        jLabel11.setVisible(true);
        jTextField6.setVisible(true);
        this.jLabel11.setText(((ActionValue)actionList1.getSelectedValue()).caption4);
    }
    
    if (((ActionValue)actionList1.getSelectedValue()).caption5.equals("")) {
        jLabel12.setVisible(false);
        jTextField7.setVisible(false);
    } else {
        jLabel12.setVisible(true);
        jTextField7.setVisible(true);
        this.jLabel12.setText(((ActionValue)actionList1.getSelectedValue()).caption5);
    }
    if (((ActionValue)actionList1.getSelectedValue()).caption6.equals("")) {
        jLabel13.setVisible(false);
        jTextField8.setVisible(false);
    } else {
        jLabel13.setVisible(true);
        jTextField8.setVisible(true);
        this.jLabel13.setText(((ActionValue)actionList1.getSelectedValue()).caption6);
    }
    if (((ActionValue)actionList1.getSelectedValue()).caption7.equals("")) {
        jLabel14.setVisible(false);
        jTextField9.setVisible(false);
    } else {
        jLabel14.setVisible(true);
        jTextField9.setVisible(true);
        this.jLabel14.setText(((ActionValue)actionList1.getSelectedValue()).caption7);
    }
    this.jPanel3.setVisible(true);
}//GEN-LAST:event_actionList1ValueChanged

private void actionList1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actionList1MousePressed
    draggingIndex = actionList1.locationToIndex(evt.getPoint());
    if (evt.getButton() == evt.BUTTON3) {
        actionList1.setSelectedIndex(actionList1.locationToIndex(evt.getPoint()));
        final Point p = evt.getPoint();
        JPopupMenu popup = new JPopupMenu();
        JMenuItem menuItem = new JMenuItem("Delete");
        menuItem.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("Delete"))
                    actionList1.model.remove(actionList1.locationToIndex(p));
            }
        });
        popup.add(menuItem);
        popup.setVisible(true);
        popup.show(actionList1, evt.getX(), evt.getY());
        //popup.setLocation(evt.getPoint());
    }
}//GEN-LAST:event_actionList1MousePressed

private void actionList1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actionList1MouseReleased
    //draggingIndex = -1;
}//GEN-LAST:event_actionList1MouseReleased

private void actionList1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actionList1MouseDragged
    final int newIndex = actionList1.locationToIndex(evt.getPoint());
    
    if (newIndex != draggingIndex) {
        Object temp = actionList1.model.get(draggingIndex);
        
        actionList1.model.set(draggingIndex, actionList1.model.get(newIndex));
        actionList1.model.set(newIndex, temp);
        
        draggingIndex = newIndex;
    }
}//GEN-LAST:event_actionList1MouseDragged

public final void setimage(String image) {
    this.image = image;
}

public void save() throws IOException {
    savefile();
    // a.setModified(false);
}
private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    try     {
        savefile();
        a.setModified(false);
        a.writejava();
    } catch (IOException ex) {
        Exceptions.printStackTrace(ex);
    }
}//GEN-LAST:event_jButton1MouseClicked

private void eventListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_eventListValueChanged
    if (eventList.getSelectedValue() == null) {
        return;
    }
    actionList1.setModel(((Value) eventList.getSelectedValue()).actions);
    actionList1.model = ((Value) eventList.getSelectedValue()).actions;
    if (oldav !=null) {
        oldav.arg0 = this.jTextField2.getText();
        oldav.arg1 = this.jTextField3.getText();
        oldav.arg2 = this.jTextField4.getText();
        oldav.arg3 = this.jTextField5.getText();
        oldav.arg4 = this.jTextField6.getText();
        oldav.arg5 = this.jTextField7.getText();
        oldav.arg6 = this.jTextField8.getText();
        oldav.arg7 = this.jTextField9.getText();
        oldav.relative = this.jCheckBox3.isSelected();
    }
    oldav = null;
    this.jTextField2.setText("");
    this.jTextField3.setText("");
    this.jTextField4.setText("");
    this.jTextField5.setText("");
    this.jTextField6.setText("");
    this.jTextField7.setText("");
    this.jTextField8.setText("");
    this.jTextField9.setText("");
    
    this.jPanel3.setVisible(false);
    //this.jEditorPane1.setText("// "+((Value)eventList.getSelectedValue()).value+", Click an action to edit the arguments here!");
}//GEN-LAST:event_eventListValueChanged

/**
 * Used to stop errors occuring from generated code, Don't use!
 */
public void pack() {
}

public Container getContentPane() {
    return this;
}

private void setDefaultCloseOperation(int i) {
    
}

private void savefile() {
    if (oldav !=null) {
        oldav.arg0 = this.jTextField2.getText();
        oldav.arg1 = this.jTextField3.getText();
        oldav.arg2 = this.jTextField4.getText();
        oldav.arg3 = this.jTextField5.getText();
        oldav.arg4 = this.jTextField6.getText();
        oldav.arg5 = this.jTextField7.getText();
        oldav.arg6 = this.jTextField8.getText();
        oldav.arg7 = this.jTextField9.getText();
    }
    oldav = null;
    FileLock lock;
    try {
        lock= ado.getPrimaryFile().lock();
    } catch (Exception e) {
        return;
    }
    {
        java.io.PrintWriter to = null;
        
        try {
            to = new java.io.PrintWriter(ado.getPrimaryFile().getOutputStream(lock));
            try {
                to.println("<?xml version=\"1.0\"?>");
                
                if (jLabel4.getIcon() == null)
                    to.println("<Image>null</Image>");
                else
                    to.println("<Image>"+this.image+"</Image>");
                
                if (jCheckBox1.isSelected() == true)
                    to.println("<Solid>True</Solid>");
                else
                    to.println("<Solid>False</Solid>");
                if (jCheckBox2.isSelected() == true)
                    to.println("<Visible>True</Visible>");
                else
                    to.println("<Visible>False</Visible>");
                
                //save events/actions
                for (Enumeration e = eventList.events.elements() ; e.hasMoreElements() ;) {
                    Value v = (Value)e.nextElement();
                    to.println("<Event>");
                    to.println("<Name>"+v.value+"</Name>");
                    to.println("<Image>"+v.img+"</Image>");
                    
                    for (Enumeration ee = v.actions.elements() ; ee.hasMoreElements() ;) {
                        ActionValue vv = (ActionValue)ee.nextElement();
                        to.println("<Action>");
                        to.println("<Name>"+vv.value+"</Name>");
                        to.println("<Image>"+vv.img+"</Image>");
                        to.println("<Code>"+vv.code+"</Code>");
                        to.println("<Arg0>"+vv.arg0+"</Arg0>");
                        to.println("<Arg1>"+vv.arg1+"</Arg1>");
                        to.println("<Arg2>"+vv.arg2+"</Arg2>");
                        to.println("<Arg3>"+vv.arg3+"</Arg3>");
                        to.println("<Arg4>"+vv.arg4+"</Arg4>");
                        to.println("<Arg5>"+vv.arg5+"</Arg5>");
                        to.println("<Arg6>"+vv.arg6+"</Arg6>");
                        to.println("<Arg7>"+vv.arg7+"</Arg7>");
                        to.println("<Caption0>"+vv.caption0+"</Caption0>");
                        to.println("<Caption1>"+vv.caption1+"</Caption1>");
                        to.println("<Caption2>"+vv.caption2+"</Caption2>");
                        to.println("<Caption3>"+vv.caption3+"</Caption3>");
                        to.println("<Caption4>"+vv.caption4+"</Caption4>");
                        to.println("<Caption5>"+vv.caption5+"</Caption5>");
                        to.println("<Caption6>"+vv.caption6+"</Caption6>");
                        to.println("<Caption7>"+vv.caption7+"</Caption7>");
                        to.println("</Action>");
                    }
                    to.println("</Event>");
                }
            } finally {
                to.close();
            }
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        } finally {
            lock.releaseLock();
            to.close();
        }
    }
    
}

/**
 * Opens the .actor file and sets the values of the componenets
 * @throws java.lang.Exception
 */
public void openfile() throws Exception {
    
    eventList.events.clear();
    BufferedReader from=new BufferedReader(new InputStreamReader(ado.getPrimaryFile().getInputStream()));
        String caption7 = "";
        String caption6 = "";
        String caption5 = "";
        String caption4 = "";
        String caption0 = "";
        String caption1 = "";
        String caption2 = "";
        String caption3 = "";
    try {
        String line;
        String arg0 = "";
        String arg1 = "";
        String arg2 = "";
        String arg3 = "";
        String arg4 = "";
        String arg5 = "";
        String arg6 = "";
        String arg7 = "";;
        while ((line=from.readLine()) != null) {
            if (line.contains("<Image>") && line.contains("</Image>")) {
                this.image = line.replaceAll("<Image>", "").replaceAll("</Image>", "");
                if (!this.image.equals("null") )
                    jLabel4.setIcon(new ImageIcon(this.image));
            }
            if (line.contains("<Solid>") && line.contains("</Solid>")) {
                if (line.contains("True") )
                    
                    jCheckBox1.setSelected(true);
                
                else
                    jCheckBox1.setSelected(false);
            }
            if (line.contains("<Visible>") && line.contains("</Visible>")) {
                if (line.contains("True") )
                    
                    jCheckBox2.setSelected(true);
                
                else
                    jCheckBox2.setSelected(false);
            }
            
            if (line.equals("<Event>")) {
                line=from.readLine();
                String name="",img="",code="",args="";
                if (line.contains("<Name>") && line.contains("</Name>")) {
                    name = line.replaceAll("<Name>", "").replaceAll("</Name>", "");
                }
                line=from.readLine();
                if (line.contains("<Image>") && line.contains("</Image>")) {
                    img = line.replaceAll("<Image>", "").replaceAll("</Image>", "");
                    
                }
                eventList.events.addElement(new Value(name,img, new DefaultListModel() )) ;
                
                line=from.readLine();
                while (!line.equals("</Event>")) {
                    code="";
                    args="";
                    //get actions
                    if (line.equals("<Action>")) {
                        line=from.readLine();
                        if (line.contains("<Name>") && line.contains("</Name>")) {
                            name = line.replaceAll("<Name>", "").replaceAll("</Name>", "");
                        }
                        line=from.readLine();
                        if (line.contains("<Image>") && line.contains("</Image>")) {
                            img = line.replaceAll("<Image>", "").replaceAll("</Image>", "");
                            System.out.println(img);
                        }
                        line=from.readLine();
                        if (line.contains("<Code>")) {
                            if (line.contains("</Code>"))
                                code = code+ line.replaceAll("<Code>", "").replaceAll("</Code>", "")+"\n";
                            else
                                while (!line.contains("</Code>")) {
                                    code = code+ line.replaceAll("<Code>", "").replaceAll("</Code>", "")+"\n";
                                    line=from.readLine();
                                }
                            code = code+ line.replaceAll("<Code>", "").replaceAll("</Code>", "")+"\n";
                            
                        }
                        line=from.readLine();
                        if (line.contains("<Arg0>") && line.contains("</Arg0>")) {
                            arg0 = line.replaceAll("<Arg0>", "").replaceAll("</Arg0>", "");
                        }
                        line=from.readLine();
                        if (line.contains("<Arg1>") && line.contains("</Arg1>")) {
                            arg1 = line.replaceAll("<Arg1>", "").replaceAll("</Arg1>", "");
                        }
                        line=from.readLine();
                        if (line.contains("<Arg2>") && line.contains("</Arg2>")) {
                            arg2 = line.replaceAll("<Arg2>", "").replaceAll("</Arg2>", "");
                        }
                        line=from.readLine();
                        if (line.contains("<Arg3>") && line.contains("</Arg3>")) {
                            arg3 = line.replaceAll("<Arg3>", "").replaceAll("</Arg3>", "");
                        }
                        line=from.readLine();
                        if (line.contains("<Arg4>") && line.contains("</Arg4>")) {
                            arg4 = line.replaceAll("<Arg4>", "").replaceAll("</Arg4>", "");
                        }
                        line=from.readLine();
                        if (line.contains("<Arg5>") && line.contains("</Arg5>")) {
                            arg5 = line.replaceAll("<Arg5>", "").replaceAll("</Arg5>", "");
                        }
                        line=from.readLine();
                        if (line.contains("<Arg6>") && line.contains("</Arg6>")) {
                            arg6 = line.replaceAll("<Arg6>", "").replaceAll("</Arg6>", "");
                        }
                        line=from.readLine();
                        if (line.contains("<Arg7>") && line.contains("</Arg7>")) {
                            arg7 = line.replaceAll("<Arg7>", "").replaceAll("</Arg7>", "");
                        }
                        
                        line=from.readLine();
                        if (line.contains("<Caption0>") && line.contains("</Caption0>")) {
                            caption0 = line.replaceAll("<Caption0>", "").replaceAll("</Caption0>", "");
                        }
                        line=from.readLine();
                        if (line.contains("<Caption1>") && line.contains("</Caption1>")) {
                            caption1 = line.replaceAll("<Caption1>", "").replaceAll("</Caption1>", "");
                        }
                        line=from.readLine();
                        if (line.contains("<Caption2>") && line.contains("</Caption2>")) {
                            caption2 = line.replaceAll("<Caption2>", "").replaceAll("</Caption2>", "");
                        }
                        line=from.readLine();
                        if (line.contains("<Caption3>") && line.contains("</Caption3>")) {
                            caption3 = line.replaceAll("<Caption3>", "").replaceAll("</Caption3>", "");
                        }
                        line=from.readLine();
                        if (line.contains("<Caption4>") && line.contains("</Caption4>")) {
                            caption4 = line.replaceAll("<Caption4>", "").replaceAll("</Caption4>", "");
                        }
                        line=from.readLine();
                        if (line.contains("<Caption5>") && line.contains("</Caption5>")) {
                            caption5 = line.replaceAll("<Caption5>", "").replaceAll("</Caption5>", "");
                        }
                        line=from.readLine();
                        if (line.contains("<Caption6>") && line.contains("</Caption6>")) {
                            caption6 = line.replaceAll("<Caption6>", "").replaceAll("</Caption6>", "");
                        }
                        line=from.readLine();
                        if (line.contains("<Caption7>") && line.contains("</Caption7>")) {
                            caption7 = line.replaceAll("<Caption7>", "").replaceAll("</Caption7>", "");
                        }
                        
                        line=from.readLine();//</Action>
                        // add the action
                        Value v = (Value)eventList.events.lastElement();
                        ActionData ad = new ActionData();
                        ad.name = name;
                        ad.img = img;
                        ad.code = code;
                        ad.arg0 = arg0;
                        ad.arg1 = arg1;
                        ad.arg2 = arg2;
                        ad.arg3 = arg3;
                        ad.arg4 = arg4;
                        ad.arg5 = arg5;
                        ad.arg6 = arg6;
                        ad.arg7 = arg7;
                        
                        ad.caption0 = caption0;
                        ad.caption1 = caption1;
                        ad.caption2 = caption2;
                        ad.caption3 = caption3;
                        ad.caption4 = caption4;
                        ad.caption5 = caption5;
                        ad.caption6 = caption6;
                        ad.caption7 = caption7;
                        
                        v.actions.addElement(new ActionValue(ad));
                    }
                    line=from.readLine();
                }
                
            }
            
        }
    } finally {
        from.close();
    }
}






private void MousePressed(java.awt.event.MouseEvent evt) {
    draggingIndex = actionList1.locationToIndex(evt.getPoint());
}

public void componentOpened() {
    this.setActivatedNodes(new Node[] {a.getNodeDelegate()});
}

public void componentClosed() {
    // TODO add custom code on component closing
}

/**
 * @param args the command line arguments
 */
public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            //new Actoreditor().setVisible(true);
        }
    });
}

private PaletteController initializePalette() {
    try {
        return PaletteFactory.createPalette(    "ActorEditorPalette",new PaletteActions() {
            public Action[] getCustomCategoryActions(Lookup lookup) {
                return new Action[0];
            }
            public Action[] getCustomItemActions(Lookup lookup) {
                return new Action[0];
            }
            public Action[] getCustomPaletteActions() {
                return new Action[0];
            }
            public Action[] getImportActions() {
                return new Action[0];
            }
            public Action getPreferredAction(Lookup lookup) {
                return null; //TODO
            }
            
            
        });
    } catch (IOException ex) {
        ex.printStackTrace();
        
    }
    return null;
}


public static Actoreditor getInstance(String name,actorDataObject a) {
    //this.a = a;
    // look for an open instance containing this feed
    Iterator opened = TopComponent.getRegistry().getOpened().iterator();
    while (opened.hasNext()) {
        Object tc = opened.next();
        if (tc instanceof Actoreditor) {
            Actoreditor elc = (Actoreditor)tc;
            System.out.println(name+" "+elc.path);
            if (name.equals(elc.path)) {
                //elc.requestActive();
                return elc;
            }
        }
    }
    
    // none found, make a new one
    return new Actoreditor(a);
}


final static class ResolvableHelper implements Serializable {
    private static final long serialVersionUID = 1L;
    public Object readResolve() {
        return OLD_ActorEditorTopComponent.getDefault();
    }
}

public void propertyChange(PropertyChangeEvent evt) {
    if (evt.getSource() == explorerManager &&
            ExplorerManager.PROP_SELECTED_NODES.equals(evt.getPropertyName())) {
        setActivatedNodes(explorerManager.getSelectedNodes());
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public ActionList actionList1;
    public EventList eventList;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public final javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
    
}
