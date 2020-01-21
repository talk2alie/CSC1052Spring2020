import java.time.LocalDate;

/**
 * MemoryLocations
 */
public class MemoryLocations {

    public static void main(String[] args) {


        Person zack;
        Person cody = new Person("Cole", "Sprouse", LocalDate.parse("1992-08-04"));

        System.out.println(zack);
        System.out.println(cody);

        String firstName = "Jiahua";
        String lastname = "He";
        byte age = 19;

        System.out.println("The following is " + firstName + "'s profile:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastname);
        System.out.println("Age: " + age);

    }
}