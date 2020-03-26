package application;

import implementation.ArrayCollection;
import implementation.LinkNodeCollection;
import implementation.Person;

/**
 * CollectionTest
 */
public class CollectionTest {

    public static void main(String[] args) {
        LinkNodeCollection<Person> people = new LinkNodeCollection<>();

        Person erica = new Person("Erica", "Jones", "03/12/1992");
        Person edith = new Person("Edith", "Johnson", "11/13/1981");
        Person joseph = new Person("Joseph", "Dunkin", "05/13/1990");

        people.add(erica);
        people.add(edith);
        people.add(joseph);

        people.remove(edith);
        people.remove(edith);

        System.out.println("Is Edith in collection? " + people.contains(new Person("Edith", "Johnson", "11/13/1981")));
    }
}