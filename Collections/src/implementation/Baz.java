package implementation;

import abstraction.ICancelable;

/**
 * Baz
 */
public class Baz implements ICancelable {

    @Override
    public void cancel() {
        System.out.println("From Baz");
    }

    
}