package String;

import java.util.Scanner;

public class string2 {
    public static void main(String[] args) {

        String[] employees = {
                "Samruddhi Theurkar",
                "Rohit Sharma",
                "Virat Kohli"
        };

        Scanner sc = new Scanner(System.in);

        // Search by first name
        System.out.print("Enter first name: ");
        String fname = sc.next();

        boolean found = false;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].startsWith(fname)) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Mil gaya majdoor");
        else
            System.out.println("Bhag gya yahan se");

        // Search by surname
        System.out.print("Enter surname: ");
        String sname = sc.next();

        found = false;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].endsWith(sname)) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Mil gaya majdoor");
        else
            System.out.println("Bhag gya yahan se");

        // Print employees
        System.out.println("\nEmployees:");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }

        // Count employees
        System.out.println("\nTotal Employees = " + employees.length);

        // Longest name
        String longest = employees[0];

        for (int i = 1; i < employees.length; i++) {
            if (employees[i].length() > longest.length()) {
                longest = employees[i];
            }
        }

        System.out.println("Longest Name = " + longest);

        // Uppercase names
        System.out.println("\nUppercase Names:");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toUpperCase());
        }

        sc.close();
    }
}