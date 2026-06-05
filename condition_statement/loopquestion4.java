package condition_statement;

    public class loopquestion4 {
    public static void main(String[] args) {

        int line = 4;

        for (int row = line; row >= 1; row--) {
            for( int space=1;space <= (line - row) * 2; space++) {
                System.out.print(" ");
            }
            for (int start=1; start <= row; start++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


