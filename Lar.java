import java.util.Scanner;
class Lar
{
 public static void main(String arg[])
 {

 Scanner sc = new Scanner(System.in);
 int size,large, i;
 System.out.print("enter the size of the array: ");
 size = sc.nextInt();
 int a[] = new int[50];
 System.out.println("enter array elements: ");
 for(i=0; i<size; i++)
 {
 a[i] = sc.nextInt();
  }
System.out.println("search for the largest number");
large = a[0];
for(i=0; i<size; i++)
{
if(large<a[i])
{ large = a[i];     }
 }

System.out.print("the largest number is: " + large);



    }
}