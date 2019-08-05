public class palindrome
{
public static void main(String[] arg)
{
int n=161,r=0,t;
t=n;
while(t!=0)
{
r=r*10;
r=r+t%10;
t=t/10;
}
if(n==r)
{
System.out.print("palindrome");
}
else
{
System.out.print("not a palindrome");
}
}
}