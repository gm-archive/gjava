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

        public System.Drawing.Bitmap GetBitmap()
        {
            return texture.Bitmap;
        }
    }

    public class Tile : Object
    {
        internal Image i;
        internal int x, y, tx, ty, width, height, depth;
        internal bool visible;

        public Tile(Image i, int x, int y, int tx, int ty, int width, int height, int depth, bool visible)
        {
            this.i = i;
            this.x = x;
            this.y = y;
            this.tx = tx;
            this.ty = ty;
            this.width = width;
            this.height = height;
            this.depth = depth;
            this.visible = visible;
        }

        public void Draw()
        {
            Surface s = org.gcreator.Native.SDL.Game.game.cursurface;
            s.Blit(
                i.texture,
                new System.Drawing.Point(x, y),
                new System.Drawing.Rectangle(tx, ty, width, height));
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

    public class Sound : Object
    {
        private SdlDotNet.Audio.Sound s;

        private SdlDotNet.Audio.Channel c = null;
        private string path = "";
        private static ArrayList list = new ArrayList();

        public static void Stop(string s)
        {
            foreach(object o in list){
                if (o is Sound)
                {
                    if (((Sound)o).path == s && ((Sound)o).IsPlaying())
                        ((Sound)o).Stop();
                }
            }
        }

        public static void StopAll()
        {
            foreach (object o in list)
            {
                if (o is Sound)
                {
                    if (((Sound)o).IsPlaying())
                        ((Sound)o).Stop();
                }
            }
        }

        public static bool IsPlaying(string s)
        {
            foreach (object o in list)
            {
                if (o is Sound)
                {
                    if (((Sound)o).path == s && ((Sound)o).IsPlaying())
                        return true;
                }
            }
            return false;
        }

        public static int GetVolume(string s)
        {
            foreach (object o in list)
            {
                if (o is Sound)
                {
                    if (((Sound)o).path == s && ((Sound)o).IsPlaying())
                        return ((Sound)o).GetVolume();
                }
            }
            return 0;
        }

        public static void SetVolume(string s, int volume)
        {
            foreach (object o in list)
            {
                if (o is Sound)
                {
                    if (((Sound)o).path == s && ((Sound)o).IsPlaying())
                        ((Sound)o).SetVolume(volume);
                }
            }
        }

        public Sound(string path)
        {
            this.path = path;
            s = new SdlDotNet.Audio.Sound(path);
            list.Add(this);
        }

        public void Play(bool loop)
        {
            c = s.Play(loop);
        }

        public bool IsPlaying()
        {
            if (c == null)
                return false;
            return c.IsPlaying();
        }

        public void Loop()
        {
            Play(true);
        }

        public void Pause()
        {
            if (c != null)
                c.Pause();
        }

        public void Resume()
        {
            if (c != null)
                c.Resume();
        }

        public void SetPanning(int left, int right)
        {
            if (c != null)
                c.SetPanning(left, right);
        }

        public void Stop()
        {
            s.Stop();
        }

        public void SetVolume(int vol)
        {
            s.Volume = vol;
        }

        public int GetVolume()
        {
            return s.Volume;
        }

        public void FadeIn(int milliseconds)
        {
            s.FadeIn(milliseconds);
        }

        public void FadeOut(int milliseconds)
        {
            s.Fadeout(milliseconds);
        }
    }
}
