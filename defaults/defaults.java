package defaults;

import java.util.Arrays;
import java.util.stream.Stream;

interface dog{
    default void talk(){
        System.out.println("bow bow");
    }
}

interface cat{
    default void talk(){
        System.out.println("mew mew");
    }
}

class Zoo implements dog,cat{
    @Override
    public void talk(){
        dog.super.talk();
    }
}

interface foo1{
    default void foo(){
        System.out.println("foo1");
    }
    static void fooo(){
        System.out.println("fooo");
    }
}
interface foo2{
    default void foo(){
        System.out.println("foo2");
    }
}


public class defaults implements foo1,foo2{

    public void foo(){
        foo1.super.foo();
    }

    public static void main(String[] args) {
//        Zoo z = new Zoo();
//        z.talk();
        new defaults().foo();
    }
}

//
//public class defaults{
//    public static void main(String[] args) {
////        foo1.fooo();
//
//        String [] arr = {"Hello", "World","How","Are","You??"};
//        Stream<String> stream = Arrays.stream(arr);
//        stream.forEach(System.out::println);
//    }
//}
