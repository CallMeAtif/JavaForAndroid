package Lambda_expressions;

import java.util.function.Consumer;
import java.util.function.Function;

public class runnable_lambda {
    Runnable r1 = () -> System.out.println(this);
    Runnable r2 = () -> System.out.println(toString());

    public String toString(){
        return "Hello world!";
    }
    public static void main(String[] args) throws InterruptedException {
        new runnable_lambda().r1.run();
        new runnable_lambda().r2.run();
    }
}
