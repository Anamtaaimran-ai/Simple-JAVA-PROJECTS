package SIMPLEJAVA;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();

        int choice;
        do {
            System.out.println("\nSimple Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            double result;
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Addition: " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Subtraction: " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Multiplication: " + result);
                    break;
                case 4:
                    if (num2 != 0) {
                        result = (double) num1 / num2;
                        System.out.println("Division: " + result);
                    } else {
                        System.out.println("Error! Division by zero is not allowed.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting calculator...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}
