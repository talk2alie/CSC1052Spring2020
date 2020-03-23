package application;

import implementation.BoundedStack;
import implementation.LinkNode;

/**
 * WorkingWithCollections
 */
public class WorkingWithCollections {

    public static void main(String[] args) {

        final int number = 6;
        System.out.println(factorial(number));
    }

    private static void print(LinkNode<String> elements) {
        // 1. Initialize a new variable; currentNode, to the node at the top of the list
        LinkNode<String> currentNode = elements;
        // 2. while (currentNode is not null; that is we are not at the end of the list)
        while(currentNode != null) {
            // a. Print the value of currentNode
            System.out.println(currentNode.getValue());

            // Set currentNode to point to its next node
            currentNode = currentNode.getNext();
        }
    }

    private static LinkNode<String> find(String name, LinkNode<String> names) {
        LinkNode<String> current = names;
        while(current != null) {
            if(current.getValue().equalsIgnoreCase(name)) {
                return current;
            }
            current = current.getNext();
        }

        return null;
    }

    static int factorial(int number) {
        int result = 1;
        while(number > 0) {
            result *= number;
            number--;
        }

        return result;
    }
}