package condition_statement.functions;

import java.util.Scanner;

public class foodorderfunction {

    static Scanner sc = new Scanner(System.in);

    static double orderFood() {

        System.out.println("===== Welcome to Food Ordering App =====");
        System.out.println("Select Restaurant:");
        System.out.println("1. Hotel Shivneri");
        System.out.println("2. Burger Point");
        System.out.println("3. Pizza Hub");
        System.out.println("4. Food Kingdom");

        int restaurant = sc.nextInt();

        System.out.println();

        if (restaurant == 1) {
            System.out.println("Menu of Hotel Shivneri");
            System.out.println("Misal - Rs.250");
            System.out.println("Poha - Rs.100");
            System.out.println("VadaPav - Rs.50");

            System.out.print("Enter Item Name: ");
            String food = sc.next();

            if (food.equalsIgnoreCase("Misal"))
                return 250;
            else if (food.equalsIgnoreCase("Poha"))
                return 100;
            else if (food.equalsIgnoreCase("VadaPav"))
                return 50;

        } else if (restaurant == 2) {

            System.out.println("Menu of Burger Point");
            System.out.println("Burger - Rs.300");
            System.out.println("Fries - Rs.150");
            System.out.println("Sandwich - Rs.200");

            System.out.print("Enter Item Name: ");
            String food = sc.next();

            if (food.equalsIgnoreCase("Burger"))
                return 300;
            else if (food.equalsIgnoreCase("Fries"))
                return 150;
            else if (food.equalsIgnoreCase("Sandwich"))
                return 200;

        } else if (restaurant == 3) {

            System.out.println("Menu of Pizza Hub");
            System.out.println("Pizza - Rs.500");
            System.out.println("GarlicBread - Rs.200");
            System.out.println("Pasta - Rs.350");

            System.out.print("Enter Item Name: ");
            String food = sc.next();

            if (food.equalsIgnoreCase("Pizza"))
                return 500;
            else if (food.equalsIgnoreCase("GarlicBread"))
                return 200;
            else if (food.equalsIgnoreCase("Pasta"))
                return 350;

        } else if (restaurant == 4) {

            System.out.println("Menu of Food Kingdom");
            System.out.println("Biryani - Rs.400");
            System.out.println("Paneer - Rs.350");
            System.out.println("Noodles - Rs.250");

            System.out.print("Enter Item Name: ");
            String food = sc.next();

            if (food.equalsIgnoreCase("Biryani"))
                return 400;
            else if (food.equalsIgnoreCase("Paneer"))
                return 350;
            else if (food.equalsIgnoreCase("Noodles"))
                return 250;

        }

        System.out.println("Item not found!");
        return 0.0;
    }

    static double deliverycharges(double FoodPrice) {

        System.out.print("Enter Restaurant Distance (KM): ");
        int distance = sc.nextInt();

        System.out.println("Your food is coming from " + distance + " KM.");

        if (distance > 10 && distance < 20) {
            FoodPrice = FoodPrice + (distance * 2);
        } else if (distance >= 20 && distance < 30) {
            FoodPrice = FoodPrice + (distance * 3);
        } else if (distance >= 30) {
            FoodPrice = FoodPrice + (distance * 4);
        } else {
            System.out.println("Free Delivery");
        }

        return FoodPrice;
    }

    static double applycoupon(double FoodPrice) {

        System.out.print("Do you have a Coupon? (Y/N): ");
        char Coupon = sc.next().charAt(0);

        if (Coupon == 'Y' || Coupon == 'y') {

            System.out.print("Enter Coupon Code: ");
            String CouponValue = sc.next();

            if (CouponValue.equalsIgnoreCase("IPLRCB")) {
                FoodPrice = FoodPrice - (FoodPrice * 0.25);
                System.out.println("25% Discount Applied!");
            } else {
                System.out.println("Invalid Coupon!");
            }
        }

        return FoodPrice;
    }

    static double GST(double FoodPrice) {

        System.out.println("Adding 7% GST...");
        FoodPrice = FoodPrice + (FoodPrice * 0.07);

        return FoodPrice;
    }

    static void finalamt(double Pf, double FWD, double DAMT, double FoodGST) {

        System.out.println("\n===== BILL =====");
        System.out.println("Food Price                : Rs." + Pf);
        System.out.println("Food + Delivery Charges   : Rs." + FWD);
        System.out.println("After Coupon Discount     : Rs." + DAMT);
        System.out.println("Final Amount After GST    : Rs." + FoodGST);
    }

    public static void main(String[] args) {

        double PriceOfFood = orderFood();

        if (PriceOfFood == 0) {
            System.out.println("Order Cancelled!");
            return;
        }

        double FoodWithDeliveryCharge = deliverycharges(PriceOfFood);
        double discountedAmt = applycoupon(FoodWithDeliveryCharge);
        double foodwithGst = GST(discountedAmt);

        finalamt(PriceOfFood, FoodWithDeliveryCharge, discountedAmt, foodwithGst);
    }
}