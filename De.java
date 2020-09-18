import java.util.lang;
class Mythread extends Thread
{
public void run()
{
 for(int i=1; i<10000; i++)
 {System.out.println(i);
 }
 
}

  }
  class De
  {
  public static void main(String arg[])
  {
  Mythread obj = new Mythread();
  Thread t = new Thread(obj);
  t.start();
  
  }
  
  }