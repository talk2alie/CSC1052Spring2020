import java.util.Hashtable;

/**
 * Represents a collection of people
 */
public class Roster {
    private int initialCapacity = 28;
    private Hashtable<Integer, Student> people;
    
    public Roster() {
        people = new Hashtable<>(initialCapacity);
    }

    public Roster(int initialCapacity) {
        this.initialCapacity = initialCapacity;
        people = new Hashtable<>(this.initialCapacity);
    }

    public void register(Student student) {
        // Exercise: Make this method polymorphic

        people.put(student.getId(), student);
    }

    public Student find(int id) {
        return people.get(id);
    }
}