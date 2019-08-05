//replacall of a string
import java.util.*;
class str_replaceall
{
public static void main(String[] args)
{
Scanner ob=new Scanner(System.in);
String s1=ob.nextLine();
System.out.println("enter a string"+s1);
String s2=s1.replaceAll("ya","re");
System.out.println("replacing of string is:"+s2);

System.out.println(s1);
}
}