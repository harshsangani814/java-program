import java.util.*;
 public class prac_16{
    public static void main(String[] args)
    {
    Scanner input=new Scanner(System.in);
     
    int i=0;
    int arr[]=new int[10];
    for(i=0;i<10;i++){
    System.out.println("enter a position"+(i+1));
    arr[i]=input.nextInt();
}
reversenum(arr);                           //function declaretion
for(i=0;i<10;i++)
{
    System.out.println("value at position"+(i+1)+":"+arr[i]);
}
}
 public static void reversenum(int arr[])
 {
    int j=0,temp;
    while(j<=arr.length / 2)
    {
        temp=arr[j];
        arr[j]=arr[arr.length-1-j];
        arr[arr.length-1-j]=temp;
        j++;

    }
 }
}


