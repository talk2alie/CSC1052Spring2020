package application;

import implementation.BoundedStack;

/**
 * WorkingWithCollections
 */
public class WorkingWithCollections {

    public static void main(String[] args) {

        final int maxCapacity = 5;
        BoundedStack<String> names = new BoundedStack<>(maxCapacity);
        names.push("Eric");
        names.push("Kevin");
        names.push("Mahyawi");
        names.push("Celeste");
        names.push("Alita");

        if(names.isFull()) {
            System.out.println("The stack is full");

            names.pop();
            names.pop();
            names.pop();
            names.pop();
            names.pop();
        }

       if(names.isEmpty()) {
           System.out.println("The stack is empty");
       }
    }
}