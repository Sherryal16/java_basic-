
import java.util.Scanner;

public class hcf 
{
     public static void main(String[] args)
        {
         Scanner sc=new Scanner (System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
  
        for(int i=2;i<(a*b);i++)
        {
            if(a%i==0&&b%i==0)
            {
          System.out.println("hcf  is "+i ); 
            break;
            }
        }
       
        }
}
