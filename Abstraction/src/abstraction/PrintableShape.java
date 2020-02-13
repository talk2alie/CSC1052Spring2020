package abstraction;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * PrintableShape
 */
public abstract class PrintableShape implements IShape, IPrintable {

    
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