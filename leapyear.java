public class leapyear
{
public static void main(String[] arg)
{
int num=2016;
if((num%400==0)||(num%100!=0&&num%4==0))
{
System.out.print("leap year");
}
else
{
System.out.print("not a leap year");
}
}
}
