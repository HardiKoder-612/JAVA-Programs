package Week2;
// This is the class named School
class School {
    // This is a method in class School
    public void print() {
        System.out.println("Hi! I class SCHOOL.");
    }
}
// This is the class named Student
class Student {
    // This is a method in class Student
    public void print() {
        System.out.println("Hi! I am class STUDENT");
    }
}

public class Question21 {
    public static void main(String args[]) {
        Student obj1=new Student();
        obj1.print();
        // Create an object of class Student

// Call 'print()' method of class Student
        School obj2=new School();
        obj2.print();
// Create an object of class School

// Call 'print()' method of class School
    }
}
