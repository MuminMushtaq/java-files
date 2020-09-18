interface mumin
 {
 void store();
 void crockery();
 
  }
 interface dept extends mumin
    {
	void clothing();
	void profits();
	void loss();
      }



interface bill extends dept
{
 void shop();
 void gadgets();
 void furniture();
 
 }





class A implements dept
{
 int stor, crock , cloth, total, tloss, gadgetsp, sprofit, furni  ;

 	public void store()
{ 
 
 stor = 60000;
{ System.out.println("enter the profit  of the departmental store: " + stor);}

}
public  void crockery()
{
 crock = 35000;
{ System.out.println("enter the proit  of the crockery shop: " + crock);}

} 

public void clothing()
{
 cloth = 120000;
{ System.out.println("enter the profit of the  clothing shop: " + cloth);}
}

public void profits()
     { 
 	total = crock + stor + cloth;
	{ System.out.println("total Profit for Mumin is: " + total); }
      }
 public void loss()
{
 tloss = total /15;
   { System.out.println("the total loss is: "+ tloss); }
}
        }


class B extends A{
 public void shop()
{
 sprofit = 1000;
 {System.out.println("the profit of shop is: " + sprofit) ; }
}
 public void gadgets()
{
 gadgetsp = 130000;
{System.out.println("gadgets profit is: " + gadgetsp) ; }

}
public void furniture()
{
 furni = 125064;
 { System.out.println("the profit from furniture is: " + furni) ; }
}
 
	}

class All
       {
 public static void main(String arg[])
  {
  
 A a1 = new A();
 a1.store();
 a1.crockery();
 a1.clothing();
 a1.profits(); 
 a1.loss();



 B b1 = new B();
 b1.shop();
 b1.gadgets();
 b1.furniture();

   }

	}










