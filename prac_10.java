import java.util.*;
public class prac_10
{
    public static void pattern(String s)
    {
    
        
        for(int i=0;i<s.length();i++)
        {
            for(int j=s.length()-1;j>=0;j--)
            System.out.print("");
        }
        for(int k=0;k<i+1;k++)

        {
            System.out.print(s.chatAt(k)+" ");
        }
        System.out.println();
    
}
public static void main( String[] args)
{
Scanner input=new Scanner(System.in);
System.out.println("enter a string");
String s=input.nextLine();
pattern(s);
}
}
