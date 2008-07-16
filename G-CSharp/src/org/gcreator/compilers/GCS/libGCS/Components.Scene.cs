using System.Collections;
using SdlDotNet.Graphics;
using org.gcreator.Types;

namespace org.gcreator.Components
{
    public class Scene : Object
    {
        internal ArrayList actors = new ArrayList();
        private ArrayList tiles = new ArrayList();
        private int width = 640, height = 480;
        private System.Drawing.Color background = System.Drawing.Color.Black;

        public Scene()
        {
            setVariable("fps", new Integer(9999));
        }
		
		public void KeyPress(object o, SdlDotNet.Input.KeyboardEventArgs args)
		{
			
		}
			
		public void KeyRelease(object o, SdlDotNet.Input.KeyboardEventArgs args)
		{
			
		}

        public System.Drawing.Color getBackground()
        {
            return background;
        }

        public void setBackground(System.Drawing.Color background)
        {
            this.background = background;
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
			l = new ArrayList();
			l.AddRange(actors);
			l.AddRange(tiles);
        }
        public void addTile(Tile tile)
        {
            tiles.Add(tile);
			l = new ArrayList();
			l.AddRange(actors);
			l.AddRange(tiles);
        }
        internal void InheritPersistents(Actor[] persistents)
        {

        }
        public virtual void Destroy()
        {
            foreach (Actor a in actors)
            {
                //TODO: Destroy a if a isn't persistant
            }
            actors.Clear();
            tiles.Clear();
        }
		
		Surface t = null;
		ArrayList l = null;
        public virtual void Loop()
        {
            foreach (object o in actors)
            {
                if (o!=null&&o is Actor)
                {
                    (o as Actor).Loop();
                }
            }
			if(t==null){
				t = new Surface(getWidth(), getHeight());
			}
			//t.Fill(System.Drawing.Color.White);
            t.Fill(background);
            Native.SDL.Game.game.cursurface = t;
            /*int a = getMaximumDepth();
            while (a >= getMinimumDepth())
            {
                foreach (object o in tiles)
                {
                    if (o is Tile)
                    {
                        if ((o as Tile).depth == a && (o as Tile).visible)
                            (o as Tile).Draw();
                    }
                }
                foreach (object o in actors)
                {
                    if (o is Actor)
                    {
                        if ((o as Actor).getDepth() == a && (o as Actor).getVisible().getBoolean())
                            (o as Actor).Draw();
                    }
                }
                if (a != getNextDepth(a))
                    a = getNextDepth(a);
                else
                    break;
            }*/
			
			if(l==null){
				l = new ArrayList();
				l.AddRange(actors);
				l.AddRange(tiles);
			}
			l.Sort(new DepthComparer());
			foreach(object o in l)
			{
				if(o is Tile&&(o as Tile).visible)
					(o as Tile).Draw();
				if(o is Actor&&(o as Actor).visible)
					(o as Actor).Draw();
			}
			
            viewDrawer(t);
            Native.SDL.Game.game.cursurface = Native.SDL.Game.game.master;
        }

        private void viewDrawer(Surface t)
        {
            //No Views
			Native.SDL.Game.game.master.Blit(t, new System.Drawing.Rectangle(0, 0, getWidth(), getHeight()),
			                                 new System.Drawing.Rectangle(0, 0, Native.SDL.Game.game.master.Width, Native.SDL.Game.game.master.Height));
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
	
	internal class DepthComparer : IComparer
	{
		int IComparer.Compare(System.Object x, System.Object y)
		{
			int v1 = 0;
			int v2 = 0;
			
			if(x is Actor)
				v1 = (x as Actor).getDepth();
			if(x is Tile)
				v1 = (x as Tile).depth;
			
			if(y is Actor)
				v2 = (x as Actor).getDepth();
			if(y is Tile)
				v2 = (x as Tile).depth;
			
			if(v1>v2)
				return 1;
			if(v1==v2)
				return 0;
			return -1;
		}
	}
}