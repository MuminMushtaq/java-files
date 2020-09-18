class Mythread implements Runnable
{
public void run()
{
 task1();
 task2();
 task3();
}
 void task1()
 {
  System.out.println("this is task 1");
  }
  void task2()
  {
  System.out.println("this is task2");
  }
  void task3()
  {System.out.println("this is task3");
  }
}
  class Hello
  {
   public static void main(String args[])
   {
   Mythread obj = new Mythread();
   Thread t = new Thread(obj);
   t.start();
   }
  }
  