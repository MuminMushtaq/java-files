class Mythread extends Thread
{
try{

 public void run()
{
 //task1();
 //task2();
 //task3();
 }
}
catch(Exception c)
{
}

 
/*void task1()
{
 System.out.println("we are here");
 }

void task2()
 {
 System.out.println("we are together");
 }

 void task3()
{
 System.out.println("tomorrow we have our exam");
 }*/
 }

class Pr
{
 public static void main(String args[])
 {
  Mythread obj = new Mythread();
    Thread t = new Thread(obj);
     t.start();

}
}
 