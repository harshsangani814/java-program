import java.util.*;
public class prac_2
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);

        System.out.println("enter  value pound");
        System.out.println("enter  value inch");
         
        int pound=input.nextInt();
        int inch=input.nextInt();
          

        float BMI=(((pound*4535927)) /((inch*0254)*(inch*0254)));
        System.out.println("BMI="+BMI);
    }
}