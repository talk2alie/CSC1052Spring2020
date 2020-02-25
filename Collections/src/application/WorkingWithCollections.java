package application;

import implementation.BoundedStack;
import implementation.StackOverflowException;
import implementation.StackUnderflowException;

public class WorkingWithCollections {

    public static void main(String[] args) {
        try {
            BoundedStack<Integer> numbers = new BoundedStack<>();
            numbers.push(13);
            numbers.push(12);
            numbers.push(14);
            numbers.push(9);
            numbers.push(31);
            numbers.push(10);
            numbers.push(22);
            numbers.push(19);
            numbers.push(50);
            numbers.push(66);
            numbers.push(33);
        } catch (StackOverflowException e) {
            System.out.println(e.getMessage());
        } catch(StackUnderflowException e) {
            System.out.println(e.getMessage());
        }
    }
}