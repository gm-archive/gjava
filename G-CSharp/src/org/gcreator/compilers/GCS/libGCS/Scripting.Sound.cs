using org.gcreator.Components;
using org.gcreator.Types;

namespace org.gcreator.Scripting
{
    public partial class GCL
    {
        public Object sound_play(Object s)
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

        public Object sound_loop(Object s)
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
    }
}
