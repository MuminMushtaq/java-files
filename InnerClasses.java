class Outer {
  
  private int x=20;

  	class inner  
	{
	  	
	 void display() 
        { 
	System.out.println(x);
	}
  	}
}

public class InnerClasses 
{
  public static void main(String[] args)
 {
	Outer obj=new Outer();
   	Outer.inner obj = Outer obj.new inner();
        obj.display();
  }
}