package org.example.functionalbook;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapReview {
    List<Rectangle> list1 = Arrays.asList(
            new Rectangle(10, 10, 20, 20),
            new Rectangle(10, 20, 30, 40),
            new Rectangle(40, 30, 20, 20));
    List<Rectangle> list2 = Arrays.asList(
            new Rectangle(50, 50, 30, 30),
            new Rectangle(60, 60, 20, 20));

    Stream<Rectangle> list1Stream = list1.stream();
    Stream<Rectangle> list2Stream = list2.stream();
    Stream<Rectangle> concatenatedStream = Stream.concat(list1Stream, list2Stream);


}
