package org.dolphin.game.api.components;

import com.golden.gamedev.util.ImageUtil;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import java.io.Serializable;
import org.dolphin.game.api.types.Variable;




/**
 * Sprite object, may be replaced with another object in G-java 2.0
 * @author G-Java development team
 * @version 1.0
 */
public class Sprite extends Object implements Serializable {
private static final long serialVersionUID = 1L;

    String filename;
    transient BufferedImage[] spritename,spritenameoriginal;
   // public int Transparent;
    public int sprite_width;
    public int sprite_height;
    public int sprite_xoffset=0;
    public int sprite_yoffset=0;
    public double index=0;
    public double image_speed=1;
    public int subimages;
    public int image_count;
    public int currentimage;
    public int BBLeft;
    public int BBRight;
    public int BBTop;
    public int BBBottom;
    public double image_xscale=1,image_yscale=1,image_angle=0;
    public boolean transparent;
    
    
    public Sprite() {
        
    }
    
    public Sprite(BufferedImage[] images){
        //a=new Animation(images,1);
    }
    
    /**
     * Create a new sprite object
     * @param sprite_name
     * @param Height
     * @param Width
     * @param BBLeft
     * @param BBRight
     * @param BBBottom
     * @param BBTop
     * @param Transparent
     * @param SmoothEdges
     * @param PreLoadTexture
     * @param BoundingBox
     * @param PreciseCollisionDetection
     * @param OriginX
     * @param OriginY
     * @param subimages
     */
    public Sprite(String sprite_name, int Height, int Width, int BBLeft, int BBRight, int BBBottom, int BBTop, int OriginX, int OriginY,boolean transparent, BufferedImage[] images) {
        //a=new Animation(images,1);
        this.sprite_width = images[0].getWidth();//Width;
        this.sprite_height = images[0].getHeight();//Height;
        this.BBBottom = BBBottom;
        this.BBTop = BBTop;
        this.BBRight = BBRight;
        this.BBLeft = BBLeft;
        this.sprite_xoffset = OriginX;
        this.sprite_yoffset = OriginY;
        this.transparent=transparent;

        this.subimages = images.length;
        
        filename = sprite_name;
        this.spritename = images;//new BufferedImage[subimages-1];
        this.spritenameoriginal = images;
//        for (int i = 0; i < images.length; i++) {
//            
//            if (images[i].equals("")) subimages--;
//            else {
//                
////                try{
////                    ImageIcon ic = new ImageIcon(getClass().getResource(images[i]));
////                    
////            spritename[i] = new ImageIcon(getClass().getResource(images[i])).getImage();
////                } catch (Exception e){System.out.println("Load image error:"+images[i]+e.getMessage());}
//        } }
        //loadImage();
    }
    
//    public Sprite(String sprite_name, int Height, int Width, int BBLeft, int BBRight, int BBBottom, int BBTop, int OriginX, int OriginY, java.lang.String[] images) {
//        BufferedImage[] im = new BufferedImage[images.length];
//        for(int i = 0; i < images.length; i++)
//            try{
//                im[i] = new BufferedImage(images[i]);
//            }
//            catch(Exception e){}
//        a = new Animation(im, 1);
//        this.sprite_width = Width;
//        this.sprite_height = Height;
//        this.BBBottom = BBBottom;
//        this.BBTop = BBTop;
//        this.BBRight = BBRight;
//        this.BBLeft = BBLeft;
//        this.sprite_xoffset = OriginX;
//        this.sprite_yoffset = OriginY;
//
//        this.subimages = images.length;
//        filename = sprite_name;
//        this.spritename = new Image[subimages-1];
//        
//        for (int i = 0; i < images.length; i++) {
//            
//            if (images[i].equals("")) subimages--;
//            else {
//                
////                try{
////                    ImageIcon ic = new ImageIcon(getClass().getResource(images[i]));
////                    
////            spritename[i] = new ImageIcon(getClass().getResource(images[i])).getImage();
////                } catch (Exception e){System.out.println("Load image error:"+images[i]+e.getMessage());}
//        } }
//        //loadImage();
//    }
//    
    


    /*
     * No longer needed as actors keep track of their own subimage
     */
    public BufferedImage imshow() {
        index += image_speed;
        
        while (index >= subimages) index -= subimages;
        
        return imshow((int)index);
        //return spritename[0];
    }

    /**
     * Get a subimage from this sprite as an Image object
     * @param subimage The sub image number
     * @return the Image object of the sprite
     */
    public BufferedImage imshow(int subimage) {

//        while (subimage >= this.subimages) {
//            subimage = subimage - subimages;
//        }

        if ((subimage) == -1) {
            subimage = currentimage;
        } else {
            currentimage = subimage;
        }
        


        return spritename[subimage];
    }
    
    /*
     * Xscale all the images
     */
    public void xscale(double xscale)
    {
        for (int i=0; i<subimages; i++)
        spritename[i] = ImageUtil.resize(spritename[i], (int)(this.sprite_width * xscale), this.sprite_height);
        sprite_width = (int)(sprite_width *xscale);
        this.BBLeft = (int)(this.BBLeft*xscale);
        this.BBRight = (int)(this.BBRight*xscale);
        this.image_xscale = xscale;
    }
    
    /*
     * Yscale all the images
     */
    public void yscale(double yscale)
    {
        for (int i=0; i<subimages; i++)
        spritename[i] = ImageUtil.resize(spritename[i], (this.sprite_width), (int)(this.sprite_height * yscale));
        sprite_height = (int)(sprite_height*yscale);
        this.BBTop = (int)(this.BBTop*yscale);
        this.BBBottom = (int)(this.BBBottom*yscale);
        this.image_yscale = yscale;
    }

    /*To fix does all objects instead of just the one that calls it*/
    public void angle(int angle){
        for (int i=0; i<subimages; i++)
        {
        	BufferedImage tempimage = spritenameoriginal[i];
        spritename[i] = ImageUtil.rotate(tempimage, (int)(angle-image_angle));
        }
        image_angle = angle;
    }
    
    
    // Crop sprite to bounding box
    private void cropSprite(BufferedImage img) {
        // Crop all 8x8 blocks
        // PixelGrabber pg=new PixelGrabber(img,0,0,64*8,32*8,false);
        // try { pg.grabPixels(); } catch (InterruptedException ex) { };
        // byte[] map = (byte[])pg.getPixels();
        // offscrcm = pg.getColorModel();
        // for (int x=0; x<16; x++) for (int y=0; y<128; y++)
        // for (int sx=0; sx<bw; sx++) for (int sy=0; sy<bw; sy++)
        // maps[x+y*16][sx+sy*bw] = map[(x*8)+(sx/scale)+(y/32*16*8)+(y%32*64*8*8)+(sy/scale*64*8)];
    }

//    private final boolean loadImage() {
//        for (int i = 0; i < subimages; i++) {
//
//            // get image inside jar
//            spritename[i] = new ImageIcon(getClass().getResource(filename + "N" + i + ".png")).getImage();
//
//
//
//            this.spritename[i] = spritename[i];
//        }
//        return true;
//    }
    
    public Rectangle getBounds() {
        return new Rectangle(BBTop, BBLeft, BBRight-BBLeft, BBBottom-BBTop);
    }
}