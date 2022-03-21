package AdditionalAssignment;

import java.util.Scanner;

public class ByteToString {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        byte byteValue=sc.nextByte();
        String str;
        str=""+byteValue;
        System.out.println(str);
    }
}
