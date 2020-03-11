public class LinkNode<T> {
    protected T value;
    protected LinkNode<T> next;
    
    public LinkNode(T value) {
        this.value = value;
    }

    public void setNext(LinkNode<T> next) {
        this.next = next;
    }

    public LinkNode<T> getNext() {
        return next;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}