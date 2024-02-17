package Fork_join_framework;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.List;
import java.util.concurrent.RecursiveTask;
import java.util.stream.IntStream;


class DoubleNumbers extends RecursiveAction{
    List<Integer> input;
    DoubleNumbers(List<Integer> input){
        this.input = input;
    }

    @Override
    protected void compute() {
        if(input.size() <= 2){
            input.stream().map(n -> 2*n).forEach(System.out::println);
        }
        else{
            int mid = input.size() / 2;
            DoubleNumbers t1 = new DoubleNumbers(input.subList(0,mid));
            DoubleNumbers t2 = new DoubleNumbers(input.subList(mid ,input.size()));

            invokeAll(t1, t2);
        }
    }
}

class AdditonUsingRecursiveTask extends RecursiveTask<Integer>{

    List<Integer> input;

    AdditonUsingRecursiveTask(List<Integer> input){
        this.input = input;
    }

    @Override
    protected Integer compute() {
        if(input.size() <= 2){
            return input.stream().mapToInt(s -> s).sum();
        }
        else{
            int mid = input.size() / 2;
            AdditionUsingRecursiveTask t1 = new AdditionUsingRecursiveTask(input.subList(0,mid));
            AdditionUsingRecursiveTask t2 = new AdditionUsingRecursiveTask(input.subList(mid,input.size()));

            t2.fork();

            return t1.compute() + t2.join();
        }
    }
}

class Fibonacci extends RecursiveTask<Integer>{
    int input;
    Fibonacci(int input){
        this.input = input;
    }

    @Override
    protected Integer compute() {
        if(input <= 1){
            return input;
        }
        else{
            Fibonacci f1 = new Fibonacci(input -1);
            Fibonacci f2 = new Fibonacci(input -2);

            f2.fork();
            return f1.compute() + f2.join();
        }
    }
}


public class temp {
    public static void main(String[] args) {
//        3,2,1,7,6,9,1,2,4,4
        ForkJoinPool pool = new ForkJoinPool();
//        pool.invoke(new DoubleNumbers(List.of(1,2,3,4,5,6,7,8,9)));
//        System.out.println(pool.invoke(new AdditonUsingRecursiveTask(List.of(3,2,1,7,6,9,1,2,4,4,11))));

//        System.out.println(pool.invoke(new Fibonacci(7)));
    }
}
