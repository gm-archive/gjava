using org.gcreator.Types;
using org.gcreator.Support;

namespace org.gcreator.Components
{
	public class Actor : org.gcreator.Scripting.GCL
    {
        private int x, y, z;
        private int xprevious, yprevious;
        private int spritepos, spritemovdelay, spritet, spritett = 0;
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
            this.xprevious = this.x;
            this.yprevious = this.y;
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

        public override Object getGravity()
        {
            return new Double(gravity);
        }

        public override Object getGravity_direction()
        {
            return new Double(gravitydir);
        }

        public override void setGravity(Object gravity)
        {
            this.gravity = gravity.getDouble();
        }

        public override void setGravity_direction(Object direction)
        {
            gravitydir = direction.getDouble();
        }

        public override void setX(Object x)
        {
            this.x = x.getInt();
        }

        public override void setY(Object y)
        {
            this.y = y.getInt();
        }

        public void setDepth(int depth)
        {
            z = depth;
        }

        public override Object getX()
        {
            return new Integer(x);
        }

        public override Object getY()
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

        public override Object getVisible()
        {
            return new Boolean(visible);
        }

        public override void setVisible(Object visible)
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
		
		public override Object getHspeed(){
			return new Double(hspeed);
		}
		
		public override Object getVspeed(){
			return new Double(vspeed);
		}
		
		public override void setHspeed(Object hspeed){
			this.hspeed = hspeed.getDouble();
		}
		
		public override void setVspeed(Object vspeed){
			this.vspeed = vspeed.getDouble();
		}

        public override Object getSpeed()
        {
            return new Double(System.Math.Sqrt(hspeed*hspeed+vspeed*vspeed));
        }

        private Object lastdir = null;

        public override Object getDirection()
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

        public override void setSpeed(Object speed)
        {
            hspeed = System.Math.Sin(getDirection().getDouble() * System.Math.PI / 180) * speed.getDouble();
            vspeed = 0 - System.Math.Cos(getDirection().getDouble() * System.Math.PI / 180) * speed.getDouble();
        }

        public override void setDirection(Object direction)
        {
            lastdir = direction;
            hspeed = System.Math.Sin(direction.getDouble() * System.Math.PI / 180) * getSpeed().getDouble();
            vspeed = 0 - System.Math.Cos(direction.getDouble() * System.Math.PI / 180) * getSpeed().getDouble();
        }
		
		public void Loop(){
			BeginStep();
            xprevious = x;
            yprevious = y;
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

		public void CollisionCheck()
        {
            if (sprite == null)
                return;
            foreach (object o in Native.SDL.Game.game.currentScene.actors)
            {
                if (o!=null&&o is Actor)
                {
                    Actor a2 = o as Actor;
                    if (a2.sprite != null)
                    {
                        Sprite s1 = sprite;
                        Sprite s2 = a2.sprite;
                        Actor a1 = this;
                        if (a1.x - s1.getOriginX() < a2.x - s2.getOriginX() + s2.getWidth() &&
                            a1.x - s1.getOriginX() + s1.getWidth() > a2.x - s2.getOriginX() &&
                            a1.y - s1.getOriginY() < a2.y - s2.getOriginY() + s2.getHeight() &&
                            a1.y - s1.getOriginY() + s1.getHeight() > a2.y - s2.getOriginY())
                        {
                            setVariable("other", a2);
                            CollisionWith(a2);
                        }
                    }
                }
            }
        }

        public virtual void CollisionWith(Actor other){}

		public virtual void Create(){}
    }
}
