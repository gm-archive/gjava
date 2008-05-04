using org.gcreator.Types;
using org.gcreator.Components;
using org.gcreator.Native;
using org.gcreator.Support;

namespace org.gcreator.Scripting
{
    public partial class GCL
    {
        public static void draw_sprite(Object sprite, Object subimg, Object x, Object y)
        {
            Sprite s = sprite as Sprite;
            int index = (int) subimg.getDouble();
            int _x = (int)x.getDouble();
            int _y = (int)y.getDouble();

            Rectangle r = new Rectangle(
                _x-s.getOriginX(),
                _y-s.getOriginY(),
                s.getWidth(), s.getHeight());

            SDL.DrawToSurface(s.getImage(index), SDL.Game.game.cursurface,
                s.getBounds(), r);
        }

        public static void draw_sprite_stretched
            (Object sprite, Object subimg, Object x, Object y, Object w, Object h)
        {
            Sprite s = sprite as Sprite;
            int index = (int)subimg.getDouble();
            int _x = (int)x.getDouble();
            int _y = (int)y.getDouble();

            Rectangle r = new Rectangle(
                _x - s.getOriginX(),
                _y - s.getOriginY(),
                (int) w.getDouble(), (int) h.getDouble());

            SDL.DrawToSurface(s.getImage(index),
                SDL.Game.game.cursurface, s.getBounds(), r);
        }

        public static void draw_sprite_part(Object sprite, Object subimg,
            Object left, Object top, Object width, Object height, Object x, Object y)
        {
            Sprite s = sprite as Sprite;
            int index = (int)subimg.getDouble();
            int _x = (int)x.getDouble();
            int _y = (int)y.getDouble();

            Rectangle src =
                new Rectangle(s.getBounds().x, s.getBounds().y,
                    s.getBounds().width, s.getBounds().height);

            src.x += (int) left.getDouble();
            src.y += (int) top.getDouble();
            src.width = (int)min(width, new Double(src.width)).getDouble();
            src.height = (int)min(height, new Double(src.height)).getDouble();

            Rectangle r = new Rectangle(
                _x - s.getOriginX(),
                _y - s.getOriginY(),
                src.width, src.height);

            SDL.DrawToSurface(s.getImage(index), SDL.Game.game.cursurface,
                src, r);
        }
    }
}
