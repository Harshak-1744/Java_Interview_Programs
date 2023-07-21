import java.util.*;

public class Leap_year {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a year:- ");
        int number = sc.nextInt();
       

        if (number % 4 == 0) 
        {
            if (number % 100 == 0) 
            {
                if (number % 400 == 0) 
                {
                    System.out.println("yes");
                } else 
                {
                    System.out.println("no");
                }
            } else 
            {
                System.out.println("yes");
            }
        } else 
        {
            System.out.println("no");
        }

        sc.close();
    }
}
