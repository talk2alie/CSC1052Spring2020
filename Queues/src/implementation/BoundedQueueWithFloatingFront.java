package implementation;

import abstraction.Queue;

/**
 * BoundedQueueWithFloatingFront
 */
public class BoundedQueueWithFloatingFront<T> implements Queue<T> {

    private final int DEFAULT_CAPACITY = 10;
    private int backIndex = -1;
    private int frontIndex = 0;
    private int maxCapacity;
    protected T[] elements;
    private int size = 0;

    public BoundedQueueWithFloatingFront(int maxCapacity) {
        this.maxCapacity = maxCapacity == 0 ? DEFAULT_CAPACITY : maxCapacity;
        elements = (T[]) new Object[this.maxCapacity];
    }

    public BoundedQueueWithFloatingFront() {
        this(0);
    }

    @Override
    public void enqueue(T element) throws QueueOverflowException {
        if(isFull()) {
            throw new QueueOverflowException("The queue is full");
        }

        size++;
        backIndex = (backIndex + 1) % maxCapacity;
        elements[backIndex] = element;
    }

    @Override
    public T dequeue() throws QueueUnderflowException {
        if(isEmpty()) {
            throw new QueueUnderflowException("Queue is empty");
        }

        T element = elements[frontIndex];
        elements[frontIndex] = null;
        
        size--;
        frontIndex = (frontIndex + 1) % maxCapacity;
        return element;
    }

    @Override
    public boolean isFull() {
        return size == maxCapacity;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }
    
}