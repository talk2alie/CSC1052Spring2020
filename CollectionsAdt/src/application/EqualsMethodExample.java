package application;

import implementation.Person;

/**
 * EqualsMethodExample
 */
public class EqualsMethodExample {

    public static void main(String[] args) {
        Person person = new Person("John", "Doe", "12/15/1990");
        Person personAlias = person;

        // This will evaluate to true because both variables are aliases of each other.
        // In other workds, they are pointing to the same object and both have the same memory address
        System.out.println("Is peraon equal to personAlias? " + person.equals(personAlias));

        Person yetunde = new Person("Yetunde", "Oketona", "06/13/2006");
        Person yetundeAlias = new Person("Yetunde", "Oketona", "06/13/2006");

        // This will evaluate to false even though the two objects are referring to the same person
        // in real life. This is because the two variables; yetunde and yetundeAlias hold different 
        // references and their corresponding objects are stored in different places in memory.
        // Remember that every time the new keyword is used, a new object is created in a new location 
        // in memory
        System.out.println("Is yetunde equal to yetundeAlias? " + yetunde.equals(yetundeAlias)); 

        // // To fix this so that we and the compiler have the same understanding of equality, we have 
        // // to override the equals method so that we can tell the compiler what it means for two Person 
        // // objects to be equal

    }
}