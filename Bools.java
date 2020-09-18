class Book extends Thread
{
 public void run()
{
 System.out.println("this book already taken by the beast");
}
}
class Book2 extends Thread
{
 public void run()
{
 System.out.println("the Fame just started to begin");
}
}


class Bools
{
 public static void main(String args[])
 {
 Book b1 = new Book();
 Book2 b2 = new Book2();
 b1.start();
 b2.start();
 }
}