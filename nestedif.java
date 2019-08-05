public class nestedif
{
public static void main(String[] arg)
{
int a=5,b=3,c=4;
if(a>b)
{
 if(a>c)
 {
   System.out.println("a is large number");
  }
  else
  {
    System.out.println("c is large number");
  }
}
else
{
 if(b>c)
 {
   System.out.println("b is large");
  }
  else
  {
     System.out.print("c is larger");
   }
}
}
}
