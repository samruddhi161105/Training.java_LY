package condition_statement;

public class loopquestion3 {
    public static void main(String[] args) {

        for (int i = 4; i >= 1; i--) {

            // Print spaces
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}