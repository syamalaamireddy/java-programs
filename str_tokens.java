//string tokenizer 
import java.util.*;
class str_tokens
{
public static void main(String[] args)
{
StringTokenizer ob=new StringTokenizer("Syamala amireddy");
String a=ob.nextToken();
System.out.println(a);
int b=ob.countTokens();
System.out.println(b);
boolean c=ob.hasMoreTokens();
System.out.println(c);
}
}