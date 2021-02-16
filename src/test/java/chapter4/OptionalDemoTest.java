package chapter4;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class OptionalDemoTest {

    @Test
    void avgTestWithNoParams() {
        Optional<Double> result = OptionalDemo.avg();
        assertTrue(result.isEmpty());
    }

    @Test
    void avgTestWithParams() {
        Optional<Double> result = OptionalDemo.avg(1, 2, 3, 4, 5, 6);
        assertTrue(!result.isEmpty());
        assertEquals(3.5, result.get());
    }
}
