// Abstract classes

class A
{
 void f1()
{
 System.out.print("A");
}
}
class B extends A
{
void f2()
{
 System.out.print("B");
}
}
class Tess
{
 public static void main(String arg[])
{
 B b1 = new B();
b1.f2();
b1.f1();
}
}