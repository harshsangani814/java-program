import java.util.*;
public class prac_24 {
    String name;
    int age;
    int salary;
    int emp_no=1;
    public void getdata()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a employee name:=");
        String name=input.nextLine();
        System.out.println("Enter a emoloyee age:=");
        int age=input.nextInt();
        System.out.println("Enter a employee salary");
        int salary=input.nextInt();
    }
    public void display()
    {
        System.out.println("employe name:="+name);
        System.out.println("employe age:="+age);
        System.out.println("employe salary:="+salary);
        System.out.println("employe emp_n0:="+emp_no);
    }
    public static void main(String[] args)
    {   
        
        prac_24 []a=new prac_24[10];
        for(int i=0;i<10;i++){
    
        a[i]=new prac_24();
        a[i].getdata();

        a[i].emp_no=a[0].emp_no+i;
        a[i].display();

        }
    }
    
}

