// write a program to find overall performane of a student based upon two categories academics and co-curricular amd print the waitage of both 

interface i1
{
 
 int m1=55;
 void show1();
 int m2=49;
 void show2();
 int m3=54;
 void show3();
 void waitage();
 
 void waitages();

}
interface i2 extends i1
{
int sports= 52;
 void show4();
 int cul = 65;
 void show5();
}

class A implements i1,i2
 {	int marks, waitage1, waitages1 ;
 public void show1()
{
 System.out.println("subject one marks: " + m1);
}
public void show2()
{
 System.out.println(" subject two marks are: " + m2);
}
public void show3()
{
 System.out.println(" subject three matks are: " + m3);
}
 public void show4()
{
 System.out.println(" marks of fourth are: " + sports);
}
public void show5()
{
 System.out.println(" marks of cultural are: " + cul);
}
public void marks()
{
marks = m1+m2+m3+sports+cul ;
System.out.println(" total marks are: " + marks);
}
public void waitage()
{
waitage1 = (75*3)/100;
 
System.out.println(" waitage for academics is: " + waitage1);
}

public void waitages()
{
 waitages1 = (200*2)/100;
 System.out.println("waitage for co-curricular is: " + waitages1);
}

} 
class Waitage
{
 public static void main(String arg[])
{
 
 A a1 = new A();
 a1.show1();
 a1.show2();
 a1.show3();
 a1.show4();
 a1.show5();
 a1.marks();
 a1.waitage();
 a1.waitages();

}
}