/*This is the first G-C# test*/

//gmcs test1.cs -out:test1.exe -r:libGCS.dll

using org.gcreator.Components;
using org.gcreator.Native;
using org.gcreator.Support;

class Actor1 : Actor
{
	public Actor1(int x, int y, int z) : base(x,y,z)
	{
		Sprite s;
		setSprite(s = new Sprite());
		s.setImageArray(new Image[]{
			new Image("graphics/Minimize.png")
		});
		setSpritePosition(0);
	}
	/*public override void Draw()
	{
		//SDL.DrawToSurface(getSprite().getImageArray()[0], SDL.Game.game.master, new Rectangle(0,0,30,30));
	}*/
}

class Scene1 : Scene
{
	public override void Create()
	{
		base.addActor(new Actor1(10,10,0));
		base.addActor(new Actor1(40,10,0));
		base.addActor(new Actor1(10,40,0));
		base.addActor(new Actor1(100,10,0));
	}
}

public class Test1
{
	public static Scene[] scenelist = new Scene[]
	{
		new Scene1()
	};

	public static void Main()
	{
		SDL.Game game = new SDL.Game(scenelist, false, true, 800, 600, "Test1");
		game.Run();
	}
}