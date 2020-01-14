import java.time.LocalDate;

/**
 * Student
 */
public class Student extends Person {

    private final int id;
    private String major;
    private String minor;
    private int graduationYear;

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
}