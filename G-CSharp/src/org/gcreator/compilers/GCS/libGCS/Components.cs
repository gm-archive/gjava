using System;
using System.Collections.Generic;
using System.Text;
using System.Collections;
using org.gcreator.Support;
using SdlDotNet.Graphics;

namespace org.gcreator.Components
{

    public class Image
    {
        internal Surface texture;

		public Image()
		{
			texture = null;
		}
		
        public Image(string path)
        {
            texture = new Surface(path);
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
            return (Image[]) images.ToArray(typeof(Image));
        }

        public void setImageArray(Image[] images)
        {
            this.images = new ArrayList();
            this.images.AddRange(images);
        }

        public int getWidth()
        {
			if(images==null||images[0]==null)
				return -1;
            return (images[0] as Image).texture.Width;
        }

        public int getHeight()
        {
            if(images==null||images[0]==null)
				return -1;
            return (images[0] as Image).texture.Height;
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
        private int x, y, z, spritepos, spritemovdelay, spritet, spritett = 0;
        //spritet-current position(only on -1 mode)
        //spritett-time to fill delay
        private Sprite sprite = null;
        private double gravity, gravitydir;
        private bool visible, solid, persistent;
		private int startx, starty;
		
		public Actor(int x, int y, int z)
		{
			this.x = x;
			this.y = y;
			this.z = z;
			this.startx = x;
			this.starty = y;
		}
		
		public int getStartingX()
		{
			return startx;
		}
		
		public int getStartingY()
		{
			return starty;
		}
		
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
		
		public bool isPersistent()
        {
            return persistent;
        }

        public void setPersistent(bool persistent)
        {
            this.persistent = persistent;
        }
		
		public void Loop(){
			BeginStep();
			MouseCheck();
			KeyboardCheck();
			spritett++;
			if(spritett >= spritemovdelay)
			{
				spritett = 0;
				spritet++;
				if(spritet>=sprite.getImageCount())
				{
					spritet = 0;
				}
			}
			Step();
			CollisionCheck();
			EndStep();
		}
		public virtual void MouseCheck(){} //Call Mouse events
		public virtual void KeyboardCheck(){} //Call Keyboard events
		public virtual void BeginStep(){}
		public virtual void Step(){}
		public virtual void EndStep(){}
		public virtual void Draw()
		{
			//Unless otherwise specified
			Native.SDL.DrawToSurface(
				sprite.getImage(getCurrentSpritePosition()),
				Native.SDL.Game.game.cursurface,
				new Rectangle(x - sprite.getOriginX(), y - sprite.getOriginY(), sprite.getWidth(), sprite.getHeight()));
		}
		public virtual void CollisionCheck(){} //TODO: Check collisions/solid
		public virtual void Create(){}
    }

    public class Scene
    {
		private ArrayList actors = new ArrayList();
		private int width = 640, height = 480;
        private System.Drawing.Color background = System.Drawing.Color.Black;

        public System.Drawing.Color getBackground()
        {
            return background;
        }

        public void setBackground(System.Drawing.Color background)
        {
            this.background = background;
        }

		private int getMinimumDepth()
		{
			int result = Int32.MaxValue;
			foreach(object o in actors)
			{
				if(o is Actor)
				{
					int adep = ((Actor) o).getDepth();
					if(adep<result)
						result = adep;
				}
			}
			return result;
		}

		private int getMaximumDepth()
		{
			int result = Int32.MinValue;
			foreach(object o in actors)
			{
				if(o is Actor)
				{
					int adep = ((Actor) o).getDepth();
					if(adep>result)
						result = adep;
				}
			}
			return result;
		}
		private int getNextDepth(int Depth)
		{
			int result = Int32.MinValue;
			foreach(object o in actors)
			{
				if(o is Actor)
				{
					int adep = ((Actor) o).getDepth();
					if(adep>result&&adep<Depth)
						result = adep;
				}
			}
			return result;
		}

		public int getWidth()
		{
			return width;
		}

		public int getHeight()
		{
			return height;
		}

		public void setWidth(int w)
		{
			width = w;
		}

		public void setHeight(int h)
		{
			height = h;
		}

		public virtual void Create()
		{
		
		}
		public void addActor(Actor actor)
		{
			actors.Add(actor);
		}
		internal void InheritPersistents(Actor[] persistents)
		{
		
		}
		public void Destroy()
		{
		
		}
		public void Loop()
		{
			foreach(object o in actors)
			{
				if(o is Actor)
				{
					(o as Actor).Loop();
				}
			}
			Surface t = new Surface(getWidth(), getHeight());
            t.Fill(background);
			Native.SDL.Game.game.cursurface = t;
			int a = getMaximumDepth();
			while(a >= getMinimumDepth()){
				foreach(object o in actors)
				{
					if(o is Actor)
					{
						if((o as Actor).getDepth()==a&&(o as Actor).isVisible())
							(o as Actor).Draw();
					}
				}
				if(a!=getNextDepth(a))
					a = getNextDepth(a);
				else
					break;
			}
			viewDrawer(t);
			Native.SDL.Game.game.cursurface = Native.SDL.Game.game.master;
		}

		private void viewDrawer(Surface t)
		{
			//No Views
			Native.SDL.DrawToSurface(t, Native.SDL.Game.game.master, new Rectangle(0, 0, getWidth(), getHeight()), new Rectangle(0,0,Native.SDL.Game.game.master.Width, Native.SDL.Game.game.master.Height));
		}

		internal Actor[] getPersistentActors()
		{
			return null;
		}
		internal Actor[] getNonPersistentActors()
		{
			return null;
		}
    }
}
