
import java.util.Scanner;

public class array_smallest 
{
   public static void main(String[] args)
        {
            int a[]=new int [10];
            int small;
         Scanner sc=new Scanner (System.in);  
            System.out.println("enter 10 elements");
        for (int i=0;i<10;i++)
        {
         a[i]= sc.nextInt();  
        }
        small=a[0];
        for (int i=0;i<10;i++)
        {
        if(a[0]<small)
           small=a[i];
        }
            System.out.println("smallest elt is "+small);
        }
}