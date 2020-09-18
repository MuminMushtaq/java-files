import java.util.*;
import java.io.*;
class AList
{
 public static void main(String args[])
 {
  int n = 5;
 ArrayList<Integer> al = new ArrayList<Integer>();
  for(int i=0; i<n; i++)
 al.add(i);
 System.out.println(al);
 
 al.remove(3);
 System.out.println(al);
 for(int i=0; i<al.size(); i++)
   System.out.print(al.get(i)+" ");

   }
 }
