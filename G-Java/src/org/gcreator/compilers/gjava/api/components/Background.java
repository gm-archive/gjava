/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gcreator.compilers.gjava.api.components;

import com.golden.gamedev.util.ImageUtil;
import java.awt.image.BufferedImage;

/**
 *
 * @author TGMG
 */
public class Background {

    public boolean background_visible;
    public int background_foreground,  background_x,  background_y,  background_width,  background_height,  background_htiled,  background_vtiled,  background_xscale,  background_yscale,  background_hspeed,  background_vspeed,  background_blend,  background_alpha;
    public BufferedImage background_image;

    public Background(boolean background_visible, int background_foreground, int background_x, int background_y, int background_width, int background_height, int background_htiled, int background_vtiled, int background_xscale, int background_yscale, int background_hspeed, int background_vspeed, int background_blend, int background_alpha, BufferedImage background_image) {
        this.background_visible = background_visible;
        this.background_foreground = background_foreground;
        this.background_x = background_x;
        this.background_y = background_y;
        this.background_width = background_width;
        this.background_height = background_height;
        this.background_htiled = background_htiled;
        this.background_vtiled = background_vtiled;
        this.background_xscale = background_xscale;
        this.background_yscale = background_yscale;
        this.background_hspeed = background_hspeed;
        this.background_vspeed = background_vspeed;
        this.background_blend = background_blend;
        this.background_alpha = background_alpha;
        this.background_image = background_image;
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
