import java.util.Scanner;
class One
{
 public static void main(String arg[])
 {
 int i,sum=0;
  int a[] = {1,2,4,5,6,9};
System.out.print("for even numbers: ");
for(i=0; i<a.length; i++)
{
  if(a[i]%2 == 0){
  System.out.println(a[i]);
}}
System.out.print("for odd numbers: ");
for(i=0; i<a.length; i++)
{if(a[i]%2!=0)
{
 System.out.println(a[i]);
}
}}
}