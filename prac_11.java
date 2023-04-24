import java.util.Random;
public class prac_11
{
    public static void main(String[] args)
    {
        Random rn=new Random();

        for(int i=0;i<=100;i++)
        {
        int a=rn.nextInt(49);
        System.out.printf(" %d ",a);
        if((i+1)%20==0)
        System.out.println();
 }  
}
}
