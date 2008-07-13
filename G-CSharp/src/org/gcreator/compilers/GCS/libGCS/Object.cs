using System.Collections.Generic;
using System.Text;

namespace org.gcreator.Types
{
	
    public class Object
    {
        Dictionary<string, Object> variables = new Dictionary<string, Object>();

		public static Object Global = new Object();
		
        public virtual void setVariable(string key, Object o)
        {
                if (variables.ContainsKey(key))
                    variables[key] = o;
                else
                    variables.Add(key, o);
        }

        public virtual Object getVariable(string key)
        {
			if(key=="fps")
				return new Integer(SdlDotNet.Core.Events.Fps);
            return variables[key];
        }

        public virtual Object getX()
        {
			int i = getInt();
			if(i>10000){
				return ((Object) org.gcreator.Native.SDL.Game.game.currentScene.actors[i-10000]).getX();
			}
            return new Integer(0);
        }

        public virtual Object setX(Object x)
        {
			int i = getInt();
			if(i>10000){
				return ((Object) org.gcreator.Native.SDL.Game.game.currentScene.actors[i-10000]).setX(x);
			}
            return new Integer(0);
        }

        public virtual Object getY()
        {
			int i = getInt();
			if(i>10000){
				return ((Object) org.gcreator.Native.SDL.Game.game.currentScene.actors[i-10000]).getY();
			}
            return new Integer(0);
        }

        public virtual Object setY(Object y)
        {
			int i = getInt();
			if(i>10000){
				return ((Object) org.gcreator.Native.SDL.Game.game.currentScene.actors[i-10000]).setY(y);
			}
			return new Integer(0);
        }

        public virtual Object getVisible()
        {
			int i = getInt();
			if(i>10000){
				return ((Object) org.gcreator.Native.SDL.Game.game.currentScene.actors[i-10000]).getVisible();
			}
            return new Boolean(true);
        }

        public virtual Object setVisible(Object visible)
        {
			int i = getInt();
			if(i>10000){
				return ((Object) org.gcreator.Native.SDL.Game.game.currentScene.actors[i-10000]).setVisible(visible);
			}
            return new Boolean(true);
        }

        public virtual Object getGravity()
        {
			int i = getInt();
			if(i>10000){
				return ((Object) org.gcreator.Native.SDL.Game.game.currentScene.actors[i-10000]).getGravity();
			}
            return new Integer(0);
        }

        public virtual Object setGravity(Object gravity)
        {
			int i = getInt();
			if(i>10000){
				return ((Object) org.gcreator.Native.SDL.Game.game.currentScene.actors[i-10000]).setGravity(gravity);
			}
			return new Integer(0);
        }

        public virtual Object getGravity_direction()
        {
			int i = getInt();
			if(i>10000){
				return ((Object) org.gcreator.Native.SDL.Game.game.currentScene.actors[i-10000]).getGravity_direction();
			}
            return new Integer(0);
        }

        public virtual Object setGravity_direction(Object gd)
        {
			int i = getInt();
			if(i>10000){
				return ((Object) org.gcreator.Native.SDL.Game.game.currentScene.actors[i-10000]).setGravity_direction(gd);
			}
			return new Integer(0);
        }

        public virtual Object setHspeed(Object hspeed)
        {
			int i = getInt();
			if(i>10000){
				return ((Object) org.gcreator.Native.SDL.Game.game.currentScene.actors[i-10000]).setHspeed(hspeed);
			}
			return new Integer(0);
        }
		
		public virtual Object getHspeed()
        {
			int i = getInt();
			if(i>10000){
				return ((Object) org.gcreator.Native.SDL.Game.game.currentScene.actors[i-10000]).getHspeed();
			}
            return new Integer(0);
        }
		
		public virtual Object setVspeed(Object vspeed)
        {
			int i = getInt();
			if(i>10000){
				return ((Object) org.gcreator.Native.SDL.Game.game.currentScene.actors[i-10000]).setVspeed(vspeed);
			}
			return new Integer(0);
        }
		
		public virtual Object getVspeed()
        {
			int i = getInt();
			if(i>10000){
				return ((Object) org.gcreator.Native.SDL.Game.game.currentScene.actors[i-10000]).getVspeed();
			}
            return new Integer(0);
        }

        public virtual Object getXPrevious()
        {
            return new Integer(0);
        }
        

        public virtual void setYprevious(Object prev)
        {

        }

        public virtual Object getYPrevious()
        {
            return new Integer(0);
        }

        public virtual Object getSpeed()
        {
            return new Integer(0);
        }

        public virtual void setSpeed(Object speed)
        {

        }

        public virtual Object getDirection()
        {
            return new Integer(0);
        }

        public virtual void setDirection(Object directory)
        {

        }

        public virtual bool isInstanceOf(Object obj)
        {
            return obj is Object;
        }

        public virtual Boolean equals(Object obj)
        {
            return new Boolean(this == obj);
        }

        public virtual Boolean nequals(Object obj)
        {
            return new Boolean(this != obj);
        }

        public virtual Object not()
        {
            return new Boolean(!this.getBoolean());
        }

        public virtual Object negate()
        {
            return this;
        }

        public virtual Object bnegate()
        {
            return this;
        }

        public virtual Boolean gt(Object obj)
        {
            return new Boolean(false);
        }

        public virtual Boolean gte(Object obj)
        {
            return new Boolean(false);
        }

        public virtual Boolean lt(Object obj)
        {
            return new Boolean(false);
        }

        public virtual Boolean lte(Object obj)
        {
            return new Boolean(false);
        }

        public virtual Object sub(Object o)
        {
            return o;
        }

        public virtual Object add(Object o)
        {
            return o;
        }

        public virtual Object mult(Object o)
        {
            return o;
        }

        public virtual Object div(Object o)
        {
            return o;
        }

        public virtual Object setsub(Object o)
        {
            return o;
        }

        public virtual Object setadd(Object o)
        {
            return o;
        }

        public virtual Object setmult(Object o)
        {
            return o;
        }

        public virtual Object setdiv(Object o)
        {
            return o;
        }

        public virtual Object and(Object o)
        {
            return o;
        }

        public virtual Object or(Object o)
        {
            return o;
        }

        public virtual Object xor(Object o)
        {
            return o;
        }

        public virtual Object band(Object o)
        {
            return o;
        }

        public virtual Object bor(Object o)
        {
            return o;
        }

        public virtual Object bxor(Object o)
        {
            return o;
        }

        public virtual Object setband(Object o)
        {
            return o;
        }

        public virtual Object setbor(Object o)
        {
            return o;
        }

        public virtual Object setbxor(Object o)
        {
            return o;
        }

        public virtual Object mod(Object o)
        {
            return o;
        }

        public virtual Object bleft(Object o)
        {
            return o;
        }

        public virtual Object bright(Object o)
        {
            return o;
        }

        public virtual double getDouble()
        {
            return 0;
        }

        public virtual int getInt()
        {
            return (int)getDouble();
        }

        public virtual float getFloat()
        {
            return 0;
        }

        public virtual bool getBoolean()
        {
            return getInt()!=0;
        }

        public virtual String getString()
        {
            return new String("");
        }
    }
}
