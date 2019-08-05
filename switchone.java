public class switchone
{
public static void main(String[] arg)
{
int a=4,b=3,c,d,e,f,g;
char operator='-';
switch(operator)
{
 case '+':c=a+b;
	System.out.println(c);
	break;
 case '-':d=a-b;
	System.out.println(d);
	break;
 case '*':e=a*b;
	System.out.println(e);
	break;
 case '/':f=a/b;
	System.out.println(f);
	break;
 case '%':g=a%b;
	System.out.println(g);
	break;
 default:
 System.out.print("invalid input");
}
}
}
