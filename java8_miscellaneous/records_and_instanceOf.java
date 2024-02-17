package java8_miscellaneous;


public class records_and_instanceOf {
//    Records are ways to store data groups similar to
//    how a class is composed of data but in an immutable, more compact, and slimmer way
    record Car(int year,String model,String make){}
    public static void main(String[] args) {
        Car c = new Car(2020,"5","Tesla");
        System.out.print(String.format("""
                This car is of year %s
                The model number is %s
                The car is of %s
                """,c.year(),c.model(),c.make()));

        //instanceof operator is used to test whether the object is an instance of the specified type
        String x = "hello world!";
        if(x instanceof String){
            String s = x;
            System.out.println(s);
        }


    }
}
