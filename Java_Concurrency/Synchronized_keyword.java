package Java_Concurrency;

class Count{
    int count;
    //sychronized can only be used on methods
    //only one Thread can work if t is working t2 is waiting
    public synchronized void increment(){
        count++;
    }
}
public class Synchronized_keyword {
    public static void main(String[] args) throws InterruptedException {
        Count c = new Count();
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 100000; i++){
                    c.increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 100000; i++){
                    c.increment();
                }
            }
        });
        t.start();
        t2.start();
        t.join();
        t2.join();
        System.out.println(c.count);
    }
}
