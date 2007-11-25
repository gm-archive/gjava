using System;
using System.Collections.Generic;
using System.Text;
using Microsoft.Xna.Framework;
using Microsoft.Xna.Framework.Content;
using Microsoft.Xna.Framework.Graphics;
using org.gcreator.Components;

namespace org.gcreator.Native
{
    public class XNA
    {
        public static ContentManager content;
        public static GraphicsDeviceManager graphics;
        public static SpriteBatch batch;

        public static void Start(Scene[] scenelist)
        {
            Game game = new Game();
            game.RunWith(scenelist);
        }
    }

    internal class Game : Microsoft.Xna.Framework.Game
    {
        public Scene currentScene;

        public Game()
        {
            XNA.graphics = new GraphicsDeviceManager(this);
            XNA.content = new ContentManager(Services);
        }

        protected override void Initialize()
        {
            XNA.batch = new SpriteBatch(XNA.graphics.GraphicsDevice);
            base.Initialize();
        }

        internal void RunWith(Scene[] scenelist)
        {
            currentScene = scenelist[0];
            base.Run();
        }

        protected override void Draw(GameTime gameTime)
        {
            XNA.graphics.GraphicsDevice.Clear(Color.CornflowerBlue);

            XNA.batch.Begin();

            currentScene.Draw();

            XNA.batch.End();

            base.Draw(gameTime);
        }
    }
}
