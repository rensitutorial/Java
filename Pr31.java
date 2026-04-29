import java.util.*;

public class Pr31 {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<String>();

        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");
        playlist.add("Song D");

        System.out.println("Full Playlist:");
        System.out.println(playlist);

        String firstSong = playlist.removeFirst();
        System.out.println("Playing First Song: " + firstSong);
        System.out.println("Playlist After Playing First Song:");
        System.out.println(playlist);

        String lastSong = playlist.removeLast();
        System.out.println("Skipping Last Song: " + lastSong);
        System.out.println("Updated Playlist:");
        System.out.println(playlist);
    }
}
