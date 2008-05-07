using System.Collections.Generic;
using System.Text;
using System.Collections;
using org.gcreator.Support;
using SdlDotNet.Graphics;
using org.gcreator.Types;

namespace org.gcreator.Components
{

    public class Image : Object
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

    public class Sprite : Object
    {
        private ArrayList images = new ArrayList();
        private int originX = 0, originY = 0;
        private Rectangle bounds = new Rectangle(0, 0, 0, 0);

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
            if (images == null || pos >= images.Count)
                return null;
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
            int result = System.Int32.MaxValue;
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
            int result = System.Int32.MinValue;
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
            int result = System.Int32.MinValue;
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
		    foreach(Actor a in actors){
                //Destroy a if isn't persistent
            }
            actors.Clear();
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
