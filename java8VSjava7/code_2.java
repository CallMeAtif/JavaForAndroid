package java8VSjava7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class code_2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 3, 7, 1, 7, 0, 9, 6, 4, 6, 2);

        int i = 0;
//        var v = list.stream().reduce(0, (n,k) -> Math.min(n,k));
//        System.out.println(v);



//        System.out.println("Maximum = "+list.stream().reduce(0,Math::max));
//        System.out.println("Minimum = "+list.stream().mapToInt(Number::intValue).min().getAsInt());
//        System.out.println("Average = " + list.stream().mapToInt(Number::intValue).average().getAsDouble());

        
        IntStream.range(1,11).forEach(System.out::println);
        //or
        Stream.iterate(1,k -> k+1).limit(10).forEach(System.out::println);

    }
}
