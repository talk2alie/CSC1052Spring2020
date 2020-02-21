package implementation;

import abstraction.Stack;

/**
 * Represents a structure that stores elements and provides stack access to them
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

    /**
     * Creates a new bounded stack with the default max capacity
     */
    public BoundedStack() {
        // This is how you call a constructor inside a class.
        // This can only be done inside of another constructor.
        // Here, we are calling out the parameterized constructor on line 18.
        // We do not want to repeat the same code we wrote in that constructor, so
        // we simply call it and pass 0, indicating the user did not provide a
        // max capacity
        this(0);
    }

    /**
     * Adds the given element to the stack
     * 
     * @param element The element to add to the stack
     */
    @Override
    public void push(T element) throws StackOverflowException {
        if (isFull()) {
            throw new StackOverflowException("The stack is full. Cannot add more elements");
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
            throw new StackUnderflowException("The stack is emepty. Cannot remove an element from an empty stack");
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
            throw new StackUnderflowException("The stack is emepty. Cannot view an element from an empty stack");
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

}