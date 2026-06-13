package AbstractClasses;

    public class Marketing extends Employee {

    Marketing(int Id, String name, double salary) {
        super(Id, name, salary);

    }

    @Override
    void calculateAnnualSalary() {
        int incentives = 70000;
        System.out.println((incentives + salary) + " LPA");
    }

}
