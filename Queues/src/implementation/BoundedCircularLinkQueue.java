package implementation;

import abstraction.Queue;

public class BoundedCircularLinkQueue<T> implements Queue<T> {

    private int size;
    private LinkNode<T> back;
    private int maxCapacity;
    private final int DEFAULT_CAPACITY = 5;

    public BoundedCircularLinkQueue(int size) {
        this.maxCapacity = maxCapacity == 0 ? DEFAULT_CAPACITY : maxCapacity;
    }

    public BoundedCircularLinkQueue() {
        this(0);
    }

    @Override
    public void enqueue(T element) throws QueueOverflowException {
        if (isFull()) {
            throw new QueueOverflowException("Queue is full");
        }

        LinkNode<T> newElement = new LinkNode<>(element);
        if(back == null) {
            back = newElement;
            back.setNext(back);
        } else {
            LinkNode<T> front = back.getNext();
            back.setNext(newElement);
            newElement.setNext(front);
            back = newElement;
        }

        size++;
    }

    @Override
    public T dequeue() throws QueueUnderflowException {
        if(isEmpty()) {
            throw new QueueUnderflowException("Queue is empty");
        }

        T element = back.getNext().getValue();
        back.setNext(back.getNext().getNext());
        size--;
        if(size == 0) {
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