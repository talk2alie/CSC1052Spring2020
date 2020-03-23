package application;

import implementation.LinkNode;

public class RecursionExamples {
    private static LinkNode<String> names;

    public static void main(String[] args) {
        setupNames();
        //printNamesIteratively(names);
        printNamesRecursively(names);
    }

    private static void printNamesIteratively(LinkNode<String> names) {
        while(names != null) {
            System.out.print(" " + names.getValue());
            names = names.getNext();
        }
    }

    private static void printNamesRecursively(LinkNode<String> names) {
        if(names == null) {
            return;
        }

        System.out.print(" " + names.getValue());
        printNamesRecursively(names.getNext());
    }

    private static void setupNames() {
        names = new LinkNode<>("Sheldon");
        LinkNode<String> penny = new LinkNode<>("Penny");
        names.setNext(penny);

        LinkNode<String> leonard = new LinkNode<>("Leonard");
        penny.setNext(leonard);

        LinkNode<String> howard = new LinkNode<>("Howard");
        leonard.setNext(howard);

        LinkNode<String> rajesh = new LinkNode<>("Rajesh");
        howard.setNext(rajesh);

        LinkNode<String> amy = new LinkNode<>("Amy");
        rajesh.setNext(amy);

        LinkNode<String> bernadette = new LinkNode<>("Bernadette");
        amy.setNext(bernadette);
    }
}