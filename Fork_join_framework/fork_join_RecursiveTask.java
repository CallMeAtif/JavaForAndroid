package Fork_join_framework;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/*
    RecursiveTask is an abstract class
    RecursiveTask ------> Callable (returns value)
 */
class AdditionUsingRecursiveTask extends RecursiveTask<Integer>{

    List<Integer> input;
    AdditionUsingRecursiveTask(List<Integer> input){
        this.input = input;
    }

    @Override
    public Integer compute(){
        if(input.size() <= 2){
            return input.stream().mapToInt(s -> s).sum();
        }
        else{
            int mid = input.size() / 2;
            List<Integer> list1 = input.subList(0, mid);
            List<Integer> list2 = input.subList(mid, input.size());

            AdditionUsingRecursiveTask a1 = new AdditionUsingRecursiveTask(list1);
            AdditionUsingRecursiveTask a2 = new AdditionUsingRecursiveTask(list2);

            a2.fork();

            return a1.compute() + a2.join();
        }
    }
}


class ComputeFibonacciTask extends RecursiveTask<Integer> {

    private int n;

    public ComputeFibonacciTask(int n) {
        this.n = n;
    }

    protected Integer compute() {
        if (n <= 1) {
//            return Integer.valueOf(n);
            return n;
        }

        else {
            RecursiveTask<Integer> otherTask = new ComputeFibonacciTask(n - 1);
            otherTask.fork();
            return new ComputeFibonacciTask(n - 2).compute() + otherTask.join();
        }
    }
}

public class fork_join_RecursiveTask {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        List<Integer> input = List.of(1,2,3,4,5,6,7,8);
        int sum = pool.invoke(new AdditionUsingRecursiveTask(input));
        System.out.println(sum);

//        int sum = pool.invoke(new ComputeFibonacciTask(4));
//        System.out.println(sum);


    }
}
