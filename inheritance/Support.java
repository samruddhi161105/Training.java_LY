package inheritance;


    public class Support extends Teacher {
    boolean Uniform;
    int problems;

    Support(int ID, String name, String email, int exp, String degree, boolean Uniform, int problems) {
        super(ID, name, email, exp, degree);
        System.out.println("I am support constructor");
        this.Uniform = Uniform;
        this.problems = problems;
    }

}

