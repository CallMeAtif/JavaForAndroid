package Streams_in_java;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class groupBy_partitioningBy {
    public static class Dragon{
        Dragon(String name){this.name = name;}
        String name;
        public String getName(){return name;}
        public String toString(){return name;}
        public boolean isGreen(){return Math.random() > 0.5;}
    }
    public static List<Dragon> getDragons(){
        return Arrays.asList(new Dragon("Atif"),new Dragon("Abhishek"),new Dragon("Faizaan"),new Dragon("Ilyas"));
    }

    public static void main(String[] args) {
        List<Dragon> dragons = getDragons();
        Map<Character, List<Dragon>> map =
                dragons.parallelStream().collect(groupingByConcurrent(d -> d.getName().charAt(0)));
        System.out.println(map);

        Map<Boolean , List<Dragon>> map2 = dragons.stream()
                .collect(partitioningBy(Dragon::isGreen));
        System.out.println(map2);

        // parallelStream is unordered

        // stream is ordered

        // groupingByConcurrent returns concurrent collector and is unordered(elements returned are unordered)

        // partitioningBy performs the operation according to the predicate (true/false is the key)

    }
}
