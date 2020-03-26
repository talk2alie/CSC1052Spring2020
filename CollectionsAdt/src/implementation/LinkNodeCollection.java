package implementation;

import abstraction.Collection;

/**
 * LinkNodeCollection
 */
public class LinkNodeCollection<T> implements Collection<T> {

    private int maxCapacity;
    final int DEFAULT_MAX_CAPACITY = 10;
    private LinkNode<T> elements;
    private int size;

    public LinkNodeCollection(int maxCapacity) {
        this.maxCapacity = maxCapacity == 0 ? DEFAULT_MAX_CAPACITY : maxCapacity;
    }

    public LinkNodeCollection() {
        this(0);
    }

    @Override
    /**
     * This version of add has both O(n) and O(1) implementations
     * The O(n) implementation is commented out
     */
    public boolean add(T element) {
        if(isFull()) {
            return false;
        }

        LinkNode<T> next = new LinkNode<>(element);
        if(isEmpty()) {
            elements = next;
            size++;
            return true;
        }

        // NOTE: This is the O(n) implementation
        // LinkNode<T> temp = elements;
        // while(temp.getNext() != null) {
        //     temp = temp.getNext();
        // }
        // temp.setNext(next);

        // NOTE: This is the O(1) implementation
        next.setNext(elements);
        elements = next;

        size++;
        return true;
    }

    @Override
    public T get(T element) {
        LinkNode<T> found = searchFor(element);
        return found == null ? null : found.getValue();
    }

    @Override
    public boolean contains(T element) {
        LinkNode<T> found = searchFor(element);
        return found != null;
    }

    @Override
    public boolean remove(T element) {
        if(isEmpty()) {
            return false;
        }

        LinkNode<T> navigation = elements;
        while(navigation.getNext() != null && !navigation.getNext().getValue().equals(element)) {
            navigation = navigation.getNext();
        }

        if(navigation == null || navigation.getNext() == null) {
            return false;
        }

        navigation.setNext(navigation.getNext().getNext());
        size--;
        return true;
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

    protected LinkNode<T> searchFor(T element) {
        LinkNode<T> navigation = elements;
        while(navigation != null && !navigation.getValue().equals(element)) {
            navigation = navigation.getNext();
        }

        return navigation;
    }
}