package implementation;

import abstraction.Stack;

public class LinkStack<T> implements Stack<T> {

    protected LinkNode<T> root;

    public LinkStack(T rootValue) {
        root = new LinkNode<>(rootValue);
    }

    @Override
    public void push(T element) throws StackOverflowException {
        LinkNode<T> node = new LinkNode<>(element);
        node.setNext(root);
        root = node;
    }

    @Override
    public void pop() throws StackUnderflowException {
        if(isEmpty()) {
            throw new StackUnderflowException("The stack is empty.");
        }

        root = root.getNext();
    }

    @Override
    public T top() throws StackUnderflowException {
        return root.getValue();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    public LinkNode<T> getRoot() {
        return root;
    }

}