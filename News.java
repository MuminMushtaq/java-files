public class News
{
 public static void main(String args[])
{
 int a[] = new int[2];
try
{
 System.out.println("acess third element" + a[3]);
}
catch(ArrayIndexOutOfBoundsException ae)
{
 System.out.println("exception thrown: " + ae);
}
 finally{
 a[0]=6;
System.out.println("first element value: " + a[0]);
System.out.println("the finally statement is executed");
   }

}
   }