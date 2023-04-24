 import java.util.*;

 public class prac_22 {
    String name;
    int enroll_no;
    int t_marks;
    prac_22()
    {
        this.name="Harsh";
        this.enroll_no=2101201056;
        this.t_marks=99;

    } 
    prac_22(String name, int enroll_no ,int t_marks)
    {
        this.name=name;
        this.enroll_no=enroll_no;
        this.t_marks=t_marks;
    }
    public void display()
    {
        System.out.println("enter a name:="+name);
        System.out.println("enter a enroll_no:="+enroll_no);
        System.out.println("enter a t_marks:="+t_marks);
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);

        System.out.println(":=========updating==========:");
        System.out.println("Enter a name");
        String name=input.nextLine();
        System.out.println("enter a enroll_no");
        int enroll_no=input.nextInt();
        System.out.print("enter a t_marks");
        int t_marks=input.nextInt();
           

        prac_22 a1=new prac_22();
        prac_22 a2=new prac_22(name, enroll_no, t_marks);

        System.out.println(":============before updating===========:"); 
        a1.display();

        System.out.println(":=============after updating===========");
        a2.display();

    }
 }
