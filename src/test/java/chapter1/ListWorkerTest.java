package chapter1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ListWorkerTest {

    @Test
    void printListStrings() {
        List<String> stringList = new ArrayList<>();
        stringList.add("aaaaaa");
        stringList.add("bbbbbbb");
        stringList.add("ccccccc");
        ListWorker.printList(stringList);
    }
    @Test
    void printListInts() {
        List<Integer> integerListList = new ArrayList<>();
        integerListList.add(33);
        integerListList.add(22);
        integerListList.add(11);
        ListWorker.printList(integerListList);
    }

    @Test
    void testSumListWithIntegerList() {
        List<Integer> integerList = Arrays.asList(1, 1, 1, 1, 1);
       long result = ListWorker.sumList(integerList);
       assertEquals(5, result);
    }

    @Test
    void testSumListWithLongList() {
        int numberOfOnes = 10;
        List<Long> integerList = Stream.generate(() -> 1L).limit(numberOfOnes).collect(Collectors.toList());
       long result = ListWorker.sumList(integerList);
       assertEquals(numberOfOnes, result);
    }

    @Test
    void testSumListWithDoubleList() {
        long numberOfOnes = 10;
        List<Double> integerList = Stream.generate(() -> 1.0).limit(numberOfOnes).collect(Collectors.toList());
       long result = ListWorker.sumList(integerList);
       assertEquals(numberOfOnes, result);
    }

    @Test
    void addStringTest() {
        List<String> stringList = new ArrayList<>();
        stringList.add("aaaaa");
        List<Object> objectList = new ArrayList<>(stringList);
        ListWorker.addString(stringList);
        ListWorker.addString(objectList);
        assertEquals(stringList.get(stringList.size() - 1), objectList.get(objectList.size() - 1));
    }
}
