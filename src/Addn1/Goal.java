package Addn1;
import java.util.Scanner;
public class Goal {
    public static String makeBricks(int s,int b,int goal)
    {
        int digit=goal%5;
        if(goal>(s+b*5))
            return "False";
        if (digit < 5 && s < digit)
            return "False";
        else if (digit > 5 && digit > s + 5)
            return "False";
        else
            return "True";
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s,goal,b;
        String ans;
        System.out.println("Enter the length of the goal: ");
        goal=sc.nextInt();
        System.out.println("Enter the number of small bricks (1 inches long): ");
        s=sc.nextInt();
        System.out.println("Enter the number of large bricks (1 inches long): ");
        b=sc.nextInt();
        ans=makeBricks(goal,s,b);
        System.out.println(ans);
    }
}
