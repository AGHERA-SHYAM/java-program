import java.util.Scanner;

public class p2 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("enter three number:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int max12 = (num1 > num2) ? num1 : num2;
        int max = (max12 > num3) ? max12 : num3;

        System.out.println("The maximum number is: " + max);
        scanner.close();
    }
}
