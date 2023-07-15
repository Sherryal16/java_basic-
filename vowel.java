
import java.util.Scanner;

public class vowel 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a character to check");
       char ch=sc.nextLine().charAt(0);
        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            System.out.println("VOWEL");
        else
            System.out.println("NOT A VOWEL");
        
    }
    
}
