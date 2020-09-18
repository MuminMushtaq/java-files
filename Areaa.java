import java.util.Scanner;
class Areaa
{
 public static void main(String arg[])
{
 Scanner sc=new Scanner(System.in);
 double area,perimeter;
  float l,b;
 System.out.print("enter the length of the area: ");
 l=sc.nextInt();

 System.out.print("enter the breadth of the area: ");
 b=sc.nextInt();
  area=l*b;

System.out.println("the area is: " +area);

 perimeter = 2*(l+b);

System.out.println("the perimeter is: "+ perimeter);
}
}