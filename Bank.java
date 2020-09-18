class Bank
{
 public static void main(String args[])
{
 Check c = new Check(101);
 System.out.println("Depositing %500...");
 c.deposit(500.00);
 try
{
 System.out.println("withdrawing $100...");
 c.withdraw(100.00);
 System.out.println("withdrawing $600....");
 c.withdraw(600.00);
 }
 catch (InSufficientFundsException e)
{
 System.out.println("sorry, but you are short of cash" + e.getAmount());
 e.printStackTrace();
}
   }
     }