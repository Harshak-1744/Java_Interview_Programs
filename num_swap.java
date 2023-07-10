import java.util.*;

public class num_swap 
{
    public static void main(String [] args)
    {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int a = n.nextInt();
        System.out.println("Enter b number:- ");
        int b = n.nextInt();
        
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After Swapping..");
        System.out.println("a = " + a + " ");
        System.out.println("b = " + b);

    n.close();
    }
}