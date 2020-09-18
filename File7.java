abstract class A
{
 abstract void f1();
 void f2()
}
 class B extends A
{
 void f2()
{
 System.out.print("B");
}
void f3()
{
 System.out.print("print B");
}
}
class File7
{
 public static void main(String arg[])
{
 B b1 = new B();
 b1.f1();
 b1.f2();
 b1.f3();
}
}