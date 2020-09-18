class A implements Runnable
{
public void run()
{
System.out.println("hello world");

}
}
class Meow
{
public static void main(String args[])
{
A a=new A();
Thread t1=new Thread();
a.start();
}
}