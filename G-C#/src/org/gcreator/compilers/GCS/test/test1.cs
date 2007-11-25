/*This is the first G-C# test*/

using org.gcreator.Components;

public class Test1
{
	public static void Main()
	{
		org.gcreator.Native.XNA.Start(new Scene[]{new Scene()});
		Image a = new Image("./Minimize.png");
	}
}
