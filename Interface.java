interface i1
{
 void show1();
 void show2();
 default void show3()
   {
 System.out.print("show 3");
     }
}

class A implements i1
 {
  public void show1()
 {
   System.out.println("show 1");
  }
public void show2()
    {
 	System.out.println("show 2 ");
	}
     }

    
class Interface
{
 public static void main(String arg[])
{
 
 A a1 = new A();
 a1.show1();
  a1.show2();
a1.show3();
}
}