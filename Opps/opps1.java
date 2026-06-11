package Opps;
//make a class of students where make class of name, rollno, attendance and either they can bunk class or attend the class according to their attendance
public class opps1 {
    String name;
    int rollno;
    double attendance;
    
    opps1(String name, int rollno, double attendance) {
        this.name = name;
        this.rollno = rollno;
        this.attendance = attendance;
    }

    void canBunkClass() {
        if (attendance >= 75) {
            System.out.println(name + " can bunk the class.");
        } else {
            System.out.println(name + " cannot bunk the class. Attendance is low.");
        }
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Attendance: " + attendance + "%");
    }
}

class studentdemo {
    public static void main(String[] args) {
        opps1 s1 = new opps1("Samruddhi", 101, 82);
        opps1 s2 = new opps1("pragati", 102, 68);

        s1.display();
        s1.canBunkClass();

        System.out.println();

        s2.display();
        s2.canBunkClass();
    }
}

