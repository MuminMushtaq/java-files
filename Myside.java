class Myself implements Runnable
{
 public void run()
{
 show1();
 show2();
 show3();
}

 public void show1()
{
 System.out.println("this is show one");
}
 public void show2()
{
 System.out.println("this is show two");
  }
public void show3()
{
 System.out.println("this is show3");
 }
 }
class Myside
{
 public static void main(String args[])
 {
  Myself me = new Myself();
 me.start();
me.show
}
}
 