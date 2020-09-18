class Ef
{
 public static void main(String arg[])
 {
  Thread t = Thread.currentThread();
  System.out.prinltn("Current thread=" +t);
  System.out.prinltn("its name="+t.getName());
 }
}