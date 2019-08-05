import java.util.*;
class string_concat
{
public static void main(String[] args)
{
Scanner ob=new Scanner(System.in);
String s1=ob.nextLine();
System.out.println("first string is:"+s1);
String s2=ob.nextLine();
System.out.println("second string is:"+s2);
String s3;
s3=s1+s2;
System.out.println("concatination of strings:"+s3);
          //second method for concatination
String s4;
s4=s1.concat(s2);
System.out.println("concatination of strings in 2nd method:"+s4);
}
}
