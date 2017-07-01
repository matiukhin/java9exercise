package com.java9.test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {
        List<Integer> list = List.of(1, 2, 3);

        try {
            list.set(1, 1);
        } catch (UnsupportedOperationException ex) {
            ex.printStackTrace();
        }

        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).takeWhile(i -> i < 5).forEach(System.out::println);

    }

}


