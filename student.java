class student
{
int id,phnum;
String n1;
void display()
{
System.out.println("id number="+id);
System.out.println("phnumber="+phnum);
System.out.println("student name="+n1);
}
}
class test
{
public static void main(String[] arg)
{
student s1=new student();
s1.id=274;
s1.phnum=834;
s1.n1="syamala";
s1.display();
student s2=new student();
s2.id=063;
s2.phnum=888;
s2.n1="vandana";
s2.display();
}
}

