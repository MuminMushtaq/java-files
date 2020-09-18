import java.util.Scanner;
class LinearSearch
 {
 public static void main(String args[])
  {
 Scanner sc = new Scanner(System.in);
 int num, i, item, a[];
 System.out.println("enter number of elements: ");
 num = sc.nextInt();
 a = new int[num];
 System.out.print("enter all the numbers: ");
 for(i=0; i<num; i++)
a[i] = sc.nextInt();
System.out.print("enter the search value: ");
item = sc.nextInt();
for(i=0; i<num; i++)
{
 if(a[i] == item)
{
 System.out.println(item + " is present at location "+(i+1));
 break ;
  }
 }
if(i == num )
{
 System.out.println(item + " does not exist ");
   }
 }

   }