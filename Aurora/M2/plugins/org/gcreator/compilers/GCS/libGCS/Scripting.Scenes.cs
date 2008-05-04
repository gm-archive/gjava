using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using org.gcreator.Native;

namespace org.gcreator.Scripting
{
    public partial class GCL
    {
        public static void room_goto_next()
        {
            SDL.Game.game.SceneGotoNext();
        }

        public static void room_goto_previous()
        {
            SDL.Game.game.SceneGotoPrevious();
        }

        public static void scene_goto_next()
        {
            SDL.Game.game.SceneGotoNext();
        }

        public static void scene_goto_previous()
        {
            SDL.Game.game.SceneGotoPrevious();
        }
    }
}
