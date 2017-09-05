package DataStracture.Map;

import java.util.HashMap;

public class TestMap {
    public static void main (String[] args) {
        HashMap<String, Integer> scores = new HashMap<String, Integer>();

        scores.put("Me", 20);
        scores.put("You", 40);
        scores.put("He", 30);

        System.out.println(scores);
        System.out.println(scores.get("Me"));
    }
}
