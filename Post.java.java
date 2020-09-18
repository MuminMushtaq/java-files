interface c
{
 void minutes();
 void sms();
 void int();
  
 }
 interface p extends c
{
 void pminutes();
 void psms();
 void pint();

}

class A implements p
{
 void minutes()
{
 System.out.println("enter the number of minutes the user talks: " + minutes);
} 
 void sms()
{
 System.out.println("enter the total sms used in the current month" + sms); 
}
 void int()
{
 System.out.print("enter the internet usage" + int); 
}
void pminutes()
{
 System.out.println("enter the previous month usage: " + pminutes);
}
void psms()
{
 System.out.println("enter the previous month sms usage" + psms);
}
void pint()
{
 System.out.println("enter the previous month internet usage: " + pint); 
}
}

class Post
{
 public static void main(String arg[])
{
 Scanner sc = new scanner(System.in);
 System.out.println("enter all the details: ");
 minutes= sc.nextInt();
 sms = sc.nextInt();
 int = sc.nextInt();
 pminutes = sc.nextInt();
 psms = sc.nextInt();
 pinternet = sc.nextInt();
A a1 = new A();
 a1.minutes();
 a1.sms();
 a1.int();
 a1.pminutes();
 a1.psms();
 a1.pint();
}
}