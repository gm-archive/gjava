using System.Collections.Generic;
using System.Text;

namespace org.gcreator.Types
{
    public class Integer : Number
    {
        private int i;

        public Integer(int ii)
        {
            this.i = ii;
        }

        public override double getDouble()
        {
            return (double) i;
        }
		
		public override int getInt()
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
		
		public override Object add(Object o){
			return new Integer(i + o.getInt());
		}
		
		public override Boolean gte(Object o){
			return new Boolean(i >= o.getInt());
		}
    }
}
