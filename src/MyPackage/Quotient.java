package MyPackage;
import java.lang.Exception;
import java.util.Scanner;
public class Quotient {
    public static void main(String args[])
    {
        int a,b,quotient;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        try
        {
            quotient=a/b;
            System.out.println("The quotient of "+a+"/"+b+" = "+quotient);
        }
        catch(ArithmeticException e)
        {
            System.out.println("DivideByZeroException caught");
        }
        finally {
            System.out.println("Inside finally block");
        }
    }
}
