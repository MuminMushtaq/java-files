import java.io.File;
import java.io.IOException;
class CreateFile
  {
 public static void main(String args[])
  {
 try{
 File f= new File("newfile.txt");
 boolean fvar = file.createNewFile();
if(fvar){
 System.out.println("file has been created");
 }
 else{
 System.out.println("file is already present at the specified location");
 }
 
}
 catch(IOException e)
{
 System.out.println("exception occured");
 e.printStackTrace();
}
  }
 }