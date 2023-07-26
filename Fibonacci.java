import java.util.*;

public class Fibonacci 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many tearms..: ");
        int value = sc.nextInt();
        int n1 = 0;
        int n2 = 1;

        for(int i = 1;i<=value;i++)
        {
            System.out.print(n1 + " ");
            int a = n1 + n2;
            n1 = n2;
            n2 = a;
        
        }
        sc.close();
    }
}