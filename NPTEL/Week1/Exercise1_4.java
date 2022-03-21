package Week1;
import java.util.Scanner;
public class Exercise1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        int temp=n;
        int rem=0,sum=0;
        while(n>0)
        {
            rem=n%10;
            sum+=rem*rem*rem;
            n/=10;
        }
        if(temp==sum)
            result=1;
        else
            result=0;
        System.out.print(result);
    }
}