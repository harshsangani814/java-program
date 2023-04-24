import java.util.*;
public class prac_15
 {
    public static void main(String[] args)
    {
    Scanner input=new Scanner(System.in);

    System.out.println("enter a first number");
    int num1=input.nextInt();
    System.out.println("enter a second number");
    int num2=input.nextInt();

    System.out.println("GCD OF"+num1+" and "+num2+" is "+gcd(num1, num2));
    }
     public static int gcd(int num1,int num2)
{
    while(num1 != num2)
    {
        if(num1>num2)
        {
            num1=num1-num2;
        }
        else
        {
            num2=num2-num1;

        }
    }
    return num1;

}
}
