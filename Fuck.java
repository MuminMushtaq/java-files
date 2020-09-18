import java.util.Scanner;
class Fuck
{
 public static void main(String args[])
  {
	int size, large, i;
 	int a[] = new int[100];
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size of the array");
	size = sc.nextInt();
	System.out.println("enter all the elements");
	for(i=0; i<size; i++)
  {
     a[i] = sc.nextInt();
    }
System.out.println("search for the largest number is: ");

 large = a[0];
 for(i=0; i<size; i++)
{
  if(large < a[i])
{
 large = a[i];
  }
 }

System.out.println("largest number =" + large);
    }

}
