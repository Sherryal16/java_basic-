
import java.util.Scanner;
public class lcm 
{
        public static void main(String[] args)
        {
         Scanner sc=new Scanner (System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
  
        for(int i=1;i<(a*b);i++)
        {
            if(i%a==0&&i%b==0)
            {
          System.out.println("lcm is"+i ); 
            break;
            }
        }
       
        }
}
