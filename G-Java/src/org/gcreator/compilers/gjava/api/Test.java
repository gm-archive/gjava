/*
 * 
 */
package org.gcreator.compilers.gjava.api;

/**
 * This class is just for testing the API
 * @author TGMG
 */
class Test extends Object {
Object varname1;
    Test() {
        long start=0,average=0;
        long end=0;
        Integer iii;
        int iiii;
        
        for(int ii=0; ii<20; ii++) {
        
        start=System.currentTimeMillis();
        for(int i=0; i<9969998; i++)
        {
           iii = (new Integer(i));
        }
        end=System.currentTimeMillis();
        System.out.println("G-Script: "+(end-start));
        average += end-start;
        
        start=System.currentTimeMillis();
        for(int i=0; i<9998; i++)
        {
           iiii = i;
        }
        end=System.currentTimeMillis();
        System.out.println("Native: "+(end-start));
        }
        average /= 20;
        System.out.println("G-Script average"+average);
        function();
        
        Object varname1 = new Object(), varname2;
        varname1 = ((new Integer(3)));

        varname1.mult((new Integer(3)).sub((new Integer(4))));

        varname1.sub((new Integer(3)).sub((new Integer(4))));
        System.out.println("" + varname1.getDouble());
        varname1.add((new Integer(3)).sub((new Integer(4))));
        System.out.println("" + varname1.getDouble());
        varname1 = ((new Integer(3)).sub((new Integer(4))));
        System.out.println("" + varname1.getDouble());
        varname1.div((new Integer(3)).sub((new Integer(4))));
        System.out.println("" + varname1.getDouble());
        varname1.bor((new Integer(3)).sub((new Integer(4))));
        System.out.println("" + varname1.getDouble());
        varname1.bxor((new Integer(3)).sub((new Integer(4))));
        System.out.println("" + varname1.getDouble());
        varname1.band((new Integer(3)).sub((new Integer(4))));

        if (((new Integer(1)).equals((new Integer(1)))).getBoolean()) {
            System.out.println("1==1 :)");
        }

        if ((new Integer(1)).equals((new Integer(2))).getBoolean()) {
            System.out.println("this should not display!");
        }

        while (((new Integer(1)).equals((new Integer(1)))).getBoolean()) {
            return;
        }

        for (Object i = ((new Integer(1))); i.lt((new Integer(2))).getBoolean(); i = ((new Integer(1)))) {
            break;
        }


        while (((new Integer(1)).equals((new Integer(1)))).getBoolean()) {
           // return null;
        }
        for (Object i = ((new Integer(1))); i.lt((new Integer(2))).getBoolean(); i = ((new Integer(1)))) {
            break;
            
        }
        
        Object ball=((new Integer(3)));
 if ( ( ((new Integer(1)).equals((new Integer(5))))  .and  ( ((new Integer(2)).equals((new Integer(3))))))  .or  ((new Integer(5)).equals((new Integer(6)))).getBoolean()) 
{ 

 } 
        
        do { 
//return null;
 }while((new Integer(2)).equals((new Integer(3))).getBoolean());

        double G_CREATOR__repeat=0; 
 while(G_CREATOR__repeat < ( ((new Integer(5))).getDouble())){
{ 
//continue;;break;;
 } G_CREATOR__repeat++;}

        System.out.println("" + varname1.getDouble());
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
        
// G_CREATOR__repeat=new Double(0); 
// while(G_CREATOR__repeat.lt( ((new Integer(3)))).getBoolean()){
//{ 
//System.out.println(G_CREATOR__repeat.toString());
// } G_CREATOR__repeat.add(new Integer(1));}

long start=System.currentTimeMillis(),end;
       // for(int i=0; i<9969998; i++)
        {
 self.setVariable("varname1",(new Integer(3)));
 self.setVariable("varname1",self.getVariable("varname1").mult((new Integer(3)) .sub((new Integer(4)))));
 self.setVariable("varname1",self.getVariable("varname1").sub((new Integer(3)) .sub((new Integer(4)))));
 self.setVariable("varname1",self.getVariable("varname1").add((new Integer(3)) .sub((new Integer(4)))));
 self.setVariable("varname1",(new Integer(3)) .sub((new Integer(4))));
 self.setVariable("varname1",self.getVariable("varname1").div((new Integer(3)) .sub((new Integer(4)))));
 self.setVariable("varname1",self.getVariable("varname1").bor((new Integer(3)) .sub((new Integer(4)))));
 self.setVariable("varname1",self.getVariable("varname1").bxor((new Integer(3)) .sub((new Integer(4)))));
 
 
 { 
self.setVariable("x",(new Integer(23)));
self.setVariable("color",(new String("$FFAA00")));
self.setVariable("str",(new String("hello world")));
self.setVariable("str",(new String("hello world")));
self.setVariable("y",self.getVariable("y").add((new Integer(5))));
self.setVariable("x",self.getVariable("x").mult(self.getVariable("y")));
self.setVariable("x",self.getVariable("y") .bleft((new Integer(2))));
self.setVariable("x",self.getVariable("y") .bright((new Integer(2))));
//self.setVariable("x",(new Integer(23)) .mult( ( ((new Integer(2)) .add((new Integer(4)))) .div(sin(y)))));
self.setVariable("str",(new String("hello")) .add((new String(" world"))));
//self.setVariable("b", (self.getVariable("x").lt((new Integer(5))))  .and  ( !( (self.getVariable("x").equals((new Integer(2)))  .or  (self.getVariable("x").equals((new Integer(4))))))));
//self.setVariable("b", (self.getVariable("x").lte((new Integer(5))))  .and  ( !( (self.getVariable("x").gt((new Integer(2)))  .xor  (self.getVariable("x").gt((new Integer(4))))))));
//self.setVariable("b", (self.getVariable("x").notequals((new Integer(3)))));
//self.setVariable("b",show_message(""));
self.setVariable("b",self.getVariable("true"));
self.setVariable("b",self.getVariable("false"));
self.setVariable("b",(new Integer(3)) .band((new Integer(4))));
self.setVariable("b",(new Integer(3)) .bxor((new Integer(4))));
self.setVariable("b",(new Integer(3)) .bor((new Integer(4))));
self.setVariable("b",(new Integer(3)) .add((new Integer(4)) .mult((new Integer(2)) .mod((new Integer(2))))));
self.setVariable("b", (self.getVariable("b") .div((new Integer(2)))));
self.setVariable("b", (self.getVariable("b") .div((new Integer(2)))));

 }

        }
end=System.currentTimeMillis();
System.out.println("Time:"+(end-start));
    }

    public static void main(java.lang.String[] args) {
        new Test(1);
    }
}
