package chapter3.comparators;

import java.util.*;
import java.util.stream.Collectors;

class Dog implements Comparable<Dog>{
    protected String name;
    protected int weight;

    public Dog(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Dog o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}

public class ComparatorsDemo {

    public static void main(String[] args) {
        List<Dog> dogs;
        dogs = new ArrayList<>(Arrays.asList(
                new Dog("a", 12),
                new Dog("b", 10),
                new Dog("c", 8),
                new Dog("d", 6)));

        Collections.sort(dogs);
        System.out.println(dogs);

        Comparator<Dog> byWeight = (d1, d2) -> d1.weight - d2.weight;
        Collections.sort(dogs, byWeight);
        System.out.println(dogs);

    }
}
