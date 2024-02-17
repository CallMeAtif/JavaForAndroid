package Streams_in_java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class statistics {
    public static void main(String[] args) throws IOException {

        /*  Program for Counting average number of lines of code
            in the Stream_in_java package

        var v = Files.walk(Paths.get("src/Streams_in_java/"))
                .map(Path::getFileName).map(Path::toString)
                .filter(name -> name.endsWith(".java")).toList();
//                .map(Path).map(Path::toString)
        Iterator t = v.iterator();
        List<Double> list = new ArrayList<>();
        while(t.hasNext()){
            list.add(Files.lines(Paths.get("src/Streams_in_java/"+t.next()))
                    .map(String::trim)
                    .filter(line -> !line.isEmpty())
                    .collect(Collectors.averagingInt(String::length)));

        }
        System.out.println(list);
        System.out.println(list.stream().collect(Collectors.averagingDouble(s -> s)));
ve code performs the same average as before
         */



        /*
            SummarizingInt is used to give all about the lines present in the file

        IntSummaryStatistics summary = Files.lines(Paths.get("src/Streams_in_java/collectors.java"))
                .map(String::trim)
                .filter(line -> !line.isEmpty())
                .collect(Collectors.summarizingInt(String::length));

        System.out.println("count =" + summary.getCount());
        System.out.println("max =" + summary.getMax());
        System.out.println("min =" + summary.getMin());

         */

        /*

        summaryStatistics is used to print all the stats directly 

        System.out.println(Files.lines(Paths.get("src/Streams_in_java/collectors.java"))
                .map(String::trim)
                .filter(line -> !line.isEmpty())
                .mapToInt(String::length)
                .summaryStatistics());

         */
    }
}
