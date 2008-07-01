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
            if (s is String)
            {
                Sound q = new Sound(s.ToString());
                q.Play(false);
                return q;
            }
            return new Object();
        }

        public static Object sound_loop(Object s)
        {
            if (s is Sound)
            {
                ((Sound)s).Loop();
                return s;
            }
            if (s is String)
            {
                Sound q = new Sound(s.ToString());
                q.Loop();
                return q;
            }
            return new Object();
        }

        public static Object sound_stop(Object s)
        {
            if (s is Sound)
                ((Sound)s).Stop();
            else if (s is String)
                Sound.Stop(s.ToString());
            return new Object();
        }

        public static Object sound_stop_all()
        {
            Sound.StopAll();
            return new Object();
        }

        public static Object sound_is_playing(Object o)
        {
            if (o is Sound)
                return new Boolean(((Sound)o).IsPlaying());
            else if (o is String)
                return new Boolean(Sound.IsPlaying(o.ToString()));
            return new Boolean(false);
        }

        public static Object sound_get_volume(Object o)
        {
            if (o is Sound)
                return new Double(128).div(new Double(((Sound)o).GetVolume()));
            else if (o is String)
                return new Double(128).div(new Double(Sound.GetVolume(o.ToString())));
            return new Double(0);
        }

        public static Object sound_set_volume(Object o)
        {
            if (o is Sound)
                ((Sound)o).SetVolume((int)(o.getDouble() * 128.0));
            else if (o is String)
                Sound.SetVolume(o.ToString(), (int)(o.getDouble() * 128.0));
            return new Object();
        }

        public static Object sound_volume(Object o)
        {
            return sound_set_volume(o);
        }
    }
}
