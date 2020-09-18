class S
{
 int a =12;
}
 class T extends S
{
 int a =44;
void display()
{
 System.out.println("details are: "+ super.a);
}    }

class M
{
 public static void main(String args[])
{
 T b1 = new T();
 b1.display();
}
}