package Streams_in_java;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class iterator_in_java {
    //Iterators are used for collections like Arraylist/ Hashmap etc
    public static void main(String[] args) {
        List<Integer> arr = List.of(43,53,2,4,2,5,7,44,9);
        try{
            var v = Files.list(Paths.get("src"));
//            var v = Files.walk(Paths.get("src/NIO_api"));
            v.forEach(System.out::println);
        }catch(Exception e){e.printStackTrace();}
    }
}
