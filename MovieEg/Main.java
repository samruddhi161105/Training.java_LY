package MovieEg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MovieWatchlist watchlist = new MovieWatchlist();

        int choice;

        do {
            System.out.println("\n===== OTT Watchlist Menu =====");
            System.out.println("1. Add Movie");
            System.out.println("2. Add Multiple Movies");
            System.out.println("3. Remove Movie");
            System.out.println("4. Replace Movie");
            System.out.println("5. Display All Movies");
            System.out.println("6. Display Reverse");
            System.out.println("7. Sort Movies");
            System.out.println("8. Display Movies Starting With");
            System.out.println("9. Count Movies by Keyword");
            System.out.println("10. Display Duplicates");
            System.out.println("11. Remove Duplicates");
            System.out.println("12. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter movie: ");
                    watchlist.addMovie(sc.nextLine());
                    break;

                case 2:
                    System.out.print("How many movies? ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    String[] movies = new String[n];

                    for (int i = 0; i < n; i++) {
                        System.out.print("Movie " + (i + 1) + ": ");
                        movies[i] = sc.nextLine();
                    }

                    watchlist.addMultipleMovies(movies);
                    break;

                case 3:
                    System.out.print("Enter movie to remove: ");
                    watchlist.removeMovie(sc.nextLine());
                    break;

                case 4:
                    System.out.print("Old movie: ");
                    String oldMovie = sc.nextLine();

                    System.out.print("New movie: ");
                    String newMovie = sc.nextLine();

                    watchlist.replaceMovie(oldMovie, newMovie);
                    break;

                case 5:
                    watchlist.displayMovies();
                    break;

                case 6:
                    watchlist.displayReverse();
                    break;

                case 7:
                    watchlist.sortMovies();
                    break;

                case 8:
                    System.out.print("Enter starting character: ");
                    char ch = sc.next().charAt(0);

                    watchlist.displayStartingWith(ch);
                    break;

                case 9:
                    System.out.print("Enter keyword: ");
                    String keyword = sc.nextLine();

                    System.out.println(
                            "Count: " +
                            watchlist.countKeyword(keyword));
                    break;

                case 10:
                    watchlist.displayDuplicates();
                    break;

                case 11:
                    watchlist.removeDuplicates();
                    break;

                case 12:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 12);

        sc.close();
    }
}