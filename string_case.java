import java.util.*;
class string_case
{
public static void main(String[] args)
{
Scanner ob=new Scanner(System.in);
String s1=ob.nextLine();
System.out.println("first string:"+s1);
String s2=ob.nextLine();
System.out.println("second string:"+s2);
//first method to compare upper and lower case letters
System.out.println(s1.compareToIgnoreCase(s2));
//2nd method to compare upper and lower case letters
int s=s1.compareToIgnoreCase(s2);
System.out.println(s);
}
}