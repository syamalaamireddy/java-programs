//geometric functions
class geometric
{
int l,b;
float r;
double s,h;
void area(int x,int y)
{
l=x;
b=y;
System.out.println("area of rectangle=" + l*b);
}
void area(float a)
{
r=a;
System.out.println("area of circle:" + Math.PI*r*r);
}
void area(double a,double b)
{
s=a;
h=b;
System.out.println("area of trianlge:" + s*h);
}
}
class test
{
public static void main(String args[])
{
geometric ob=new geometric();
ob.area(10.2f);
ob.area(10,5);
ob.area(2.3,3.4);
}
}
