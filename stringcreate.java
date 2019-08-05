class stringcreate
{
public static void main(String[] args)
{
String s1="hello";
System.out.println(s1);
String s2=new String();
s2="Syamala";
System.out.println(s2);
String s3=new String("Vandana");
System.out.println(s3);
char str[]={'f','r','i','e','n','d','s'};
String s4=new String(str);
String s5=new String(str,1,3);            //sub_string printing
System.out.println(s4);
System.out.println(s5);
}
}