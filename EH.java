class Myexp extends Exception
{
 static int accno[] = {100,200};
 static String name[] = {"A","B"};
 static int bal[] = {100,0};
Myexp()
{}
Myexp(String str)
{
 super(str);
}
 }

class EH
{
 public static void main(String arg[])
{
 try{
 for(int i =0; i<2; i++)
{
System.out.println(Myexp.accno[i]+ " "+Myexp.bal[i]);
if(Myexp.bal[i]==0)
{Myexp me = new Myexp("pay at least something");
throw me;}
}}
catch(Myexp me)
{me.printStackTrace();}

}}