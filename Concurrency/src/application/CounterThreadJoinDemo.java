package application;

import implementation.Counter;
import implementation.Increment;

/**
 * CounterThreadJoinDemo
 */
public class CounterThreadJoinDemo {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable incrementOperation = new Increment(counter, 10000);

        Thread thread = new Thread(incrementOperation);
        thread.start();
        thread.join();
        
        System.out.println("Expected: 10000");
        System.out.println("Count is: " + counter.getCount());
    }
}