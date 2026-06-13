package AbstractClasses;

import inheritance.Employee;
    public class Developer extends Employee {

        private double salary;
        Developer(int Id, String name, double salary) {
        super(Id, name, salary);
        this.salary = salary;
    }

    void calculateAnnualSalary() {
        int bonus = 100000;
        System.out.println((bonus + salary) + " LPA");
    }

}
