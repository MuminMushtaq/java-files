interface Book
  {
   void received(int size);
  }
 interface Book2
     {
      void credited(int size);
      }

public class MultipleInterfacesLambda
  {
    public static void main(String args[])
 {
  Book a =(int size)->
  {
  System.out.println("books are: "+size) ; 
    };
 Book2 b = (int size)->
 {
 System.out.println("weight of the books is: "+size);
  };

  a.received(123);
  b.credited(321);  
}
   }