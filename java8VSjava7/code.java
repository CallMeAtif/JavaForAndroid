package java8VSjava7;

import java.util.*;

public class code{

    public String toString() {
        return "Hello!";
    }

    public List<String> func(List<String> list){
        System.out.println("java8");
        list.stream().forEach(System.out::println);
        System.out.println("___________");
        return list;
    }

    public List<String> incOrder(List<String> list){
        System.out.println("java8");
//        list.sort(Comparator.comparingInt(String::length));
        Collections.sort(list,(s1,s2) -> s1.length() - s2.length());
        func(list);
        return list;
    }

    public static class Person {
        String FirstName;
        String LastName;

        public String getFirstName() {
            return FirstName;
        }

        public String getLastName() {
            return LastName;
        }

        public Person(String firstName, String lastName) {
            FirstName = firstName;
            LastName = lastName;
        }

    }
    public List<Person> sortpeople(List<Person> list){
        list.sort(Comparator.comparing(Person::getLastName).thenComparing(Person::getFirstName));
        return list;
    }
    public static void main(String[] args) {
        code t = new code();
//        t.func(List.of("Atif","ParvezMama","abhishek","ilyas","Faizaan","pranav"));
//        t.incOrder(Arrays.asList("Atif", "ParvezMama", "abhishek", "ilyas", "Faizaan", "pranav"));
//        t.incOrder(List.of("Atif", "ParvezMama", "abhishek", "ilyas", "Faizaan", "pranav")); --> throws an error because list.of is unmodifiable
        code c = new code();
        Person [] list = {
            new Person("Atif","Mulla"),
            new Person("Parvez","Mullah"),
            new Person("Abhishek","Singh"),
            new Person("Ilyas","Gafoor")
        };
        var v = Arrays.asList(list);
        c.sortpeople(v);

        for(int i = 0; i < 4;i++){
            System.out.println(v.get(i).getFirstName() + v.get(i).getLastName());
        }


//        v.forEach(System.out::println);
    }
}