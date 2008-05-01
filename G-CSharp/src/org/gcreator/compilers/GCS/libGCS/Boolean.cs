using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace org.gcreator.Types
{
    public class Boolean : Number
    {
        private bool b;

        public Boolean(bool b)
        {
            this.b = b;
        }

        public override bool getBoolean()
        {
            return b;
        }

        public override string ToString()
        {
            return b ? "true" : "false";
        }

        public override String getString()
        {
            return new String(this.ToString());
        }
    }
}
