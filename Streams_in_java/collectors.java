package Streams_in_java;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class collectors {
    public static void main(String[] args) {

        // toList


//        Stream<String> str = Stream.of("This", "is","a","Stream");
//        List<String> newlist = str.collect(Collectors.toList());
//        System.out.println(newlist);

        //toCollection
        //treeSet sorts the Strings in lexicographic order

//        Stream<String> str = Stream.of("This", "is","a","Stream");
//        Collection<String> name = str.collect(Collectors.toCollection(TreeSet::new));
//        System.out.println(name);


        //Joining

        String [] str = {"This", "is","joining","in","java"};
        List<String> list = Arrays.asList(str);
        String s = list.stream().collect(Collectors.joining(","));
        System.out.println(s);


    }
}
