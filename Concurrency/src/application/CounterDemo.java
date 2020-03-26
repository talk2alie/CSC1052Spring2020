package application;

import implementation.Counter;

/**
 * CounterDemo
 */
public class CounterDemo {

    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.increment();
        counter.increment();
        counter.increment();
        System.out.println("Count is: " + counter.getCount());
    }
}