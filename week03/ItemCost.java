import java.util.Scanner;

/**
 * ItemCost.java
 * COS 201 - Programming I | Week 3
 *
 * Reads an item name, integer quantity, and double unit price
 * from the user, then calculates and displays the total cost.
 */
public class ItemCost {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read item name
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();

        // Read quantity (integer)
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        // Read unit price (double)
        System.out.print("Enter unit price: ");
        double unitPrice = scanner.nextDouble();

        // Calculate total cost
        double totalCost = quantity * unitPrice;

        // Print formatted output
        System.out.println();
        System.out.println("========== ITEM COST SUMMARY ==========");
        System.out.printf("Item Name  : %s%n", itemName);
        System.out.printf("Quantity   : %d%n", quantity);
        System.out.printf("Unit Price : %.2f%n", unitPrice);
        System.out.println("-----------------------------------------");
        System.out.printf("Total Cost : %.2f%n", totalCost);
        System.out.println("=========================================");

        scanner.close();
    }
}
