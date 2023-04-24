import java.util.*;
public class prac_5
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter three number a,b,c");
         int a=input.nextInt();
         int b=input.nextInt();
         int c=input.nextInt();

         int temp;
         if(a<b)
         {
            temp=a;
            a=b;
            b=temp;

         }
         if(b<c)
         {
            if(c>a)
            {
                temp=c;
                c=b;
                b=a;
                a=temp;
            }
            else
            {
                temp=c;
                c=b;
                b=temp;
            }
         }
         System.out.println("decreasing order="+a+" "+b+" "+c);

}
}
