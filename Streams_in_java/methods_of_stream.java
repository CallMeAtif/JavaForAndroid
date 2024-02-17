package Streams_in_java;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.nio.file.Path;

public class methods_of_stream {
    public static void main(String[] args) {
//        Stream.iterate(0, n -> n+1).limit(10).forEach(System.out::println);
        /*
        .limit limits the stream to 10 elements

         */

//        Stream.generate(() -> Math.random()).limit(10).forEach(System.out::println);
        /*
        Take nothing but return a value using Math.random func
         */

        Stream<Integer> s = Stream.of(1,2,3); //creating a stream from values

        String [] arrs = {"1","2","3","4","5","6","7"};
        IntStream st = Arrays.stream(arrs).mapToInt(n -> Integer.valueOf(n));
//        st.forEach(System.out::println);

        // reading from a file using stream
//        --> in NIO_api

    }
}
