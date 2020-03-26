package implementation;

/**
 * Counter
 */
public class SynchronizedCounter {
    private int count;

    public SynchronizedCounter() {
        count = 0;
    }

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}