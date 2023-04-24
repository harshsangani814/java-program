import java.util.*;
public class prac_4
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a any number");
        int n=input.nextInt();
         
       int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%2==0)
            {
            count++;
            }
        }
        if(count==2)
        
            System.out.println("not prime");
        
        else
        
            System.out.println("prime");
 

      }
}
