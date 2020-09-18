interface academic 
{
 int sub1= 58;
 int sub2= 65;
 int sub3= 70;
 }
interface cocurricular
{
 sports = 21;
 cultural = 19;
}
class Nest implements academic,cocurricular
{
 w1=(58/75)*100;
 w2=(65/75)*100;
 w3=(70/75)*100;
 sports=(21/25)*100;
 cultural=(19/25)*100;
}
class File5
{
 public static void main(String arg[])
{
 Nest b1= new Nest();
 b1.w1();
 b1.w2();
 b1.w3();
 b1.sports();
 b1.cultural();
}
}