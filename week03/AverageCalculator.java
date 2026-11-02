import java.util.Scanner;

/**
 * AverageCalculator.java
 * COS 201 - Programming I | Week 3
 *
 * Reads a student's name and three test scores, calculates the
 * total and average, then prints a formatted summary.
 */
public class AverageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read student name
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        // Read three scores
        System.out.print("Enter score 1: ");
        double score1 = scanner.nextDouble();

        System.out.print("Enter score 2: ");
        double score2 = scanner.nextDouble();

        System.out.print("Enter score 3: ");
        double score3 = scanner.nextDouble();

        // Calculate total and average
        double total = score1 + score2 + score3;
        double average = total / 3.0;

        // Print formatted summary
        System.out.println();
        System.out.println("========== STUDENT REPORT ==========");
        System.out.printf("Student Name : %s%n", studentName);
        System.out.printf("Score 1      : %.2f%n", score1);
        System.out.printf("Score 2      : %.2f%n", score2);
        System.out.printf("Score 3      : %.2f%n", score3);
        System.out.println("-------------------------------------");
        System.out.printf("Total        : %.2f%n", total);
        System.out.printf("Average      : %.2f%n", average);
        System.out.println("=====================================");

        scanner.close();
    }
}
