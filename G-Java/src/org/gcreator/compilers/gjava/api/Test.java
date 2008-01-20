/*
 * 
 */
package org.gcreator.compilers.gjava.api;

/**
 * This class is just for testing the API
 * @author TGMG
 */
class Test extends Actor {
Object varname1,v,v2,v3,v4,v5,v6,v7,v8,v9= new Object();

    public Test() {
        long start=0,average=0;
        long end=0;
        Integer iii;
        int iiii;
        Actor self = new Actor();
        for(int ii=0; ii<20; ii++) {
        
        start=System.currentTimeMillis();
        for(int i=0; i<69998; i++)
        {
           { 
self.setX((new Integer(23)));
self.setVariable("color",(new String("$FFAA00")));
self.setVariable("str",(new String("hello world")));
self.setVariable("str",(new String("hello world")));
self.setY(self.getY().setadd((new Integer(5))));
self.setX(self.getX().setmult(self.getY()));
self.setX(self.getY() .bleft((new Integer(2))));
self.setX(self.getY() .bright((new Integer(2))));
self.setX((new Integer(23)) .mult( ( ((new Integer(2)) .add((new Integer(4)))) .div(sin(self.getY())))));
self.setVariable("str",(new String("hello")) .add((new String(" world"))));
self.setVariable("b", (self.getX().lt((new Integer(5))))  .and  ( ( (self.getX().equals((new Integer(2)))  .or  (self.getX().equals((new Integer(4)))))).not()));
self.setVariable("b", (self.getX().lte((new Integer(5))))  .and  ( ( (self.getX().gt((new Integer(2)))  .xor  (self.getX().gt((new Integer(4)))))).not()));
self.setVariable("b", (self.getX().notequals((new Integer(3)))));
//self.setVariable("b",show_message((new String(""))).negate());
self.setVariable("b",self.getVariable("true"));
self.setVariable("b",self.getVariable("false"));
self.setVariable("b",(new Integer(3)) .band((new Integer(4))));
self.setVariable("b",(new Integer(3)) .bxor((new Integer(4))));
self.setVariable("b",(new Integer(3)) .bor((new Integer(4))));
self.setVariable("b",(new Integer(3)) .add((new Integer(4)) .mult((new Integer(2)) .mod((new Integer(2))))));
self.setVariable("b", (self.getVariable("b") .div((new Integer(2)))).negate());
self.setVariable("b", (self.getVariable("b") .div((new Integer(2)))).bnegate());

 }
        }
        end=System.currentTimeMillis();
        System.out.println("G-Script: "+(end-start));
        average += end-start;
        
//        start=System.currentTimeMillis();
//        for(int i=0; i<9998; i++)
//        {
//           iiii = i;
//        }
//        end=System.currentTimeMillis();
//        System.out.println("Native: "+(end-start));
        }
        average /= 20;
        System.out.println("G-Script average"+average);
        }
    
    Test(int i)
    {
        function();
    }
    
    Test(java.lang.String s)
    {
        //do nothing
        
    }

    public void function() {
     Test self = new Test("");
     self.setVariable("varname1",(new Integer(3)));
     System.out.println(""+self.getVariable("varname1").getDouble());
        self.getVariable("varname1").setadd((new Integer(3)));
        System.out.println(""+self.getVariable("varname1").getDouble());
        
        self.setVariable("varname1",(new Integer(3)));
 self.setVariable("varname1",self.getVariable("varname1").setmult((new Integer(3)) .sub((new Integer(4)))));
 self.setVariable("varname1",self.getVariable("varname1").setsub((new Integer(3)) .sub((new Integer(4)))));
 self.setVariable("varname1",self.getVariable("varname1").setadd((new Integer(3)) .sub((new Integer(4)))));
 self.setVariable("varname1",(new Integer(3)) .sub((new Integer(4))));
 self.setVariable("varname1",self.getVariable("varname1").setdiv((new Integer(3)) .sub((new Integer(4)))));
 self.setVariable("varname1",self.getVariable("varname1").setbor((new Integer(3)) .sub((new Integer(4)))));
 self.setVariable("varname1",self.getVariable("varname1").setbxor((new Integer(3)) .sub((new Integer(4)))));
 
{ 
self.setVariable("x",(new Integer(23)));
self.setVariable("color",(new String("$FFAA00")));
self.setVariable("str",(new String("hello world")));
self.setVariable("str",(new String("hello world")));
self.setVariable("y",self.getVariable("y").setadd((new Integer(5))));
self.setVariable("x",self.getVariable("x").setmult(self.getVariable("y")));
self.setVariable("x",self.getVariable("y") .bleft((new Integer(2))));
self.setVariable("x",self.getVariable("y") .bright((new Integer(2))));
self.setVariable("x",(new Integer(23)) .mult( ( ((new Integer(2)) .add((new Integer(4)))) .div(sin(self.getVariable("y"))))));
self.setVariable("str",(new String("hello")) .add((new String(" world"))));
self.setVariable("b", (self.getVariable("x").lt((new Integer(5))))  .and  ( ( (self.getVariable("x").equals((new Integer(2)))  .or  (self.getVariable("x").equals((new Integer(4)))))).not()));
self.setVariable("b", (self.getVariable("x").lte((new Integer(5))))  .and  ( ( (self.getVariable("x").gt((new Integer(2)))  .xor  (self.getVariable("x").gt((new Integer(4)))))).not()));
self.setVariable("b", (self.getVariable("x").notequals((new Integer(3)))));
self.setVariable("b",show_message((new String(""))).negate());
self.setVariable("b",self.getVariable("true"));
self.setVariable("b",self.getVariable("false"));
self.setVariable("b",(new Integer(3)) .band((new Integer(4))));
self.setVariable("b",(new Integer(3)) .bxor((new Integer(4))));
self.setVariable("b",(new Integer(3)) .bor((new Integer(4))));
self.setVariable("b",(new Integer(3)) .add((new Integer(4)) .mult((new Integer(2)) .mod((new Integer(2))))));
self.setVariable("b", (self.getVariable("b") .div((new Integer(2)))).negate());
self.setVariable("b", (self.getVariable("b") .div((new Integer(2)))).bnegate());

self.setVariable("x",self.getY() .bleft((new Integer(2))));
self.setVariable("x",self.getY() .bright((new Integer(2))));
 }
    }


    public static void main(java.lang.String[] args) {
        new Test();
    }
}
