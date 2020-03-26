package implementation;

/**
 * SynchronizedIncrement
 */
public class SynchronizedIncrement implements Runnable {

    private SynchronizedCounter counter;
    private int amount;

    public SynchronizedIncrement(SynchronizedCounter counter, int amount) {
        this.counter = counter;
        this.amount = amount;
    }

    @Override
    public void run() {
        for(int i = 0; i < amount; ++i) {
            counter.increment();
        }
    }   
}