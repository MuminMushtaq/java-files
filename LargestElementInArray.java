import java.util.Scanner;
class LargestElementInArray
{
 public static void main(String args[])
   {
 int large, size,i;
 int a[] = new int[50];
 Scanner sc  = new Scanner(System.in);
 System.out.println("enter the size of the array");
 size = sc.nextInt();
 System.out.println("enter the elements");
 for(i=0; i<size; i++)
{
 a[i] = sc.nextInt();
 }
System.out.println("print the largest element of the array");
large = a[0];
for(i=0; i<size; i++)
{
 if(large < a[i])
 {
 large = a[i];
}

}
System.out.println("largest no. in array: " +large);


        }



   }