package chapter4;

import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo {

    static Optional<Double> avg(int ... nums){
        return nums.length == 0 ? Optional.empty() : Optional.of((double)Arrays.stream(nums).sum() / nums.length);
    }
}
