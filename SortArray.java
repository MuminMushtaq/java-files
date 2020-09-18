import java.util.Scanner;
class SortArray
{
 public static void main(String arg[])
{
 Scanner sc = new Scanner(System.in);
 int n, temp;
 System.out.println("enter the elements in array");
 n= sc.nextInt(); 
int a[] = new int[n];
System.out.println("enter all the elements");
for(int i=0; i<n; i++)
{
 a[i] = sc.nextInt();
}
for(int i=0; i<n; i++)
 {
  for(int j=i+1; j<n; j++)
    { 
 if (a[i]>a[j])
{
 temp=a[i];
 a[i] = a[j];
 a[j] = a[i];
     }
  }
  }

System.out.println("the sorted array is: ");
for(int i=0; i<n-1; i++)
{
 System.out.println(a[i] + " ," );
   }
System.out.println(a[n-1]);

}

}