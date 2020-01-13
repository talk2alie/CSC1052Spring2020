import java.time.LocalDate;

/**
 * ClassRoom
 */
public class ClassRoom {

    public static void main(String[] args) {
        Person penny = new Person("Penny", "Robinson", LocalDate.parse("2001-01-28"));
        Person judy = new Person("Judy", "Robinson", LocalDate.parse("2000-04-04"));

        final int numberOfStudents = 28;
        Roster roster = new Roster(numberOfStudents);
        roster.register(penny);
        roster.register(judy);
    }
}