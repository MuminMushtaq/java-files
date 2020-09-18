import java.util.Scanner;
class Get
{
 public static void main(String arg[])
{
 int seq, name,marks, m1,m2,m3,m4,m5;
 double  per;
 Scanner sc= new Scanner(System.in);
 System.out.print("enter the serial of the students: ");
 seq = sc.nextInt();
 name = sc.nextInt();
 System.out.print("enter the marks of 5 subjects");
 m1 = sc.nextInt();
 m2 = sc.nextInt();
 m3= sc.nextInt();
 m4 = sc.nextInt();
 m5 = sc.nextInt();
 marks = m1 + m2 + m3 + m4 + m5;
 System.out.print("total marks are: " + marks);
 per = (marks*100)/500;
 System.out.print("the percentage is: " + per);
if(per>90)
{System.out.print("grade A"+marks);
}
else if(per>75)
{
System.out.print("candidate is having good grade");
}
else
{
System.out.print("candidate is Fail");
}
}
}
