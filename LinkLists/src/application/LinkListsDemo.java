package application;

import implementation.LinkNode;

/**
 * LinkListsDemo
 */
public class LinkListsDemo {

    public static void main(String[] args) {
        
        LinkNode<String> names = getNames();
        names = put("Jiahua", names);
        LinkNode<String> items = names;
        while(items != null) {
            System.out.println(items.getValue());
            items = items.getNext();
        }
        //System.out.println(names.getValue());

        // LinkNode<String> henry = find("stephen", names);
        // System.out.println(henry.getValue());
        // System.out.println(henry.getNext().getValue());

    }

    static LinkNode<String> getNames() {
        LinkNode<String> names;
        names = new LinkNode<String>("Eric");

        LinkNode<String> erica = new LinkNode<String>("Erica");
        names.setNext(erica);

        LinkNode<String> celeste = new LinkNode<String>("Celeste");
        erica.setNext(celeste);

        LinkNode<String> henry = new LinkNode<String>("Henry");
        celeste.setNext(henry);

        LinkNode<String> stephen = new LinkNode<String>("Stephen");
        henry.setNext(stephen);

        return names;
    }

    static LinkNode<String> find(String value, LinkNode<String> items) {
        LinkNode<String> names = items;

        while(names != null){
            if(names.getValue().equalsIgnoreCase(value)){
                return names;
            }
            
            names = names.getNext();
            
        }
        return null;
    }

    static void insertAfter(String value, LinkNode<String> newItem, LinkNode<String> items) {
        LinkNode<String> found =find(value,items);
        LinkNode<String> curr = found.getNext();
        found.setNext(newItem);
        newItem.setNext(curr);
    }

    static LinkNode<String> put(String newItemValue, LinkNode<String> items) {
        LinkNode<String> newLink = new LinkNode<String>(newItemValue);
        newLink.setNext(items);
        return newLink;
    }
}