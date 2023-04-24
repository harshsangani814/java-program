import java.util.*;
public class prac_18
 {
    public static void main(String[] args)
    {
        int a[]=new int [5];
        int temp;
        Scanner input= new Scanner(System.in);
        System.out.println("enter a number");
        for(int i=0;i<5;i++)
        {
            a[i]=input.nextInt();
        }
        for(int i=0;i<5;i++)
      {
        for(int j=i+1;i<5;i++)
        {
            if(a[i]>a[j])
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
      }
      System.out.print(" "+a[i]);
    }
    
}
