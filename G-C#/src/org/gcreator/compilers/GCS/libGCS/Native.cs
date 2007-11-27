using System;
using System.Collections.Generic;
using System.Text;
using org.gcreator.Components;
using SdlDotNet.Core;
using SdlDotNet.Graphics;

namespace org.gcreator.Native
{
	public class CSharp
	{
		public static org.gcreator.Support.Color ToSupportColor(System.Drawing.Color c)
		{
			return new org.gcreator.Support.Color(c.R, c.G, c.B);
		}
		
		public static System.Drawing.Color ToDrawingColor(org.gcreator.Support.Color c)
		{
			return System.Drawing.Color.FromArgb(c.getRed(), c.getGreen(), c.getBlue());
		}
		
		public static System.Drawing.Rectangle ToDrawingRectangle(org.gcreator.Support.Rectangle r)
		{
			return new System.Drawing.Rectangle(r.x, r.y, r.width, r.height);
		}
	}
	
    public class SDL
    {
		public static void DrawToSurface(Image image, Surface screen, org.gcreator.Support.Rectangle source, org.gcreator.Support.Rectangle destination)
		{
			DrawToSurface(image.texture, screen, CSharp.ToDrawingRectangle(source), CSharp.ToDrawingRectangle(destination));
		}
		
		public static void DrawToSurface(Surface image, Surface screen, org.gcreator.Support.Rectangle source, org.gcreator.Support.Rectangle destination)
		{
			DrawToSurface(image, screen, CSharp.ToDrawingRectangle(source), CSharp.ToDrawingRectangle(destination));
		}
		
		public static void DrawToSurface(Image image, Surface screen, System.Drawing.Rectangle source, System.Drawing.Rectangle destination)
		{
			DrawToSurface(image.texture, screen, source, destination);
		}
		
		public static void DrawToSurface(Surface image, Surface screen, System.Drawing.Rectangle source, System.Drawing.Rectangle destination)
		{
			Surface s = image.CreateSurfaceFromClipRectangle(source);
			DrawToSurface(s, screen, destination);
		}
		
		public static void DrawToSurface(Image image, Surface screen, org.gcreator.Support.Rectangle destination)
		{
			DrawToSurface(image.texture, screen, CSharp.ToDrawingRectangle(destination));
		}
		
		public static void DrawToSurface(Image image, Surface screen, System.Drawing.Rectangle destination)
		{
			DrawToSurface(image.texture, screen, destination);
		}
		
		public static void DrawToSurface(Surface image, Surface screen, org.gcreator.Support.Rectangle destination)
		{
			Surface t = image.CreateStretchedSurface(new System.Drawing.Size(destination.width, destination.height));
			screen.Blit(t, CSharp.ToDrawingRectangle(destination));
		}
		
		public static void DrawToSurface(Surface image, Surface screen, System.Drawing.Rectangle destination)
		{
			Surface t = image.CreateStretchedSurface(new System.Drawing.Size(destination.Width, destination.Height));
			screen.Blit(t, destination);
		}
	
		public Surface getSDLTexture(Image img)
		{
			return img.texture;
		}
		
		public Image makeImage(Surface tex)
		{
			Image i = new Image();
			i.texture = tex;
			return i;
		}
	
        public class Game
        {
            internal Scene currentScene;
            public Scene[] scenes;
			public static Game game;

			public Surface screen, master;
			
			private bool fullscreen, resizable;
			private int width, height; //Initial
			
            public Game(Scene[] scenelist, bool fullscreen, bool resizable, int width, int height, string title)
            {
				game = this;
				this.fullscreen = fullscreen;
				this.resizable = resizable;
				this.width = width;
				this.height = height;
                scenes = scenelist;
                currentScene = scenelist[0];
				currentScene.Create();
                screen = Video.SetVideoMode(width, height, resizable, false, fullscreen);
				master = new Surface(width, height);
                Video.WindowCaption = title;
                Events.Quit += new EventHandler<QuitEventArgs>(this.Quit);
				Events.VideoResize += new EventHandler<VideoResizeEventArgs>(this.Resize);
				Events.Tick += new EventHandler<TickEventArgs>(this.Tick);
            }
			
			private void Tick(object o, TickEventArgs t)
			{
				Draw();
			}

            private void Draw()
            {
                currentScene.Loop();
				master.Update();
				screen.Blit(master);
				screen.Update();
            }
			
			internal void UpdateVideoMode(int Width, int Height)
			{
				screen = Video.SetVideoMode(Width, Height, resizable, false, fullscreen);
				master = new Surface(Width, Height);
			}
			
			internal void UpdateVideoMode()
			{
				UpdateVideoMode(width, height);
			}

            private void Quit(object sender, QuitEventArgs e)
            {
                Events.QuitApplication();
            }

            public void Run()
            {
                Events.Run();
            }
			
			private void Resize(object sender, VideoResizeEventArgs e)
			{
				UpdateVideoMode(e.Width, e.Height);
			}
        }
    }
}
