final class LinkNode<T> {
    private T value;
    private LinkNode<T> next;

    public LinkNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public LinkNode<T> getNext() {
        return next;
    }

    public void setNext(LinkNode<T> next) {
        this.next = next;
    }
}

public class Quiz2Problem1 {
    private static LinkNode<Integer> numbers;

    public static void main(String[] args) {
        // If your solution is correct, each of these assertions must be true
        setupNumbers();
        System.out.println("print() should print: 0 1 4 5 6 9");
        print();

        System.out.println("After inserting 2, print() should print: 0 1 2 4 5 6 9");
        insertSort(2);
        print(); 

        System.out.println("After inserting 3, print() should print: 0 1 2 3 4 5 6 9");
        insertSort(3);
        print();

        System.out.println("After inserting 7, print() should print: 0 1 2 3 4 5 6 7 9");
        insertSort(7);
        print();
        
        System.out.println("After inserting -5, print() should print: -5 -1 0 1 2 3 4 5 6 7 8 9 10");
        insertSort(-5);
        print();

        System.out.println("After inserting 8, print() should print: 0 1 2 3 4 5 6 7 8 9");
        insertSort(8);
        print();

        System.out.println("After inserting 10, print() should print: 0 1 2 3 4 5 6 7 8 9 10");
        insertSort(10);
        print();

        System.out.println("After inserting -1, print() should print: -1 0 1 2 3 4 5 6 7 8 9 10");
        insertSort(-1);
        print();
    }   

    private static void setupNumbers() {
        numbers = new LinkNode<>(0);
        
        LinkNode<Integer> one = new LinkNode<>(1);
        numbers.setNext(one);

        LinkNode<Integer> four = new LinkNode<>(4);
        one.setNext(four);

        LinkNode<Integer> five = new LinkNode<>(5);
        four.setNext(five);

        LinkNode<Integer> six = new LinkNode<>(6);
        five.setNext(six);

        LinkNode<Integer> nine = new LinkNode<>(9);
        six.setNext(nine);
    }

    private static void print() {
        LinkNode<Integer> head = numbers;
        while(head != null) {
            System.out.print(head.getValue() + " ");
            head = head.getNext();
        }

        System.out.println();
        System.out.println();
    }

    /**
     * Question:
     * Write code for the method body that will INSERT the given number in the numbers 
     * list declared on line 27 so that after the insertion the numbers list remains 
     * sorted in ascending (from small to large) order.
     * 
     * NOTE: The numbers list, after line 30, currently has the values: 0 1 4 5 6 9
     * NOTE: The values are sorted in ascending (from small to large) order
     * 
     * REMEMBER: Make sure that the numbers variable is always pointing to the 
     *           root node, especially if the given number is less than the number 
     *           at the root of the node. Otherwise, the print() method will not work
     *           correctly. You might lose points if you missed that
     * 
     * WARNING: Do not change anything about the insertSort method header. 
     *          YOU WILL GET 0 IF YOU DID!
     * @param number The new number to add to the list
     */
    public static void insertSort(int value) {
        LinkNode<Integer> number = new LinkNode<>(value);
        if(numbers == null) {
            numbers = number;
            return;
        }

        if(number.getValue() < numbers.getValue()) {
            number.setNext(numbers);
            numbers = number;
            return;
        }
        
        LinkNode<Integer> temp = numbers;
        while(temp.getNext() != null && temp.getNext().getValue() < number.getValue()) {
            temp = temp.getNext();
        }

        LinkNode<Integer> next = temp.getNext();
        temp.setNext(number);
        number.setNext(next);
    }
}