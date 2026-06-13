package MusicPlaylist;
 import java.util.LinkedList;

public class playlistdata {

    public static LinkedList<Song> getSongs() {

        LinkedList<Song> songs = new LinkedList<>();

        songs.add(new Song("Believer"));
        songs.add(new Song("Perfect"));
        songs.add(new Song("Shape of You"));
        songs.add(new Song("Faded"));

        return songs;
    }
}