package org.dolphin.game.api.components;

import java.awt.image.BufferedImage;

import org.dolphin.game.api.types.Variable;

import com.golden.gamedev.util.ImageUtil;
import java.io.Serializable;

public class Background extends Variable implements Serializable {
private static final long serialVersionUID = 1L;

	public boolean background_visible,background_htiled,  background_vtiled,background_scale,background_foreground;
    public int background_x,  background_y,  background_width,  background_height,  background_xscale,  background_yscale,  background_hspeed,  background_vspeed,  background_blend,  background_alpha;
    public BufferedImage background_image;

    /*create background with imageonly (Remove?)*/
    public Background(BufferedImage background_image){
    	this.background_image = background_image;
    }
    
    /*create bakcgound using full details*/
    public Background(boolean background_visible, boolean background_foreground, int background_x, int background_y, int background_width, int background_height, boolean background_htiled, boolean background_vtiled, boolean background_scale, int background_hspeed, int background_vspeed, boolean smooth, boolean transparent, BufferedImage background_image) {
        this.background_visible = background_visible;//if the background is visible or not (works 15dec08)
        this.background_foreground = background_foreground;
        this.background_x = background_x; //the x offset of the background (works 15dec08)
        this.background_y = background_y; //the y offset of the background (works 15dec08)
        this.background_width = background_width;//the background width (works 15dec08)
        this.background_height = background_height;//the background height (works 15dec08)
        this.background_htiled = background_htiled;//tile the background horizontally (works 16dec08)
        this.background_vtiled = background_vtiled;//'(works 16dec08)
        this.background_scale = background_scale;//whether to scale background (works 16dec08)
        
        this.background_hspeed = background_hspeed;
        this.background_vspeed = background_vspeed;
        this.background_blend = background_blend;
        this.background_alpha = background_alpha;
        this.background_image = background_image;//the image for the background (works 15dec08)
    }
    
    public void update(){
    background_x = background_x + background_hspeed;
    background_y = background_y + background_vspeed;
    }
    
    public void xscale(){
       background_image = ImageUtil.resize(background_image, background_image.getWidth()*background_xscale, background_image.getHeight());
    }
    
    public void yscale(){
       background_image = ImageUtil.resize(background_image, background_image.getWidth(), background_image.getHeight()*background_yscale);
    }
	
}
