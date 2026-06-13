package inheritance;

    public class Teacher extends Employee {
    int exp;
    String degree;

    Teacher(int ID, String name, String email, int exp, String degree) {
        super(ID, name, email);
        System.out.println("I am Teacher constructor");
        this.exp = exp;
        this.degree = degree;
    }

    void MarkAttendance() {
        System.out.println("Attendance marked!!");
    }

    void gyaanBhiDeSaktahai() {
        System.out.println("Or chale gaye Jai hind!!!");
    }
}

