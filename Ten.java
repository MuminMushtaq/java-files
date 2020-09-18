class MyException extends Exception
{
 static int accno[] = {1000,1005,990,2000,1200};
 static String name[] = {"Raj","Ram","Dev","Som","Rao"};
 static int bal[] = {9000, 8500, 5000,900,7000};

 MyException()
 {
   }

MyException(String str)
   {
 super(str);
      }
 }
class Ten
{
 public static void main(String arg[])
{
 try {
  for(int i=0; i<5; i++)
  {
  System.out.println(MyException.accno[i] + MyException.name[i] + MyException.bal[i]);
  if(MyException.bal[i]<1000)
    {MyException me = new MyException("Balance is less");
      throw me;
       } 
  }
 
    }

catch(MyException me)
    {
 me.printStackTrace();
     }
 }
   }