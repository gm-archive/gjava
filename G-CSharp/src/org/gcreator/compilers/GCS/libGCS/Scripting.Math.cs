using org.gcreator.Types;

namespace org.gcreator.Scripting
{
	public partial class GCL
	{
		public static readonly Double PI;
		public static readonly Double E;
        
        static GCL()
        {
            PI = new Double(3.14159265358979324);
            E = new Double(2.71828182845904523);
        }

        public static Object abs(Object _value)
		{
            double value = _value.getDouble();
			return new Double(value>0 ? value : 0-value);
		}

		public static Object arccos(Object _value)
		{
            double value = _value.getDouble();
			return new Double(System.Math.Acos(value));
		}

        public static Object arcsin(Object _value)
		{
            double value = _value.getDouble();
			return new Double(System.Math.Asin(value));
		}

        public static Object arctan(Object _value)
		{
            double value = _value.getDouble();
			return new Double(System.Math.Atan(value));
		}

        public static Object arctan2(Object y, Object x)
		{
            return new Double(System.Math.Atan2(y.getDouble(), x.getDouble()));
		}

        public static Object sqrt(Object value)
		{
			return new Double(System.Math.Sqrt(value.getDouble()));
		}

        public static Object cbrt(Object value)
		{
            return new Double(System.Math.Pow(value.getDouble(), 1.0 / 3.0));
		}

		public static Object ceil(Object value)
		{
            return new Double(System.Math.Ceiling(value.getDouble()));
		}

		public static Object floor(Object value)
		{
            return new Double(System.Math.Floor(value.getDouble()));
		}

		public static Object round(Object value)
		{
            return new Double(System.Math.Round(value.getDouble()));
		}

        public static Object sin(Object value)
        {
            return new Double(System.Math.Sin(value.getDouble()));
        }

        public static Object sinh(Object value)
        {
            return new Double(System.Math.Sinh(value.getDouble()));
        }

		public static Object cos(Object value)
		{
            return new Double(System.Math.Cos(value.getDouble()));
		}

		public static Object cosh(Object value)
		{
            return new Double(System.Math.Cosh(value.getDouble()));
		}

        public static Object tan(Object value)
        {
            return new Double(System.Math.Tan(value.getDouble()));
        }

        public static Object tanh(Object value)
        {
            return new Double(System.Math.Tanh(value.getDouble()));
        }

		public static Object is_real(Object a)
		{
			return new Boolean(a is Number);
		}
		
		public static Object is_string(Object a)
		{
			return new Boolean(a is String);
		}

        public static Object degtorad(Object deg)
		{
			return new Double((deg.getDouble()*PI.getDouble())/180);
		}

        public static Object radtodeg(Object rad)
		{
            return new Double((rad.getDouble() * 180) / PI.getDouble());
		}
		
		public static Object exp(Object x)
		{
			return new Double(System.Math.Pow(E.getDouble(),x.getDouble()));
		}

		public static Object expm1(Object x)
		{
			return new Double((E.getDouble()*x.getDouble()) - 1);
		}

		public static Object sign(Object _x)
		{
            double x = _x.getDouble();
			if(x<0)
				return new Double(-1);
			if(x==0)
				return new Double(0);
			return new Double(1);
		}

        public static Object min(params Object[] args){
            double cur = 0;
            bool curdef = false;
            for (int i = 0; i < args.Length; i++)
            {
                Object o = args[i];
                double d = o.getDouble();
                if (d <= cur || !curdef)
                {
                    curdef = true;
                    cur = d;
                }
            }
            return new Double(cur);
        }

        public static Object max(params Object[] args)
        {
            double cur = 0;
            bool curdef = false;
            for (int i = 0; i < args.Length; i++)
            {
                Object o = args[i];
                double d = o.getDouble();
                if (d >= cur || !curdef)
                {
                    curdef = true;
                    cur = d;
                }
            }
            return new Double(cur);
        }

        public static Object random(Object x)
        {
            int max = (int) x.getDouble();
            System.Random r = new System.Random();
            return new Integer(r.Next(max));
        }

        public static Object choose(params Object[] args)
        {
            Object index = random(new Double((double) args.Length));
            return args[(int)index.getDouble()];
        }

        public static Object log10(Object x)
        {
            return new Double(System.Math.Log10(x.getDouble()));
        }

        public static Object log2(Object x)
        {
            return new Double(System.Math.Log(x.getDouble(), 2));
        }

        public static Object logn(Object n, Object x)
        {
            return new Double(System.Math.Log(x.getDouble(), n.getDouble()));
        }

        public static Object ln(Object x)
        {
            return new Double(System.Math.Log(x.getDouble()));
        }

        public static Object power(Object x, Object n)
        {
            return new Double(System.Math.Pow(x.getDouble(), n.getDouble()));
        }

        public static Object frac(Object x)
        {
            return new Double(x.getDouble() - floor(x).getDouble());
        }

        public static Object sqr(Object x)
        {
            double d = x.getDouble();
            return new Double(d * d);
        }

        public static Object point_distance(Object x1, Object y1, Object x2, Object y2)
        {
            Double xd = new Double(x2.getDouble() - x1.getDouble());
            Double yd = new Double(y2.getDouble() - y1.getDouble());
            return sqrt(new Double(sqr(xd).getDouble() + sqr(yd).getDouble()));
        }

        public static Object point_direction(Object x1, Object y1, Object x2, Object y2)
        {
            double basic =
                arctan2(new Double(y2.getDouble() - y1.getDouble()),
                    new Double(x2.getDouble() - x1.getDouble())).getDouble() / PI.getDouble();
            if (y1.getDouble() < y2.getDouble())
                return abs(new Double(180 + 180 * (1 - basic)));
            return abs(new Double(180 * basic));
        }

        public static Object lengthdir_x(Object len, Object dir)
        {
            return new Double(len.getDouble() * cos(degtorad(dir)).getDouble());
        }

        public static Object lengthdir_y(Object len, Object dir)
        {
            return new Double(len.getDouble() * -sin(degtorad(dir)).getDouble());
        }

        public static Object mean(params Object[] args)
        {
            if (args.Length == 0)
                return new Double(0);
            double total = 0;
            foreach (Object x in args)
                total += x.getDouble();
            return new Double(total / args.Length);
        }

        public static Object median(params Object[] args)
        {
            if (args.Length == 0)
                return new Double(0);
            if (args.Length % 2 == 1)
                return args[args.Length / 2];
            return mean(args[args.Length / 2], args[(args.Length / 2) - 1]);
        }
	}
}
