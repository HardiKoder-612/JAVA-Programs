package Week1;
import java.util.Scanner;
public class Exercise1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            if((2*i)%3==0)
                sum+=2*i;
        }
        System.out.print(sum);
    }
}