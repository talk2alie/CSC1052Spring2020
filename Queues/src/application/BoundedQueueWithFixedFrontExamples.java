package application;

import implementation.BoundedQueueWithFixedFront;
// import implementation.BoundedQueueWithFloatingFront;

/**
 * BoundedQueueExamples
 */
public class BoundedQueueWithFixedFrontExamples {

    public static void main(String[] args) {
        BoundedQueueWithFixedFront<Integer> numbers = new BoundedQueueWithFixedFront<>(4);
        numbers.enqueue(1);
        numbers.enqueue(3);
        numbers.enqueue(5);
        numbers.enqueue(10);

        while(!numbers.isEmpty()) {
            System.out.println(numbers.dequeue());
        }
    }
}