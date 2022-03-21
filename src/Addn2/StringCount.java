package Addn2;
import java.util.*;
public class StringCount {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size,len1,len2,count=0;
        String ch="y";
        String s2;
        ArrayList <String> str1=new ArrayList<>();
        System.out.println("Enter the array list->\n");
        while(ch.equals("y"))
        {
            System.out.print("Enter: ");
            str1.add(sc.nextLine());
            System.out.println("Want to add more (y/n)? ");
            ch=sc.nextLine();
        }
        System.out.println("Enter the string: ");
        s2=sc.nextLine();
        len2=s2.length();
        size= str1.size();
        for(int i=0;i<size;i++)
        {
            len1=str1.get(i).length();
            if(len1!=len2)
                count++;
        }
        System.out.println("Array list is: ");
        for(int i=0;i<size;i++)
            System.out.print(str1.get(i)+"\t");
        System.out.println("\nString is: "+s2);
        System.out.println(count);
    }
}
