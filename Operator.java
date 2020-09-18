// constructor overloading

class Operator
{
 int a,b,c;
 public Operator(int a, int b)
{
 int d=a+b;
 System.out.println("Add: "+d);
}
 public Operator(int a,int b, int c)
{
 int f= a+b+c;
 System.out.println("add: "+f);
}
 public static void main(String arg[])
{
 Operator s = new Operator(12,13);
 Operator r = new Operator(34,54,56);
 
}


}