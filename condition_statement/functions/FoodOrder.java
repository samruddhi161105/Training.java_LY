package condition_statement.functions;
import java.util.Scanner;

public class FoodOrder {

    // Function to get food price
    public static double orderFood(String food) {

        if (food.equalsIgnoreCase("Misal")) {
            return 80;
        } else if (food.equalsIgnoreCase("Coffee")) {
            return 40;
        } else if (food.equalsIgnoreCase("Pizza")) {
            return 250;
        } else if (food.equalsIgnoreCase("Burger")) {
            return 150;
        } else if (food.equalsIgnoreCase("Rice")) {
            return 120;
        } else if (food.equalsIgnoreCase("Thali")) {
            return 200;
        } else {
            return 0;
        }
    }

    // Function to add delivery charges
    public static double addDeliveryCharges(double amount, int km) {

        if (km <= 10) {
            return amount;
        } else if (km <= 20) {
            return amount + 50;
        } else if (km <= 30) {
            return amount + 100;
        } else {
            return amount + 150;
        }
    }

    // Function to apply coupon
    public static double applyCoupon(double amount, String coupon) {

        if (coupon.equalsIgnoreCase("RCBvsMI")) {
            return amount - 100;
        }

        return amount;
    }

    // Function to add GST
    public static double addGST(double amount) {
        return amount + (amount * 7 / 100);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== FOOD MENU =====");
        System.out.println("Misal  - ₹80");
        System.out.println("Coffee - ₹40");
        System.out.println("Pizza  - ₹250");
        System.out.println("Burger - ₹150");
        System.out.println("Rice   - ₹120");
        System.out.println("Thali  - ₹200");

        System.out.print("\nEnter Food Name: ");
        String food = sc.nextLine();

        double bill = orderFood(food);

        if (bill == 0) {
            System.out.println("Invalid Food Item!");
            sc.close();
            return;
        }

        System.out.println("Food Price = ₹" + bill);

        System.out.print("Enter Distance (km): ");
        int km = sc.nextInt();

        sc.nextLine(); // clear buffer

        System.out.print("Enter Coupon Code: ");
        String coupon = sc.nextLine();

        bill = addDeliveryCharges(bill, km);
        System.out.println("After Delivery Charges = ₹" + bill);

        bill = applyCoupon(bill, coupon);
        System.out.println("After Coupon Discount = ₹" + bill);

        bill = addGST(bill);
        System.out.println("After GST (7%) = ₹" + bill);

        System.out.println("\nFinal Amount = ₹" + bill);

        sc.close();
    }
}