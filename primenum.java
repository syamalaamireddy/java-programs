public class primenum
{
public static void main(String[] arg)
{
int i,j,n=100,c;
for(i=2;i<=n;i++)
{
 c=0;
 for(j=2;j<=i/2;j++)
 {
   if(i%j==0)
   c=c+1;
 }
 if(c==0)
 System.out.println(i);
}
}
}