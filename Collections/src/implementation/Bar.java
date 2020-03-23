package implementation;

import abstraction.ICancelable;

/**
 * Bar
 */
public class Bar implements ICancelable {

    @Override
    public void cancel() {
        System.out.println("From Bar");

    }

    
}