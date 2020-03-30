package abstraction;

public interface List<T> extends Collection<T> {
    void add(int index, T element) throws IndexOutOfBoundsException;
    T set(int index, T newElement) throws IndexOutOfBoundsException;
    T get(int index) throws IndexOutOfBoundsException;
    int indexOf(T element);
    T remove(int index) throws IndexOutOfBoundsException;
}