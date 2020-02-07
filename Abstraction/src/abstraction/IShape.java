package abstraction;

/**
 * Specifies the logical view of shapes
 * This interface indicates that any class that implements it
 * must have these methods
 */
public interface IShape {

    // Constant field to denote the Mathematical PI
    // When a class implements this interface, it gets this field for free
    final double PI = 3.14;

    // Method headers
    // When a class implements this interface, it acquires the resposnibility
    // to provide an implementation (a body) for these methods

    /**
     * Given a specific shape, calculates its perimeter
     * @return a double value that is the calculated perimeter of the shape
     */
    double perimeter();
    
    /**
     * Given a specific shape, calculates its area
     * @return a double value that is the calculated area of the shape
     */
    double area();
}

