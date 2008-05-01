using org.gcreator.Types;

namespace org.gcreator.Scripting
{
	public partial class GCL
	{
		public static readonly Double PI = new Double(3.14159265358979324);
		public static readonly Double E = new Double(2.71828182845904523);

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

        public static double cbrt(Object value)
		{
            return System.Math.Pow(value.getDouble(), 1.0 / 3.0);
		}

		public static double ceil(Object value)
		{
            return System.Math.Ceiling(value.getDouble());
		}

		public static double floor(Object value)
		{
            return System.Math.Floor(value.getDouble());
		}

		public static double round(Object value)
		{
            return System.Math.Round(value.getDouble());
		}

		public static double cos(Object value)
		{
            return System.Math.Cos(value.getDouble());
		}

		public static double cosh(Object value)
		{
            return System.Math.Cosh(value.getDouble());
		}

		public static bool is_real(Object a)
		{
			return a is Number;
		}
		
		public static bool is_string(Object a)
		{
			return a is String;
		}

        public static double degtorad(Object deg)
		{
			return (deg.getDouble()*PI.getDouble())/180;
		}

        public static double radtodeg(Object rad)
		{
            return (rad.getDouble() * 180) / PI.getDouble();
		}
		
		public static double exp(Object x)
		{
			return System.Math.Pow(E.getDouble(),x.getDouble());
		}

		public static double expm1(Object x)
		{
			return (E.getDouble()*x.getDouble()) - 1;
		}

		public static int sign(Object _x)
		{
            double x = _x.getDouble();
			if(x<0)
				return -1;
			if(x==0)
				return 0;
			return 1;
		}

        public static Object min(Object a)
        {
            return a;
        }

		public static Object min(Object a, Object b)
		{
            return a.getDouble() < b.getDouble() ? a : b;
		}
		
		public static Object min(Object a, Object b, Object c)
		{
            return a.getDouble() < b.getDouble() ? min(a, c) : min(b, c);
		}
		
		public static Object min(Object a, Object b, Object c, Object d)
		{
			return min(min(a,b),min(c,d));
		}

        public static Object min(Object a, Object b, Object c, Object d, Object e)
		{
			return min(min(a,b),min(c,d,e));
		}
		
		public static Object min(Object a, Object b, Object c, Object d, Object e, Object f)
		{
			return min(min(a,b),min(c,d), min(e,f));
		}
		
		public static Object min(Object a, Object b, Object c, Object d, Object e, Object f, Object g)
		{
			return min(min(a,b,g),min(c,d), min(e,f));
		}
		
		public static Object min(Object a, Object b, Object c, Object d, Object e, Object f, Object g, Object h)
		{
			return min(min(a,b,g),min(c,d,h), min(e,f));
		}
		
		public static Object min(Object a, Object b, Object c, Object d, Object e, Object f, Object g, Object h, Object i)
		{
			return min(min(a,b,g),min(c,d,h), min(e,f,i));
		}
		
		public static Object min(Object a, Object b, Object c, Object d, Object e, Object f, Object g, Object h, Object i, Object j)
		{
			return min(min(a,b,g),min(c,d,h), min(e,f,i), j);
		}
		
		public static Object min(Object a, Object b, Object c, Object d, Object e, Object f, Object g, Object h, Object i, Object j, Object k)
		{
			return min(min(a,b,g),min(c,d,h), min(e,f,i), min(j,k));
		}
		
		public static Object min(Object a, Object b, Object c, Object d, Object e, Object f, Object g, Object h, Object i, Object j, Object k, Object l)
		{
			return min(min(a,b,g),min(c,d,h), min(e,f,i), min(j,k,l));
		}
		
		public static Object min(Object a, Object b, Object c, Object d, Object e, Object f, Object g, Object h, Object i, Object j, Object k, Object l, Object m)
		{
			return min(min(a,b,g),min(c,d,h), min(e,f,i), min(j,k,l), m);
		}
		
		public static Object min(Object a, Object b, Object c, Object d, Object e, Object f, Object g, Object h, Object i, Object j, Object k, Object l, Object m, Object n)
		{
			return min(min(a,b,g),min(c,d,h), min(e,f,i), min(j,k,l), min(m,n));
		}
		
		public static Object min(Object a, Object b, Object c, Object d, Object e, Object f, Object g, Object h, Object i, Object j, Object k, Object l, Object m, Object n, Object o)
		{
			return min(min(a,b,g),min(c,d,h), min(e,f,i), min(j,k,l), min(m,n,o));
		}
		
		public static Object min(Object a, Object b, Object c, Object d, Object e, Object f, Object g, Object h, Object i, Object j, Object k, Object l, Object m, Object n, Object o, Object p)
		{
			return min(min(a,b,g,p),min(c,d,h), min(e,f,i), min(j,k,l), min(m,n,o));
		}

        public static Object max(Object a)
        {
            return a;
        }

		public static Object max(Object a, Object b)
		{
            return a.getDouble() > b.getDouble() ? a : b;
		}
		
		public static Object max(Object a, Object b, Object c)
		{
            return a.getDouble() > b.getDouble() ? max(a, c) : max(b, c);
		}
		
		public static Object max(Object a, Object b, Object c, Object d)
		{
			return max(max(a,b),max(c,d));
		}
		
		public static Object max(Object a, Object b, Object c, Object d, Object e)
		{
			return max(max(a,b),max(c,d,e));
		}
		
		public static Object max(Object a, Object b, Object c, Object d, Object e, Object f)
		{
			return max(max(a,b),max(c,d), max(e,f));
		}
		
		public static Object max(Object a, Object b, Object c, Object d, Object e, Object f, Object g)
		{
			return max(max(a,b,g),max(c,d), max(e,f));
		}
		
		public static Object max(Object a, Object b, Object c, Object d, Object e, Object f, Object g, Object h)
		{
			return max(max(a,b,g),max(c,d,h), max(e,f));
		}
		
		public static Object max(Object a, Object b, Object c, Object d, Object e, Object f, Object g, Object h, Object i)
		{
			return max(max(a,b,g),max(c,d,h), max(e,f,i));
		}
		
		public static Object max(Object a, Object b, Object c, Object d, Object e, Object f, Object g, Object h, Object i, Object j)
		{
			return max(max(a,b,g),max(c,d,h), max(e,f,i), j);
		}
		
		public static Object max(Object a, Object b, Object c, Object d, Object e, Object f, Object g, Object h, Object i, Object j, Object k)
		{
			return max(max(a,b,g),max(c,d,h), max(e,f,i), max(j,k));
		}
		
		public static Object max(Object a, Object b, Object c, Object d, Object e, Object f, Object g, Object h, Object i, Object j, Object k, Object l)
		{
			return max(max(a,b,g),max(c,d,h), max(e,f,i), max(j,k,l));
		}
		
		public static Object max(Object a, Object b, Object c, Object d, Object e, Object f, Object g, Object h, Object i, Object j, Object k, Object l, Object m)
		{
			return max(max(a,b,g),max(c,d,h), max(e,f,i), max(j,k,l), m);
		}
		
		public static Object max(Object a, Object b, Object c, Object d, Object e, Object f, Object g, Object h, Object i, Object j, Object k, Object l, Object m, Object n)
		{
			return max(max(a,b,g),max(c,d,h), max(e,f,i), max(j,k,l), max(m,n));
		}
		
		public static Object max(Object a, Object b, Object c, Object d, Object e, Object f, Object g, Object h, Object i, Object j, Object k, Object l, Object m, Object n, Object o)
		{
			return max(max(a,b,g),max(c,d,h), max(e,f,i), max(j,k,l), max(m,n,o));
		}
		
		public static Object max(Object a, Object b, Object c, Object d, Object e, Object f, Object g, Object h, Object i, Object j, Object k, Object l, Object m, Object n, Object o, Object p)
		{
			return max(max(a,b,g,p),max(c,d,h), max(e,f,i), max(j,k,l), max(m,n,o));
		}
	}
}
