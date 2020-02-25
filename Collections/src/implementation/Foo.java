package implementation;

import abstraction.ICancelable;

/**
 * Foo
 */
public class Foo implements ICancelable {

    @Override
    public void cancel() {
        System.out.println("From Foo");

    }

    
}