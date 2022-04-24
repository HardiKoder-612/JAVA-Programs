package Session1;

import java.util.Scanner;
interface Square {
    int findSquare(int i);  // Returns the square of a number
}
class A implements Square{
    public int findSquare(int i)
    {
        return i*i;
    }

}
public class Question5{
    public static void main (String[] args){
        A a = new A();   //Create an object of class A
        // Read a number from the keyboard
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(a.findSquare(n));
    }
}
