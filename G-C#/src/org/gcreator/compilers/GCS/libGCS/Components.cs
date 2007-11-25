using System;
using System.Collections.Generic;
using System.Text;
using System.Collections;
using Microsoft.Xna.Framework.Graphics;
using org.gcreator.Support;

namespace org.gcreator.Components
{

    public class Image
    {
        private Texture2D texture;

        public Image(String path)
        {
            texture = org.gcreator.Native.XNA.content.Load<Texture2D>(path);
        }
    }

    public class Sprite
    {
        private ArrayList images = new ArrayList();
        private int originX, originY;
        private Rectangle bounds;

        public int getOriginX()
        {
            return originX;
        }

        public int getOriginY()
        {
            return originY;
        }

        public void setOriginX(int x)
        {
            originX = x;
        }

        public void setOriginY(int y)
        {
            originY = y;
        }

        public void setOrigin(int x, int y)
        {
            originX = x;
            originY = y;
        }

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

        public Rectangle getBounds()
        {
            return bounds;
        }

        public void setBounds(Rectangle bounds)
        {
            this.bounds = bounds;
        }
    }

    public class Sound
    {

    }

    public class Actor
    {
        private int x, y, z, spritepos, spritemovdelay, spritet, spritett;
        //spritet-current position(only on -1 mode)
        //spritett-time to fill delay
        private Sprite sprite = null;
        private double gravity, gravitydir;
        private bool visible, solid, persistant;

        public int getSpritePosition()
        {
            return spritepos;
        }

        public int getSpriteMovingDelay()
        {
            return spritemovdelay;
        }

        public void setSpritePosition(int spritepos)
        {
            this.spritepos = spritepos;
        }

        public int getCurrentSpritePosition()
        {
            if (spritepos != -1)
                return spritepos;
            return spritet;
        }

        public void setSpriteMovingDelay(int delay)
        {
            spritemovdelay = delay;
        }

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

        public void Draw()
        {

        }
    }

    public class Scene
    {
        public void Draw()
        {

        }
    }
}

