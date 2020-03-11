package application;

// import implementation.BoundedQueueWithFixedFront;
import implementation.BoundedQueueWithFloatingFront;

/**
 * BoundedQueueExamples
 */
public class BoundedQueueWithFixedFrontExamples {

    public static void main(String[] args) {
        BoundedQueueWithFloatingFront<String> names = new BoundedQueueWithFloatingFront<>();
        names.enqueue("Stephen");
        names.enqueue("Henry");
        names.enqueue("Celeste");
        names.enqueue("Erica");
        names.enqueue("Eric");

        names.dequeue();
        
        names.enqueue("Penny");
        names.enqueue("Howard");
        names.enqueue("Rajesh");

        names.dequeue();

        names.enqueue("Amy");
        names.enqueue("Leonard");
        names.enqueue("Bernadette");
        names.enqueue("Wil");
        names.enqueue("Stewart");
        names.enqueue("Lesley");

        names.dequeue();
        names.dequeue();
        names.dequeue();        

        System.out.println(names.size());
    }
}