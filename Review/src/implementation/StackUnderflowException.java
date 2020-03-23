package implementation;

/**
 * An exception that is thrown when an attempt is made to view/remove an 
 * element from an empty stack
 */
public class StackUnderflowException extends RuntimeException {

    /**
     * Provides unique serialization ID for the type
     */
    private static final long serialVersionUID = -2015252839515998774L;

    /**
     * Creates an instance with no initial set up of fields
     */
    public StackUnderflowException() {
        super();
    }    

    /**
     * Creates an instance with an initial error message
     * @param message The message to send back to the erroed code
     */
    public StackUnderflowException(String message) {
        super(message);
    }
    
}