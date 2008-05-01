using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace org.gcreator.Types
{
    public class Double : Number
    {
        private double i;

        public Double(double ii)
        {
            this.i = ii;
        }

        public override double getDouble()
        {
            return i;
        }

        public override String getString()
        {
            return new String("" + i);
        }

        public override string ToString()
        {
            return "" + i;
        }
    }
}
