//printing and counting all digit and  calculating their sum 
import java.util.Scanner;


public class print_each_digit 
{
     public static void main(String[] args)
        {
         Scanner sc=new Scanner (System.in);
        int n,sum=0,count=0;
        n=sc.nextInt();
        while(n!=0)
        {
            int rem=n%10;
            System.out.println(rem);  
            sum=sum+rem;
            count++;
            n=n/10;
        }
            System.out.println("sum is "+sum);
            System.out.println("count is "+count);
        }
}
