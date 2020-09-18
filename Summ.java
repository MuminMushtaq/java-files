//method overloading
public class Summ
{
 public int summ(int x, int y)
{return(x+y);
     }

 public int summ(int x,int y,int z)
{return(x+y+z);
}
 public double summ(double x, double y)
{return(x+y);
  }

public static void main(String args[])
{
 Summ s = new Summ();
 System.out.println(s.summ(10,20));
 System.out.println(s.summ(12,23,34));
 System.out.println(s.summ(13.4,43.5));

}
    }