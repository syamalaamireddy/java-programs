//user command line arguments
class usercommand
{
public static void main(String[] args)
{
int n=args.length;
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=Integer.parseInt(args[2]);
System.out.println(args[0]);
System.out.println(args[1]);
System.out.println(args[2]);
int sum=a+b+c;
System.out.println(sum);
}
}