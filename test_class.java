//without parameters and without return type
class test
{
test()
{
System.out.println("constructor");
}
void display()
{
System.out.println("hello");
}
void print()
{
System.out.println("hai");
}
}
class test_prgm
{
public static void main(String[] args)
{
test ob=new test();
ob.display();
ob.print();
test ob1=new test();    //again we are getting output as constructor in test()
}
}