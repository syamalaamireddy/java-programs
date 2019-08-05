//wrapper classes-primitive datatype to object and object to datatype
import java.util.Random;
class wrapper
{
public static void main(String[] args)
{
Integer ob=new Integer(4);
int a=ob;
int b=ob.intValue();
System.out.println(b);
//primitive datatype to object
int s=10;
Integer ob1=s;
Integer ob2=Integer.valueOf(s);
System.out.println(s);

}
}
