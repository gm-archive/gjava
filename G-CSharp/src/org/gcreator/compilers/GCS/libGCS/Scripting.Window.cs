using org.gcreator.Types;

namespace org.gcreator.Scripting
{
    public partial class GCL
    {
        public static Object window_get_caption()
        {
            return new String(SdlDotNet.Graphics.Video.WindowCaption);
        }

        public static Object window_set_caption(Object caption)
        {
            SdlDotNet.Graphics.Video.WindowCaption = caption.getString().ToString();
            Native.SDL.Game.game.titled = true;
            return new Object();
        }
    }
}
