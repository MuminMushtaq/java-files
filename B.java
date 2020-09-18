interface i1
{
 int x = 21;
void getAge();
}
 class B
{
 public static void main(String[] args)
{
 i1 a = new i1()
{
 public void getAge(){
 System.out.print("the age is" +x);
}
};
a.getAge();
}
}
