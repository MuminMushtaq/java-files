class Outer
{
 static int x = 10;
 static int y = 20;
 	int z = 40;
static class Inner1
{
 void display()
 {
 System.out.println(x+y);
 }
}

class Inner2
{
 void display()
{
 System.out.println(x+y+z);
}
}
}

class Nested
{
 public static void main(String args[])
 {
 Outer obj = new Outer();
 Outer.Inner1 obj1 = new Outer.Inner1();
  Outer.Inner2 obj2 = obj.new Inner2();
 obj1.display();
 obj2.display();
 }
   }