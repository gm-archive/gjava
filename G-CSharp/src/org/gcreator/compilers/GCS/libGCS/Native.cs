using System.Collections.Generic;
using System.Text;
using org.gcreator.Components;
using SdlDotNet.Core;
using SdlDotNet.Graphics;

namespace org.gcreator.Native
{
	public static class CSharp
	{
		/*public static org.gcreator.Support.Color ToSupportColor(System.Drawing.Color c)
		{
			return new org.gcreator.Support.Color(c.R, c.G, c.B);
		}*/
		
		/*public static System.Drawing.Color ToDrawingColor(org.gcreator.Support.Color c)
		{
			return System.Drawing.Color.FromArgb(c.getRed(), c.getGreen(), c.getBlue());
		}*/
		
		//public static System.Drawing.Rectangle ToDrawingRectangle(org.gcreator.Support.Rectangle r)
		//{
		//	return new System.Drawing.Rectangle(r.x, r.y, r.width, r.height);
		//}
	}
	
    public static class SDL
    {
		/*public static void DrawToSurface(Image image, Surface screen, org.gcreator.Support.Rectangle source, org.gcreator.Support.Rectangle destination)
		{
			DrawToSurface(image.texture, screen, CSharp.ToDrawingRectangle(source), CSharp.ToDrawingRectangle(destination));
		}
		
		public static void DrawToSurface(Surface image, Surface screen, org.gcreator.Support.Rectangle source, org.gcreator.Support.Rectangle destination)
		{
			DrawToSurface(image, screen, CSharp.ToDrawingRectangle(source), CSharp.ToDrawingRectangle(destination));
		}*/
		
		public static void DrawToSurface(Image image, Surface screen, System.Drawing.Rectangle source, System.Drawing.Rectangle destination)
		{
			DrawToSurface(image.texture, screen, source, destination);
		}
		
		public static void DrawToSurface(Surface image, Surface screen, System.Drawing.Rectangle source, System.Drawing.Rectangle destination)
		{
			Surface s = image.CreateSurfaceFromClipRectangle(source);
			DrawToSurface(s, screen, destination);
		}
		
		//public static void DrawToSurface(Image image, Surface screen, org.gcreator.Support.Rectangle destination)
		//{
        //    if(image!=null)
		//	    DrawToSurface(image.texture, screen, CSharp.ToDrawingRectangle(destination));
		//}
		
		public static void DrawToSurface(Image image, Surface screen, System.Drawing.Rectangle destination)
		{
			DrawToSurface(image.texture, screen, destination);
		}
		
		//public static void DrawToSurface(Surface image, Surface screen, org.gcreator.Support.Rectangle destination)
		//{
		//	Surface t = image.CreateStretchedSurface(new System.Drawing.Size(destination.width, destination.height));
		//	screen.Blit(t, CSharp.ToDrawingRectangle(destination));
		//}
		
		public static void DrawToSurface(Surface image, Surface screen, System.Drawing.Rectangle destination)
		{
			Surface t = image.CreateStretchedSurface(new System.Drawing.Size(destination.Width, destination.Height));
			screen.Blit(t, destination);
		}
	
		public static Surface getSDLTexture(Image img)
		{
			return img.texture;
		}
		
		public static Image makeImage(Surface tex)
		{
			Image i = new Image();
			i.texture = tex;
			return i;
		}

        public class GameControl : SdlDotNet.Windows.SurfaceControl
        {

            delegate void BlitSurfaceCallback(Surface s);
            delegate void UpdateCallback();

            public GameControl(Scene[] scenelist)
            {
                Game g = new Game(scenelist, false, true, "", false);
                g.c = this;
                System.Threading.Thread thread =
                    new System.Threading.Thread(new System.Threading.ThreadStart(SdlDotNet.Core.Events.Run));
                thread.IsBackground = true;
                thread.Name = "SDL.NET";
                thread.Priority = System.Threading.ThreadPriority.Normal;
                thread.Start();
            }

            public void SafeBlit(Surface c)
            {
                if (this.InvokeRequired)
                {
                    BlitSurfaceCallback d = new BlitSurfaceCallback(SafeBlit);
                    this.Invoke(d, new object[] { c });
                }
                else
                {
                    //Surface s = new Surface(c.Width, c.Height);
                    //s.Blit(c, Location);
                    //this.s.Blit(s);
                    this.Blit(c);
                }
            }

            public void SafeUpdate()
            {
                if (this.InvokeRequired)
                {
                    UpdateCallback d = new UpdateCallback(SafeUpdate);
                    this.Invoke(d, new object[] {});
                }
                else
                {
                    this.Update();
                }
            }
        }

        public class Game
        {
            internal Scene currentScene = null;
            public Scene[] scenes;
			public static Game game;

			public Surface screen, master;
			
			private bool fullscreen, resizable;
			public Surface cursurface;

            internal bool stop = false;
            internal bool titled = false;
            internal bool standalone;
            internal GameControl c;

            public Game(Scene[] scenelist, bool fullscreen, bool resizable, string title)
                : this(scenelist, fullscreen, resizable, title, true) { }

            public Game(Scene[] scenelist, bool fullscreen, bool resizable, string title, bool standalone)
            {
                if (stop)
                    return;
                this.standalone = standalone;
				game = this;
				this.fullscreen = fullscreen;
				this.resizable = resizable;
                scenes = scenelist;
				if(scenelist!=null&&scenelist.Length>0){
					currentScene = scenelist[0];
					currentScene.Create();
				}
                master = new Surface(currentScene.getWidth(), currentScene.getHeight());
                if (standalone)
                {
                    screen = Video.SetVideoMode(
                        currentScene.getWidth(), currentScene.getHeight());
					//screen.AlphaBlending = false;
                    if (!titled)
                        Video.WindowCaption = title;
                    Events.Quit += new System.EventHandler<QuitEventArgs>(this.Quit);
                    Events.VideoResize += new System.EventHandler<VideoResizeEventArgs>(this.Resize);
					//master = screen;
                }
				//master = new Surface(currentScene.getWidth(), currentScene.getHeight());

                Events.Tick += new System.EventHandler<TickEventArgs>(this.Tick);
				Events.KeyboardDown += new System.EventHandler<SdlDotNet.Input.KeyboardEventArgs>(this.KeyPress);
				Events.KeyboardUp += new System.EventHandler<SdlDotNet.Input.KeyboardEventArgs>(this.KeyRelease);
				//SdlDotNet.Core.Events.Fps = currentScene.getVariable("fps").getInt();
				SdlDotNet.Core.Events.Fps = 200;
            }
			
			public void KeyPress(object o, SdlDotNet.Input.KeyboardEventArgs args)
			{
				currentScene.KeyPress(o, args);
			}
			
			public void KeyRelease(object o, SdlDotNet.Input.KeyboardEventArgs args)
			{
				currentScene.KeyPress(o, args);
			}

            public int SceneGetCurrentIndex()
            {
                for (int i = 0; i < scenes.Length; i++)
                {
                    if (currentScene.GetType() == scenes[i].GetType())
                        return i;
                }
                return -1;
            }

            public void SceneGoto(int i)
            {
                currentScene.Destroy();
                currentScene = scenes[i];
                //Events.Fps = currentScene.getVariable("fps").getInt();
                currentScene.Create();
            }

            public void SceneGotoNext()
            {
                int i = SceneGetCurrentIndex() + 1;
                if (i >= scenes.Length)
                    SceneGoto(0);
                else
                    SceneGoto(i);
            }

            public void SceneGotoPrevious()
            {
                int i = SceneGetCurrentIndex() - 1;
                if (i <= 0)
                    SceneGoto(scenes.Length-1);
                else
                    SceneGoto(i);
            }

            private void Tick(object o, TickEventArgs t)
			{
				Draw();
			}

            private void Draw()
            {
				cursurface = master;
				if(currentScene!=null)
					currentScene.Loop();
				master.Update();
                if (standalone)
                {
                    screen.Blit(master);
                    screen.Update();
                }
                else
				//if (!standalone)
                {
                    c.SafeBlit(master);
                    c.SafeUpdate();
                }
            }
			
			internal void UpdateVideoMode(int Width, int Height)
			{
				screen = Video.SetVideoMode(Width, Height, resizable, false, fullscreen);
				master = new Surface(Width, Height);
			}
			
			internal void UpdateVideoMode()
			{
                UpdateVideoMode(currentScene.getWidth(), currentScene.getHeight());
			}

            internal void Quit(object sender, QuitEventArgs e)
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
