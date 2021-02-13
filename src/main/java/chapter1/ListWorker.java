package chapter1;

import java.util.ArrayList;
import java.util.List;

public class ListWorker {
    public static void printList(List<?> list){
        for(Object obj: list)
            System.out.println(obj);
    }

    //calculates sum of list
    public static long sumList(List<? extends Number> list){
        long sum = 0;
        for(Number number: list)
            sum += number.longValue();
        return sum;
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("aaaaaa");
        stringList.add("bbbbbbb");
        stringList.add("ccccccc");
        printList(stringList);
    }

}
