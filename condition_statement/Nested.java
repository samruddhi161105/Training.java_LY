package condition_statement;
public class Nested {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        if (a > b) {
            if (a > c) {
                System.out.println("a is the greatest");
            } else {
                System.out.println("c is the greatest");
            }
        } else {
            if (b > c) {
                System.out.println("b is the greatest");
            } else {
                System.out.println("c is the greatest");
            }
        }
    }
}


 