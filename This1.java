class Student
{
 int id;
 String name;
 float fees;
Student(int id, String name, float fees)
  {
   this.id = id;
  this.name=name;
   this.fees=fees;
   }
void display()
{
 System.out.println(id+" "+name+" "+fees);
  }
 }
 class This1
{
 public static void main(String arg[])
{
 Student s1 = new Student(12,"Mumin",345);
 Student s2 = new Student(32,"Mushtaq",321);
 s1.display();
 s2.display();
}

   }