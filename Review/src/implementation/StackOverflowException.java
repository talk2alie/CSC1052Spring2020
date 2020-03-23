package implementation;

/**
 * An exception thrown when an attempt is made to add an element to a full stack
 */
public class StackOverflowException extends RuntimeException{

    /**
     * Provides unique serialization ID for the type
     */
    private static final long serialVersionUID = -7352697835574577110L;

    /**
     * Creates an instance with no initial set up of fields
     */
    public StackOverflowException() {
        super();
    }

    /**
     * Creates an instance with an initial error message
     * @param message The message to send back to the erroed code
     */
    public StackOverflowException(String message) {
        super(message);
    }
    
}