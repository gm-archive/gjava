namespace org.gcreator.Scripting
{
	public partial class GCL
	{
		public static readonly double PI = 3.14159265358979324;
		public static readonly double E = 2.71828182845904523;
	
		public static int abs(int value)
		{
			return value>0 ? value : 0-value;
		}
		
		public static double abs(double value)
		{
			return value>0 ? value : 0-value;
		}
		
		public static float abs(float value)
		{
			return value>0 ? value : 0-value;
		}

		public static double arccos(double value)
		{
			return System.Math.Acos(value);
		}

		public static double arcsin(double value)
		{
			return System.Math.Asin(value);
		}

		public static double arctan(double value)
		{
			return System.Math.Atan(value);
		}

		public static double arctan2(double y, double x)
		{
			return System.Math.Atan2(y,x);
		}
		
		public static double sqrt(double value)
		{
			return System.Math.Sqrt(value);
		}

		public static double cbrt(double value)
		{
			return System.Math.Pow(value, 1.0/3.0);
		}

		public static double ceil(double value)
		{
			return System.Math.Ceiling(value);
		}

		public static double floor(double value)
		{
			return System.Math.Floor(value);
		}

		public static double round(double value)
		{
			return System.Math.Round(value);
		}

		public static double cos(double value)
		{
			return System.Math.Cos(value);
		}

		public static double cosh(double value)
		{
			return System.Math.Cosh(value);
		}

		[System.Obsolete("No longer needed")]
		public static bool is_real(bool a)
		{
			return true;
		}
		
		[System.Obsolete("No longer needed")]
		public static bool is_real(int a)
		{
			return true;
		}
		
		[System.Obsolete("No longer needed")]
		public static bool is_real(double a)
		{
			return true;
		}
		
		[System.Obsolete("No longer needed")]
		public static bool is_real(float a)
		{
			return true;
		}
		
		[System.Obsolete("No longer needed")]
		public static bool is_real(string a)
		{
			return false;
		}
		
		[System.Obsolete("No longer needed")]
		public static bool is_string(bool a)
		{
			return false;
		}
		
		[System.Obsolete("No longer needed")]
		public static bool is_string(int a)
		{
			return false;
		}
		
		[System.Obsolete("No longer needed")]
		public static bool is_string(double a)
		{
			return false;
		}
		
		[System.Obsolete("No longer needed")]
		public static bool is_string(float a)
		{
			return false;
		}
		
		[System.Obsolete("No longer needed")]
		public static bool is_string(string a)
		{
			return true;
		}
		
		public static double degtorad(double deg)
		{
			return (deg*PI)/180;
		}
		
		public static double radtodeg(double rad)
		{
			return (rad*180)/PI;
		}
		
		public static float degtorad(float deg)
		{
			return (float) ((deg*PI)/180);
		}
		
		public static float radtodeg(float rad)
		{
			return (float) ((rad*180)/PI);
		}
		
		public static int degtorad(int deg)
		{
			return ((int) (deg*PI))/180;
		}
		
		public static int radtodeg(int rad)
		{
			return (int) ((rad*180)/PI);
		}
		
		public static double exp(double x)
		{
			return System.Math.Pow(E,x);
		}

		public static double expm1(double x)
		{
			return (E*x) - 1;
		}

		public static int sign(int x)
		{
			if(x<0)
				return -1;
			if(x==0)
				return 0;
			return 1;
		}
		
		public static int sign(double x)
		{
			if(x<0)
				return -1;
			if(x==0)
				return 0;
			return 1;
		}
		
		public static int sign(float x)
		{
			if(x<0)
				return -1;
			if(x==0)
				return 0;
			return 1;
		}
		
		public static int sign(bool x)
		{
			if(x)
				return 1;
			else
				return 0;
		}
		
		public static int min(int a)
		{
			return a;
		}
		
		public static int min(int a, int b)
		{
			return a<b ? a : b ;
		}
		
		public static int min(int a, int b, int c)
		{
			return a<b ? min(a,c) : min(b,c);
		}
		
		public static int min(int a, int b, int c, int d)
		{
			return min(min(a,b),min(c,d));
		}
		
		public static int min(int a, int b, int c, int d, int e)
		{
			return min(min(a,b),min(c,d,e));
		}
		
		public static int min(int a, int b, int c, int d, int e, int f)
		{
			return min(min(a,b),min(c,d), min(e,f));
		}
		
		public static int min(int a, int b, int c, int d, int e, int f, int g)
		{
			return min(min(a,b,g),min(c,d), min(e,f));
		}
		
		public static int min(int a, int b, int c, int d, int e, int f, int g, int h)
		{
			return min(min(a,b,g),min(c,d,h), min(e,f));
		}
		
		public static int min(int a, int b, int c, int d, int e, int f, int g, int h, int i)
		{
			return min(min(a,b,g),min(c,d,h), min(e,f,i));
		}
		
		public static int min(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j)
		{
			return min(min(a,b,g),min(c,d,h), min(e,f,i), j);
		}
		
		public static int min(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k)
		{
			return min(min(a,b,g),min(c,d,h), min(e,f,i), min(j,k));
		}
		
		public static int min(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k, int l)
		{
			return min(min(a,b,g),min(c,d,h), min(e,f,i), min(j,k,l));
		}
		
		public static int min(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k, int l, int m)
		{
			return min(min(a,b,g),min(c,d,h), min(e,f,i), min(j,k,l), m);
		}
		
		public static int min(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k, int l, int m, int n)
		{
			return min(min(a,b,g),min(c,d,h), min(e,f,i), min(j,k,l), min(m,n));
		}
		
		public static int min(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k, int l, int m, int n, int o)
		{
			return min(min(a,b,g),min(c,d,h), min(e,f,i), min(j,k,l), min(m,n,o));
		}
		
		public static int min(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k, int l, int m, int n, int o, int p)
		{
			return min(min(a,b,g,p),min(c,d,h), min(e,f,i), min(j,k,l), min(m,n,o));
		}
		
				public static float min(float a, float b)
		{
			return a<b ? a : b ;
		}
		
		public static float min(float a, float b, float c)
		{
			return a<b ? min(a,c) : min(b,c);
		}
		
		public static float min(float a, float b, float c, float d)
		{
			return min(min(a,b),min(c,d));
		}
		
		public static float min(float a, float b, float c, float d, float e)
		{
			return min(min(a,b),min(c,d,e));
		}
		
		public static float min(float a, float b, float c, float d, float e, float f)
		{
			return min(min(a,b),min(c,d), min(e,f));
		}
		
		public static float min(float a, float b, float c, float d, float e, float f, float g)
		{
			return min(min(a,b,g),min(c,d), min(e,f));
		}
		
		public static float min(float a, float b, float c, float d, float e, float f, float g, float h)
		{
			return min(min(a,b,g),min(c,d,h), min(e,f));
		}
		
		public static float min(float a, float b, float c, float d, float e, float f, float g, float h, float i)
		{
			return min(min(a,b,g),min(c,d,h), min(e,f,i));
		}
		
		public static float min(float a, float b, float c, float d, float e, float f, float g, float h, float i, float j)
		{
			return min(min(a,b,g),min(c,d,h), min(e,f,i), j);
		}
		
		public static float min(float a, float b, float c, float d, float e, float f, float g, float h, float i, float j, float k)
		{
			return min(min(a,b,g),min(c,d,h), min(e,f,i), min(j,k));
		}
		
		public static float min(float a, float b, float c, float d, float e, float f, float g, float h, float i, float j, float k, float l)
		{
			return min(min(a,b,g),min(c,d,h), min(e,f,i), min(j,k,l));
		}
		
		public static float min(float a, float b, float c, float d, float e, float f, float g, float h, float i, float j, float k, float l, float m)
		{
			return min(min(a,b,g),min(c,d,h), min(e,f,i), min(j,k,l), m);
		}
		
		public static float min(float a, float b, float c, float d, float e, float f, float g, float h, float i, float j, float k, float l, float m, float n)
		{
			return min(min(a,b,g),min(c,d,h), min(e,f,i), min(j,k,l), min(m,n));
		}
		
		public static float min(float a, float b, float c, float d, float e, float f, float g, float h, float i, float j, float k, float l, float m, float n, float o)
		{
			return min(min(a,b,g),min(c,d,h), min(e,f,i), min(j,k,l), min(m,n,o));
		}
		
		public static float min(float a, float b, float c, float d, float e, float f, float g, float h, float i, float j, float k, float l, float m, float n, float o, float p)
		{
			return min(min(a,b,g,p),min(c,d,h), min(e,f,i), min(j,k,l), min(m,n,o));
		}
		
				public static double min(double a, double b)
		{
			return a<b ? a : b ;
		}
		
		public static double min(double a, double b, double c)
		{
			return a<b ? min(a,c) : min(b,c);
		}
		
		public static double min(double a, double b, double c, double d)
		{
			return min(min(a,b),min(c,d));
		}
		
		public static double min(double a, double b, double c, double d, double e)
		{
			return min(min(a,b),min(c,d,e));
		}
		
		public static double min(double a, double b, double c, double d, double e, double f)
		{
			return min(min(a,b),min(c,d), min(e,f));
		}
		
		public static double min(double a, double b, double c, double d, double e, double f, double g)
		{
			return min(min(a,b,g),min(c,d), min(e,f));
		}
		
		public static double min(double a, double b, double c, double d, double e, double f, double g, double h)
		{
			return min(min(a,b,g),min(c,d,h), min(e,f));
		}
		
		public static double min(double a, double b, double c, double d, double e, double f, double g, double h, double i)
		{
			return min(min(a,b,g),min(c,d,h), min(e,f,i));
		}
		
		public static double min(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j)
		{
			return min(min(a,b,g),min(c,d,h), min(e,f,i), j);
		}
		
		public static double min(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k)
		{
			return min(min(a,b,g),min(c,d,h), min(e,f,i), min(j,k));
		}
		
		public static double min(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l)
		{
			return min(min(a,b,g),min(c,d,h), min(e,f,i), min(j,k,l));
		}
		
		public static double min(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m)
		{
			return min(min(a,b,g),min(c,d,h), min(e,f,i), min(j,k,l), m);
		}
		
		public static double min(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m, double n)
		{
			return min(min(a,b,g),min(c,d,h), min(e,f,i), min(j,k,l), min(m,n));
		}
		
		public static double min(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m, double n, double o)
		{
			return min(min(a,b,g),min(c,d,h), min(e,f,i), min(j,k,l), min(m,n,o));
		}
		
		public static double min(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m, double n, double o, double p)
		{
			return min(min(a,b,g,p),min(c,d,h), min(e,f,i), min(j,k,l), min(m,n,o));
		}
		
				public static int max(int a)
		{
			return a;
		}
		
		public static int max(int a, int b)
		{
			return a>b ? a : b ;
		}
		
		public static int max(int a, int b, int c)
		{
			return a>b ? max(a,c) : max(b,c);
		}
		
		public static int max(int a, int b, int c, int d)
		{
			return max(max(a,b),max(c,d));
		}
		
		public static int max(int a, int b, int c, int d, int e)
		{
			return max(max(a,b),max(c,d,e));
		}
		
		public static int max(int a, int b, int c, int d, int e, int f)
		{
			return max(max(a,b),max(c,d), max(e,f));
		}
		
		public static int max(int a, int b, int c, int d, int e, int f, int g)
		{
			return max(max(a,b,g),max(c,d), max(e,f));
		}
		
		public static int max(int a, int b, int c, int d, int e, int f, int g, int h)
		{
			return max(max(a,b,g),max(c,d,h), max(e,f));
		}
		
		public static int max(int a, int b, int c, int d, int e, int f, int g, int h, int i)
		{
			return max(max(a,b,g),max(c,d,h), max(e,f,i));
		}
		
		public static int max(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j)
		{
			return max(max(a,b,g),max(c,d,h), max(e,f,i), j);
		}
		
		public static int max(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k)
		{
			return max(max(a,b,g),max(c,d,h), max(e,f,i), max(j,k));
		}
		
		public static int max(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k, int l)
		{
			return max(max(a,b,g),max(c,d,h), max(e,f,i), max(j,k,l));
		}
		
		public static int max(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k, int l, int m)
		{
			return max(max(a,b,g),max(c,d,h), max(e,f,i), max(j,k,l), m);
		}
		
		public static int max(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k, int l, int m, int n)
		{
			return max(max(a,b,g),max(c,d,h), max(e,f,i), max(j,k,l), max(m,n));
		}
		
		public static int max(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k, int l, int m, int n, int o)
		{
			return max(max(a,b,g),max(c,d,h), max(e,f,i), max(j,k,l), max(m,n,o));
		}
		
		public static int max(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k, int l, int m, int n, int o, int p)
		{
			return max(max(a,b,g,p),max(c,d,h), max(e,f,i), max(j,k,l), max(m,n,o));
		}
		
				public static float max(float a, float b)
		{
			return a>b ? a : b ;
		}
		
		public static float max(float a, float b, float c)
		{
			return a>b ? max(a,c) : max(b,c);
		}
		
		public static float max(float a, float b, float c, float d)
		{
			return max(max(a,b),max(c,d));
		}
		
		public static float max(float a, float b, float c, float d, float e)
		{
			return max(max(a,b),max(c,d,e));
		}
		
		public static float max(float a, float b, float c, float d, float e, float f)
		{
			return max(max(a,b),max(c,d), max(e,f));
		}
		
		public static float max(float a, float b, float c, float d, float e, float f, float g)
		{
			return max(max(a,b,g),max(c,d), max(e,f));
		}
		
		public static float max(float a, float b, float c, float d, float e, float f, float g, float h)
		{
			return max(max(a,b,g),max(c,d,h), max(e,f));
		}
		
		public static float max(float a, float b, float c, float d, float e, float f, float g, float h, float i)
		{
			return max(max(a,b,g),max(c,d,h), max(e,f,i));
		}
		
		public static float max(float a, float b, float c, float d, float e, float f, float g, float h, float i, float j)
		{
			return max(max(a,b,g),max(c,d,h), max(e,f,i), j);
		}
		
		public static float max(float a, float b, float c, float d, float e, float f, float g, float h, float i, float j, float k)
		{
			return max(max(a,b,g),max(c,d,h), max(e,f,i), max(j,k));
		}
		
		public static float max(float a, float b, float c, float d, float e, float f, float g, float h, float i, float j, float k, float l)
		{
			return max(max(a,b,g),max(c,d,h), max(e,f,i), max(j,k,l));
		}
		
		public static float max(float a, float b, float c, float d, float e, float f, float g, float h, float i, float j, float k, float l, float m)
		{
			return max(max(a,b,g),max(c,d,h), max(e,f,i), max(j,k,l), m);
		}
		
		public static float max(float a, float b, float c, float d, float e, float f, float g, float h, float i, float j, float k, float l, float m, float n)
		{
			return max(max(a,b,g),max(c,d,h), max(e,f,i), max(j,k,l), max(m,n));
		}
		
		public static float max(float a, float b, float c, float d, float e, float f, float g, float h, float i, float j, float k, float l, float m, float n, float o)
		{
			return max(max(a,b,g),max(c,d,h), max(e,f,i), max(j,k,l), max(m,n,o));
		}
		
		public static float max(float a, float b, float c, float d, float e, float f, float g, float h, float i, float j, float k, float l, float m, float n, float o, float p)
		{
			return max(max(a,b,g,p),max(c,d,h), max(e,f,i), max(j,k,l), max(m,n,o));
		}
		
		public static double max(double a, double b)
		{
			return a>b ? a : b ;
		}
		
		public static double max(double a, double b, double c)
		{
			return a>b ? max(a,c) : max(b,c);
		}
		
		public static double max(double a, double b, double c, double d)
		{
			return max(max(a,b),max(c,d));
		}
		
		public static double max(double a, double b, double c, double d, double e)
		{
			return max(max(a,b),max(c,d,e));
		}
		
		public static double max(double a, double b, double c, double d, double e, double f)
		{
			return max(max(a,b),max(c,d), max(e,f));
		}
		
		public static double max(double a, double b, double c, double d, double e, double f, double g)
		{
			return max(max(a,b,g),max(c,d), max(e,f));
		}
		
		public static double max(double a, double b, double c, double d, double e, double f, double g, double h)
		{
			return max(max(a,b,g),max(c,d,h), max(e,f));
		}
		
		public static double max(double a, double b, double c, double d, double e, double f, double g, double h, double i)
		{
			return max(max(a,b,g),max(c,d,h), max(e,f,i));
		}
		
		public static double max(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j)
		{
			return max(max(a,b,g),max(c,d,h), max(e,f,i), j);
		}
		
		public static double max(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k)
		{
			return max(max(a,b,g),max(c,d,h), max(e,f,i), max(j,k));
		}
		
		public static double max(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l)
		{
			return max(max(a,b,g),max(c,d,h), max(e,f,i), max(j,k,l));
		}
		
		public static double max(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m)
		{
			return max(max(a,b,g),max(c,d,h), max(e,f,i), max(j,k,l), m);
		}
		
		public static double max(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m, double n)
		{
			return max(max(a,b,g),max(c,d,h), max(e,f,i), max(j,k,l), max(m,n));
		}
		
		public static double max(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m, double n, double o)
		{
			return max(max(a,b,g),max(c,d,h), max(e,f,i), max(j,k,l), max(m,n,o));
		}
		
		public static double max(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m, double n, double o, double p)
		{
			return max(max(a,b,g,p),max(c,d,h), max(e,f,i), max(j,k,l), max(m,n,o));
		}
	}
}
