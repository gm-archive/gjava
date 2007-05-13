package com.sun.tools.javac;
/*
 * OpenImage.java
 *
 * Created on 13 April 2007, 21:30
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */





import java.lang.String;
import java.lang.String;
import java.lang.reflect.Method;
import org.openide.util.HelpCtx;
import org.openide.util.actions.CookieAction;

/**
 *
 * @author ali1
 */
public class Javac {
    
    /** Creates a new instance of OpenImage */
    public Javac() {
    }
    
   
    
    public void javac(String[] filename)
    
    {
      //  ImageDataObject cc = ((ImageDataObject) activatedNodes[0].getLookup().lookup(ImageDataObject.class));
       
       String s = this.getClass().getResource("Main.class").getFile().replaceAll("Main.class", "").replaceAll("file:/","").replaceAll("%20"," ").replaceAll("!/com/sun/tools/javac/","");
        
       try{ 
           //System.out.println(s);
           
          // java.net.URLClassLoader ucl = new java.net.URLClassLoader(new URL[] {f.toURL()});
           // java.lang.Class clazz = ucl.loadClass("ImageJ.Class");
            
            JarClassLoader jarLoader = new JarClassLoader (s);
        /* Load the class from the jar file and resolve it. */
        Class c = jarLoader.loadClass ("com.sun.tools.javac.Main", true);

            
           Object objectParameters[] = {new String[]{}};
           Class classParameters[] = 
                     {objectParameters[0].getClass()};
         Method m =   c.getDeclaredMethod("compile", classParameters);
         m.invoke(c.newInstance(), new Object[]{filename});
           // c.getConstructor(new Class[] {"C:/Program Files/ImageJ/settings.png".getClass()}).newInstance(new Object[]{"C:/Program Files/ImageJ/settings.png"});
        }
        catch (Exception ex) {
           // Exceptions.printStackTrace(ex);
        }
}
    
        protected int mode()
    {
        return CookieAction.MODE_EXACTLY_ONE;
    }
    
    public String getName()
    {
        return "";//NbBundle.getMessage(OpenImage.class, "CTL_ActorOpen");
    }
    
       
  
    
    public HelpCtx getHelpCtx()
    {
        return HelpCtx.DEFAULT_HELP;
    }
    
    protected boolean asynchronous()
    {
        return false;
    }

   

   
    
}

 class JarClassLoader extends  MultiClassLoader
    {
    private JarResources    jarResources;
    public JarClassLoader (String jarName)
    {
    // Create the JarResource and suck in the jar file.
    jarResources = new JarResources (jarName);
    }
    protected byte[] loadClassBytes (String className)
    {
    // Support the MultiClassLoader's class name munging facility.
    className = formatClassName (className);
    // Attempt to get the class data from the JarResource.
    return (jarResources.getResource (className));
    }
    }
