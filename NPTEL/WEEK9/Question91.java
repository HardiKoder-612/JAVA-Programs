package WEEK9;
import java.util.Scanner;
public class Question91{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); // Read as string, e.g., 5+6
        int c=Integer.parseInt(String.valueOf(input.charAt(0)));
        int d=Integer.parseInt(String.valueOf(input.charAt(2)));
        System.out.println(input+" = "+(c+d));
    }
}