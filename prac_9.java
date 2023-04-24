import java.util.*;
public class prac_9
{
    public static void main(String[] args)
    {
        int s=0;
        int r,n,c;
    
        Scanner input=new Scanner(System.in);
        System.out.println("enetr any number");
        n=input.nextInt();
        c=n;
        while(n>0)
        {
            r=n%10;
            s=r+(s*10);
            n=n/10;
        }
        if(c==s)
        System.out.println(" number is palindrome");
        else
        System.out.println("not");
}
}
