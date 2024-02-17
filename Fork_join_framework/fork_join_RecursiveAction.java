package Fork_join_framework;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

/*
    RecursiveAction is an abstract class
    RecursiveAction ------> Runnable (doesn't return anything)
 */
class DoubleNumbersRecursiveAction extends RecursiveAction{
    private final List<Integer> input;

    DoubleNumbersRecursiveAction(List<Integer> input){
        this.input = input;
    }

    @Override
    protected void compute() {
        if(input.size() <= 2){
            input.stream().map(n -> 2*n).forEach(System.out::println);
        }
        else{
            int mid = input.size() / 2;
            List<Integer> list1 = input.subList(0,mid);
            List<Integer> list2 = input.subList(mid,input.size());

            DoubleNumbersRecursiveAction t1 = new DoubleNumbersRecursiveAction(list1);
            DoubleNumbersRecursiveAction t2 = new DoubleNumbersRecursiveAction(list2);
            invokeAll(t1,t2);
        }
    }
}
public class fork_join_RecursiveAction {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        List<Integer> input = List.of(1,2,3,4,5,6,7,8,9);
        pool.invoke(new DoubleNumbersRecursiveAction(input));
    }
}
