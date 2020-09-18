public class Except
{
public static void main(String args[])
{
 try{
 int a[] = new int[2];
 System.out.println("Acess elements: " + a[3]);
}
catch(ArrayIndexOutOfBoundsException ae)
{
System.out.println("exception thrown: "+ ae);
}
System.out.println("out of the block");
}
}