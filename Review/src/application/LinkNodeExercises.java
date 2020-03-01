package application;

import implementation.LinkNode;

public class LinkNodeExercises {

    static LinkNode<String> roster;

    public static void main(String[] args) {
        setupRoster();
        update("Jiahua", "Kevin");
        print();
    }

    static void add(String studentName) {
        LinkNode<String> student = new LinkNode<>(studentName);
        LinkNode<String> navigation = roster;
        while(navigation.getNext() != null) {
            navigation = navigation.getNext();
        }

        navigation.setNext(student);
    }

    static void update(String oldName, String newName) {
        LinkNode<String> navigation = roster;
        while(!navigation.getValue().equalsIgnoreCase(oldName)) {
            navigation = navigation.getNext();
        }

        navigation.setValue(newName);
    }

    static void remove(String studentName) {

    }

    static LinkNode<String> get(String studentName) {
        return null;
    }

    static void insertAfter(String studentName, String newStudentName) {

    }

    static void print() {
        LinkNode<String> elements = roster;
        while(elements != null) {
            System.out.println(elements.getValue());
            elements = elements.getNext();
        }
    }

    static void insertBefore(String studentName, String newStudentName) {

    }

    static void setupRoster() {
        roster = new LinkNode<>("Malik");
        LinkNode<String> jiahua = new LinkNode<>("Jiahua");
        roster.setNext(jiahua);

        LinkNode<String> joseph = new LinkNode<>("Joseph");
        jiahua.setNext(joseph);
    }

}