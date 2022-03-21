package MyPackage;
import java.util.*;
public class Multiple {
    static int check(int n1,int n2)
    {
        if(n1==0||n2==0)
            return 3;
        else if(n1%n2==0)
            return 2;
        else
            return 1;

    }
    public static void main(String args[])
    {
        int ans;
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1: ");
        num1=sc.nextInt();
        System.out.println("Enter number 2: ");
        num2=sc.nextInt();
        if(num2>=0)
        {
            ans=check(num1,num2);
            if(ans==2)
            System.out.println("\nIt is a multiple.");
            else if(ans==1)
                System.out.println("\nIt is not a multiple.");
            else if(ans==3)
                System.out.println("\nBoth numbers are zero.");
        }
    }
}
