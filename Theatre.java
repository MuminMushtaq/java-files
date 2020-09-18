class Mythread implements Runnable
{
String str;
Mythread(String str)
{
this.str=str;
}
 public void run()
 {
  for(int i=1; i<=10; i++)
  {System.out.println(str +i);
    try{
	 Thread.sleep(2000);
	}  
	catch(InterruptedException ie)
	{ie.printStackTrace();}
  }
  
 }

}
class Theatre
{
 public static void main(String args[])
 {
  Mythread obj1 = new Mythread("cut the ticket");
  Mythread obj2 = new Mythread("show the seat");
  Thread r1 = new Thread(obj1);
  Thread r2 = new Thread(obj2);
	r1.start();
	r2.start();
 }
}