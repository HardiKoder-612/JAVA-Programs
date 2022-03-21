package com.MyPackage;
import java.util.Scanner;
class conv{
    float cc=0,fah=0;
    public void ini(float c, float f)
    {
        cc=c;
        fah=f;
    }
    public void conv(int n)
    {
        if(n==1)
        {
            fah=((float)(9/5)*cc)+32;
            System.out.println("Temperature in farenheit is: "+fah);
        }
        else
            cc=(fah-32)*(float)(5/9);
            System.out.println("Temperature in celcius is: "+cc);
    }
}
class TempConv {
    public static void main(String args[]){
        conv obj= new conv();
        float c=0,fh=0;
        Scanner sc=new Scanner(System.in);
        int ch;
        System.out.print("\n1. Celcius to Fahrenheit\n2. Fahrenheit to Celcius \nEnter your choice-> ");
        ch=sc.nextInt();
        if(ch==1)
        {
            System.out.print("\nEnter temperature in celcius: ");
            c=sc.nextFloat();
            obj.ini(c,fh);
            obj.conv(ch);
        }
        else
        {
            System.out.print("\nEnter temperature in Fahrenheit: ");
            fh=sc.nextFloat();
            obj.ini(c,fh);
            obj.conv(ch);
        }

    }
    }
