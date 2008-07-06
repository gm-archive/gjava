using System.Collections.Generic;
using System.Text;

namespace org.gcreator.Types
{
    public class String : Object
    {
        private string s = "";

        public String(string str)
        {
            s = str;
        }

        public override String getString()
        {
            return this;
        }

        public override double getDouble()
        {
            return System.Double.Parse(s);
        }

        public override Object add(Object o)
        {
            return new String(s + o.getString().ToString());
        }

        public override string ToString()
        {
            return s;
        }

        public static string chr(double v)
        {
            return "" + (char)v;
        }

        public static double ord(string s)
        {
            return (int)s[0];
        }

        public static double length(string s)
        {
            return s.Length;
        }
    }
}
