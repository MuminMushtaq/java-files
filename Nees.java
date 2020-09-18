abstract class A
{
 abstract void f1();
 void f2()
{ System.out.println("A");
}
}
class B extends A
{
 void f1()
{
 System.out.println("B");
}
void f3()
{
 System.out.println("Print B");
}
}
class Nees
{
 public static void main(String arg[])
{
 B b1 = new B();
b1.f1();
b1.f2();
b1.f3();
}
}