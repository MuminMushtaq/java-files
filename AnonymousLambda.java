interface Account
   {
 	void deposit(int cash);
    }

 class AnonymousLambda
    {
      public static void main(String args[]) 
  {
        Account ob = new Account()
      {
 	public void deposit(int cash)
           {
              System.out.println("the cash deposited is: " + cash);
           }
       };
   ob.deposit(192);
    }
 }