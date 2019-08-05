//scope and lifetime
class scopelife
{
public static void main(String[] args)
{
int a=10;
{
int b=20;
System.out.println(b);
}
System.out.println(a);
}
}