/* Program on multithreading using Runnable interface 
   here is the simple demonstration */
class Beast implements Runnable
{
 public void run()
{
  task1();
  task2();
  task3();
}

 void task1(){
 System.out.println("Hii i am going to blow your back out ");
}
 void task2(){
 System.out.println("how are you feeling now");
}
 void task3()
{
 
 System.out.println("i hope you enjoyed last night, I think we used it very well");
}
}
class Mining
{
 public static void main(String args[])
{
 Beast b1 = new Beast();
Thread t = new Thread(b1);
t.start();
 
}
}