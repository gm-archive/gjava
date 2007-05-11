// tile.java
package org.gjava.runner;
import java.awt.*;
import java.awt.image.*;
import java.awt.Toolkit;

public class tile implements Comparable {
	public double depth,X,Y,tileX,tileY,tileW,tileH,id;
	public  int background,visible;
	public  Image tileimage;
	public double instance_id = 0;
	
	tile(){
        }
        
	tile(double x,double y, double tileX, double tileY, double tileW, double tileH, double depth, double id, int background) {
		this.X = x;
		this.Y = y;
		this.tileX = tileX;
		this.tileY = tileY;
		this.tileW = tileW;
		this.tileH = tileH;
		this.depth = depth;
		this.id = id;
		this.background = background;
		Load_image();
	}
	
      public int compareTo(Object o) {
    tile t = (tile)o;
    
    int  i = (int)depth - (int)t.depth;
    if (i == 0) {
    	if (t.instance_id < 200000 && instance_id < 200000) {
    	i = (int)(t.instance_id-100000) - (int)(instance_id-100000);
    	//System.out.println(""+i);
    	} else
    	i = (int)(instance_id-200000) - (int)(t.instance_id-200000);	
    }
     //return i != 0 ? i : (int)depth - (int)t.depth;
	return i;
  }
	
	public void Load_image() {
		//load the image
		// check if the image has to be cropped
		tileimage = cropImage(basicgame.background[background].show(),(int)tileX,(int)tileY,(int)tileW,(int)tileH);
		}
		
	public void Draw_event(Graphics g) {
		g.drawImage(get_image(),(int)X,(int)Y,null);
		
		}
	
	public Image get_image() {
		return tileimage;
	}
	
	public Image cropImage(Image img,int x, int y, int width, int height){
Toolkit toolkit = Toolkit.getDefaultToolkit();
    Image image = toolkit.createImage(new FilteredImageSource(img.getSource(), new CropImageFilter(x, y, width, height)));
    return image;
}
}