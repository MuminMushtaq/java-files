import java.io.*;
import java.io.IOException;
import java.io.FileReader;
class Cre{

public static void main(String args[]) throws Exception
{
 try{ 

File f = new File("D:\\newfile4.txt");
boolean fvar = f.createNewFile();
FileWriter fw = new FileWriter("D:\\newfile4.txt");
fw.write("hey, the last time i missed your smile !! can you pass One");
fw.close();
FileReader fr = new FileReader("D:\\newfile4.txt");
int i ;
while((i=fr.read())!=-1)
System.out.print((char)i);
fr.close();
if(fvar){
System.out.println("File has been created successfully");
   }
else{
System.out.println("file already present at the specified location");
  }
} catch(IOException e)
{
 System.out.println("exception occured");
e.printStackTrace();
}
}
}