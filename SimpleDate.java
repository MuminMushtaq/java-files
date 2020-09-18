import java.text.*;
import java.util.*;
class SimpleDate
{
    public static void main(String args[])
    {
        Date d = new Date();
        SimpleDateFormat sc = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String strDate = sc.format(d);
        System.out.println(strDate);
    }
    }
 