package org.example.refactors;

import java.util.*;
import java.util.stream.Collectors;

public class SortIf {
    public static void main(String[] args) {
        String[] strings = "this is an array of strings".split(" ");

        List<String> evenLengths = new ArrayList<>();
        for (String s : strings) {
            if (s.length() % 2 == 0) {
                evenLengths.add(s);
            }
        }

        List<String>  strings1  = List.of(strings);
                                 strings1.stream()
                                         .map((s -> s.length()))
                                         .filter(x -> x % 2 == 0)
                                         .collect(Collectors.toList());


//        Collections.sort(evenLengths, new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.length() - s2.length();
//            }
//        });

//        for (String s : evenLengths) {
//            System.out.print(s);
//        }
//        System.out.println();
        System.out.print(strings1);
    }
}