import java.util.*;
import java.io.*;
class Ab
{
 public static void main(String args[])
 {
 int n=5;
 ArrayList<Integer> a = new ArrayList<Integer>();
 for(int i=0; i<n; i++)
a.add(i);
System.out.println(a);
a.remove(3);
System.out.println(a);
for(int i=0; i<a.size(); i++)
System.out.print(a.get(i)+ " ");
 
}
}
