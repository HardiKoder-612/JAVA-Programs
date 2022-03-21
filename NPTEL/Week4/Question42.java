package Week4;

import java.util.Calendar;

//import java.util.java.util.Calendar;
public class Question42 {
    public static void main(String args[]) {
        int year;
        // integer type variable to store year
        // Create an object of java.util.Calendar class.
        // Use getInstance() method to initialize the java.util.Calendar object.
        // Initialize the int variable year with the current year
        java.util.Calendar obj = java.util.Calendar.getInstance();
        year = obj.get(java.util.Calendar.YEAR);
        System.out.println("Current Year: " + year);
    }
}