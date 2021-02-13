package chapter1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class ListPrinterTest {

    @Test
    void printListStrings() {
        List<String> stringList = new ArrayList<>();
        stringList.add("aaaaaa");
        stringList.add("bbbbbbb");
        stringList.add("ccccccc");
        ListPrinter.printList(stringList);
    }
    @Test
    void printListInts() {
        List<Integer> integerListList = new ArrayList<>();
        integerListList.add(33);
        integerListList.add(22);
        integerListList.add(11);
        ListPrinter.printList(integerListList);
    }
}
