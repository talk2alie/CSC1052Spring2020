package application;

import implementation.BoundedQueueWithFixedFront;

/**
 * BoundedQueueExamples
 */
public class BoundedQueueWithFixedFrontExamples {

    public static void main(String[] args) {
        BoundedQueueWithFixedFront<String> names = new BoundedQueueWithFixedFront<>();
        names.enqueue("Stephen");
        names.enqueue("Henry");
        names.enqueue("Celeste");
        names.enqueue("Erica");
        names.enqueue("Eric");

        System.out.println(names.size());

        while(!names.isEmpty()) {
            System.out.println(names.dequeue());
        }

        System.out.println(names.size());
    }
}