package implementation;

/**
 * An exception thrown when an attempt is made to add an element to a full queue
 */
public class QueueOverflowException extends RuntimeException{

    /**
     * Provides unique serialization ID for the type
     */
    private static final long serialVersionUID = -7342697836674577110L;

    /**
     * Creates an instance with no initial set up of fields
     */
    public QueueOverflowException() {
        super();
    }

    /**
     * Creates an instance with an initial error message
     * @param message The message to send back to the erroed code
     */
    public QueueOverflowException(String message) {
        super(message);
    }
    
}