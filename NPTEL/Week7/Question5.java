package Week7;

import java.util.*;
public class Question5 {
    public static void main(String[] args) {
        try {
            String s1 = "NPTELJAVA";
            Scanner inr = new Scanner(System.in);
            int n = inr.nextInt();
            char c = 'a';
            char temp=s1.charAt(n);
            System.out.println(s1.replace(temp,'a'));
        }
            catch (Exception e){
                System.out.println("exception occur");
            }
        }
    }
