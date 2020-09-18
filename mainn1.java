class A extends Thread
{
public void run()
{
System.out.println("hello world");

}
}
class Mainn1
{
public static void main(String args[])
{
A a=new A();
Thread t1=new Thread();
a.start();
}
}