import java.util.Scanner;
import java.util.ArrayList;


class File2
{ 
 public static void main(String arg[])
{
 int i;
 Scanner sc = new Scanner(System.in);
 ArrayList<String> list = new ArrayList<String>();
 list.add("enter the variable name: ");
 System.out.print(list.add);
 list.add("mummy");
 list.add("topi");
 list.add("jmmmm");
 String[] a = new String[list.size()];
 list.toArray(a);
 for(String string : a)
 {
  System.out.println(string);
}
}
}