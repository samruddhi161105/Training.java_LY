package condition_statement;
//Rhombus pattern
public class loopquestion6{
    public static void main(String[] args) {

        int line = 4;

        for (int row = 1; row <= line; row++) {

            // Print spaces
            for (int col = 1; col < row; col++) {
                System.out.print(" ");
            }

            // Print 4 stars
            for (int col = 1; col <= line; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
