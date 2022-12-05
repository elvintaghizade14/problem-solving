package az.et.ocp.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MergeMethodApp {
    public static void main(String[] args) {
        BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;

        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", "Tram");

        favorites.merge(
                "Jenny",
                "Skyride", // s2, s1 is the current value here!!!
                (s1, s2) -> s1.length() > s2.length() ? s1 : s2
        );

        String jenny = favorites.merge("Jenny", "Skyride", mapper);
        String tom = favorites.merge("Tom", "Skyride", mapper);

        System.out.println(favorites);  // {Tom=Skyride, Jenny=Bus Tour}
        System.out.println(jenny);      // Bus Tour
        System.out.println(tom);        // Skyride

    }
}