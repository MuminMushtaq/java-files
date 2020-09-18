import java.util.*;

class MyException extends Exception
{
MyException()
{
}
MyException(String me)
{
super(me);
}
}
 
class IncomeTaxx
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
 int n[][]= new int[3][4];
for(i=0;i<3;i++)
{
  for(j=0;j<4;j++)
{
System.out.println("Enter the Employee ID:");
int id=sc.nextInt();
System.out.println("Enter the Basic Salary:");
int Sal=sc.nextInt();
}
}
float bp,hra=0,da=0,gp=0;
int da=(Sal*50)/100;
int hra=(Sal*20)/100;
System.out.println("The DA is:"+da);
System.out.println("The hrA is:"+hra);
int total=(Sal+da+hra)*12;
System.out.println("The Total Salary is:"+total);
for(i=0;i<3;i++)
{
  for(j=0;j<4;j++)
{
System.out.print(" "+n[i][j]);
}
System.out.println(" ");

if(total<500000)
{
System.out.println("No Tax");
}
else if(total>=500000)
{
int tax=(total*10)/100;
System.out.println("The Tax is:"+tax);
}
try
{
if(total=0)
MyException me=new MyException("balance cant be this much");
throw me;
}

catch(MyException me)
{
me.printStackTrace();
}
finally
{
System.out.println("it is completed");
}
}
}






