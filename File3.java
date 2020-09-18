import java.util.Scanner;
import java.util.Arrays;
class File3
{
 public static void main(String arg[])
{
 int a[] = {1,2,3,5,7,8,9,0};
System.out.println("previous array" +Arrays.toString(a));
int even =0;
for(int i=0; i<a.length; i++)
{
 if(a[i] %2 ==0)
 even++;
}
System.out.println("number of even numbers is: "+even);
System.out.println("number of odd numbers is: "+(a.length-even));
}
}