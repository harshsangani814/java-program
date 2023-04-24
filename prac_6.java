import java.util.*;
public class prac_6
{
    public static void main(String[] args)
    {
        
        Scanner input=new Scanner(System.in);
        System.out.println("enter any charcter");
        char ch=input.next().charAt(0);
         
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            System.out.println( "charcter is vowel");
        }
        else
        {
            System.out.println("charcter is consonent");
        }

  }
}