interface i1
{
 void bsalary();
 void da();
 void hra();
 void tsalary();
 void tax();
}
 
class A extends i1
{
 float bsalary, da, hra , taxapply ;

 public void bsalary()
{
System.out.print("enter the basic salary of the employee");
bsalary= sc.nextInt();
}

public void da()
{
System.out.println("the da is applicable 50%");
da = (50/bsalary)*100;
}

public void hra()
{
System.out.println("again enter the basic salary of the employee");
hra = (20/bsalary);
}

public void tsalary()
    {
 System.out.println("total salary is");
 tsalary = bsalary + da + hra ;
     }

public void tax()
{
  if(tsalary<500000)
   {
     System.out.println("no tax is applicable");
    }
 else if(tsalary >= 500000)
   {
    taxapply = (10/tsalary)*100;
    System.out.println("tax is applied" + taxapply);
    tsalary = tsalary - taxapply ;
    System.out.println("now the total salary is: " + tsalary);
     }

 }
    }






class Myexp extends Exception
{
 Myexp()
{}
Myexp(String str)
{
 super(str);
}
   }
class Lab
{
 public static void main(String arg[])
{
 System.out.println("the total is tsalary");
try{
 if(Myexp.tsalary==0)
        {
     Myexp me = new Myexp("salary cannot be zero");
     throw me ; 
         }
   }
  catch(Myexp me)
    {
     me.printStackTrace();
      }



A a1 = new A();
a1.bsalary();
a1.da();
a1.hra();
a1.tsalary();
a1.taxapply();

   }
	}