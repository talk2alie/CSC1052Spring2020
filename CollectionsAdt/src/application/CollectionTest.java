package application;

import implementation.ArrayCollection;
import implementation.Person;

/**
 * CollectionTest
 */
public class CollectionTest {

    public static void main(String[] args) {
        ArrayCollection<Person> people = new ArrayCollection<>();

        Person erica = new Person("Erica", "Jones", "03/12/1992");
        Person edith = new Person("Edith", "Johnson", "11/13/1981");
        Person joseph = new Person("Joseph", "Dunkin", "05/13/1990");

        people.add(erica);
        people.add(edith);
        people.add(joseph);

        System.out.println("Is Erica in collection? " + people.contains(new Person("Erica", "Jones", "03/12/1992")));
    }
}