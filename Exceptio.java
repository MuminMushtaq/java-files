class Exceptio
{
	public static void main(String args[])
	{
	try {
		int n = args.length;
		int a = 45 / n;
		System.out.println(“The value of a is :”+a); }
	catch(ArithmeticException  ae) {
		System.out.println(ae);
		System.out.println(“Arguments are required”); }
	finally {
		System.out.println(“End of program”); }
	}
}