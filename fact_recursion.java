//factorial using recursion
import java.util.*;
public class fact_recursion
{
static int f(int n)
{
if(n==0)
   return 1;
else
   return (n*f(n-1));
}
public static void main(String[] args)
{
int i,fact=1;
System.out.println("enter a number:");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
fact=f(n);
System.out.println("factorial of given number is:"+fact);
}
}