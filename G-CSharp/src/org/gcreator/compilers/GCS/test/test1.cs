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

class Actor2 : Actor
{
    public Actor2(int x, int y, int z)
        : base(x, y, z)
    {
        Sprite s;
        setSprite(s = new Sprite());
        s.setImageArray(new Image[]{
			new Image("graphics/small.png")
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
        setWidth(400);
        setHeight(400);
        setBackground(System.Drawing.Color.Red);
		base.addActor(new Actor2(5,5,0));
		//base.addActor(new Actor1(40,10,0));
		//base.addActor(new Actor1(10,40,0));
		//base.addActor(new Actor1(100,10,0));
	}
}

class Scene2 : Scene
{
    public override void Create()
    {
        setWidth(640);
        setHeight(480);
        setBackground(System.Drawing.Color.Green);
        //base.addActor(new Actor1(10, 10, 0));
        //base.addActor(new Actor1(40, 10, 0));
        //base.addActor(new Actor1(10, 40, 0));
        //base.addActor(new Actor1(100, 10, 0));
    }
}

public class Test1
{
	public static Scene[] scenelist = new Scene[]
	{
        //new Scene2(),
		new Scene1()
	};

	public static void Main()
	{
		SDL.Game game = new SDL.Game(scenelist, false, true, "Test1");
		game.Run();
	}
}