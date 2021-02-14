package chapter3.collections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionsDemonstrator {
    public static void main(String[] args) {

        Collection<Integer> collection;
        collection = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1));
        collection.remove(2);
        System.out.println(collection);

        collection = new TreeSet<>(Arrays.asList(5, 4, 3, 2, 1));
        System.out.println(collection);

        collection = new HashSet<>();
        collection.addAll(Arrays.asList(555, 5555, 55, 55555, 5555555));
        System.out.println(collection);

        NavigableSet<Integer> navigableSet = new TreeSet<>(Stream.iterate(1, i -> ++i).limit(20).collect(Collectors.toSet()));


        System.out.println(navigableSet.ceiling(19));
        System.out.println(navigableSet.floor(19));
        System.out.println(navigableSet.higher(19));
        System.out.println(navigableSet.lower(19));

        List<String> newList = new ArrayList<>();

    }
}
