import java.util.*;
class string_cmp
{
public static void main(String[] args)
{
Scanner ob=new Scanner(System.in);
String s1=ob.nextLine();
System.out.println("first string:"+s1);
String s2=ob.nextLine();
System.out.println("second string:"+s2);
//first method to compare
System.out.println(s1.compareTo(s2));
//2nd method
int s=s1.compareTo(s2);
System.out.println(s);
}
}