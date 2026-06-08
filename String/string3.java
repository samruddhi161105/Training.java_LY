package String;

import java.util.Scanner;
import java.util.Arrays;

public class string3 {

    public static void main(String[] args) {

        String[] products = {"Laptop", "Mouse", "Keyboard", "Monitor", "Phone"};
        double[] prices = {50000, 500, 1500, 12000, 30000};

        // Display products
        System.out.println("Product Catalog:");
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i] + " = " + prices[i]);
        }

        // Most expensive product
        double maxPrice = Arrays.stream(prices).max().getAsDouble();

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == maxPrice) {
                System.out.println("\nMost Expensive: " + products[i] + " = " + prices[i]);
            }
        }

        // Cheapest product
        double minPrice = Arrays.stream(prices).min().getAsDouble();

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == minPrice) {
                System.out.println("Cheapest: " + products[i] + " = " + prices[i]);
            }
        }

        // Search product
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter product name: ");
        String search = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < products.length; i++) {
            if (products[i].equalsIgnoreCase(search)) {
                System.out.println("Found: " + products[i] + " = " + prices[i]);
                found = true;
            }
        }
 
        if (!found) {
            System.out.println("Product not found");
        }

        // Total inventory value
        double total = Arrays.stream(prices).sum();
        System.out.println("\nTotal Inventory Value = " + total);

        // Bonus
        System.out.println("Laptop + Keyboard = " + (prices[0] + prices[2]));

        sc.close();
    }
}