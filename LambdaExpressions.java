interface Account
{
 void deposit(int cash);  //it is not allowed to have more than one function here

      ///// this is the limitation of lambda

}
 class LambdaExpressions
   {
	public static void main(String args[])
	{
	   Account ob = (int cash)->   // -> is lambda expression
	    {
		System.out.println("amount deposited: " + cash);
	      };
    ob.deposit(1200);
         }
    }