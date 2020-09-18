import java.io.*;
import java.io.IOException;
class Created{

public static void main(String args[])
{
 try{

File f = new File("D:\\newfile3.txt");
boolean fvar = f.createNewFile();
FileWriter fw = new FileWriter("D:\\newfile3.txt");
fw.write("hey, the last time i missed your smile !! can you pass One");
fw.close();
FileReader fr = new FileReader("D:\\newfile3.txt");
int i ;
while((char)i=!-1)

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