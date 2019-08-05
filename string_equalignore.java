//to check both strings are equal or not if those are upper or lower case
import java.util.*;
class string_equalignore
{
public static void main(String[] args)
{
Scanner ob=new Scanner(System.in);
String s1=ob.nextLine();
System.out.println("first string:"+s1);
String s2=ob.nextLine();
System.out.println("second string:"+s2);
System.out.println(s1.equalsIgnoreCase(s2));

}
} 