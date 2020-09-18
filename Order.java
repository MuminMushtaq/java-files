import java.util.Scanner;
class Order
{
 public static void main(String arg[])
 {
  Scanner sc = new Scanner(System.in);
  int i,j,n, temp;
 System.out.println("enter the elements in an array: ");
 n= sc.nextInt();
 int a[] =new int[n];
 System.out.println("enter the elements");
 for(i=0; i<n; i++)
{
 a[i] = sc.nextInt();
}

for(i=0; i<n; i++)
{
 for(j=i+1; j<n; j++)
 {
 if(a[i] > a[j])
   {
	temp = a[i];
	a[i] = a[j];
	a[j] = temp;
	}
   }
 }

System.out.print("ascending order: ");
for(i=0; i<n-1; i++)
{System.out.print(a[i] +","); }
System.out.print(a[n-1]);

    }
}