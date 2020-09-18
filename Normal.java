interface Account
{
 void deposit(int amount);
}
 class Deposit implements Account
{
 public void deposit(int amount)
    {
 System.out.println("amount deposited: " + amount);
    }
 }
public class Normal 
{
 public static void main(String args[])
{
 Deposit ob = new Deposit();
 ob.deposit( 1000);
  }
 }
