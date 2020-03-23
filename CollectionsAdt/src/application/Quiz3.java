package application;

public class Quiz3 {

    public static void main(String[] args) {
        
        LinkNode<String> names = new LinkNode<>("Maria");

        LinkNode<String> angie = new LinkNode<>("Angie");
        names.setNext(angie);

        LinkNode<String> augustus = new LinkNode<>("Augustus");
        angie.setNext(augustus);

        LinkNode<String> nyisha = new LinkNode<>("Nyisha");
        augustus.setNext(nyisha);
    }
}

final class LinkNode<T> {
    T value;
    LinkNode<T> next;
    
    public LinkNode(T root) {
        value = root;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setNext(LinkNode<T> next) {
        this.next = next;
    }

    public LinkNode<T> getNext() {
        return next;
    }
}