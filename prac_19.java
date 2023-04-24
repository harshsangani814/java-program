import java.util.*;
public class prac_19 {
    public static void main(String[] args)
    {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{1,2,3},{4,5,6},{7,8,9}};
          

        int c[][]=new int[3][3];                        //creating two matrics
         
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                 c[i][j]=a[i][j]+b[i][j];                //additin two matrics
                 
                 System.out.print(c[i][j]+" ");
            }
            System.out.println();                          //new line
        }
       //System.out.println();
    }
    
}
