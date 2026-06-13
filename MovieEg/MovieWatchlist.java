package MovieEg;
import java.util.*;
public class MovieWatchlist {

    private ArrayList<String> watchlist;

    public MovieWatchlist() {
        watchlist = new ArrayList<>();
    }

    // Add a movie
    public void addMovie(String movie) {
        watchlist.add(movie);
        System.out.println(movie + " added.");
    }

    // Add multiple movies
    public void addMultipleMovies(String[] movies) {
        for (String movie : movies) {
            watchlist.add(movie);
        }
        System.out.println("Movies added successfully.");
    }

    // Remove a movie
    public void removeMovie(String movie) {
        if (watchlist.remove(movie)) {
            System.out.println(movie + " removed.");
        } else {
            System.out.println("Movie not found.");
        }
    }

    // Replace an existing movie
    public void replaceMovie(String oldMovie, String newMovie) {
        int index = watchlist.indexOf(oldMovie);

        if (index != -1) {
            watchlist.set(index, newMovie);
            System.out.println("Movie replaced.");
        } else {
            System.out.println("Movie not found.");
        }
    }

    // Display all movies
    public void displayMovies() {
        if (watchlist.isEmpty()) {
            System.out.println("Watchlist is empty.");
            return;
        }

        System.out.println("Watchlist:");
        for (String movie : watchlist) {
            System.out.println(movie);
        }
    }

    // Display movies in reverse order
    public void displayReverse() {
        System.out.println("Movies in Reverse Order:");

        for (int i = watchlist.size() - 1; i >= 0; i--) {
            System.out.println(watchlist.get(i));
        }
    }

    // Sort movies alphabetically
    public void sortMovies() {
        Collections.sort(watchlist);
        System.out.println("Movies sorted alphabetically.");
    }

    // Display movies starting with a character
    public void displayStartingWith(char ch) {
        System.out.println("Movies starting with '" + ch + "':");

        for (String movie : watchlist) {
            if (movie.toLowerCase().startsWith(
                    String.valueOf(ch).toLowerCase())) {
                System.out.println(movie);
            }
        }
    }

    // Count movies containing a keyword
    public int countKeyword(String keyword) {
        int count = 0;

        for (String movie : watchlist) {
            if (movie.toLowerCase().contains(keyword.toLowerCase())) {
                count++;
            }
        }

        return count;
    }

    // Display duplicate movie names
    public void displayDuplicates() {
        HashSet<String> seen = new HashSet<>();
        HashSet<String> duplicates = new HashSet<>();

        for (String movie : watchlist) {
            if (!seen.add(movie)) {
                duplicates.add(movie);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("No duplicate movies found.");
        } else {
            System.out.println("Duplicate Movies:");
            for (String movie : duplicates) {
                System.out.println(movie);
            }
        }
    }

    // Remove duplicates while preserving order
    public void removeDuplicates() {
        LinkedHashSet<String> unique =
                new LinkedHashSet<>(watchlist);

        watchlist.clear();
        watchlist.addAll(unique);

        System.out.println("Duplicates removed.");
    }
}