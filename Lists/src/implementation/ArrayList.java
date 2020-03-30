package implementation;

import abstraction.List;

public class ArrayList<T> implements List<T> {

    protected final int DEFAULT_CAPACITY = 10;

    protected int size = 0;
    protected int originalCapacity;

    protected T[] elements;

    public ArrayList(int capacity) {
        this.originalCapacity = capacity > 0 ? capacity : DEFAULT_CAPACITY;

        elements = (T[]) new Object[originalCapacity];
    }

    public ArrayList() {
        this(0);
    }

    @Override
    public boolean add(T element) {
        if (isFull()) {
            resize();
        }

        // Code here

        return true;
    }

    @Override
    public T get(T element) {
        // TODO Auto-generated method stub
        return null;
    }

    protected void resize() {
        T[] temporary = (T[]) new Object[elements.length * 2];
        for(int i = 0; i < elements.length; ++i) {
            temporary[i] = elements[i];
        }

        elements = temporary;
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
    public boolean contains(T element) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean remove(T element) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isFull() {
        return size == elements.length;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(int index, T element) throws IndexOutOfBoundsException {
        // TODO Auto-generated method stub

    }

    @Override
    public T set(int index, T newElement) throws IndexOutOfBoundsException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int indexOf(T element) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public T remove(int index) throws IndexOutOfBoundsException {
        // TODO Auto-generated method stub
        return null;
    }    
}