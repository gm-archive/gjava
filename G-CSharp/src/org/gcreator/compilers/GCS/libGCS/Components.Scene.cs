using System.Collections;
using SdlDotNet.Graphics;
using org.gcreator.Types;
using org.gcreator.Support;

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
            setVariable("fps", new Integer(30));
        }

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
            foreach (object o in actors)
            {
                if (o is Actor)
                {
                    int adep = ((Actor)o).getDepth();
                    if (adep < result)
                        result = adep;
                }
            }
            foreach (object o in tiles)
            {
                if (o is Tile)
                {
                    int adep = ((Tile)o).depth;
                    if (adep < result)
                        result = adep;
                }
            }
            return result;
        }

        private int getMaximumDepth()
        {
            int result = System.Int32.MinValue;
            foreach (object o in actors)
            {
                if (o is Actor)
                {
                    int adep = ((Actor)o).getDepth();
                    if (adep > result)
                        result = adep;
                }
            }
            foreach (object o in tiles)
            {
                if (o is Tile)
                {
                    int adep = ((Tile)o).depth;
                    if (adep > result)
                        result = adep;
                }
            }
            return result;
        }
        private int getNextDepth(int Depth)
        {
            int result = System.Int32.MinValue;
            foreach (object o in actors)
            {
                if (o is Actor)
                {
                    int adep = ((Actor)o).getDepth();
                    if (adep > result && adep < Depth)
                        result = adep;
                }
            }
            foreach (object o in tiles)
            {
                if (o is Tile)
                {
                    int adep = ((Tile)o).depth;
                    if (adep > result && adep < Depth)
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
        public void addTile(Tile tile)
        {
            tiles.Add(tile);
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
        public virtual void Loop()
        {
            foreach (object o in actors)
            {
                if (o!=null&&o is Actor)
                {
                    (o as Actor).Loop();
                }
            }
            Surface t = new Surface(getWidth(), getHeight());
            t.Fill(background);
            Native.SDL.Game.game.cursurface = t;
            int a = getMaximumDepth();
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
            }
            viewDrawer(t);
            Native.SDL.Game.game.cursurface = Native.SDL.Game.game.master;
        }

        private void viewDrawer(Surface t)
        {
            //No Views
            Native.SDL.DrawToSurface(t, Native.SDL.Game.game.master, new Rectangle(0, 0, getWidth(), getHeight()), new Rectangle(0, 0, Native.SDL.Game.game.master.Width, Native.SDL.Game.game.master.Height));
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