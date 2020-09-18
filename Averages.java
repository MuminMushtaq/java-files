class Averages
{
 public static void main(String arg[])
{
 double  nums[] = { 10.2,11.1,12.2,13.3,14.4,15.5 };
 double result =0;
 int i;
 for(i=0; i<5; i++)
 result = result + nums[i];
 System.out.print("the average is " + result/5);
}
} 
