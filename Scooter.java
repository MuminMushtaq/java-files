abstract class Vehicle
{
abstract void start();
 }
class Car extends Vehicle
{
 void start()
 {
System.out.println("car starts with key");
}
}
class Scooter extends Vehicle
{
 void start()
{
 System.out.println("scooter starts with kick");
}
class Car{
 public static void main(String[] arg)
{
 Car c = new Car();
 c.start();
 Scooter s = new Scooter();
 s.start();
}
}}