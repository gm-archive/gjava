using org.gcreator.Types;

namespace org.gcreator.Scripting
{
    public partial class GCL
    {
        public static Object mouse_x
        {
            get
            {
                return new Double((double)SdlDotNet.Input.Mouse.MousePosition.X);
            }
        }

        public static Object mouse_y
        {
            get
            {
                return new Double((double)SdlDotNet.Input.Mouse.MousePosition.Y);
            }
        }
    }
}
