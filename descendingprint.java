
import java.util.Scanner;

public class descendingprint 
{
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner (System.in);
        int a,b,c;
        System.out.println("enter 3 nos to check largest");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if (a>b&&a>c)
        {
            System.out.print(a+", ");
        if (b>c)
           System.out.print(b+", "+c);
        else
           System.out.print(c+", "+b);
        }
        else if(b>a&&b>c)
            {
            System.out.print(b+", ");
        if (a>c)
           System.out.print(a+", "+c);
        else
           System.out.print(c+", "+a);
            }
        else
            {
            System.out.print(c+", ");
        if (b>a)
           System.out.print(b+", "+a);
        else
           System.out.print(a+", "+b);
        }
            
    
}
}
