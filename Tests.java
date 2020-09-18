import.java.util.Scanner;
class Validatemarks extends Exception
{
 Validatemarks()
{}
Validatemarks(string str)
super(str);
}
class Tests
{
 public static void main(String arg[])
{
 Scanner sc = new Scanner();
int m1,m2,m3;
 try{
 System.out.println("enter marks ");
 m1= sc.nextInt();
}
if(m1<0 | m1>100)
{
Validatemarks v = new Validatemarks("enter marks between 0 and 100");
throw v;
}
System.out.print("enter marks");
m2=sc.nextInt();
if(m2<0 | m2>100)
{
 Validatemarks v = new Validatemarks("enter marks between 0 and 100");
 throw v;
}
System.out.println("enter marks ");
 m3= sc.nextInt();
if(m3<0 | m3>100)
{
Validatemarks v = new Validatemarks("enter marks between 0 and 100");
throw v;}
}
catch(Validatemarks v)
   {
 v.printStackTrace();
     }
	}