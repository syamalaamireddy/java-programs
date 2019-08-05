//passing two objects as a parameter
class test
{
int a;
test()
{
a=10;
System.out.println(a);
}
void display(test ob)
{
System.out.println("Inside="+ob.a);
a=ob.a;
System.out.println("value="+a);
}
}
class test_prgm
{
public static void main(String[] args)
{
test ob=new test();
test ob2=new test();
ob2.display(ob);
ob.a=40;
ob2.display(ob);
}
}