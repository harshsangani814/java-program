import java.util.*;
public class prac_21
{
    String name;
    int age;
    int salary;
    public void getdata()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter name is person ");
        name=input.nextLine();
        System.out.println("enter person is age ");
        age=input.nextInt();
        System.out.println("enter person is salary ");
        salary=input.nextInt();
    }
      public void setdata(String name,int age,int salary)
      {
        System.out.println("name is person:="+name);
        System.out.println("persom is age:="+age);
        System.out.println("name is person:="+salary);
  
      }

      public static void main(String[] args) {
        
        prac_21  pr=new prac_21();
        pr.getdata();
        System.out.println();
        System.out.println("****************************************************************************");
        
        pr.setdata(pr.name,pr.age,pr.salary);

      }
}
