/**
 * DivideByZeroException
 */
public class DivideByZeroException extends ArithmeticException{

    /**
     * This value is used to uniquely identify the version
     */
    private static final long serialVersionUID = 1982232698011220819L;

    public DivideByZeroException(String message) {
        super(message);
    }
}

