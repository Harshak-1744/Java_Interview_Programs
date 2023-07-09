import java.util.*;


public class palindrome 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check :- ");
        int num = sc.nextInt();
        int org_num = num;
        int rev = 0;


        sc.close();

        
        while(num!=0)
        {
            rev = rev*10+num%10;
            num = num/10;
        }
        if(rev == org_num)
        {
            System.out.println("It is a palindrome number..");
        }
        else 
        {
            System.out.println("It is not a palindrome number..");
        }

    }
    
}
