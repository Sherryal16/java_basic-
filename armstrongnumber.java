
import java.util.Scanner;


public class armstrongnumber 
{
     public static void main(String[] args) 
    {
        int n,cube,org,rem,sum=0;      
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number to check if it is armstrong or not");
        n=sc.nextInt();
        org=n;
        while(n!=0)
        {
          rem=n%10;
          cube= rem*rem*rem;
          sum=sum+cube;
          n=n/10;
      
        }
     if(org==sum)
            System.out.println("armstrong");
        else 
            System.out.println("not armstrong");
}
}
