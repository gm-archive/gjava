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
}
