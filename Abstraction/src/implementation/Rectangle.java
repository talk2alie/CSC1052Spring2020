package implementation;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import abstraction.IPrintable;
import abstraction.IShape;

/**
 * Rectangle
 */
public class Rectangle implements IShape, IPrintable {

    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public void print() {
        String name = this.getClass().getSimpleName();

        NumberFormat formatter = DecimalFormat.getInstance(Locale.US);
        String area = formatter.format(area());
        String perimeter = formatter.format(perimeter());

        System.out.println("The area of the " + name + " is: " + area);
        System.out.println("The perimeter of the " + name + " is: " + perimeter);
    }
}