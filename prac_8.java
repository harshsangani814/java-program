import java.util.*;
public class prac_8
{

    public static void main(String[] args)
    {
    Scanner input=new Scanner(System.in);
     
    System.out.println("enter a string");
    String s=input.nextLine();
    
    char c;

    int count=0;
    for (int i=0;i<s.length();i++)
    {
        c=s.charAt(i);
        if(c>=65 && c<=90)
        {
        count++;
        }
    }
    System.out.println("count is="+count);
}
}
