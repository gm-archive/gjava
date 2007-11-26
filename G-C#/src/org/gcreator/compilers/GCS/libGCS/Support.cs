using System;
using System.Collections.Generic;
using System.Text;

namespace org.gcreator.Support
{
    public class Rectangle
    {
        public Rectangle(int x, int y, int width, int height)
        {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }

        public int x, y, width, height;
    }

    public class Color
    {
		public static Color Red()
		{
			return new Color(255, 0, 0);
		}
		
		public static Color Green()
		{
			return new Color(0, 255, 0);
		}
		
		public static Color Blue()
		{
			return new Color(0, 0, 255);
		}
		
		public static Color Black()
		{
			return new Color(0, 0, 0);
		}
	
        private int red, green, blue;
		
		public Color(int red, int green, int blue)
		{
			if(red >= 255)
				this.red = 255;
			else if(red<=0)
				this.red = 0;
			else
				this.red = red;
			if(green >= 255)
				this.green = 255;
			else if(green<=0)
				this.green = 0;
			else
				this.green = green;
			if(blue >= 255)
				this.blue = 255;
			else if(blue<=0)
				this.blue = 0;
			else
				this.blue = blue;
		}
		
		public int getRed()
		{
			return red;
		}
		
		public int getBlue()
		{
			return blue;
		}
		
		public int getGreen()
		{
			return green;
		}
		
		public static Color Darker(Color c, int i)
		{
			return new Color(c.getRed()-i,c.getGreen()-i,c.getBlue()-i);
		}
		
		public static Color Lighter(Color c, int i)
		{
			return new Color(c.getRed()+i,c.getGreen()+i,c.getBlue()+i);
		}
		
		public static Color Merge(Color c1, Color c2)
		{
			return new Color((c1.getRed()+c2.getRed())/2,(c1.getGreen()+c2.getGreen())/2,(c1.getBlue()+c2.getBlue())/2);
		}
		
    }
}
