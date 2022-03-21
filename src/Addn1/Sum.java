package Addn1;
import java.util.Scanner;
public class Sum {
    static void loneSum(int a, int b, int c) {
        int sum = 0;
        if (a == b&&a == c)
            sum = 0;
        else if (a == b && a != c)
            sum += c;
        else if (a == c && a != b)
            sum += b;
        else if (b == c && b != a)
            sum += a;
        else if (a != b && a != c)
            sum += a + b + c;
        System.out.println(sum);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        loneSum(a,b,c);
    }
}
