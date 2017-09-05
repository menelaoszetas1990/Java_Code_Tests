package DataStracture.Set;

class Song implements Comparable<Song> {
    String title;
    String artist;
    String rating;
    String bpm;

    Song(String t, String a, String r, String b) {
        title = t;
        artist = a;
        rating = r;
        bpm = b;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getRating() {
        return rating;
    }

    public String getBpm() {
        return bpm;
    }

    // What we want to be printed when we System.out.print(songObject)
    @Override
    public String toString() {
        return title + " " + artist;
    }

    // how sort() will work
    @Override
    public int compareTo(Song s) {
        return title.compareTo(s.getTitle());
    }

    // for the hashSet
    public boolean equals(Object aSong) {
        Song s = (Song) aSong;
        return getTitle().equals(s.getTitle());
    }

    // for the hashSet
    public int hashCode() {
        return title.hashCode();
    }
}
