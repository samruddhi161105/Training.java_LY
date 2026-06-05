package condition_statement.functions;

import java.util.Scanner;

public class function5 {

    public static int taxi(String typeOfTaxi, int km, int hours) {

        int taxiFare = 0;

        if (typeOfTaxi.equalsIgnoreCase("bike")) {
            taxiFare = km * 10;
        }
        else if (typeOfTaxi.equalsIgnoreCase("car")) {
            taxiFare = km * 25;
        }
        else if (typeOfTaxi.equalsIgnoreCase("rental")) {

            if (hours == 1) {
                taxiFare = km * 25;
            }
            else if (hours == 2) {
                taxiFare = km * 30;
            }
            else {
                taxiFare = km * 40;
            }
        }

        return taxiFare;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Bike");
        System.out.println("2. Car");
        System.out.println("3. Rental");

        System.out.print("Enter Taxi Type: ");
        String type = sc.next();

        System.out.print("Enter Distance (km): ");
        int km = sc.nextInt();

        int hours = 0;

        if (type.equalsIgnoreCase("rental")) {
            System.out.print("Enter Rental Hours: ");
            hours = sc.nextInt();
        }

        int fare = taxi(type, km, hours);

        System.out.println("Total Fare = " + fare);

        sc.close();
    }
}  

