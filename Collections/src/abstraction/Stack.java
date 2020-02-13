package abstraction;

/**
 * Stack
 */
public interface Stack<T> {

    /**
     * Given an element, adds the element to the top o the stack
     * @param element The element to add to the top of the stack
     */
    void push(T element);

    /** 
     * Removes an element from the top of an element and discards it
     * NOTE: This operation will shorten the stack
     */
    void pop();

    /**
     * Retrieves the element at the top of the stack
     * @return The element at the top of the stack
     */
    T top();

    /**
     * Checks whether the stack is full
     * @return true if the stack is full; false, otherwise
     */
    boolean isFull();

    /**
     * Checks whether the stack is empty
     * @return true if the stack is empty; false, otherwise
     */
    boolean isEmpty();

}