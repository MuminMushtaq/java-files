class Anonymous
{
 public static void main(String[] args)
 {
  sum(new int[]{1,2,4,5,6,3,4,5,6,7,8,6,5,4,3,44,3,333,3});
  }
 public static void sum(int[] a)
{
  int total=0;
for (int i:a)
 total = total + i;
System.out.println("the sum is : "+ total);
}
}