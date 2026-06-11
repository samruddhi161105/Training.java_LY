
package library;

class Book {

    static int count = 1000; // auto-generated ID

    int id;
    String name;
    String author;
    String category;
    double price;
    int copies;

    // Constructor
    Book(String name, String author, String category, double price, int copies) {

        id = ++count;

        this.name = (name == null || name.trim().isEmpty())
                ? "Harry Potter"
                : name;

        this.author = author.trim();

        this.category = category;

        this.price = (price < 0) ? 0 : price;

        this.copies = (copies < 0) ? 0 : copies;
    }

    void display() {
        System.out.println(id + " " + name + " " + author +
                " " + category + " ₹" + price +
                " Copies:" + copies);
    }

    void borrowBook() {
        if (copies > 0) {
            copies--;
            System.out.println("Book Borrowed");
        } else {
            System.out.println("Not Available");
        }
    }

    void returnBook() {
        copies++;
        System.out.println("Book Returned");
    }

    boolean isAvailable() {
        return copies > 0;
    }

    void updatePrice(double newPrice) {
        if (newPrice >= 0)
            price = newPrice;
    }
}

public class library {

    public static void main(String[] args) {

        Book[] books = {
                new Book("Java Basics", "samruddhi", "Programming", 500, 10),
                new Book("Python Guide", "pragati", "Programming", 300, 5),
                new Book("Java Advanced", "om", "Programming", 700, 8),
                new Book("", "siddhi", "General", 200, 4)
        };

        // Costliest Book
        Book costliest = books[0];
        for (Book b : books) {
            if (b.price > costliest.price)
                costliest = b;
        }
        System.out.println("Costliest Book: " + costliest.name);

        // Cheapest Book
        Book cheapest = books[0];
        for (Book b : books) {
            if (b.price < cheapest.price)
                cheapest = b;
        }
        System.out.println("Cheapest Book: " + cheapest.name);

        // Count Books starting with Java
        int javaCount = 0;
        for (Book b : books) {
            if (b.name.toLowerCase().startsWith("java"))
                javaCount++;
        }
        System.out.println("Books starting with Java: " + javaCount);

        // Count Books by samruddhi
        int samruddhiCount = 0;
        for (Book b : books) {
            if (b.author.equalsIgnoreCase("samruddhi"))
                samruddhiCount++;
        }
        System.out.println("Books by samruddhi: " + samruddhiCount);

        // Total Inventory Value
        double totalInventory = 0;
        for (Book b : books) {
            totalInventory += b.price * b.copies;
        }
        System.out.println("Total Inventory Value = ₹" + totalInventory);
    }
}