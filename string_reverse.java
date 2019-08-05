//reverse of string elements
import java.util.*;
class string_reverse
{
public static void main(String[] args)
{
String s1,s2="";
Scanner ob=new Scanner(System.in);
System.out.println("enter string:");
s1=ob.nextLine();
int length=s1.length();
for(int i=length-1;i>=0;i--)
s2=s2+s1.charAt(i);
System.out.println("reversed string is:"+s2);
}
}