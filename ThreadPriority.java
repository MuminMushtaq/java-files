 //// thread priority program 
import java.lang.Thread;
class Myclass extends Thread
  {
int count = 0;
public void run()
      {
   for(int i=1; i<=10; i++)
   count ++;
   System.out.println("thread is completed: " + Thread.currentThread().getName());
   System.out.println("its priority is: " + Thread.currentThread().getPriority());
       }
   }

class ThreadPriority{
 public static void main(String args[])
 {
 Myclass obj = new Myclass();
 Thread t1 = new Thread(obj,"one");
 Thread t2 = new Thread(obj, "two");
 
 t1.setPriority(8);
 t2.setPriority(Thread.NORM_PRIORITY);

 t1.start();
 t2.start();
  
  }
 }
