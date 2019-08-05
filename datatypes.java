//reading input from user for datatypes such as int,float,double
import java.util.*;
class datatypes
{
public static void main(String[] args)
{
double a;
int b;
float c;
System.out.println("enter no");
Scanner ob=new Scanner(System.in);
a=ob.nextDouble();
b=ob.nextInt();
c=ob.nextFloat();
System.out.println("enter double no="+a);
System.out.println("enter int no="+b);
System.out.println("enter float no="+c);
}
}
