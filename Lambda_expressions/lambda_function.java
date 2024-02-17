package Lambda_expressions;

import java.util.Comparator;
import java.util.function.*;

public class lambda_function {
    /*

    Function<T,R><T,R>: Takes an object of type T and returns R.
    Supplier<T><T>: Just returns an object of type T.
    Predicate<T><T>: Returns a boolean value based on input of type T.
    Consumer<T><T>: Performs an action with a given object of type T.
    BiFunction: It’s like Function but with two parameters.
    BiConsumer: It’s like Consumer but with two parameters.

     */

    static Function<String, String> atr = name -> "@"+ name;
    static Function<String ,Integer> leng = name -> name.length();
    static Function<String ,Integer> leng2 = String::length;
    static Supplier<String> sup = () -> "foo";
    static Consumer<Integer> con = n -> System.out.println(n);
    static BiFunction<Integer,Integer,Integer> additon = (n,t) -> n+t;
    static Predicate<Integer> pred = n -> n%2==0;
    public String name(){return "foo";}
    public static void main(String[] args) {


        // appending @ in the given string
        System.out.println(atr.apply("Atif"));
        System.out.println(atr.apply("ParvezMama"));

        //return the length of the string
        System.out.println(leng.apply("Atif"));
        System.out.println(leng2.apply("ParvezMama"));

        //This function takes the class and returns a String --> this statement lambda_function::name returns "foo"
        Function<lambda_function, String> name = lambda_function::name;
        System.out.println(name.apply(new lambda_function()));

        System.out.println(additon.apply(4, 5));
        System.out.println(sup.get());
        con.accept(89);
        System.out.println(pred.test(7));

        // Printing names along with there length

        String [] str = {"atif","parvez mama","faizaan","ilyas","abhishek","pranav"};
        for(String s: str){
            System.out.println(s + " " + leng.apply(s));
        }

    }
}
