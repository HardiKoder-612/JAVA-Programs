package Addn2;
import java.util.Scanner;
public class Negative {
    String check(String s) {
        if (s.charAt(0)=='-')
        {
                return s.substring(1,s.length());
        }
        else
        {
            s="-1";
            return s;
        }

    }
    public static void main(String args[])
    {
        Negative obj=new Negative();
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.print("Enter the String: ");
        str=sc.nextLine();
        System.out.println("Result is: "+obj.check(str));
    }
}
