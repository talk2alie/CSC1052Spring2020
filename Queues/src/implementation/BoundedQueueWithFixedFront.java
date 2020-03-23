package implementation;

import abstraction.Queue;

public class BoundedQueueWithFixedFront<T> implements Queue<T> {

    private final int DEFAULT_CAPACITY = 10;
    private int backIndex = -1;
    private final int FRONT_INDEX = 0;
    private int maxCapacity;
    protected T[] elements;

    public BoundedQueueWithFixedFront(int maxCapacity) {
        this.maxCapacity = maxCapacity == 0 ? DEFAULT_CAPACITY : maxCapacity;
        elements = (T[]) new Object[this.maxCapacity];
    }

    public BoundedQueueWithFixedFront() {
        this(0);
    }

    @Override
    public void enqueue(T element) throws QueueOverflowException {
        if(isFull()) {
            throw new QueueOverflowException("The queue is full");
        }

        backIndex++;
        elements[backIndex] = element;
    }

    @Override
    public T dequeue() throws QueueUnderflowException {
        if(isEmpty()) {
            throw new QueueUnderflowException("Queue is empty");
        }

        T element = elements[FRONT_INDEX];
        for(int front = 0; front < backIndex; ++front) {
            elements[front] = elements[front + 1];
        }
        
        elements[backIndex] = null;
        backIndex--;
        return element;
    }

    @Override
    public boolean isFull() {
        return (backIndex + 1) == maxCapacity;
    }

    @Override
    public boolean isEmpty() {
        return backIndex == -1;
    }

    @Override
    public int size() {
        return backIndex + 1;
    }    
}