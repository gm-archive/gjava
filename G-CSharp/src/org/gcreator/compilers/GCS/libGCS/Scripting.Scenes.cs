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
    }
}
