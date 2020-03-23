package abstraction;

import implementation.QueueOverflowException;
import implementation.QueueUnderflowException;

public interface Queue<T> {
    void enqueue(T element) throws QueueOverflowException;
    
    T dequeue() throws QueueUnderflowException;

    boolean isFull();

    boolean isEmpty();

    int size();
}