package MusicPlaylist;

public class Main {

    public static void main(String[] args) {

        Playlist p = new Playlist();

        p.displayPlaylist();

        p.addAtBeginning("Senorita");
        p.addAtEnd("Hymn For The Weekend");

        System.out.println("\nAfter Adding Songs:");
        p.displayPlaylist();
    }
} 