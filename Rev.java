import java.util.Scanner;
class Rev
{
 public static void main(String arg[])
  {

Scanner sc = new Scanner(System.in);
int size, i, j, temp;
System.out.println("enter the size of the array: ");
size = sc.nextInt();
int a[] = new int[50];
System.out.println("enter the elements in the array: ");
for(i=0; i<size; i++)
{
 a[i] = sc.nextInt();
}

j= i-1;
i=0;
while(j>i)
{
 temp = a[i];
 a[i] = a[j]; 
 a[j] = temp;
 j--;
 i++;
      }

System.out.print("the reversed elements are: ");
for(i=0; i<size; i++)
{System.out.print(a[i] + " ");}





     }
  }