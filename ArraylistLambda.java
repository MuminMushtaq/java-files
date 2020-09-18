/// Arraylist in lambda expressions
import java.util.ArrayList;
class ArraylistLambda
  {
 public static void main(String args[])
    {
  ArrayList<Integer> AL = new ArrayList<Integer>();
 AL.add(1 );
 AL.add(2);
 AL.add(3);
 AL.add(4);
 AL.add(5);
 AL.add(6);

 AL.forEach(n -> System.out.print(n));
////now if you want to show only even numbers;
 System.out.println( " The even numbers are: ");

  AL.forEach( n -> { if (n%2 == 0)  System.out.println(n); } ) ;



      }  
   }