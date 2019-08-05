class rectangle             //passing parameters by object
{
int l=20,b=5;
void area()
{
 int a;
 a=l*b;
 System.out.println(a);
}
void perimeter()
{
 int p;
 p=2*(l+b);
 System.out.println(p);
}
}
class test
{
 public static void main(String[] arg)
 {
  rectangle ob1=new rectangle();

  ob1.l=10;
  ob1.b=20;
  ob1.area();
  ob1.perimeter();
 }
}