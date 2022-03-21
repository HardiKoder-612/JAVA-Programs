package Week7;
import java.util.*;
public class Question3 {
    public static void main(String[] args) {
        try {
            byte barr[] = {'N', 'P', 'T', 'E', 'L', '-', 'J', 'A', 'V', 'A', 'J', 'A', 'N', '-', 'N', 'O', 'C', 'C', 'S', 'E'};
            Scanner inr = new Scanner(System.in);
            int n = inr.nextInt();
            System.out.println(barr[n]);
            char ch= (char) barr[n];
            System.out.println(ch);

        }
        catch (Exception e){
                System.out.println("exception occur");
            }
        }
    }