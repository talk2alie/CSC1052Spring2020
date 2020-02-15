package implementation;

import abstraction.Stack;

/**
 * BoundedStack
 */
public class BoundedStack<T> implements Stack<T> {

    protected final int DEFAULT_CAPACITY = 10;

    private int topIndex;
    private final int maxCapacity;

    public BoundedStack(int maxCapacity) {
        this.maxCapacity = maxCapacity == 0 ? DEFAULT_CAPACITY : maxCapacity;
        topIndex = -1;
    }

    public BoundedStack() {
        this(0);
    }

    @Override
    public void push(T element) throws StackOverflowException {
        // TODO Auto-generated method stub

    }

    @Override
    public void pop() throws StackUnderflowException {
        // TODO Auto-generated method stub

    }

    @Override
    public T top() throws StackUnderflowException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isFull() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    
}