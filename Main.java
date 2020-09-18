class Parent
{
 void show()
 {System.out.println("Parents show");
}
}
class Child extends Parent
{
 void show()
{
 System.out.println("childs show");
}


}

class Main
{
public static void main(String arg[])
{
 Parent obj1 = new Parent();
 obj1.show();
 Parent obj2 = new Child();
 obj2.show();
}
}