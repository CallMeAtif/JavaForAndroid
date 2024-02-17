package java8_miscellaneous;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class function_programming {

    public static Function<LocalDate, LocalDateTime> dateTimeFunction(
            final Function<LocalDate,LocalDate> f) {

        return f.andThen(d -> d.atTime(2, 2));
    }

    public static void main(String[] args) {
        /*

            compose...

            Returns a composed function that first applies the before function to its input,
            and then applies this function to the result.

            (this).compose((before))

            andThen...

            Returns a composed function that first applies this function to its input,
            and then applies the after function to the result.

            (this).compose((before))

         */

        Function<Integer, Double> half = a -> a/2.0; //2nd step
        half = half.andThen(a -> 3 * a); //3rd step
        half = half.compose(a -> a * a); //1st step
        System.out.println(half.apply(6));//54

//        Function id = Function.identity();
//        System.out.println(id);

//        Function<Integer,Integer> f1 = a -> 2*a;
//        Function<Integer,Integer> f2 = a -> a*a;
//        Function id = Function.identity();
//        System.out.println(f1.andThen(f2).apply(3));//36 ---> use f1 then use f2
//        System.out.println(f1.compose(f2).apply(3));//18 ---> use f2 then use f1
//        System.out.println(id.apply("Atif")); // --> returns whatever was given as an input (LOL)

        Function<Integer, String> f = Function.<Integer>identity()
                .andThen(i -> 2*i).andThen(i ->"str" + i);

        System.out.println(Stream.iterate(1,i -> i+1).limit(10).map(f).collect(Collectors.joining(",")));

        Function<LocalDate,LocalDateTime> plusTwoM = Function.<LocalDate>identity()
                .andThen(dateTimeFunction(d -> d.plusMonths(2)));

        System.out.println(
                Stream.iterate(LocalDate.now(), d -> d.plusDays(1))
                        .limit(10)
                        .map(plusTwoM)
                        .map(Object::toString)
                        .collect(Collectors.joining(", "))
        );



        // tuple

        tuple t = new tuple(1,2);
        System.out.println(t.get_1());
        System.out.println(t.get_2());



//        Extra
//        volatile ---> used to indicate that a variable's value can be modified by different threads
//        synchronized --> a powerful tool for achieving thread safety
//                        and synchronization in multithreaded applications
    }
}
