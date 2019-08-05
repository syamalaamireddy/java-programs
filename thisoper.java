//this operator
class test
{
int a;
test()

{
a=100;
System.out.println(a);
}
void display(int a)
{
a=50;
this.a=10;
System.out.println(a);
}
}
class t_p
{
public static void main(String[] args)
{
test ob=new test();
ob.display(10);
}
}