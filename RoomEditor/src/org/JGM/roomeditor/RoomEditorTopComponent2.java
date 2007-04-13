/*
 * RoomEditorTopComponent.java
 *
 * Created on 23 February 2007, 23:06
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package org.JGM.roomeditor;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Iterator;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.EditorKit;
import org.netbeans.spi.palette.PaletteActions;
import org.netbeans.spi.palette.PaletteController;
import org.netbeans.spi.palette.PaletteFactory;
import org.openide.util.Lookup;
import org.openide.util.lookup.AbstractLookup;
import org.openide.util.lookup.InstanceContent;
import org.openide.windows.TopComponent;

/**
 *
 * @author ali1
 */
public class RoomEditorTopComponent2  extends TopComponent implements ActionListener {
    
    
    /**
     * Roomname is the name of the room
     */
    public String Roomname;
   
    /**
     * canvas is the area which will be shown in the game
     */
    public RoomPanel canvas = new RoomPanel();
    JEditorPane beanCode = new JEditorPane();
   
    
    
    /**
     * Creates the RoomEditorTopComponent
     */
    public RoomEditorTopComponent2() {
        this(new InstanceContent());
    }
        
    /** Creates a new instance of RoomEditorTopComponent 
     * @param content 
     */
    public RoomEditorTopComponent2(InstanceContent content) {
     	super( new AbstractLookup( content ) );
       // content.add( initializePalette() );
        initComponents();
    }
    
    public void actionPerformed(ActionEvent e) {
        //not needed yet
    }
    
    /**
     * This will return the instance of RoomEditorTopComponent that will be shown when a room is clicked
     * @param name  the name of the Room you want to open
     * @return the RoomEditorTopComponent to be used
     */
    public static RoomEditorTopComponent2 getInstance(String name) {
        // look for an open instance containing this feed
        Iterator opened = TopComponent.getRegistry().getOpened().iterator();
        while (opened.hasNext()) {
            Object tc = opened.next();
            if (tc instanceof RoomEditorTopComponent2) {
                RoomEditorTopComponent2 elc = (RoomEditorTopComponent2)tc;
                if (name.equals(elc.getName())) {
                    //elc.requestActive();
                    return elc;
                }
            }
        }
        // none found, make a new one
        return new RoomEditorTopComponent2();
    }
    
    private void initComponents() {
        setLayout(new BorderLayout());
        JToolBar bar = new JToolBar();
                
        //Now build our toolbar:
        JButton clear = new JButton("clear!");
        JLabel snapX = new JLabel(" Snap X:");
        snapX.setSize(new Dimension(50, 24));
        JLabel snapY = new JLabel(" Snap Y:");
        JTextField snapXtext = new JTextField("16 ");
        JTextField snapYtext = new JTextField("16 ");
        JCheckBox showgrid =  new JCheckBox("Show grid");
        showgrid.setPreferredSize(new Dimension(200, 24));
        
        clear.addActionListener(this);
        
        
        JLabel spacer = new JLabel("   "); //Just a spacer
        spacer.setPreferredSize(new Dimension(400, 24));
        
        JButton settings = new JButton("Settings...");
        
        
        bar.add(clear);
        bar.add(new JSeparator());
        bar.add(snapX);
        bar.add(snapXtext);
        
        bar.add(new JSeparator());
        bar.add(snapY);
        bar.add(snapYtext);
        bar.add(new JSeparator());
        bar.add(showgrid);
        bar.add(settings);
        
        
       /*FileSystem fs = Repository.getDefault().getDefaultFileSystem();
        FileObject paletteRoot = fs.findResource( "RoomEditorPalette" );
        try {
            paletteRoot.createFolder( "NewCategory" );
        } catch (IOException ex) {
            ex.printStackTrace();
        }*/
        
        /* FileObject paletteRoot2 = Repository.getDefault().getDefaultFileSystem().findResource( "RoomEditorPalette" );
        FileObject targetCategoryFO = paletteRoot2.getFileObject( "Actors" );
        DataFolder targetCategoryDF = DataFolder.findFolder( targetCategoryFO );
        DataObject dobj = (DataObject)getLookup().lookup( DataObject.class );
        try {
            dobj.copy( targetCategoryDF );
        } catch (IOException ex) {
            ex.printStackTrace();
        }*/
        
        //And install the toolbar and the painting component:
        add(bar, BorderLayout.NORTH);
         JScrollPane sp = new JScrollPane(canvas);
        add(sp, BorderLayout.CENTER);
        
    }
    
    private PaletteController initializePalette() {
        try {
            return PaletteFactory.createPalette( "RoomEditorPalette", new PaletteActions() {
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
                    return null; 
                }
            });
        } catch (IOException ex) {
            ex.printStackTrace();
            
        }
        return null;
    }
    
}
