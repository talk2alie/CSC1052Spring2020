package abstraction;

/**
 * Collection
 */
public interface Collection<T> {
    boolean add(T element);
    T get(T element);
    boolean contains(T element);
    boolean remove(T element);
    boolean isFull();
    boolean isEmpty();
    int size();
}