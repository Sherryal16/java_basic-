
import java.util.Scanner;

public class billperday 
{
    public static void main(String[] args) 
    {
        
         Scanner sc=new Scanner (System.in);
        int n;double bill;
        System.out.println("enter a number of calls");
        n=sc.nextInt();
      if(n<100)
         bill=0;      
      else if(n<=200)
         bill=(n-100)*0.40;

        else if (n<=300)
            bill= 100*0+100*0.40+(n-200)*0.80;
        else 
             bill=100*0+100*0.40+100*0.80+(n-300)*1.20;
        System.out.println("bill is "+bill);
            
    }
    
}
