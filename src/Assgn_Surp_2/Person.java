package Assgn_Surp_2;
import java.lang.*;
class SalesPerson extends Thread implements Runnable {
    SalesPerson()
    {
        start();
    }
    public void run()
    {
        System.out.println("Ram"+"Sham"+"Rajan"+"Hardik"+"Kavya");
    }
}
class Days extends Thread implements Runnable{
    String days[]={"Sunday","Monday","Tuesday","Wednesday","Thrusday","Friday","Saturday"};
    Days()
    {
        start();
    }
    public void run()
    {
        SalesPerson obj=new SalesPerson();
        for(int i=0;i<7;i++)
        {
            if(days[i]=="Sunday")
                obj.suspend();
            else if(days[i]=="Wednesday")
            {
                obj.resume();
                System.out.println(days[i]);
            }
            else
                System.out.println(days[i]);
        }
    }
}
class Person {
    public static void main(String args[])
    {
        Days d=new Days();
    }
}
