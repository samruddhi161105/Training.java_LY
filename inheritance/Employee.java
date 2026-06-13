package inheritance;

public class Employee {
   
    int ID;
    String name;
    String email;

    Employee(int ID, String name, String email) {
        System.out.println("I am Employee constructor");
        this.ID = ID;
        this.name = name;
        this.email = email;
    }

    void TakeLeaves() {
        System.out.println("Aaj apun chutti pe hai");
    }

}

