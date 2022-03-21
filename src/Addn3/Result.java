package Addn3;
import java.util.Scanner;
public class Result {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,result=1,j=1;
        num=sc.nextInt();
        for(int i=3;i<=num;i=i+2)
        {
            if(j==1)
            {
                result+=i;
                j=0;
            }
            else if(j==0)
            {
                result-=i;
                j=1;
            }
        }
        System.out.println(result);
    }
}
