package org.example.javaTechie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BookService {

    public List<Book> displaySortedList(List<Book> books){
        Collections.sort(books,(b1,b2) -> b1.getName() - b2.getName());
        return  books;
    }

    public static void main(String[] args) {

    }
}
