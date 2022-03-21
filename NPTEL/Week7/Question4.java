package Week7;
import java.io.*;
import java.util.*;

public class Question4{
    public static void main(String[] args) {
        int c=0;
        try{
            InputStreamReader r=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(r);
            String s1 = br.readLine();
            for (int i = 0; i < s1.length(); i++) {
                s1.toLowerCase();
                if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
                {
                    c++;
                }

            }
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
