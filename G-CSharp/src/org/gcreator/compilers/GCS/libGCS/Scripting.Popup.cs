using org.gcreator.Components;
using org.gcreator.Types;
using System.Windows.Forms;

namespace org.gcreator.Scripting
{
    public partial class GCL
    {
        public static Object show_message(Object str)
        {
            MessageBox.Show(str.getString().ToString());
            return new Object();
        }

        public static Object show_error(Object str, Object abort)
        {
            MessageBox.Show(str.getString().ToString(), "Error!", MessageBoxButtons.OK, MessageBoxIcon.Error);
            if (abort.getBoolean())
                game_end();
            return new Object();
        }

        public static Object show_question(Object str)
        {
            DialogResult r = MessageBox.Show(str.getString().ToString(), "Question", MessageBoxButtons.YesNo, MessageBoxIcon.Question);
            if (r == DialogResult.Yes)
                return new Boolean(true);
            return new Boolean(false);
        }
    }
}