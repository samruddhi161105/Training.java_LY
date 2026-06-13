package AbstractClasses;

    public class HR extends Employee {

    HR(int Id, String name, double salary) {
        super(Id, name, salary);

    }

    @Override
    void calculateAnnualSalary() {
        int allowances = 50000;
        System.out.println((allowances + salary) + " LPA");

    }

}
