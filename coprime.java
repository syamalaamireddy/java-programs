public class coprime
{
public static void main(String[] arg)
{
int a=2,b=3,r;
r=a%b;
while(r!=0)
{
 a=b;
 b=r;
 r=a%b;
}
if(b==1)
{
System.out.println("given numbers are co-primes");
}
else
{
System.out.println("given numbers are not co-primes");
}
}
}