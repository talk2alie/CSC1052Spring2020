package application;

import implementation.Counter;
import implementation.Increment;

public class CounterThreadDemo {

    public static void main(String[] args) {
        Counter counter = new Counter();
        Runnable incrementOperation = new Increment(counter, 10000);

        Thread thread = new Thread(incrementOperation);
        thread.start();
      
        System.out.println("Count is: " + counter.getCount());
    }
}