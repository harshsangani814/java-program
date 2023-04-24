import java.util.*;
public class prac_14
{
    public static void main(String[] args)  
    {
        Scanner input = new Scanner(System.in);
         //int div=2;
         System.out.println("enter integer number");
         int n=input.nextInt();
         int div=2;

         while(n>1)
         {
            if(n%div==0)
            {
                System.out.println(div+" ,");
                n=n/div;
            }
            else{
                div++;
            }

         }    
    }
}
