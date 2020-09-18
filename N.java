import java.util.Scanner;
class N
{
public static void main(String args[])
{
 Scanner sc = new Scanner(System.in);
System.out.println("enter the day for which ");
int day  = 4;
String dayString;
switch (day)
{
 case 1 :
dayString = "Monday";
break;
case 2 :
dayString = "Tuesday";
break;
case 3 :
dayString = " Wednesday ";
break;

case 4 :
dayString = "thursday   ";
break;
case 5:
dayString = "  friday";
break;
case 6 :
dayString = " saturday ";
break;
case 7 : 
dayString = "   sunday ";
break;
default:
dayString = "Invalid day";
break ;
}
System.out.println(dayString);
}
}

