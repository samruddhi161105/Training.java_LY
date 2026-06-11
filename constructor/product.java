package constructor;

 public class product {
    String name;// class attributes
    int price;// instance variables -> current objects

    product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    product(product otherproduct) {
        this.name = otherproduct.name;
        this.price = otherproduct.price;
    }

} 
