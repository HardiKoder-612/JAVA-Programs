package Week6;
import java.lang.*;
public class Question62 implements Runnable {
    @Override
    public void run() {
        System.out.print(Thread.currentThread().getName() + " has ended.");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Java Week 6 New Question.");
        Question62 th=new Question62();
        Thread t1= new Thread(th);
        t1.setName("Main Thread");
        t1.start();
    }
}

