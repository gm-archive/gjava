using System;
using System.Collections.Generic;
using System.Text;
using System.Collections;
using Microsoft.Xna.Framework.Graphics;

namespace org.gcreator.Components
{

    public class Image
    {
        private Texture2D texture;

        public Image(String path)
        {
            texture = org.gcreator.Native.XNA.content.Load<Texture2D>(path) as Texture2D;
        }
    }

    public class Sprite
    {
        private ArrayList images = new ArrayList();

        public Image getImage(int pos)
        {
            return (Image) images[pos];
        }

        public int getImageCount()
        {
            return images.ToArray().Length;
        }

        public Image[] getImageArray()
        {
            return (Image[])images.ToArray(typeof(Image));
        }

        public void setImageArray(Image[] images)
        {
            this.images = new ArrayList();
            this.images.AddRange(images);
        }

        public int getWidth()
        {
            return 0;
        }

        public int getHeight()
        {
            return 0;
        }
    }

    public class Sound
    {

    }

    public class Actor
    {
        private int x, y, z, spritepos, spritemovdelay;
        private Sprite sprite = null;
        private double gravity, gravitydir;
        private bool visible, solid, persistant;

        public Sprite getSprite()
        {
            return sprite;
        }

        public void setSprite(Sprite sprite)
        {
            this.sprite = sprite;
        }

        public double getGravity()
        {
            return gravity;
        }

        public double getGravityDirection()
        {
            return gravitydir;
        }

        public void setGravity(double gravity)
        {
            this.gravity = gravity;
        }

        public void setGravityDirection(double direction)
        {
            gravitydir = direction;
        }

        public void setX(int x)
        {
            this.x = x;
        }

        public void setY(int y)
        {
            this.y = y;
        }

        public void setDepth(int depth)
        {
            z = depth;
        }

        public int getX()
        {
            return x;
        }

        public int getY()
        {
            return y;
        }

        public int getDepth()
        {
            return z;
        }

        public bool isSolid()
        {
            return solid;
        }

        public void setSolid(bool solid)
        {
            this.solid = solid;
        }

        public bool isVisible()
        {
            return visible;
        }

        public void setVisible(bool visible)
        {
            this.visible = visible;
        }
    }

    public class Scene
    {

    }
}
