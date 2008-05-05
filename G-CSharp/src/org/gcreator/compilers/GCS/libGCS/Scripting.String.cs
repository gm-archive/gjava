using org.gcreator.Types;

namespace org.gcreator.Scripting
{
    public partial class GCL
    {
        public static Object real(Object str)
        {
            return new Double(str.getDouble());
        }

        public static Object string_length(Object str)
        {
            return new Double(str.getString().ToString().Length);
        }

        public static Object string_char_at(Object str, Object index)
        {
            return new String("" + str.getString().ToString()[(int)index.getDouble()]);
        }

        public static Object string_repeat(Object str, Object times)
        {
            int r = (int)times.getDouble();
            string s = str.getString().ToString();

            string q = "";
            for (int i = 0; i < r; i++)
            {
                q += s;
            }

            return new String(q);
        }
    }
}
