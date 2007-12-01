package org.gcreator.compilers.gjava;
import org.gcreator.compilers.gjava.components.*;
import com.jme.bounding.BoundingBox;
import com.jme.image.Texture;
import com.jme.input.InputHandler;
import com.jme.math.Quaternion;
import com.jme.math.Vector3f;
import com.jme.renderer.Renderer;
import com.jme.scene.Node;
import com.jme.scene.shape.Box;
import com.jme.scene.shape.Quad;
import com.jme.scene.shape.Sphere;
import com.jme.scene.state.LightState;
import com.jme.scene.state.TextureState;
//import com.jme.util.LoggingSystem;
import com.jme.util.TextureManager;
import com.jmex.awt.SimpleCanvasImpl;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import org.gcreator.compilers.gjava.lwjgl.LwjglBasicgame;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.applet.LWJGLInstaller;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tests.GradientTest;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.concurrent.Callable;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;

import com.jme.bounding.BoundingBox;
import com.jme.image.Texture;
import com.jme.input.InputHandler;
import com.jme.input.KeyInput;
import com.jme.input.action.InputAction;
import com.jme.input.action.InputActionEvent;
import com.jme.math.FastMath;
import com.jme.math.Quaternion;
import com.jme.math.Vector3f;
import com.jme.renderer.Renderer;
import com.jme.scene.shape.Box;
import com.jme.scene.state.TextureState;
import com.jme.system.DisplaySystem;
import com.jme.util.GameTaskQueueManager;
import com.jme.util.TextureManager;
import com.jmex.awt.JMECanvas;
import com.jmex.awt.JMECanvasImplementor;
import com.jmex.awt.SimpleCanvasImpl;
import com.jmex.awt.input.AWTMouseInput;
import org.newdawn.slick.CanvasGameContainer;
import org.newdawn.slick.tests.ImageTest;

public class Game extends LwjglBasicgame {
public static Sprite newSprite1,G_Creator_NULL_SPRITE;
public static String Runningas;
    Game(){
        super();
        loadSprites();
       // loadScenes();
       // nextScene();
    }
   public void loadScenes(){
  scenes = new Scene[1]; 
    scenes[0] = new newScene1();
    }
public void loadSprites() { newSprite1 = new Sprite("newSprite1",106, 416, 0, 0, 0, 0, 0, 0, new String[] {"newImage1.png",""});}
//   public static void main(String[] args){
//       Runningas = "Application";
//       
//       new Game();
//   }
   
   //required values for rotating the sphere
  private Quaternion rotQuat = new Quaternion();
  private float angle = 0;
  private Vector3f axis = new Vector3f(1, 1, 0);
  
   private Node hudNode;
  
  //the Sphere to render
  private Sphere s;
 
  /**
   * Entry point for the test,
   * @param args
   */
  public static void main(String[] args) {
   //install LWJGL
      try {
  LWJGLInstaller.tempInstall();
} catch (Exception le) {
 /* handle exception */
}
      
     SwingFrame frame = new SwingFrame();
        // center the frame
        frame.setLocationRelativeTo(null);
        // show frame
        frame.setVisible(true);
 
//    Game app = new Game();
//    app.setDialogBehaviour(ALWAYS_SHOW_PROPS_DIALOG);
//    
//    app.start();
//    System.out.println("got here");
//   try {
//			AppGameContainer container = new AppGameContainer(new GradientTest());
//			container.setDisplayMode(800,600,false);
//                        container.setForceExit(false);
//                                //container.setFullscreen(true);
//			container.start();
//		} catch (SlickException e) {
//			e.printStackTrace();
//		}
//    System.out.println("got here");
//    app = new Game();
//    app.setDialogBehaviour(NEVER_SHOW_PROPS_DIALOG);
//    app.start();
//    System.out.println("got here");
  }

    
 
  /**
   * updates an angle and applies it to a quaternion
   * to rotate the Sphere.
   */
    @Override
  protected void simpleRender() {
      GL11.glLoadIdentity();
      System.out.println("draw line");
      drawLine(10,10,600,300);
      
//    if (tpf < 1) {
//      angle = angle + (tpf * 1);
//      if (angle > 360) {
//        angle = 0;
//      }
//    }
//    rotQuat.fromAngleAxis(angle, axis);
//    s.setLocalRotation(rotQuat);
//    
  }
  
  /** The width of the display */
	private int width=640;
	/** The height of the display */
	private int height=480;
  
  public void enterOrtho(int xsize, int ysize) {
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glLoadIdentity();
		GL11.glOrtho(0, width, height, 0, 1, -1);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
		
		GL11.glTranslatef((width-xsize)/2,
						  (height-ysize)/2,0);
	}
  
  public void initDisplay(int width, int height) {
		this.width = width;
		this.height = height;
		
		String extensions = GL11.glGetString(GL11.GL_EXTENSIONS);
		
		GL11.glEnable(GL11.GL_TEXTURE_2D);
		GL11.glShadeModel(GL11.GL_SMOOTH);        
		GL11.glDisable(GL11.GL_DEPTH_TEST);
		GL11.glDisable(GL11.GL_LIGHTING);                    
        
		GL11.glClearColor(20.0f, 0.0f, 0.0f, 0.0f);                
        GL11.glClearDepth(1);                                       
        
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        
        GL11.glViewport(0,0,width,height);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
                
               
	}
 
  /**
   * builds the Sphere and applies the Monkey texture.
   */
  protected void simpleInitGame() {
       
    display.setTitle("jME - Sphere");
    initDisplay(640,480);
 //display.close();
    s = new Sphere("Sphere", 63, 50, 25);
    s.setLocalTranslation(new Vector3f(0,0,-40));
    s.setModelBound(new BoundingBox());
    s.updateModelBound();
    //rootNode.attachChild(s);
 
    TextureState ts = display.getRenderer().createTextureState();
    ts.setEnabled(true);
    ts.setTexture(
        TextureManager.loadTexture(
        Game.class.getClassLoader().getResource(
        "image.png"),
        Texture.MM_LINEAR_LINEAR,
        Texture.FM_LINEAR));
 
    //rootNode.setRenderState(ts);
    
    hudNode = new Node("hudNode");
         Quad hudQuad = new Quad("hud", 100f, 40f);
         hudQuad.setRenderQueueMode(Renderer.QUEUE_ORTHO);        
 
         hudQuad.setLocalTranslation(new Vector3f(display.getWidth()/2,display.getHeight()/2,0));
 
         /* does not work to disable light under v0.10 */
         //LightState ls = display.getRenderer().createLightState();
         //ls.setEnabled(false);
         //hudQuad.setRenderState(ls);
 
         hudQuad.setLightCombineMode(LightState.OFF);
         hudQuad.updateRenderState();
 
//         hudNode.attachChild(hudQuad);
//         rootNode.attachChild(hudNode);
         drawLine(0,0,100,100);
  }
  
   protected void quit() {
        //display.close();
       //display.reset(); 
    }
  
  public void drawLine(float x1, float y1, float x2, float y2) {
		//predraw();
		//currentColor.bind();
      GL11.glColor4f(0f,0f,1.0f,1.0f);
		//Texture.bindNone();

		// make sure the start and end points are drawn - GL implementations
		// seem a bit flakey on this
		GL11.glBegin(GL11.GL_POINTS);
		GL11.glVertex2f(x1, y1);
		GL11.glVertex2f(x2, y2);
		GL11.glEnd();
		GL11.glBegin(GL11.GL_LINES);
		GL11.glVertex2f(x1, y1);
		GL11.glVertex2f(x2, y2);
		GL11.glEnd();
		//postdraw();
                
	}
}

// Our custom Swing frame... Nothing really special here.

    
    // IMPLEMENTING THE SCENE:
    
    class SwingFrame extends JFrame {
        private static final long serialVersionUID = 1L;

        JPanel contentPane;
        JPanel mainPanel = new JPanel();
        Canvas comp = null;
        JButton coolButton = new JButton();
        JButton uncoolButton = new JButton();
        JPanel spPanel = new JPanel();
        JScrollPane scrollPane = new JScrollPane();
        JTree jTree1 = new JTree();
        JCheckBox scaleBox = new JCheckBox("Scale GL Image");
        JPanel colorPanel = new JPanel();
        JLabel colorLabel = new JLabel("BG Color:");
        JMECanvasImplementor impl;
    private int test=0;

        // Construct the frame
        public SwingFrame() {
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    
                    dispose();
                }
            });

            init();
            pack();


            // MAKE SURE YOU REPAINT SOMEHOW OR YOU WON'T SEE THE UPDATES...
            new Thread() {
                { setDaemon(true); }
                public void run() {
                    
                    while (true) {
                        comp.repaint();
                        yield();
                        
                    }
                }
            }.start();
             
            }
        

        int width = 640, height = 480;
        
        // Component initialization
        private void init() {
            contentPane = (JPanel) this.getContentPane();
            contentPane.setLayout(new BorderLayout());

            mainPanel.setLayout(new GridBagLayout());

            setTitle("JME - SWING INTEGRATION TEST");

            // -------------GL STUFF------------------

            // make the canvas:
            comp = DisplaySystem.getDisplaySystem("lwjgl").createCanvas(width, height);

            // add a listener... if window is resized, we can do something about it.
            comp.addComponentListener(new ComponentAdapter() {
                public void componentResized(ComponentEvent ce) {
                    doResize();
                }
            });
            KeyInput.setProvider( KeyInput.INPUT_AWT );
            AWTMouseInput.setup( comp, false );

                    // Important!  Here is where we add the guts to the panel:
            impl = new MyImplementor(width, height);
            JMECanvas jmeCanvas = ( (JMECanvas) comp );
            jmeCanvas.setImplementor(impl);
            jmeCanvas.setUpdateInput( true );

            // -----------END OF GL STUFF-------------

            coolButton.setText("Cool Button");
            uncoolButton.setText("Uncool Button");

            colorPanel.setBackground(java.awt.Color.black);
            colorPanel.setToolTipText("Click here to change Panel BG color.");
            colorPanel.setBorder(BorderFactory.createRaisedBevelBorder());
            comp.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    test=2;
                    final java.awt.Color color = JColorChooser.showDialog(
                            SwingFrame.this, "Choose new background color:",
                            colorPanel.getBackground());
                    if (color == null)
                        return;
                    colorPanel.setBackground(color);
                    Callable<?> call = new Callable<Object>() {
                        public Object call() throws Exception {
                            comp.setBackground(color);
                            return null;
                        }
                    };
                    GameTaskQueueManager.getManager().render(call);
                }
            });

            scaleBox.setOpaque(false);
            scaleBox.setSelected(true);
            scaleBox.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (comp != null)
                        doResize();
                    test=2;
                }
            });

            spPanel.setLayout(new BorderLayout());
//            contentPane.add(mainPanel, BorderLayout.WEST);
//            mainPanel.add(scaleBox,
//                    new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
//                            GridBagConstraints.CENTER,
//                            GridBagConstraints.HORIZONTAL, new Insets(5, 5, 0,
//                                    5), 0, 0));
//            mainPanel.add(colorLabel,
//                    new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
//                            GridBagConstraints.CENTER,
//                            GridBagConstraints.HORIZONTAL, new Insets(5, 5, 0,
//                                    5), 0, 0));
//            mainPanel.add(colorPanel, new GridBagConstraints(0, 2, 1, 1, 0.0,
//                    0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE,
//                    new Insets(5, 5, 0, 5), 25, 25));
//            mainPanel.add(coolButton,
//                    new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
//                            GridBagConstraints.CENTER,
//                            GridBagConstraints.HORIZONTAL, new Insets(5, 5, 0,
//                                    5), 0, 0));
//            mainPanel.add(uncoolButton,
//                    new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
//                            GridBagConstraints.CENTER,
//                            GridBagConstraints.HORIZONTAL, new Insets(5, 5, 0,
//                                    5), 0, 0));
//            mainPanel.add(spPanel, new GridBagConstraints(0, 5, 1, 1, 1.0, 1.0,
//                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
//                    new Insets(5, 5, 0, 5), 0, 0));
//            spPanel.add(scrollPane, BorderLayout.CENTER);
//            
//            scrollPane.setViewportView(jTree1);
            comp.setBounds(0, 0, width, height);
            contentPane.add(comp, BorderLayout.CENTER);
        }

        protected void doResize() {
            if (scaleBox != null && scaleBox.isSelected()) {
                impl.resizeCanvas(comp.getWidth(), comp.getHeight());
            } else {
                impl.resizeCanvas(width, height);
            }
            
            System.out.println("got here!"+ test);   
            if(test == 2) {
            try{
                    contentPane.remove(comp);
            contentPane.add(new CanvasGameContainer(new GradientTest()), BorderLayout.CENTER);
            } catch(Exception ee){System.out.println(""+ee);}
            }
        }

        // Overridden so we can exit when window is closed
        protected void processWindowEvent(WindowEvent e) {
            super.processWindowEvent(e);
            if (e.getID() == WindowEvent.WINDOW_CLOSING) {
                
                //System.exit(0);
            }
        }
    }
    class MyImplementor extends SimpleCanvasImpl {

        private Quaternion rotQuat;
        private float angle = 0;
        private Vector3f axis;
        private Box box;
		long startTime = 0;
		long fps = 0;
        private InputHandler input;

        public MyImplementor(int width, int height) {
            super(width, height);
        }

        public void simpleSetup() {

            // Normal Scene setup stuff...
            rotQuat = new Quaternion();
            axis = new Vector3f(1, 1, 0.5f);
            axis.normalizeLocal();

            Vector3f max = new Vector3f(5, 5, 5);
            Vector3f min = new Vector3f(-5, -5, -5);

            box = new Box("Box", min, max);
            box.setModelBound(new BoundingBox());
            box.updateModelBound();
            box.setLocalTranslation(new Vector3f(0, 0, -10));
            box.setRenderQueueMode(Renderer.QUEUE_SKIP);
            rootNode.attachChild(box);

            box.setRandomColors();

            TextureState ts = renderer.createTextureState();
            ts.setEnabled(true);
            ts.setTexture(TextureManager.loadTexture(SwingFrame.class
                    .getClassLoader().getResource(
                            "image.png"),
                    Texture.MM_LINEAR, Texture.FM_LINEAR));

            rootNode.setRenderState(ts);
            startTime = System.currentTimeMillis() + 5000;

            input = new InputHandler();
            input.addAction( new InputAction() {
                public void performAction( InputActionEvent evt ) {
                 //   logger.info( evt.getTriggerName() );
                }
            }, InputHandler.DEVICE_MOUSE, InputHandler.BUTTON_ALL, InputHandler.AXIS_NONE, false );
        }

        public void simpleUpdate() {
            input.update( tpf );

            // Code for rotating the box... no surprises here.
            if (tpf < 1) {
                angle = angle + (tpf * 25);
                if (angle > 360) {
                    angle = 0;
                }
            }
            rotQuat.fromAngleNormalAxis(angle * FastMath.DEG_TO_RAD, axis);
            box.setLocalRotation(rotQuat);
            
			if (startTime > System.currentTimeMillis()) {
				fps++;
			} else {
				long timeUsed = 5000 + (startTime - System.currentTimeMillis());
				startTime = System.currentTimeMillis() + 5000;
				System.out.println(fps + " frames in " + (timeUsed / 1000f) + " seconds = "
						+ (fps / (timeUsed / 1000f))+" FPS (average)");
				fps = 0;
			}				
        }
    }
