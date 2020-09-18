interface cmonth
{
 
  int calls = 100;
 void show1();

 int sms =75;
 void show2();

 int net = 1024;
 void show3();
 
 int cusage=0 ;
 void show7();
}
interface pmonth extends cmonth
{ 
  int pbalance=2;
 void show4();
 
  int psms=5;
 void show5();

 int pnet=456;
 void show6();
}

class A implements  pmonth
{
   int cusage, pusage ;
 public void show1()
{
 System.out.println(" the current month calls :" + calls);
}
public void show2()
{
  System.out.println(" the current month sms :" + sms);
}
 public void show3()
{
 System.out.println(" the current month internet :" + net);
}
public void show4()
{
  System.out.println(" the previous_month calls :" + pbalance);
}
public void show5()
{
  System.out.println(" the previous_month calls :" + psms);
}
public void show6()
{
 System.out.println(" the  previous_month calls :" + pnet);
}
public void show7()
{
cusage = (pbalance + psms + pnet + calls + sms + net);
System.out.println(" the current month usage is: " + cusage);
}
}
class Postpaid
{
 public static void main(String arg[])
{
 A a1 = new A();
 a1.show1();
 a1.show2();
 a1.show3();
 a1.show4();
 a1.show5();
 a1.show6();
 a1.show7();
}
}