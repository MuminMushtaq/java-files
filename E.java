import java.util.Arrays;
import java.util.Scanner;
public class E
{
 public static void main(String arg[])
{int i;
 Scanner sc = new Scanner(System.in);
 int[] array1 = ("enter the elements you want to store and sort");
 array1[i] = sc.nextInt();
    String[] array2 = { "Java","Python", "PHP","C#","C Programming", "C++"
        };       

System.out.println("original numeric array : "+ Arrays.toString(array1));
Arrays.sort(array1);
System.out.println("original numeric array : " +Arrays.toString(array1));

System.out.println("original string array : " + Arrays.toString(array2));
Arrays.sort(array2);

System.out.println("Sorted string array : " + Arrays.toString(array2));
}
}