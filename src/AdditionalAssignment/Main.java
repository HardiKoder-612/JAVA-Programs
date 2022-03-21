package AdditionalAssignment;
import java.util.Scanner;
public class Main {
    static boolean isMultiple(int num)
    {
        if(num%3==0)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        int T;
        boolean ans;
        Scanner sc=new Scanner(System.in);
        T=sc.nextInt();
        int N[]=new int[T];
        for(int i=0;i<T;i++)
        {
            N[i]=sc.nextInt();
        }
        for(int i=0;i<T;i++)
        {
            ans = isMultiple(N[i]);
            if(ans==true)
                System.out.println("YES");
            else if(ans==false)
                System.out.println("NO");
        }
    }

}
