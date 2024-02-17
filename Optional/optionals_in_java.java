package Optional;

import java.util.Optional;
import java.util.function.Supplier;

public class optionals_in_java {
    public static void main(String[] args) {
        Optional<Cat> optionalCat = findCatByName("fred");

        // .get is always used in .isPresent
//        if(optionalCat.isPresent()){
//            System.out.println(optionalCat.get().getAge());
//        }



        //optionalCat.orElse --> (optioncalCat --> will the value if present) (.orElse --> will return something defined )
        //Cat mycat = optionalCat.orElse(new Cat("UNKNOWN",0));


        //orElseGet takes lambda SUPPLIER function
//        Supplier<Cat> sup = () -> new Cat("Uknown",0);
//        Cat mycat = optionalCat.orElseGet(sup);
//        System.out.println(mycat.getAge());


        System.out.println(optionalCat.map(Cat::getAge).orElse(0));
    }

    public static Optional<Cat> findCatByName(String name){
        Cat cat = new Cat(name,3);
        return Optional.ofNullable(cat);
    }
}
