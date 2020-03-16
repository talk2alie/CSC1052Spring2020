package implementation;

import abstraction.Queue;

public class BoundedLinkQueue<T> implements Queue<T> {

    private int size;
    private LinkNode<T> front;
    private LinkNode<T> back;
    private int maxCapacity;
    private final int DEFAULT_CAPACITY = 5;
    
        public BoundedLinkQueue(int maxCapacity) {
            this.maxCapacity = maxCapacity == 0 ? DEFAULT_CAPACITY : maxCapacity;
        }

    public BoundedLinkQueue() {
        this(0);
    }

    @Override
    public void enqueue(T element) throws QueueOverflowException {
        if (isFull()) {
            throw new QueueOverflowException("The queue is full");
        }

        LinkNode<T> newElement = new LinkNode<>(element);
        if(back == null) {
            front = newElement;
        } else {
            back.setNext(newElement);
        }

        back = newElement;
        size++;
    }

    @Override
    public T dequeue() throws QueueUnderflowException {
        if(isEmpty()) {
            throw new QueueUnderflowException("Queue is empty");
        }

        T element = front.getValue();
        front = front.getNext();
        size--;
        if(front == null) {
            back = null;
        }

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