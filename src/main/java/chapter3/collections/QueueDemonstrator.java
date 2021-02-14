package chapter3.collections;

import java.util.ArrayDeque;
import java.util.stream.IntStream;

public class QueueDemonstrator {
    public static void main(String[] args) {
        ArrayDeque<Integer> integerQueue = new ArrayDeque<>();

        IntStream.iterate(1, i -> ++i).limit(10).forEach(i -> integerQueue.add(i));
        IntStream.iterate(1, i -> ++i).limit(11).forEach(i -> System.out.print(integerQueue.peek() + " "));
        System.out.println();
        IntStream.iterate(1, i -> ++i).limit(11).forEach(i -> System.out.print(integerQueue.poll() + " "));

        System.out.println();
        IntStream.iterate(1, i -> ++i).limit(10).forEach(i -> integerQueue.push(i));
        integerQueue.forEach( i -> System.out.print(i + " "));
        System.out.println();
        IntStream.iterate(1, i -> ++i).limit(10).forEach(i -> System.out.print(integerQueue.pop() + " "));


    }
}
