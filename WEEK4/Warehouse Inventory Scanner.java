import java.util.Scanner;

public class WarehouseInventoryScanner {

    static Scanner input = new Scanner(System.in);
    static int[][] warehouse = {
        {20, 15, 8},
        {12, -1, 4},
        {25, 3, 18}
    };

    public static void main(String[] args) {
        int choice;

        // DO-WHILE: Keep showing the menu until the user exits
        do {
            System.out.println("\n=== WAREHOUSE INVENTORY SCANNER ===");
            System.out.println("1. Display Inventory");
            System.out.println("2. Total Inventory");
            System.out.println("3. Find Critically Low Shelf");
            System.out.println("4. Restock Shelf");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    displayInventory();
                    break;

                case 2:
                    totalInventory();
                    break;

                case 3:
                    findLowShelf();
                    break;

                case 4:
                    restockShelf();
                    break;

                case 5:
                    System.out.println("Exiting inventory scanner...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);
    }

    // Display the 2D warehouse array
    static void displayInventory() {
        System.out.println("\nWarehouse Inventory:");

        for (int i = 0; i < warehouse.length; i++) {
            for (int j = 0; j < warehouse[i].length; j++) {
                if (warehouse[i][j] == -1) {
                    System.out.print("[DAMAGED] ");
                } else {
                    System.out.print(warehouse[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    // FOR + CONTINUE: Skip damaged shelves when calculating total
    static void totalInventory() {
        int total = 0;

        for (int i = 0; i < warehouse.length; i++) {
            for (int j = 0; j < warehouse[i].length; j++) {

                // CONTINUE: Skip damaged shelves
                if (warehouse[i][j] == -1) {
                    continue;
                }

                total += warehouse[i][j];
            }
        }

        System.out.println("Total Inventory: " + total + " items");
    }

    // NESTED LOOPS + BREAK: Find the first shelf with fewer than 5 items
    static void findLowShelf() {
        boolean found = false;

        for (int i = 0; i < warehouse.length; i++) {
            for (int j = 0; j < warehouse[i].length; j++) {

                if (warehouse[i][j] != -1 && warehouse[i][j] < 5) {
                    System.out.println("Critically low shelf found!");
                    System.out.println("Row: " + (i + 1));
                    System.out.println("Column: " + (j + 1));
                    System.out.println("Items: " + warehouse[i][j]);

                    found = true;

                    // BREAK: Stop the inner loop after finding a low shelf
                    break;
                }
            }

            // Stop the outer loop too, so only the first match is reported
            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("No critically low shelves found.");
        }
    }

    // WHILE + RETURN: Validate input and restock a shelf
    static void restockShelf() {
        System.out.print("Enter row (1-" + warehouse.length + "): ");
        int row = input.nextInt();

        System.out.print("Enter column (1-" + warehouse[0].length + "): ");
        int col = input.nextInt();

        // RETURN: End the method if the shelf position is invalid
        if (row < 1 || row > warehouse.length ||
            col < 1 || col > warehouse[0].length) {
            System.out.println("Invalid shelf position.");
            return;
        }

        // RETURN: Damaged shelves cannot be restocked
        if (warehouse[row - 1][col - 1] == -1) {
            System.out.println("Cannot restock a damaged shelf.");
            return;
        }

        int quantity;

        // WHILE: Keep asking until the quantity is positive
        System.out.print("Enter quantity to add: ");
        quantity = input.nextInt();

        while (quantity <= 0) {
            System.out.println("Invalid quantity. Enter a positive number.");
            System.out.print("Enter quantity to add: ");
            quantity = input.nextInt();
        }

        warehouse[row - 1][col - 1] += quantity;

        System.out.println("Restocking successful!");
        System.out.println("Updated shelf quantity: "
                + warehouse[row - 1][col - 1]);
    }
}
