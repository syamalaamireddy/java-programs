//string buffer
class str_buffer
{
public static void main(String[] args)
{
StringBuffer s1=new StringBuffer("Syamala");
System.out.println(s1.charAt(2));
StringBuffer s2=new StringBuffer("Syamala");
System.out.println(s2.capacity());
StringBuffer s3=new StringBuffer("Syamala");
System.out.println(s3.length());
StringBuffer s4=new StringBuffer("Syamala");
System.out.println(s4.append("hi"));
StringBuffer s5=new StringBuffer("Syamala");
System.out.println(s5.reverse());
StringBuffer s6=new StringBuffer("Syamala");
System.out.println(s6.insert(4,"hi"));
StringBuffer s7=new StringBuffer("Syamala");
System.out.println(s7.replace(1,4,"hi"));
StringBuffer s8=new StringBuffer("Syamala");
System.out.println(s8.delete(1,4));
StringBuffer s9=new StringBuffer("Syamala");
System.out.println(s9.substring(1));
StringBuffer s10=new StringBuffer("Syamala");
System.out.println(s10.substring(2,4));
}
}