class Multiple
{
 public static void main(String args[])
{
 	try{
 int n = args.length;
 int a = 45/n;
 System.out.println("the value of a is: " +a);
 int b[] = {10,20,30};
 b[5] = 100;
	    }
catch(ArithmeticException ae)
  {
System.out.println(ae);
System.out.println("Arguments are required");
   }
catch(ArrayIndexOutOfBoundsException aie)
     {
aie.printStackTrace();
System.out.println("Array index out of range");
	}
finally{
 System.out.println("End of program");}
} 
}