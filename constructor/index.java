package constructor;

public class index {
   
    public static void main(String[] args) {
        product Electronic1 = new product("Mobile", 30000);

        product Electronic2 = new product(Electronic1);

        System.out.println(Electronic1.name);
        System.out.println(Electronic2.name);

    }
}
