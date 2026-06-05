package condition_statement;

import java.util.Scanner;
public class SwitchInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a fruit name: ");
        String fruit = sc.nextLine();

        switch (fruit) {
            case "Apple":
                System.out.println("Apple is red.");
                break;

            case "Banana":
                System.out.println("Banana is yellow.");
                break;

            case "Mango":
                System.out.println("Mango is sweet.");
                break;

            default:
                System.out.println("Fruit not found.");
        }

        sc.close();
    }
}