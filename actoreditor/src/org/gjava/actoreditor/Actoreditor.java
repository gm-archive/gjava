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
                if( dtde.isDataFlavorSupported(Utilz.IMAGE_DATA_FLAVOR ) )
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
                if( !dtde.isDataFlavorSupported( Utilz.IMAGE_DATA_FLAVOR ) )
                {
                    dtde.rejectDrop();
                }
                //accept the drop so that we can access the Transferable
                dtde.acceptDrop( DnDConstants.ACTION_COPY_OR_MOVE );
                ImageData data = null;
                try
                {
                    //get the dragged data from the transferable
                    //get the dragged data from the transferable
                    //get the dragged data from the transferable
                    //get the dragged data from the transferable
                    data = (ImageData) dtde.getTransferable().getTransferData(Utilz.IMAGE_DATA_FLAVOR);
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
                  
                }
                ado.data.img = data.path;
                Icon image = new ImageIcon( data.path );
                setimage(data.path);
                jLabel4.setIcon(image);
            }
            
            
            
            public void dropActionChanged(DropTargetDragEvent dropTargetDragEvent)
            {
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
        
                
            jEditorPane1.setEditorKit(kit);
            
        actionList1.setDragEnabled(true);
        setName(org.openide.util.NbBundle.getMessage(org.gjava.actoreditor.ActorEditorTopComponent.class,
                "CTL_ActorEditorTopComponent"));
        setToolTipText(org.openide.util.NbBundle.getMessage(org.gjava.actoreditor.ActorEditorTopComponent.class,
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
        jScrollPane4 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        jSplitPane1.setDividerSize(8);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("Actions: ");

        
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
                .addContainerGap(640, Short.MAX_VALUE))
            .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
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

        jScrollPane4.setViewportView(jEditorPane1);

        jLabel5.setText("Depth:");

        jTextField1.setText("0");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel6.setForeground(new java.awt.Color(0, 51, 255));
        jLabel6.setText("Arguments:");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
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
                    .add(jScrollPane4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE)
                    .add(jSplitPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE)
                    .add(jLabel6))
                .addContainerGap())
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
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .add(jLabel6)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jScrollPane4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jButton1))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

private void eventListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventListMousePressed
     if (evt.getButton() == evt.BUTTON3)
   {
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
    if (oldav !=null)
        oldav.args = jEditorPane1.getText();
    oldav = (ActionValue)actionList1.getSelectedValue();
    this.jEditorPane1.setText(((ActionValue)actionList1.getSelectedValue()).args);
}//GEN-LAST:event_actionList1ValueChanged

private void actionList1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actionList1MousePressed
   draggingIndex = actionList1.locationToIndex(evt.getPoint());
   if (evt.getButton() == evt.BUTTON3)
   {
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
    
    if (newIndex != draggingIndex)
    {
        Object temp = actionList1.model.get(draggingIndex);
        
        actionList1.model.set(draggingIndex, actionList1.model.get(newIndex));
        actionList1.model.set(newIndex, temp);
        
        draggingIndex = newIndex;
    }
}//GEN-LAST:event_actionList1MouseDragged

    public final void setimage(String image)
{
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
    if (oldav !=null)
        oldav.args = jEditorPane1.getText();
    oldav = null;
    this.jEditorPane1.setText("// "+((Value)eventList.getSelectedValue()).value+", Click an action to edit the arguments here!");
}//GEN-LAST:event_eventListValueChanged
    
    /**
 * Used to stop errors occuring from generated code, Don't use!
 */
public void pack()
    {     
    }
    
    public Container getContentPane()
    {
        return this;
    }
    
    private void setDefaultCloseOperation(int i)
    {
        
    }    
    
private void savefile() {
    if (oldav !=null)
        oldav.args = jEditorPane1.getText();
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
                        to.println("<Args>"+vv.args+"</Args>");
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

public void openfile() throws Exception {
    
    eventList.events.clear();
    BufferedReader from=new BufferedReader(new InputStreamReader(ado.getPrimaryFile().getInputStream()));
    try {
        String line;
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
                        if (line.contains("<Args>")) {
                            if (line.contains("</Args>"))
                                args = args+ line.replaceAll("<Args>", "").replaceAll("</Args>", "")+"\n";
                            else
                            while (!line.contains("</Args>")) {
                            args = args+line.replaceAll("<Args>", "").replaceAll("</Args>", "")+"\n";
                            System.out.println(args);
                            line=from.readLine();
                            }
                            args = args+line.replaceAll("<Args>", "").replaceAll("</Args>", "")+"\n";

                        }
                        line=from.readLine();//</Action>
                        // add the action
                        Value v = (Value)eventList.events.lastElement();
                        v.actions.addElement(new ActionValue(name,img,code,args ));
                    }
                    line=from.readLine();
                }
                
            }
            
        }
    } finally {
        from.close();
    }
}


                                       

                                    

    private void MousePressed(java.awt.event.MouseEvent evt)                              
    {                                  
        draggingIndex = actionList1.locationToIndex(evt.getPoint());
}  

    public void componentOpened()
    {
        this.setActivatedNodes(new Node[] {a.getNodeDelegate()});
    }
    
    public void componentClosed()
    {
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
        return ActorEditorTopComponent.getDefault();
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
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public final javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    
}
