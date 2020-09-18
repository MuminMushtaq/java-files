import java.io.File;
import java.io.FileReader;
public class FileNotFound_Demo
{
 public static void main(String args[])
{
 File file = new File("C://Desktop/r");
 FileReader fr = new FileReader(file);
}


}