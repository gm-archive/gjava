using org.gcreator.Types;
using SdlDotNet.Graphics;
using SdlDotNet.Graphics.Sprites;

namespace org.gcreator.Scripting
{
    public partial class GCL
    {
        private static string font = "CourierNew.ttf";
        private static int size = 12;
        private static Font f = new Font("fonts/" + font, size);

        public static Object draw_text(Object x, Object y, Object str)
        {
            string text = str.getString().ToString();
            System.Drawing.Point pos = new System.Drawing.Point(
                (int) x.getDouble(), (int) y.getDouble());

            TextSprite t = new TextSprite(text, f);
                
            Native.SDL.Game.game.cursurface.Blit(t, pos);

            return new Object();
        }

    }
}
