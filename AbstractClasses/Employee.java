package AbstractClasses;

    abstract public class Employee {
    int Id;
    String name;
    double salary;

    Employee(int Id, String name, double salary) {
        this.Id = Id;
        this.name = name;
        this.salary = salary;
    }

    public boolean equals(Employee obj) {
        return this.salary == obj.salary;
    }

    abstract void calculateAnnualSalary();

}
