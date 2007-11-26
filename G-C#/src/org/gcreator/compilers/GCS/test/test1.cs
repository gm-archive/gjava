/*This is the first G-C# test*/

//gmcs test1.cs -out:test1.exe -r:Microsoft.Xna.Framework.dll -r:Microsoft.Xna.Framework.Game.dll -r:libGCS.dll

using org.gcreator.Components;
using org.gcreator.Native;
using Microsoft.Xna.Framework.Graphics;

class Scene1 : Scene
{
	private Image img = null;
	public override void Draw()
	{
		if(img==null)
			img = new Image("graphics/Minimize.png");
		Texture2D t = XNA.getTexture(img);
		System.Console.WriteLine("Printing 0, 0, " + t.Width + ", " + t.Height);
		XNA.batch.Draw(t, new Microsoft.Xna.Framework.Rectangle(0,0,t.Width,t.Height), new Microsoft.Xna.Framework.Rectangle(0,0,t.Width,t.Height), Microsoft.Xna.Framework.Graphics.Color.White);
	}
}

public class Test1
{
	public static Scene[] scenelist = new Scene[]{
		new Scene1()
	};

	public static void Main()
	{
		XNA.Start(scenelist);
	}
}
