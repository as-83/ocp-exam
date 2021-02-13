package chapter3.generics;

import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Bounds {
    static class Bird{}

    static class Sparrow extends Bird{}

    public static void main(String[] args) {
        List<? extends Bird> birds = new ArrayList<>();
        // birds.add(new Sparrow()); //DOES NOT COMPILE
        // birds.add(new Bird());   //DOES NOT COMPILE

        List<? super IOException> exceptions = new ArrayList<Exception>();
        exceptions.add(new IOException());
        //exceptions.add(new Exception());//DOES NOT COMPILE
        exceptions.add(new EOFException());

    }
}
