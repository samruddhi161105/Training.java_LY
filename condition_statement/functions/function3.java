package condition_statement.functions;

import java.util.Scanner;

public class function3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        String grade = calculateGrade(marks);

        System.out.println("Marks: " + marks + ", Grade: " + grade);

        sc.close();   // Close scanner here
    }

    public static String calculateGrade(int marks) {

        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else {
            return "D";
        }
    }
}