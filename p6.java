import java.util.Scanner;

public class p6 {
    // Define the Student class
    static class Student {
        String enrollmentNo;
        String name;

        // Constructor for Student
        Student(String enrollmentNo, String name) {
            this.enrollmentNo = enrollmentNo;
            this.name = name;
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create instances of Student
        Student student1 = new Student("EN001", "Alice");
        Student student2 = new Student("EN002", "Bob");
        Student student3 = new Student("EN003", "Charlie");

        // Print student details
        System.out.println("Student 1: " + student1.name);
        System.out.println("Student 2: " + student2.name);
        System.out.println("Student 3: " + student3.name);
    }
}
