using System.Collections.Generic;
using System.Linq;
using System.Text;
using org.gcreator.Types;
using System.Windows.Forms;

namespace org.gcreator.Scripting
{
    public partial class GCL
    {
        public static Object clipboard_has_text()
        {
            IDataObject iData = Clipboard.GetDataObject();

            return new Boolean(iData.GetDataPresent(DataFormats.Text));
        }

        public static Object clipboard_get_text()
        {
            if (!clipboard_has_text().getBoolean())
                return new String("");
            IDataObject iData = Clipboard.GetDataObject();
            return new String((string) iData.GetData(DataFormats.Text));
        }

        public static Object clipboard_set_text(Object str)
        {
            Clipboard.SetDataObject(str.getString().ToString(), true);
            return new Object();
        }
    }
}
