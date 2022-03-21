  package Week1;
  import java.util.Scanner;
    public class Exercise1_1 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            double radius = s.nextDouble();
            double perimeter;
            double area;
            if (radius < 0) {
                System.out.println(" please enter a non zero poisitive number ");
            } else {
                System.out.println(2 * Math.PI * radius);
                System.out.println(Math.PI * radius * radius);
            }
        }
    }
