package Unit_3;
import java.lang.Exception;
import java.util.Scanner;
class MyException extends Exception
{
    MyException(String msg)
    {
        super(msg);
    }
}
public class TestException {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        try
        {
            if(b==0)
            {
                throw new MyException("Cannot Divide because denominator is zero.");
            }
            else
            {
                int c=a/b;
                System.out.println(a+" / "+b+" = "+c);
            }
        }
        catch(MyException e)
        {
            System.out.println("Caught Exception");
            System.out.println(e.getMessage());
        }
    }
}
