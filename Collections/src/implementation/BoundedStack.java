package implementation;

import abstraction.Stack;

/**
 * BoundedStack
 */
public class BoundedStack<T> implements Stack<T> {
    private T[] elements;
    private int maxCapacity;
    private final int DEFAULT_CAPACITY = 10;
    private int topIndex;

    public BoundedStack(int maxCapacity) {
        this.maxCapacity = maxCapacity > 0 ? maxCapacity : DEFAULT_CAPACITY;
        elements = (T[])new Object[this.maxCapacity];
        topIndex = -1;
    }

    public BoundedStack() {
        this(0);
    }

    @Override
    public void push(T element) throws StackOverflowException {
        if(isFull()) {
            throw new StackOverflowException("Stack is full");
        }

        topIndex++;
        elements[topIndex] = element;
    }

    @Override
    public void pop() throws StackUnderflowException {
        if(isEmpty()) {
            throw new StackUnderflowException("Stack is empty");
        }

        elements[topIndex] = null;
        topIndex--;
    }

    @Override
    public T top() throws StackUnderflowException {
        if(isEmpty()) {
            throw new StackUnderflowException("Stack is empty");
        }

        return elements[topIndex];
    }

    @Override
    public boolean isFull() {
        return (topIndex + 1) == maxCapacity;
    }

    @Override
    public boolean isEmpty() {
        return topIndex == -1;
    }

    
}