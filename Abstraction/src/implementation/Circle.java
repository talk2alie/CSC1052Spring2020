package implementation;

import abstraction.IShape;
import abstraction.PrintableShape;

/**
 * Circle
 */
public class Circle extends PrintableShape {

    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }    
	
	public boolean isLargerThan(IShape other) {
		return perimeter() > other.perimeter();
    }
    
}