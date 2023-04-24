import java.util.*;
public class prac_1
{
    public static void main(String[] args)
    { 
        Scanner input= new Scanner(System.in);
        System.out.println("enter a value a,b,c,d,e,f");

        
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int d=input.nextInt();
        int e=input.nextInt();
        int f=input.nextInt();

         float x=(((e*d - b*f))/((a*d - b*c)));
         float y=(((a*f - e*c))/((a*d - b*c)));
          

        System.out.println("value is x="+x);
        System.out.println("value is y="+y);
    }
}
