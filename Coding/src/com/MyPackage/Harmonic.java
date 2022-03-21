package com.MyPackage;
import java.util.Scanner;
public class Harmonic {
    public static void main(String args[])
    {
        float hsum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        for(int i=1;i<n;i++)
            hsum+=(float) 1/i;
        System.out.print("\nHarmonic sum is: "+(1/hsum));
    }
}
