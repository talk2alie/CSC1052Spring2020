package implementation;

import abstraction.Stack;

/**
 * BoundedStack
 */
public class BoundedStack<T> implements Stack<T> {

    private int lastOccupiedIndex;
    protected final int DEFAULT_CAPACITY = 10;
    private final int maxCapacity;
    private final T[] elements;

    /**
     * Creates a new bounded stack with the max capacity provided
     * 
     * @param maxCapacity The maximum number of elements the stack will hold
     */
    public BoundedStack(final int maxCapacity) {
        // If the user provided a max capacity, we use it.
        // Otherwise, we use the default max capacity on line 10
        this.maxCapacity = maxCapacity == 0 ? DEFAULT_CAPACITY : maxCapacity;
        elements = (T[]) new Object[this.maxCapacity];
        lastOccupiedIndex = -1;
    }

    public BoundedStack() {
        this(0);
    }

    @Override
    public void push(T element) throws StackOverflowException {
        if(isFull()) {
            throw new StackOverflowException("Stack is full");
        }

        lastOccupiedIndex++;
        int index = lastOccupiedIndex;
        while(index > 0) {
            elements[index] = elements[index - 1];
            index--;
        }

        elements[index] = element;
    }

    @Override
    public void pop() throws StackUnderflowException {
        if(isEmpty()) {
            throw new StackUnderflowException("Stack is empty");
        }
        
        int index = 1;
        while(index <= lastOccupiedIndex) {
            elements[index - 1] = elements[index];
            index++;
        }

        elements[lastOccupiedIndex] = null;
        lastOccupiedIndex--;
    }

    @Override
    public T top() throws StackUnderflowException {
        if(isEmpty()) {
            throw new StackUnderflowException("Stack is empty");
        }

        final int FIRST = 0;
        return elements[FIRST];
    }

    @Override
    public boolean isFull() {
        return lastOccupiedIndex == (maxCapacity - 1);
    }

    @Override
    public boolean isEmpty() {
        return lastOccupiedIndex == -1;
    }

    public int count() {
        int count = 0;
        while(elements[count] != null) {
            count++;
        }
        return count;
    }
    
}