/*
 * GPlus.java
 *
 * Created on 14/Set/2007, 17:01:49
 *
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aurora.compilers;

import plugins.*;
import managers.*;
import org.gcreator.core.*;
import fileclass.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.zip.ZipOutputStream;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import javax.crypto.*;
import org.gcreator.core.*;

/**
 *
 * @author Luís
 */
public class GPlus extends PluginCore {

    public GPlus() {
    }

    public void dealWithJava(ExtensionProject p, ZipOutputStream z) {
        fileclass.File[] files = p.getJavaFiles();
        String crypted;
        String dirs;
        if (files == null) {
            return;
        }
        for (int i = 0; i < files.length; i++) {
            if (files[i] != null) {
                crypted = PluginHelper.encrypt((String) files[i].value);
                fileclass.Folder x = files[i].root;
                dirs = "src/Java/";
                while (x instanceof Group && !(x instanceof JavaGroup)) {
                    dirs += x.name;
                    dirs += "/";
                    x = ((Group) x).root;
                }
                try {
                    z.putNextEntry(new ZipEntry(dirs + files[i].name + files[i].type));
                    z.write(crypted.getBytes());
                    z.closeEntry();
                } catch (Exception e) {
                }
            }
        }
    }

    public void compile() {
        Project x = PluginHelper.getWindow().getCurrentProject();
        if (x != null) {
            PluginHelper.println(x.name);
            if (x instanceof ExtensionProject) {
                ExtensionProject y = (ExtensionProject) x;
                try {
                    PluginHelper.println("Starting");
                    ZipOutputStream out = new ZipOutputStream(new FileOutputStream(x.name + ".ext"));
                    PluginHelper.println("Setting level");
                    out.setLevel(Deflater.BEST_COMPRESSION);
                    PluginHelper.println("Beginning compression");
                    out.putNextEntry(new ZipEntry("src/Java/"));
                    PluginHelper.println("Beginning Java");
                    //out.closeEntry();
                    dealWithJava(y, out);
                    PluginHelper.println("Finished Java");
                    out.putNextEntry(new ZipEntry("src/Cpp/"));
                    //out.closeEntry();
                    out.putNextEntry(new ZipEntry("src/EGML/"));
                    //out.closeEntry();
                    out.putNextEntry(new ZipEntry("ref/Java/"));
                    //out.closeEntry();
                    out.putNextEntry(new ZipEntry("ref/Cpp/"));
                    //out.closeEntry();
                    out.close();
                } catch (Exception e) {
                    PluginHelper.println("Exception thrown: " + e.toString() + "::" + e.getMessage());
                }
            } else {
                PluginHelper.println("Project must be extension");
            }
        } else {
            PluginHelper.println("No selected project");
        }
    }

    @Override
    public void onSplashDispose() {
        JMenuItem compileext = new JMenuItem(PluginHelper.getLanguageSpecialMessage("GPlus.CompileCur"));

        compileext.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                compile();
            }
        });

        PluginHelper.println("!!!");

        gcreator.window.menus[3].add(compileext);

        VarsRegistry.setVariable("GPlus.MenuItem", compileext);
    }
}