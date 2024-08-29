import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Division");
        System.out.println("4. Modulus");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                double sum = num1 + num2;
                System.out.println("Result: " + sum);
                break;
            case 2:
                double difference = num1 - num2;
                System.out.println("Result: " + difference);
                break;
            case 3:
                if (num2 == 0) {
                    System.out.println("Error! Division by zero is not allowed.");
                } else {
                    double division = num1 / num2;
                    System.out.println("Result: " + division);
                }
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Error! Modulus by zero is not allowed.");
                } else {
                    double modulus = num1 % num2;
                    System.out.println("Result: " + modulus);
                }
                break;
            default:
                System.out.println("Invalid choice. Please select a valid operation.");
        }

        scanner.close();
    }
}
