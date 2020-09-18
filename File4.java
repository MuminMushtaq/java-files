interface i1
{
 final int i =10;
 void display();}
default void display2()
{
 System.out.print("display 2");
}


class One implements i1
{
 public void display()
{
 System.out.print("Display");
}
}

class File4
{
 public static void main(String arg[])
{
 One o1 = new One();
 o1.display();
 o1.display2();

}
}
