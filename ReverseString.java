import java.util.Scanner;
class ReverseString
{
 public static void main(String arg[])
  {
 
String a, reverse=" ";
Scanner sc= new Scanner(System.in);
System.out.println("enter a string to reverse: ");
a = sc.nextLine();
int length = a.length();
for(int i=length-1; i>=0; i--)
reverse= reverse + a.charAt(i);
System.out.println("reverse of string is: " + reverse); 






   }
 }