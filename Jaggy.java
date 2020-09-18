// Another Java program to demonstrate 2-D jagged  
// array such that first row has 1 element, second 
// row has two elements and so on.
class Jaggy
{
 public static void main(String[] args)
{
 int r=5,i,j;
 int arr[][] = new int[r][];
 for(i=0;i<arr.length;i++)
 arr[i] = new int[i+1];
 int count=0;
for(i=0;i<arr.length;i++)
  for(j=0;j<arr[i].length;j++)
arr[i][j] = count++;
System.out.println("contents of the jagged array: ");
for(i=0;i<arr.length;i++)
  {
	for(j=0;j<arr[i].length;j++)
System.out.print(arr[i][j]+ " ");
System.out.println();
}
}
}
