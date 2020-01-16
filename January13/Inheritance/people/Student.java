package people;

import java.time.LocalDate;

public class Student extends Person {

    private final int id;

    public Student() {
        super();
        id = getCount();
    }

    public Student(String firstName, String lastName, LocalDate birthDate) {
        super(firstName, lastName, birthDate);
        id = getCount();
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return getFirstName() + " " + id;
    }
}

