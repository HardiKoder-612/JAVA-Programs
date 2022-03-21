package AdditionalAssignment;

import java.util.Scanner;

public class ShortToString {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        short shortValue=sc.nextShort();
        String str;
        str=""+shortValue;
        System.out.println(str);
    }
}
