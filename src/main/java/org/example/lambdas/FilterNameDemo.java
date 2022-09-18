package org.example.lambdas;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.function.Consumer;

public class FilterNameDemo {
    @SuppressWarnings("ConstantConditions")
    public static void main(String[] args) {
        File directory = new File("src/main/java");

        // Print all files in directory
        String[] fileNames = directory.list();
        System.out.println(Arrays.asList(fileNames));

        // Print only Java source files in directory
        fileNames = directory.list((dir, name) -> name.endsWith(".java"));
        System.out.println(Arrays.asList(fileNames));

        Arrays.stream(fileNames)
                .forEach(s -> System.out.println("The current strings is " + s));

        Arrays.stream(fileNames)
                .forEach(System.out::println);
    }
}
