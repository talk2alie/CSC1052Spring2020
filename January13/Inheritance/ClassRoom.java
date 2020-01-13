import java.time.LocalDate;

/**
 * ClassRoom
 */
public class ClassRoom {

    public static void main(String[] args) {
        Student penny = new Student("Penny", "Robinson", LocalDate.parse("2001-01-28"));
        Student judy = new Student("Judy", "Robinson", LocalDate.parse("2000-04-04"));

        final int numberOfStudents = 28;
        Roster roster = new Roster(numberOfStudents);
        roster.register(penny);
        roster.register(judy);

        // Polymorphism
    }
}