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

        public Object getGravity()
        {
            return new Double(gravity);
        }

        public Object getGravity_direction()
        {
            return new Double(gravitydir);
        }

        public void setGravity(Object gravity)
        {
            this.gravity = gravity.getDouble();
        }

        public void setGravity_direction(Object direction)
        {
            gravitydir = direction.getDouble();
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

        public Object isVisible()
        {
            return new Boolean(visible);
        }

        public void setVisible(Object visible)
        {
            this.visible = visible.getBoolean();
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

        public Object getSpeed()
        {
            return new Double(System.Math.Sqrt(hspeed*hspeed+vspeed*vspeed));
        }

        private Object lastdir = null;

        public Object getDirection()
        {
            if (hspeed == 0)
            {
                if (vspeed == 0)
                {
                    if (lastdir != null)
                        return new Double(lastdir.getDouble());
                    return new Double(0);
                }
                if (vspeed > 0)
                    return new Double(270);
                return new Double(90);
            }
            return new Double(System.Math.Atan((0-vspeed)/hspeed)*180/System.Math.PI);
        }

        public void setSpeed(Object speed)
        {
            hspeed = System.Math.Sin(getDirection().getDouble() * System.Math.PI / 180) * speed.getDouble();
            vspeed = 0 - System.Math.Cos(getDirection().getDouble() * System.Math.PI / 180) * speed.getDouble();
        }

        public void setDirection(Object direction)
        {
            lastdir = direction;
            hspeed = System.Math.Sin(direction.getDouble() * System.Math.PI / 180) * getSpeed().getDouble();
            vspeed = 0 - System.Math.Cos(direction.getDouble() * System.Math.PI / 180) * getSpeed().getDouble();
        }
		
		public void Loop(){
			BeginStep();
			x += (int) hspeed;
			y += (int) vspeed;

            hspeed += System.Math.Sin(gravitydir * System.Math.PI/180) * gravity;
            vspeed -= System.Math.Cos(gravitydir * System.Math.PI / 180) * gravity;

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
