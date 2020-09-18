interface c
{
 void minutes();
 void sms();
 void internet();
  
 }
 interface p 
{
 void pminutes();
 void psms();
 void pint();

}

class A implements p,c
{
 Scanner sc = new scanner(System.in);
public void minutes()
{
  
 minutes= sc.nextInt();
 System.out.println("enter the number of minutes the user talks: " + minutes);
} 
 public void sms()
{
  sms = sc.nextInt();
 System.out.println("enter the total sms used in the current month" + sms); 
}
public void internet()
{
 internet = sc.nextInt();
 System.out.print("enter the internet usage" + internet); 
}
public void pminutes()
{
 pminutes = sc.nextInt();
 System.out.println("enter the previous month usage: " + pminutes);
}
public void psms()
{
  psms = sc.nextInt();
 System.out.println("enter the previous month sms usage" + psms);
}
public void pint()
{
  pint = sc.nextInt();
 System.out.println("enter the previous month internet usage: " + pint); 
}
}

class Post
{
 public static void main(String arg[])
{
 


 
 



A a1 = new A();
 a1.minutes();
 a1.sms();
 a1.internet();
 a1.pminutes();
 a1.psms();
 a1.pint();
}
}