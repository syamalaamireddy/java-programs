public class perfectnum
{
public static void main(String[] arg)
{
int i,num=6,sum=0;
for(i=1;i<num;i++)
{
 if(num%i==0)
 {
  sum=sum+i;
 }
}
if(sum==num)
{
System.out.print("number is perfect number");
}
else
{
System.out.print("number is not a perfect number");
}
}
}