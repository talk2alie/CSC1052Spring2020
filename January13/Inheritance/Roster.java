import java.util.Hashtable;

/**
 * Represents a collection of people
 */
public class Roster {
    private int count = 0;
    private int initialCapacity = 28;
    private Hashtable<Integer, Person> people;
    
    public Roster() {
        people = new Hashtable<>(initialCapacity);
    }

    public Roster(int initialCapacity) {
        this.initialCapacity = initialCapacity;
        people = new Hashtable<>(this.initialCapacity);
    }

    public void register(Person person) {
        people.put(++count, person);
    }

    public Person find(int id) {
        return people.get(id);
    }
}