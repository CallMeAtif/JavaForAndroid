package Streams_in_java;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class peek_limit_sort {
    public static void main(String[] args) throws IOException {

        // peek

//        List<Integer> list = Arrays.asList(1,4,5,6,3);
//        List<Integer> newList = list.stream()
//                .peek(System.out::println).collect(Collectors.toList());
//        System.out.println(newList);


        //limit

//        List<Integer> list = Arrays.asList(1,4,5,6,3);
//        List<Integer> newList = list.stream()
//                .limit(3).collect(Collectors.toList());
//        System.out.println(newList);

        //sort

//        Random rnd = new Random();
//        rnd.ints().limit(10).sorted().forEach(System.out::println);
//
        Files.list(Paths.get("src"))
                .map(Path::getFileName)
                .map(Path::toString)
                .filter(name -> name.endsWith(".java"))
                .limit(5).sorted().forEach(System.out::println);
    }
}
