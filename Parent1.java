class Child extends Thread
{
 public void run()
 {
 
System.out.println("this is one");
}
}
class Child2 extends Thread
{
 public void run()
{
 System.out.println("this is two");
  }
 }

 
class Parent1
{
 public static void main(String args[])
{
 Child c = new Child();
 Child2 s = new Child2();
 c.start();
 s.start();
}
}
  