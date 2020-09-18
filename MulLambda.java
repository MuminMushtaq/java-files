interface Chai
{
 void mul(int sum);
 }
interface Samosa
 {
 void divide(int sub);
 }
class MulLambda
  {
    public static void main(String args[])
 {
 Chai c = (sum)->
 {
  System.out.println("the multiplication is: " + sum);
  };
Samosa s = (sub)->
 {
 System.out.println("the division is: " + sub);
  };
 
c.mul(12*2);
s.divide(12/3);



    }
  }