package collection.chp8;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //
        Set<String> friends = Set.of("Rafa", "Jafa");
        System.out.println(friends);


        /* MAP */
        Map<String, Integer> ageOfFriends = Map.of("Rafa", 20, "Steve", 21, "Dasha", 33);
        System.out.println(ageOfFriends);

        Map<String, Integer> kv = Map.ofEntries(Map.entry("Rafa", 100), Map.entry("KJ", 20));
        System.out.println(kv);

        List<String> actors = List.of("Michael", "Donna", "Mia", "Men");
        actors.removeIf(ac->ac.startsWith("Mi"));
        System.out.println(actors);

        /*MAP MERGE*/
        Map<String, String> family = Map.ofEntries(
                Map.entry("Teo", "Star Wars"),
                Map.entry("Christina", "James Bond"),
                Map.entry("Chris", "John Wick")
        );

        Map<String, String> friendsMap = Map.ofEntries(
                Map.entry("Raphael", "Start Wars"),
                Map.entry("John", "John Wick")
        );

        Map<String, String> everyone = new HashMap<>(family);
        everyone.putAll(friendsMap);
    }
}
