package chapter1;

import java.util.ArrayList;
import java.util.List;

public class ListPrinter {
    public static void printList(List<?> list){
        for(Object obj: list)
            System.out.println(obj);
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("aaaaaa");
        stringList.add("bbbbbbb");
        stringList.add("ccccccc");
        printList(stringList);
    }

}
