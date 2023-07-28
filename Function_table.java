import java.util.*;

public class Function_table
{
    public static void table(int num)
    {
        for(int i = 1;i<=12;i++)
        {
            System.out.println(num + " " +"X"+" "+ i + " " +"="+" "+num * i);
        }
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for table:");
        int n = sc.nextInt();
        table(n);
    
    sc.close();
    }
}