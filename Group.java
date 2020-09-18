import java.util.Scanner;
class Group
{
public static void main(String arg[])
{
int n,i,j;
Scanner sc = new Scanner(System.in);
System.out.println("enter the list you want");
n=sc.nextInt();
int A[][] = new int[n][7];
for(i=0;i<n;i++)
{
for(j=0;j<7;j++)
{
System.out.println(" ");
A[i][j]=sc.nextInt();
}
}
int arr[][] = new int[n][];  
for (i=0;i<arr.length;i++) 
{
 for(j=0;j<arr[i].length;j++) 
{
 System.out.print(arr[i][j]); 
}
} 
        System.out.println("Contents of 2D Jagged Array"); 
        for (i=0;i<arr.length;i++) 
        { 
            for (j=0;j<arr[i].length;j++) 
{
                System.out.print(arr[i][j] + " "); 
}
            System.out.println(); 
}
}
}
