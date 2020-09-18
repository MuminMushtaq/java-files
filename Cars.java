class Myself extends Thread
{
 public void run()
{
 System.out.println("this is the moment i was waiting for");
}
}
 class Mine extends Thread
{
 public void run()
{
System.out.println("i am going to give everything for the show!! ");
}
}
class Cars
{
 public static void main(String args[])
{
 Myself m1 = new Myself();
 Mine m2 = new Mine();
 m1.start();
 m2.start();
}
}