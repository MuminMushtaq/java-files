interface Man
{
 void add(int sum);

 		///// void subtract(int sub); // cannot happen(in this case
                ////        Man is not a functional interface 

 }
class AddLambda
  {
    public static void main(String args[])
 {
 Man a = (sum)->
 {
  System.out.println("the addition is: " + sum);
  };
a.add(12+23+40);



    }
  }