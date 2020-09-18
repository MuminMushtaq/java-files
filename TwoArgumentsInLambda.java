class TwoArgumentsInLambda
  {
 interface Head
{
 int operations(int a , int b);
 }

 interface Tail 
 {
  void show(String message);
  }

 private int operate(int a , int b, Head h)
  {
 return h.operations(a, b);
   }


public static void main(String args[])
 {
  Head add  = (int x , int y) -> x + y ;
  Head multiply = (int x , int y) -> x * y ;
  TwoArgumentsInLambda a = new TwoArgumentsInLambda();
 System.out.println(" the Addition is: " + a.operate(6,3, add));
 System.out.println(" the Multiplication is: " + a.operate(6,3, multiply));
 
 Tail t = message -> System.out.println(" Hello " + message);
 t.show("Geek");
  }
 }