package application;

import implementation.SynchronizedCounter;
import implementation.SynchronizedIncrement;

/**
 * SynchronizedCounterThreadDemo
 */
public class SynchronizedCounterThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        SynchronizedCounter synchronizedCounter = new SynchronizedCounter();

        Runnable incrementOperation = new SynchronizedIncrement(synchronizedCounter, 5000);
        Runnable aSecondIncrementOperation = new SynchronizedIncrement(synchronizedCounter, 5000);

        Thread thread = new Thread(incrementOperation);
        Thread aSecondThread = new Thread(aSecondIncrementOperation);

        thread.start();
        aSecondThread.start();

        thread.join();
        aSecondThread.join();
        
        System.out.println("Count is: " + synchronizedCounter.getCount());
    }
}