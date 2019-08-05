//swapping of two numbers
import java.util.*;
class swapping
{
public static void main(String[] args)
{
int a,b,temp;
Scanner ob=new Scanner(System.in);
a=ob.nextInt();
b=ob.nextInt();
System.out.println("enter a value:"+a);
System.out.println("enter b value:"+b);
temp=a;
a=b;
b=temp;
System.out.println("after swapping a value:"+a);
System.out.println("after swapping b value:"+b);
}
}

