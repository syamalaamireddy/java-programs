//index in a string
import java.util.*;
class str_lstindex
{
public static void main(String[] args)
{
Scanner ob=new Scanner(System.in);
String s1=ob.nextLine();
System.out.println("enter a string"+s1);
int s=s1.lastIndexOf(97);
System.out.println("index of given one is:"+s);
}
}