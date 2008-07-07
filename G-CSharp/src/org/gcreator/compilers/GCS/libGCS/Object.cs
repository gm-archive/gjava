using System.Collections.Generic;
using System.Text;

namespace org.gcreator.Types
{
    public class Object
    {
        Dictionary<string, Object> variables = new Dictionary<string, Object>();

        public virtual void setVariable(string key, Object o)
        {
            variables.Add(key, o);
        }

        public virtual Object getVariable(string key)
        {
            return variables[key];
        }

        public virtual Object getX()
        {
            return new Integer(0);
        }

        public virtual void setX(Object x)
        {

        }

        public virtual Object getY()
        {
            return new Integer(0);
        }

        public virtual void setY(Object y)
        {

        }

        public virtual Object getVisible()
        {
            return new Boolean(true);
        }

        public virtual void setVisible(Object visible)
        {

        }

        public virtual Object getGravity()
        {
            return new Integer(0);
        }

        public virtual void setGravity(Object gravity)
        {

        }

        public virtual Object getGravity_direction()
        {
            return new Integer(0);
        }

        public virtual void setGravity_direction(Object gravitydir)
        {

        }

        public virtual Object getHspeed()
        {
            return new Integer(0);
        }

        public virtual void setHspeed(Object speed)
        {

        }

        public virtual Object getVspeed()
        {
            return new Integer(0);
        }

        public virtual void setXprevious(Object prev)
        {

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

        public virtual void setVspeed(Object speed)
        {

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
