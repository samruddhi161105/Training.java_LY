package condition_statement;

public class loopquestion7{
    public static void main(String[] args) {

        for (int row = 1; row <= 4; row++) {

            // Print spaces
            for (int col = 1; col <= 4 - row; col++) {
                System.out.print(" ");
            }

            // Print stars
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }


            System.out.println();

        }
    }
}