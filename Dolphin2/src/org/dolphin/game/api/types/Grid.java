package org.dolphin.game.api.types;

public class Grid {
	Object[][] o;
	double width=0,height=0;
	 public Grid(double width, double height){
	        o = new Object[(int)width][(int)height];
	        this.width=width;
	        this.height=height;
	    }
	    
	    public void destroy()
	    {
	        o=null;
	    }
	    
	    public void resize(double width,double height){
	    	
	    	  o = (Object[][])resizeArray(o,width); //resize width
	    	    // now resize height
	    	  for (int i=0; i<o.length; i++) {
	    	     if (o[i] == null)
	    	        o[i] = new Object[(int)height];
	    	      else o[i] = (Object[])resizeArray(o[i],(int)height); }
	    	  this.width=width;
	    	  this.height=height;
	    }
	    
	    public double width(){
	    	return width;
	    }
	    public double height(){
	    	return height;
	    }
	    
	    
	    /**
	    * Reallocates an array with a new size, and copies the contents
	    * of the old array to the new array.
	    * @param oldArray  the old array, to be reallocated.
	    * @param newSize   the new array size.
	    * @return          A new array with the same contents.
	    */
	    private static Object resizeArray (Object oldArray, double newSize) {
	       int oldSize = java.lang.reflect.Array.getLength(oldArray);
	       Class elementType = oldArray.getClass().getComponentType();
	       Object newArray = java.lang.reflect.Array.newInstance(
	             elementType,(int)newSize);
	       int preserveLength = Math.min(oldSize,(int)newSize);
	       if (preserveLength > 0)
	          System.arraycopy (oldArray,0,newArray,0,preserveLength);
	       return newArray; }
}
