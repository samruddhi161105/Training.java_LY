package AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Developer e1 = new Developer(201, "Pankaj", 1200000);
        Developer e2 = new Developer(301, "Kunal", 1200000);

        System.out.println(e1.equals(e2));

        e1.calculateAnnualSalary();
    }
}
