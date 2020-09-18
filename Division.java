import java.util.Scanner;
class Division 
{
 public static void main(String arg[])
 {
 int a,b, result;
 Scanner sc = new Scanner(System.in); 
 System.out.println("enter the numbers");
 a = sc.nextInt();
 b = sc.nextInt();
 
try{result = a/b;
 System.out.println("result is: " + result);
}
catch(ArithmeticException ae)
{System.out.println("exception caused: division by zero");}

   }
     }