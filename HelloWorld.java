// A simple Java program to display "Hello, World!"
public class HelloWorld {
    public static void main(String[] args) {
        // Print "Hello, World!" to the console
        System.out.println("Hello, World!");

        // Basic variables
        String name = "shyam";
        int age = 17;

        // Print a message with variables
        System.out.println("My name is " + name + ", and I am " + age + " years old.");

        // Call a simple method
        greet("Alice");
    }

    // A method to greet someone
    public static void greet(String person) {
        System.out.println("Hello, " + person + "!");
    }
}
