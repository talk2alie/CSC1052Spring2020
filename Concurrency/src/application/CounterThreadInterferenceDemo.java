package application;

import implementation.Counter;
import implementation.Increment;

/**
 * CounterThreadInterferenceDemo
 */
public class CounterThreadInterferenceDemo {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable incrementOperation = new Increment(counter, 5000);

        Runnable aSecondIncrementOperation = new Increment(counter, 5000);

        Thread thread = new Thread(incrementOperation);
        
        Thread aSecondThread = new Thread(aSecondIncrementOperation);
        
        thread.start();
        aSecondThread.start();
        
        thread.join();
        aSecondThread.join();

        // What would this print?
        System.out.println("Count is: " + counter.getCount());
    }
}