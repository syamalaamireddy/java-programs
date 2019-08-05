//string from uppercase to lowercase letters
import java.util.*;
class stringupper
{
public static void main(String[] args)
{
Scanner ob=new Scanner(System.in);
String s1=ob.nextLine();
System.out.println("enter a string"+s1);
String s2=s1.toUpperCase();
System.out.println("uppercase of string is:"+s2);
}
}