package String;

public class stringmain {

    public static void main(String[] args) {

        String name = "Samruddhi";
        System.out.println(name);

        String name2 = "Samruddhi";
        System.out.println(name2);

        System.out.println(name== name2);

        String collegename = new String("MIT ADT University");
        System.out.println(collegename);

        String collegename2 = new String("MIT ADT University");
        System.out.println(collegename2);

        System.out.println(collegename == collegename2);

        String str1 = "Hello";
        System.out.println(str1.length());
        System.out.println(str1.charAt(str1.length() - 1));
        
    }
}