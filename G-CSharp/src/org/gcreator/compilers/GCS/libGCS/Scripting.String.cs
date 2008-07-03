using org.gcreator.Types;

namespace org.gcreator.Scripting
{
    public partial class GCL
    {
        public static Object real(Object str)
        {
            return new Double(str.getDouble());
        }

        public static Object tostring(Object val){
            return val.getString();
        }

        public static Object string_length(Object str)
        {
            return new Integer(str.getString().ToString().Length);
        }

        public static Object string_char_at(Object str, Object index)
        {
            return new String("" + str.getString().ToString()[(int)index.getDouble()]);
        }

        public static Object string_repeat(Object str, Object times)
        {
            int r = (int)times.getInt();
            string s = str.getString().ToString();

            string q = "";
            for (int i = 0; i < r; i++)
            {
                q += s;
            }

            return new String(q);
        }

        public static Object string_replace(Object str, Object substr, Object newstr)
        {
            return new String(
                str.getString().ToString().Replace(
                    substr.getString().ToString(),
                    newstr.getString().ToString()));
        }

        public static Object string_digits(Object str)
        {
            string parse = str.getString().ToString();
            string result = "";
            foreach (char c in parse)
            {
                if (c >= '0' && c <= '9')
                    result += c;
            }
            return new String(result);
        }
    }
}
