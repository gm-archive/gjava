using org.gcreator.Types;

namespace org.gcreator.Scripting
{
	public partial class GCL
	{
        [System.Obsolete("Game Maker 4 compatibility")]
        public static Object min3(Object a, Object b, Object c)
		{
			return min(a,b,c);
		}

        [System.Obsolete("Game Maker 4 compatibility")]
        public static Object max3(Object a, Object b, Object c)
		{
			return max(a,b,c);
		}
	}
}