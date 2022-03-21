package Week5;
import java.util.Scanner;

public class Question5_3 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
//Read any two values for a and b.
        a=sc.nextInt();
        b=sc.nextInt();
        int c;
        try
        {
            c=a/b;
            System.out.println(c);
        }
        catch(Exception e)
        {
            System.out.println("Exception caught: Division by zero.");
        }


//Get the result of a/b;
    }
}