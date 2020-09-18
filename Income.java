interface salary
{
 void salary();
}
 
interface gifts extends salary
{
 void gifts(); 
}

interface property extends gifts
{
  void property();
}

 class A implements property
{
 int tsalary , salary = 10000, gifts = 5000, property = 12000;
 float tax, totsal;


 public void salary()
 
{
 
 System.out.println("the salary is" + salary); 
}
 
public void gifts()

 {

 System.out.println("the gifts are: " + gifts);
 }
 
public void property()
 
   {
 
  System.out.println("the property is worth: " + property);
    }


public void tsalary()
{
 tsalary = salary + gifts + property;


 System.out.println(" total salary is: " + tsalary);

}
if(salary <=250000)
{
 System.out.println("there is no applicable tax: " + salary);
}
else if(salary >250000 <= 500000)
{
 tax= (2.5/100)*salary;
System.out.println(" tax applicable is: " + salary);

}



}
class Income
{
 public static void main(String arg[])
{

A a1 = new A();
a1.salary();
a1.gifts();
a1.property();
a1.tsalary();


}
}