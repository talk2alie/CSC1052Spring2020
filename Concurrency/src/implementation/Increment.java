package implementation;

/**
 * Increment
 */
public class Increment implements Runnable {

    private Counter counter;
    private int amount;

    public Increment(Counter counter, int amount) {
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