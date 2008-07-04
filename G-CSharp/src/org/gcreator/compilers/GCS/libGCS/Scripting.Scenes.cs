using System.Collections.Generic;
using System.Text;
using org.gcreator.Native;
using org.gcreator.Types;

namespace org.gcreator.Scripting
{
    public partial class GCL : Constants
    {
        public static Object room_goto_next()
        {
            SDL.Game.game.SceneGotoNext();
            return new Object();
        }

        public static Object room_goto_previous()
        {
            SDL.Game.game.SceneGotoPrevious();
            return new Object();
        }

        public static Object scene_goto_next()
        {
            SDL.Game.game.SceneGotoNext();
            return new Object();
        }

        public static Object scene_goto_previous()
        {
            SDL.Game.game.SceneGotoPrevious();
            return new Object();
        }

        public static Object game_end()
        {
            SDL.Game.game.Quit(null, null);
            return new Object();
        }
    }
}
