class Test
{
public static void main(String args[])
{
try{
 int n = args.length;
 int a =45/n;
 System.out.println("the value of a is:" +a);}
 catch(ArithmeticException ae){
 System.out.println(ae);
 System.out.println("Arguments are required"); }
 finally{
 System.out.println("enter of program");
}
}}