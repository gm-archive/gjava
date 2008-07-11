using org.gcreator.Types;
using org.gcreator.Components;
using SdlDotNet.Graphics;
using SdlDotNet.Graphics.Sprites;
using System.Windows.Forms;

namespace org.gcreator.Scripting
{
    public partial class GCL
    {
        public static Object instance_create(Object x, Object y, Object type)
        {
            string s = type.getString().ToString();
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

        public static Object instance_exists(Object obj)
        {
            if (obj is Actor)
            {
                return new Boolean(Native.SDL.Game.game.currentScene.actors.Contains(obj));
            }
            else
            {
                string s = obj.getString().ToString();
                foreach (object o in Native.SDL.Game.game.currentScene.actors)
                {
                    if (o.GetType().FullName == s)
                        return new Boolean(true);
                }
                return new Boolean(false);
            }
        }

        public static Object instance_place(Object x, Object y)
        {
            return instance_place(x, y, new String(""));
        }

        public static Object instance_place(Object x, Object y, Object type)
        {
            int _x = x.getInt();
            int _y = y.getInt();

            string s = type.getString().ToString();

            foreach (object o in Native.SDL.Game.game.currentScene.actors
                )
            {
                if (s==""||o.GetType().FullName == s)
                {
                    Actor a = (Actor)o;
                    if (_x < a.getX().getInt() - a.getSprite().getOriginX() + a.getSprite().getWidth()
                        && _x >= a.getX().getInt() - a.getSprite().getOriginX()
                        && _y < a.getY().getInt() - a.getSprite().getOriginY() + a.getSprite().getHeight()
                        && _y >= a.getY().getInt() - a.getSprite().getOriginY())
                    {
                        return a;
                    }
                }
            }
            return new Object();
        }
    }
}