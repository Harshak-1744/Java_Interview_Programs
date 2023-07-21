import java.util.*;

public class Main 
{
    public static void main(String [] args)
    {
        int [] arr = {1,2,3,4,5};
        System.out.println("Elements in Array..");
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nAfter reversing array..");
        
        for(int j = arr.length-1;j>=0;j--)
        {
            System.out.print(arr[j] + " ");
        }
    }
}
