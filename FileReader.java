import java.io.FileReader;
public class FileReader
{
 public static void main(String arg[])
 {
 FileReader fr = new FileReader("E:\\testing.txt");
 int i;
 while((i=fr.read())!=-1)
 System.out.println(char)i);
fr.close();
  }
 }