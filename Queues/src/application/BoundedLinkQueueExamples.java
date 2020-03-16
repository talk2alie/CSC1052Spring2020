package application;

import implementation.BoundedCircularLinkQueue;
import implementation.BoundedLinkQueue;

/**
 * BoundedLinkQueueExamples
 */
public class BoundedLinkQueueExamples {
    public static void main(String[] args) {
        BoundedCircularLinkQueue<Integer> numbers = new BoundedCircularLinkQueue<>();
        numbers.enqueue(5);
        numbers.enqueue(6);
        numbers.enqueue(7);

        System.out.println(numbers.dequeue());
        System.out.println(numbers.dequeue());
        System.out.println(numbers.dequeue());

        numbers.enqueue(8);

        System.out.println(numbers.dequeue());
        
    }
}