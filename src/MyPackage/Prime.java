package MyPackage;
import java.util.*;
import java.lang.*;
public class Prime {
    public static int Check(int x)
    {
        for(int i=2;i<x/2 + 1;i++)
        {
            if(x%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String args[]) {
        int n, flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the range(>0): ");
        n = sc.nextInt();
        System.out.println("\n");
        if(n==1){
            System.out.println("1 is neither prime nor composite.");
            System.exit(0);
        }
        for(int i=2;i<=n;i++)
        {
            if(Check(i)==1)
                System.out.print(i+", ");
        }
    }
}

