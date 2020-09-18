import java.util.Arrays;
import java.util.Scanner;
class Uni
{
 public static void main(String arg[])
{
 int[] a = {123,146,188,234,45772,377,997};
 String[] a2 = {"Ganta","paneer","Bergoda","sessa","gaana"};
 
 System.out.println("original array " +Arrays.toString(a));
 Arrays.sort(a);
System.out.println("original array " +Arrays.toString(a));
System.out.println("original string " +Arrays.toString(a2));
Arrays.sort(a2);
System.out.println("original string " +Arrays.toString(a2));
}
}