package DataStracture.Set;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class JukeboxSet {
    ArrayList<Song> songList = new ArrayList<Song>();
    public static void main (String[] args) {
        new JukeboxSet().go();
    }

    // if we want to change how sort() will work
    class ArtistCompare implements Comparator<Song> {
        public int compare (Song one, Song two) {
            return one.getArtist().compareTo(two.getArtist());
        }
    }

    public void go () {
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);

        HashSet<Song> songSet = new HashSet<Song>();
        songSet.addAll(songList);
        System.out.println(songSet);
    }

    void getSongs(){
        try {
            File file = new File("C:\\Users\\menelaos\\Documents\\NetBeansProjects\\Java Code Tests\\src\\DataStracture\\SongListMore.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");
        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nextSong);
    }
}
