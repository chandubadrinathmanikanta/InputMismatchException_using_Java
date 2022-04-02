import java.util.InputMismatchException;
import java.util.Scanner;
public class Main
{  
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        try 
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a+b;
            System.out.println("Sum = "+sum);
        }
        catch(InputMismatchException ex)
        {
            System.out.println("Incorrect input type, please try again:");
        }
    }
}