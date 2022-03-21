package Assgn_Surp_2;
import java.lang.Thread;

class Aa extends Thread
{
    public void run()
    {
        System.out.println("");
    }
}
class Bb extends Thread
{
    public void run()
    {
        System.out.println("");
    }
}
public class ThreadName {
    public static void main(String args[])
    {
        Aa t1=new Aa();
        Bb t2=new Bb();
        System.out.println("Before assigning, name of the threads are following->");
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        t1.setName("Scooby");
        t2.setName("Shaggy");
        new Aa().start();
        new Bb().start();
        System.out.println("After assigning, name of the threads are following->");
        System.out.println(t1.getName());
        System.out.println(t2.getName());
    }
}
