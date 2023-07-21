import java.util.*;

public class Leap_year {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a year:- ");
        int number = sc.nextInt();
       

        if ((number % 4 == 0) && (number %100 != 0) || (number % 400 == 0))
        {
            System.out.println(number + " is a Leap Year");
        }
        else 
        {
            System.out.println(number + " is not a Leap Year");
        }
        

        sc.close();
    }
}
