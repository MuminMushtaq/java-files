class Me extends Thread
{
 public void run()
{
 System.out.println("hey bitchy ");
}
 }

class Meow extends Thread
{
 public void run()
{
 System.out.println("this is the moment"+Thread.currentThread().getName());
}
}

 class Mine extends Thread
{
 public void run()
{
System.out.println("how bad are you"+Thread.currentThread().getName());
}
}

class Damn
{
 public static void main(String args[])
{
 Me m = new Me();
Meow y = new Meow();
Mine z = new Mine();
m.setPriority(Thread.MIN_PRIORITY);
z.setPriority(Thread.MAX_PRIORITY);
y.setPriority(Thread.NORM_PRIORITY);
m.start();
y.start();
z.start();
}
}