using org.gcreator.Types;
using org.gcreator.Components;
using org.gcreator.Native;

namespace org.gcreator.Scripting
{
    public partial class GCL
    {
        public static Object draw_image(Object image, Object x, Object y)
        {
            int _x = (int)x.getDouble();
            int _y = (int)y.getDouble();
            Image i = (Image)image;

            SDL.DrawToSurface(i, SDL.Game.game.cursurface,
                new System.Drawing.Rectangle(0, 0, i.texture.Width, i.texture.Height),
                new System.Drawing.Rectangle(_x, _y, i.texture.Width, i.texture.Height));
            return new Object();
        }

        public static Object draw_sprite(Object sprite, Object subimg, Object x, Object y)
        {
            Sprite s = sprite as Sprite;
            int index = (int) subimg.getDouble();
            int _x = (int)x.getDouble();
            int _y = (int)y.getDouble();

            System.Drawing.Rectangle r = new System.Drawing.Rectangle(
                _x-s.getOriginX(),
                _y-s.getOriginY(),
                s.getWidth(), s.getHeight());

            SDL.DrawToSurface(s.getImage(index), SDL.Game.game.cursurface,
                s.getBounds(), r);
            return new Object();
        }

        public static Object draw_sprite_stretched
            (Object sprite, Object subimg, Object x, Object y, Object w, Object h)
        {
            Sprite s = sprite as Sprite;
            int index = (int)subimg.getDouble();
            int _x = (int)x.getDouble();
            int _y = (int)y.getDouble();

            System.Drawing.Rectangle r = new System.Drawing.Rectangle(
                _x - s.getOriginX(),
                _y - s.getOriginY(),
                (int) w.getDouble(), (int) h.getDouble());

            SDL.DrawToSurface(s.getImage(index),
                SDL.Game.game.cursurface, s.getBounds(), r);
            return new Object();
        }

        public static Object draw_sprite_part(Object sprite, Object subimg,
            Object left, Object top, Object width, Object height, Object x, Object y)
        {
            Sprite s = sprite as Sprite;
            int index = (int)subimg.getDouble();
            int _x = (int)x.getDouble();
            int _y = (int)y.getDouble();

            System.Drawing.Rectangle src =
                new System.Drawing.Rectangle(s.getBounds().X, s.getBounds().Y,
                    s.getBounds().Width, s.getBounds().Height);

            src.X += (int) left.getDouble();
            src.X += (int) top.getDouble();
            src.Width = (int)min(width, new Double(src.Width)).getDouble();
            src.Height = (int)min(height, new Double(src.Height)).getDouble();

            System.Drawing.Rectangle r = new System.Drawing.Rectangle(
                _x - s.getOriginX(),
                _y - s.getOriginY(),
                src.Width, src.Height);

            SDL.DrawToSurface(s.getImage(index), SDL.Game.game.cursurface,
                src, r);

            return new Object();
        }
    }
}
