package org.example.functionalbook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

public class Test {



    List<String> numberString = Arrays.asList("12", "34", "82");
    List<Integer> numbers = new ArrayList<>();
    List<Integer> doubleNumbers = new ArrayList<>();

    public String processString(Function<String,String> operation, String target) {
        return operation.apply(target);
    }





    public static void main(String[] args) {
        String[] names = {"kelly","Belly "};

          IntStream.iterate(0, n -> n + 1)
                .filter(n -> n>10 && n<100)
                .limit(10)
                .forEach(n -> System.out.print(n + " "));


    }
}
