//static or non static-accessing by variable or object
class staticnon
{
static int a;
static void display()
{
a=30;
System.out.println(a);
}
public static void main(String[] args)
{
staticnon.display();
}
}