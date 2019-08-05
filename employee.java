//employee details
import java.util.*;
class employee
{
int eid;
String ename,dept;
double salary;
void output()
{
System.out.println("enter employee name:"+ename);
System.out.println("enter employee id:"+eid);
System.out.println("enter employee salary:"+salary);
System.out.println("enter employee department:"+dept);
}
void input()
{
Scanner ob=new Scanner(System.in);
ename=ob.nextLine();
Scanner i=new Scanner(System.in);
eid=i.nextInt();
Scanner s=new Scanner(System.in);
salary=s.nextInt();
Scanner d=new Scanner(System.in);
dept=d.nextLine();
}
}
class test
{
public static void main(String[] args)
{

employee e1=new employee();
e1.input();
e1.output();
}
}