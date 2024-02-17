package Streams_in_java;

import java.util.Arrays;
import java.util.List;

class Item {
    String name;
    int price;
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
public class map_reduce_filter {

    public static void main(String[] args) {;
        List<Item> list = List.of(new Item("Chocolate",150),
                new Item("Tomato",30),
                new Item("Ice-cream",20),
                new Item("Popcorn", 100));

//        list.stream().filter(p -> p.price > 90).map(n -> n.name).forEach(System.out::println);

        List<Integer> in = Arrays.asList(-5, 5, -6, 6, 0);

//        int sum = in.stream().reduce(0,(c1,c2) -> c1+c2);
        int sum = in.stream().mapToInt(n -> n).sum();
        System.out.println("sum = " + sum);
    }
}

