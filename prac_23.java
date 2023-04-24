 import java.util.*;
 
 public class prac_23 {
    double area;
    prac_23(double redius)
    {
        area=(double)(3.14*redius*redius);
    }
    prac_23(int redius)
    {
        area=(double)(3.14*redius*redius);
    }
     public void main(String[] args)
     {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a redius:=");
        double r1=input.nextDouble();
        
        prac_23 a1=new prac_23(r1);
        prac_23 a2=new prac_23((int)r1);
        System.out.println("Area of circle:="+a1.area);
        System.out.println("Area of circle:="+a2.area);
        
     }
    
}
