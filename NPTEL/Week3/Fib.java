package Week3;
import java.util.Scanner;
public class Fib {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }

    //Template code:
    static int fib(int n) {
        int first=0,second=1;
        int temp=first+second;
        int res=0;
        if(n==1)
            return 0;
        else if(n==2)
            return 1;
        else
        {
        for (int i=2;i<n;i++)
        {
            temp=first+second;
            first=second;
            second=temp;
        }
        return temp;
        }
    }
}