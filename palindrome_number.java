import java.util.*;
public class palindrome_number
{
    public static void main(String[] args) 
    {
        int n,rev=0,org,rem;      
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number to check if it is palindrome or not");
        n=sc.nextInt();
        org=n;
        while(n!=0)
        {
           rem=n%10;
           rev=rev*10+rem;
           n=n/10;          
        }
        if(org==rev)
            System.out.println("palindrome");
        else 
            System.out.println("not palindrome");
    }
}
