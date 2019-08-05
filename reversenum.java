public class reversenum
{
public static void main(String[] arg)
{
int n=145,r=0,t;
t=n;
while(t!=0)
{
r=r*10;
r=r+t%10;
t=t/10;
}
System.out.print(r);
}
}