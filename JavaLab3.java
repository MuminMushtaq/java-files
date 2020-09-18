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

class A implements dept
{
 int stor, crock , cloth, total, tloss ;

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

class JavaLab3
       {
 public static void main(String arg[])
  {
  
 A a1 = new A();
 a1.store();
 a1.crockery();
 a1.clothing();
 a1.profits(); 
 a1.loss();

   }

	}

