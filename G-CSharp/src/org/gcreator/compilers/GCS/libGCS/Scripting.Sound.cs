using org.gcreator.Components;
using org.gcreator.Types;

namespace org.gcreator.Scripting
{
    public partial class GCL
    {
        public static Object sound_play(Object s)
        {
            if (s is Sound)
            {
                ((Sound)s).Play(false);
                return s;
            }
                Sound q = new Sound(s.getString().ToString());
                q.Play(false);
                return q;
        }

        public static Object sound_loop(Object s)
        {
            if (s is Sound)
            {
                ((Sound)s).Loop();
                return s;
            }
            Sound q = new Sound(s.getString().ToString());
            q.Loop();
            return q;
        }

        public static Object sound_stop(Object s)
        {
            if (s is Sound)
                ((Sound)s).Stop();
            else
                Sound.Stop(s.getString().ToString());
            return new Object();
        }

        public static Object sound_stop_all()
        {
            Sound.StopAll();
            return new Object();
        }

        public static Object sound_isplaying(Object o)
        {
            if (o is Sound)
                return new Boolean(((Sound)o).IsPlaying());
            return new Boolean(Sound.IsPlaying(o.getString().ToString()));
        }

        public static Object sound_get_volume(Object o)
        {
            if (o is Sound)
                return new Double(128).div(new Double(((Sound)o).GetVolume()));
            return new Double(128).div(new Double(Sound.GetVolume(o.getString().ToString())));
        }

        public static Object sound_set_volume(Object o)
        {
            if (o is Sound)
                ((Sound)o).SetVolume((int)(o.getDouble() * 128.0));
            else
                Sound.SetVolume(o.getString().ToString(), (int)(o.getDouble() * 128.0));
            return new Object();
        }

        public static Object sound_volume(Object o)
        {
            return sound_set_volume(o);
        }
    }
}
