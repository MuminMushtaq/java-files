import java.util.*;
class Jaggyy
{
    public static void main(String args[])
    {
        int i,j;
        Scanner sc = new Scanner(System.in);
        
        int a[][] = new int[4][];
        a[0] = new int[2];
        a[1]= new int[3];
        a[2] = new int[4];
        a[3] = new int[1];
        System.out.println("enter the elements");
        for(i=0; i<a.length; i++)
        {
            for(j=0; j<a[i].length; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("this is jagged array");
        for(i=0; i<a.length; i++)
        {
            for(j=0; j<a[i].length;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        

    }
}