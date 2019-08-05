//without parameter,with return type
class test
{
int a;
test()
{
a=10;
System.out.println("construtor="+a);
}
int display()
{
int a=50;
return a;
}
//with parameter and without return type
void print(int x)
{
a=x;
System.out.println("inside="+a);
}
int show(int x)
{
a=x;
return a;
}
}
class test_prgm
{
public static void main(String[] args)
{
test ob=new test();
int c=ob.display();
System.out.println(c);
ob.print(20);
int d=show(30);
System.out.println("return="+d);
}
}






