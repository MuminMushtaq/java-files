import java.util.Scanner;
class ValidateMarks extends Exception
{
 ValidateMarks()
{
}
ValidateMarks(String str)
super(str);
}




class Tent
{
 public static void main(String args[])
   {
 Scanner sc = new Scanner(System.in);
 int m1,m2,m3;
 try{
 System.out.println("enter marks");
 m1 = sc.nextInt(); 
    
 
if(m1<0 | m1>100)
{
 ValidateMarks v = new ValidateMarks("Enter the marks between 0 and 100");
throw v;
}
System.out.println("enter marks of second subject");
m2 = sc.nextInt();
if(m2<0 | m2>100)
{ValidateMarks v = new ValidateMarks("enter marks between 0 and 100");
throw v;
}
System.out.println("enter marks of third subject");
m3 = sc.nextInt();
if(m3<0 | m3>100)
{ValidateMarks v= new ValidateMarks("enter marks between 0 and 100");
 throw v;
}
     }
catch(ValidateMarks v)
{v.printStackTrace();}




     }
   }

