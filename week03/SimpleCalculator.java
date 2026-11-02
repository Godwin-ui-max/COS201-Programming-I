import java.util.Scanner;

/**
 * SimpleCalculator.java
 * COS 201 - Programming I | Week 3
 *
 * Reads two numbers and an arithmetic operator from the user,
 * performs the requested calculation, and prints a formatted result.
 * Handles division-by-zero gracefully.
 */
public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Read operator
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Read second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, result);
                break;

            case '-':
                result = num1 - num2;
                System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, result);
                break;

            case '*':
                result = num1 * num2;
                System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, result);
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, result);
                }
                break;

            default:
                System.out.printf("Error: '%c' is not a valid operator.%n", operator);
                break;
        }

        scanner.close();
    }
}
