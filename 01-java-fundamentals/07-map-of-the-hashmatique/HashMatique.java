import java.util.HashMap;
import java.util.Set;

public class HashMatique {
    public void songsAndLyrics() {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Californication", "If you want these kind of dreams, it's Californication");
        trackList.put("My Own Worst Enemy", "Can we forget about the things I said when I was Drunk?");
        trackList.put("Africa", "I hear the drums echoing tonight.");
        trackList.put("Hotel California", "On a dark desert highway, cool wind in my hair");
        System.out.println(trackList.get("Californication"));

        Set<String> songs = trackList.keySet();
        for (String song : songs) {
            System.out.println(song + ": " + trackList.get(song));
        }

    }
}
