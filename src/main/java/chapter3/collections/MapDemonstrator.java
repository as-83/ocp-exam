package chapter3.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemonstrator {

    public static void main(String[] args) {
        Map<String, Integer> map =  new HashMap<>();
        fillMap(map);
        printMap(map);

        map =  new TreeMap<>();
        fillMap(map);
        printMap(map);

    }

    private static void fillMap(Map<String, Integer> map) {
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);

    }

    private static void printMap(Map<String, Integer> map) {
        map.forEach((k, v) -> System.out.println("key - " + k + ", value - " +  v + ", hash - " + k.hashCode()));
    }
}
