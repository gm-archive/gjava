using org.gcreator.Types;
using org.gcreator.Support;

namespace org.gcreator.Components
{
	public class Actor : org.gcreator.Scripting.GCL
    {
        private int x, y, z, spritepos, spritemovdelay, spritet, spritett = 0;
        //spritet-current position(only on -1 mode)
        //spritett-time to fill delay
        private Sprite sprite = null;
        private double gravity, gravitydir;
        private bool visible, solid, persistent;
		private int startx, starty;
		private double hspeed, vspeed;
		
		public Actor(Object x, Object y, Object z)
		{
			this.x = x.getInt();
			this.y = y.getInt();
			this.z = z.getInt();
			this.startx = this.x;
			this.starty = this.y;
			this.self = this;
		}		
		
		public Actor(int x, int y, int z)
			: this(new Integer(x), new Integer(y), new Integer(z))
		{
		}
		
		public int getStartingX()
		{
			return startx;
		}
		
		public int getStartingY()
		{
			return starty;
		}
		
        public int getSpritePosition()
        {
            return spritepos;
        }

        public int getSpriteMovingDelay()
        {
            return spritemovdelay;
        }

        public void setSpritePosition(int spritepos)
        {
            this.spritepos = spritepos;
        }

        public int getCurrentSpritePosition()
        {
            if (spritepos != -1)
                return spritepos;
            return spritet;
        }

        public void setSpriteMovingDelay(int delay)
        {
            spritemovdelay = delay;
        }

        public Sprite getSprite()
        {
            return sprite;
        }

        public void setSprite(Sprite sprite)
        {
            this.sprite = sprite;
        }

        public double getGravity()
        {
            return gravity;
        }

        public double getGravityDirection()
        {
            return gravitydir;
        }

        public void setGravity(double gravity)
        {
            this.gravity = gravity;
        }

        public void setGravityDirection(double direction)
        {
            gravitydir = direction;
        }

        public void setX(Object x)
        {
            this.x = x.getInt();
        }

        public void setY(Object y)
        {
            this.y = y.getInt();
        }

        public void setDepth(int depth)
        {
            z = depth;
        }

        public Object getX()
        {
            return new Integer(x);
        }

        public Object getY()
        {
            return new Integer(y);
        }

        public int getDepth()
        {
            return z;
        }

        public bool isSolid()
        {
            return solid;
        }

        public void setSolid(bool solid)
        {
            this.solid = solid;
        }

        public bool isVisible()
        {
            return visible;
        }

        public void setVisible(bool visible)
        {
            this.visible = visible;
        }
		
		public bool isPersistent()
        {
            return persistent;
        }

        public void setPersistent(bool persistent)
        {
            this.persistent = persistent;
        }
		
		public Object getHspeed(){
			return new Double(hspeed);
		}
		
		public Object getVspeed(){
			return new Double(vspeed);
		}
		
		public Object setHspeed(Object hspeed){
			this.hspeed = hspeed.getDouble();
			return new Object();
		}
		
		public Object setVspeed(Object vspeed){
			this.vspeed = vspeed.getDouble();
			return new Object();
		}
		
		public void Loop(){
			BeginStep();
			x += (int) hspeed;
			y += (int) vspeed;
			MouseCheck();
			KeyboardCheck();
			spritett++;
			if(spritett >= spritemovdelay)
			{
				spritett = 0;
				spritet++;
				if(sprite!=null&&spritet>=sprite.getImageCount())
				{
					spritet = 0;
				}
			}
			Step();
			CollisionCheck();
			EndStep();
		}
		public virtual void MouseCheck(){} //Call Mouse events
		public virtual void KeyboardCheck(){} //Call Keyboard events
		public virtual void BeginStep(){}
		public virtual void Step(){}
		public virtual void EndStep(){}
		public virtual void Draw()
		{
			//Unless otherwise specified
			Native.SDL.DrawToSurface(
				sprite.getImage(getCurrentSpritePosition()),
				Native.SDL.Game.game.cursurface,
				new Rectangle(x - sprite.getOriginX(), y - sprite.getOriginY(), sprite.getWidth(), sprite.getHeight()));
		}
		public virtual void CollisionCheck(){} //TODO: Check collisions/solid
		public virtual void Create(){}
    }
}
