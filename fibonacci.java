
import java.util.Scanner;


public class fibonacci 
{
        public static void main(String[] args) 
    {
        Scanner sc=new Scanner (System.in);
        int n,fibo=1;
        n=sc.nextInt();
     for(int i=1;i<=n;i++)
     {
         fibo=fibo*i;//1*2*3*4*5
         
     }
        System.out.println(fibo);
    }
}
