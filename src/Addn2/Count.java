package Addn2;
import java.util.Scanner;
public class Count {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int countBlank=0;
        System.out.println("The String is->\n"+str);
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
                countBlank++;
        }
        System.out.println("The number of spaces are: "+countBlank);
    }
}
