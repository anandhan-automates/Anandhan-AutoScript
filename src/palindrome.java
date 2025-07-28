// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class palindrome
{
 public static void main(String[] args)
{
 String a = "MADAM";
 String b = "";
 int size = a.length();
 for(int i=size-1;i>=0;i--)
{
    System.out.println(a.charAt(i));
    b = b + a.charAt(i);
 
}
System.out.println(b);
 if(a.equals(b))
{
System.out.println("Palindrome");
}
else
{
    System.out.println("NOt Palindrome");
}
}
}