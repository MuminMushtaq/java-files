class outer {

  

  private int x=20;



  	class inner  

	{

	  	

	 void display() 

        { 

	System.out.println(x);

	}

  	}

}



class InerClassEx 

{

  public static void main(String[] args)

 {

	outer outerobj=new outer();

   	outer.inner obj=outerobj.new inner();

        obj.display();

  }

}