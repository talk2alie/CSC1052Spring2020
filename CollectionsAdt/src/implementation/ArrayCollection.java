package implementation;

import abstraction.Collection;

/**
 * ArrayCollection
 */
public class ArrayCollection<T> implements Collection<T> {

    private int size = 0;
    private T[] elements;
    private int maxCapacity;
    private final int DEFAULT_MAX_CAPACITY = 10;

    public ArrayCollection(int maxCapacity) {
        this.maxCapacity = maxCapacity == 0 ? DEFAULT_MAX_CAPACITY : maxCapacity;
        elements = (T[]) new Object[this.maxCapacity];
    }

    public ArrayCollection() {
        this(0);
    }

    protected SearchResult searchFor(T element) {
        int location = -1;
        boolean isSuccessful = false;
        if(isEmpty()) {
            return new SearchResult(isSuccessful, location);
        }

        int index = 0;
        while(index < size) {
            if(elements[index].equals(element)) {
                isSuccessful = true;
                location = index;
                return new SearchResult(isSuccessful, location);
            }
            index++;
        }

        return new SearchResult(isSuccessful, location);
    }

    @Override
    public boolean add(T element) {
        if(isFull()) {
            return false;
        }

        elements[size] = element;
        size++;

        return true;
    }

    @Override
    public T get(T element) {
        SearchResult searchResult = searchFor(element);
        if(searchResult.isSuccessful()) {
            return elements[searchResult.location()];
        }

        return null;
    }

    @Override
    public boolean contains(T element) {
        SearchResult searchResult = searchFor(element);
        return searchResult.isSuccessful();
    }

    @Override
    public boolean remove(T element) {
        SearchResult searchResult = searchFor(element);
        if(searchResult.isSuccessful()) {
            size--;
            elements[searchResult.location()] = elements[size];
            elements[size] = null;
            return true;
        }

        return false;
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