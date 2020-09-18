import java.util.*;
class binaryS
{
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 int a[]={1,20,3,40,56,6,78,8,9,100};
 int i,s;
 int lb=0; ub=0;
System.out.println("enter the number you want to search: ");
 s= sc.nextInt();

for(i=0; i<a.length;i++)
{
 Arrays.sort(a);
float mid=(0+9)/2;
if(s>a[mid})
 {
   lb= mid+1;
   ub=9;
   }
else{
 lb=0;

}
}