using org.gcreator.Types;
using org.gcreator.Components;
using SdlDotNet.Graphics;
using SdlDotNet.Graphics.Sprites;
using System.Windows.Forms;

namespace org.gcreator.Scripting
{
    public partial class GCL
    {
        public static Object instance_create(Object x, Object y, Object obj)
        {
            string s = obj.getString().ToString();
            System.Type t = Native.SDL.Game.game.currentScene.GetType().Assembly.GetType(s);
            System.Reflection.ConstructorInfo c = t.GetConstructor(new System.Type[] {
                typeof(Object), typeof(Object)
            });
            object o = c.Invoke(new object[] { x, y });
            if(o==null||!(o is Actor))
                return new Object();
            Native.SDL.Game.game.currentScene.addActor((Actor) o);
            ((Actor)o).Create();
            return (Object) o;
        }
    }
}