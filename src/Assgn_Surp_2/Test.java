package Assgn_Surp_2;
import java.lang.Thread;
class A extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("From thread A: i = " + i);
        }
        System.out.println("Exit from A");
    }
}

class B extends Thread{
    public void run()
    {
        for(int j=0;j<7;j++)
        {
            System.out.println("From thread B: j = "+ j);
        }
        System.out.println("Exit from B");
    }
}
public class Test {
    public static void main(String args[])
    {
        new A().start();
        new B().start();
    }
}
