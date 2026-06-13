package MusicPlaylist;
 
import java.util.LinkedList;

public class Playlist {

    LinkedList<Song> playlist;

    public Playlist() {
        playlist = playlistdata.getSongs();
    }

    public void displayPlaylist() {
        System.out.println("Playlist:");
        for (Song song : playlist) {
            System.out.println(song);
        }
    }

    public void addAtBeginning(String name) {
        playlist.addFirst(new Song(name));
    }

    public void addAtEnd(String name) {
        playlist.addLast(new Song(name));
    }

    public void removeFirstSong() {
        if (!playlist.isEmpty()) {
            System.out.println("Removed: " + playlist.removeFirst());
        }
    }

    public void removeLastSong() {
        if (!playlist.isEmpty()) {
            System.out.println("Removed: " + playlist.removeLast());
        }
    }

    public void clearPlaylist() {
        playlist.clear();
        System.out.println("Playlist Cleared.");
    }
}