package Week4;

import java.util.Scanner;

import static java.lang.System.out;

public class QUestion41 {
    public class Question41{
        public static void main(String[] args) {
            // Scanner object is created
            Scanner scanner = new Scanner(System.in);
            // Read String input using scanner class
            String courseName = scanner.nextLine();
            // Print the scanned String
            out.println("Course: " + courseName);
        }
    }
}