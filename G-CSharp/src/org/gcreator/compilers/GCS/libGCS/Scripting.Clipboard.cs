using System.Collections.Generic;
using System.Text;
using org.gcreator.Types;
using org.gcreator.Components;
using System.Windows.Forms;

namespace org.gcreator.Scripting
{
    public partial class GCL
    {
        public static Object clipboard_has_text()
        {
            return new Boolean(Clipboard.ContainsText());
        }

        public static Object clipboard_get_text()
        {
            if (!clipboard_has_text().getBoolean())
                return new String("");
            return new String(Clipboard.GetText());
        }

        public static Object clipboard_set_text(Object str)
        {
            Clipboard.SetDataObject(str.getString().ToString(), true);
            return new Object();
        }

        public static Object clipboard_has_image()
        {
            return new Boolean(Clipboard.ContainsImage());
        }

        public static Object clipboard_set_image(Object img)
        {
            if(img!=null&&img is Image)
                Clipboard.SetDataObject(((Image) img).texture.Bitmap, true);
            return new Object();
        }
    }
}
