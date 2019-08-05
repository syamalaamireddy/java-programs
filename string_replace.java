//replacement of a string
import java.util.*;
class string_replace
{
public static void main(String[] args)
{
Scanner ob=new Scanner(System.in);
String s1=ob.nextLine();
System.out.println("enter a string"+s1);
String s2=s1.replace('a','b');
String s3=s1.replace("ya","re");
System.out.println("replacing of string is:"+s2);
System.out.println("replacing of string is:"+s3);
System.out.println(s1);
}
}