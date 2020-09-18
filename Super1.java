class Vehicle
 {
 int max_speed = 120;
  }
 
class Car extends Vehicle
 {
 int max_speed = 180;

void display()
  {
  System.out.println("maximum speed: " +super.max_speed);
}
 }
class Super1
{
 public static void main(String arg[])
{
 Car c = new Car();
 c.display();
  }
 }