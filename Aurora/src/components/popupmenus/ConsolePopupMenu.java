/*
 * ConsolePopupMenu.java
 * 
 * Created on 12/Set/2007, 21:59:43
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package components.popupmenus;

import javax.swing.*;
import java.awt.event.*;


import org.gcreator.core.*;
import managers.*;

/**
 *
 * @author Luís
 */
public class ConsolePopupMenu extends JPopupMenu{
    JMenuItem copymessage;
    JMenuItem clear;
    JMenuItem hide;
    public ConsolePopupMenu(){
        copymessage = new JMenuItem(LangSupporter.activeLang.getEntry(115));
        copymessage.setIcon(new ImageIcon(getClass().getResource("/resources/general/copy.png")));
        clear = new JMenuItem(LangSupporter.activeLang.getEntry(14));
        hide = new JMenuItem(LangSupporter.activeLang.getEntry(116));
        add(copymessage);
        copymessage.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                copymessage();
            }
        });
        add(clear);
        clear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                clear();
            }
        });
        add(hide);
        hide.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                _hide();
            }
        });
        this.updateUI();
    }
    
    private void copymessage(){
        String content = gcreator.window.console.getText();
        content = content.replaceAll("\n", "");
        content = content.replaceAll("<(b[^r]|[^b]).*?/?>", "");
        content = content.replaceAll("\\s+", " ");
        content = content.replaceAll("^\\s", "");
        content = content.replaceAll("<br/?>", "\n");
        gcreator.clipboard.setClipboardContents(content);
    }
    
    private void clear(){
        gcreator.window.console.setText("");
        gcreator.output = "";
    }
    
    private void _hide(){
        gcreator.window.items[MenuSupporter.GenerateMenuItemId(2, 0)].setSelected(false);
        gcreator.window.items[MenuSupporter.GenerateMenuItemId(2, 0)].getActionListeners()[0].actionPerformed(null);
    }
}
