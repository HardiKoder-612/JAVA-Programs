package Addn1;
import java.util.*;
public class Multiple {
    public void check(int ...num)
    {
        ArrayList <Integer> number=new ArrayList<>();
        for(int n:num)
            number.add(n);
        for(int i=0;i<number.size();i++)
        {
            if(number.get(i)%5==0)
                System.out.print(number.get(i)+" ");
            else
                System.out.print("");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Multiple obj=new Multiple();
        int arr[] =new int[5];
        for(int i=0;i<5;i++)
            arr[i]=sc.nextInt();
        obj.check(arr[0]);
        obj.check(arr[0],arr[1]);
        obj.check(arr[0],arr[1],arr[2]);
        obj.check(arr[0],arr[1],arr[2],arr[3]);
        obj.check(arr[0],arr[1],arr[2],arr[3],arr[4]);
    }
}
