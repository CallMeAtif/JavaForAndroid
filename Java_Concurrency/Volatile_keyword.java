package Java_Concurrency;

import java.security.spec.ECField;

public class Volatile_keyword{
    private static volatile int counter = 0;
    /*volatile keyword is used to create the value reference
    in the memory instead of in cpu cache to quickly read during multithreading
     */

    public static void main(String[] args) throws Exception {
        Thread t = new Thread(() -> {
            int local_counter = counter;
            while(local_counter < 10){
                if(local_counter != counter){
                    System.out.println("[T1] local counter changed");
                    local_counter = counter;
                }
            }

        });
        Thread t2 = new Thread(() -> {
            int local_counter = counter;
            while (local_counter < 10){
                System.out.println("[T2] incremented counter to "+ (local_counter+1));
                counter = ++local_counter;
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        t.start();
        t2.start();

    }
}
