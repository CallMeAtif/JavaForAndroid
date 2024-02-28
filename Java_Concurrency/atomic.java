package Java_Concurrency;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

class AtomicExample{
    /*
    The primary use of AtomicInteger is when you are in a multithreaded context and you need to perform thread safe operations on an integer without using synchronized keyword

    AtomicBoolean --> for booleans
    AtomicReference --> for objects
    AtomicLong --> for long
    AtomicInteger --> for integers

     */

    AtomicInteger count = new AtomicInteger(0);
    public void increment(){
        count.getAndIncrement();
    }
}

public class atomic{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        AtomicExample atom = new AtomicExample();
        Thread t11 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i= 0; i < 100000; i++){
                    atom.increment();
                }
            }
        });
        Thread t12 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i= 0; i < 100000; i++){
                    atom.increment();
                }
            }
        });

        t11.start();
        t12.start();
        t11.join();
        t12.join();
        System.out.println(atom.count);

    }
}
