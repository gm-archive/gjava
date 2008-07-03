using org.gcreator.Types;
using org.gcreator.Native;

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
            SDL.Game.game.titled = true;
            return new Object();
        }

        public static Object window_set_size(Object width, Object height)
        {
            SdlDotNet.Graphics.Video.SetVideoMode(width.getInt(), height.getInt());
            return new Object();
        }
    }
}
