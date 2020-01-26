import java.time.LocalDate;

/**
 * MemoryLocations
 */
public class MemoryLocations {

    public static void main(String[] args) {

        // int number = 50;
        // increase(number);
        // System.out.println(number);

        // Person person = new Person("Yetunde", "Oketona", LocalDate.parse("2005-07-04"));
        // changeFirstName(person);
        // System.out.println(person.getFirstName());

        // int age = 24;
        // int newAge = age;
        // newAge = 50;
        // System.out.println("Original Age: " + age);
        // System.out.println("New Age: " + newAge);

        // Person person = new Person("Luke", "Skywalker", LocalDate.parse("1972-12-12"));
        // Person newPerson = person;
        // newPerson.setFirstName("Jedi Master");
        // System.out.println("Original First Name: " + person.getFirstName());
        // System.out.println("New First Name: " + newPerson.getFirstName());

        // int number = 22;
        // int crates = 22;
        // System.out.println("Number is equal +o Crates: " + (number == crates));
        // Person person = new Person("Luke", "Skywalker", LocalDate.parse("1972-12-12"));
        // Person person1 = person;
        // System.out.println("Person is equal to Person1: " + (person == person1));

        int[] ages = new int[]{11, 10, 5, 9, 6};
        int[] newAges = new int[]{11, 10, 5, 9, 6};
        System.out.println("Ages is equal to newAges: " + (ages == newAges));
    }
    
    private static void increase(int number) {
        number = number + 100;
    }

    private static void changeFirstName(Person person) {
        person.setFirstName("New First Name");
    }

    private static void AssigningOneVariableToAnother() {
        // 1. We initialize a new int varibale, age, to 24
        int age = 24;

        // 2. We initialize a new int variable, newAge, with
        //    the value of the previous int variable, age
        int newAge = age;

        // 3. Now we update the newAge variable's value to 50
        newAge = 50;

        // 4. When I print the value of age, what do you expect to see?
        System.out.println("Original Age: " + age);

        // 5. When I print the value of newAge, what do you expect to see?
        System.out.println("New Age: " + newAge);
        
    }


    private static void AssigningOneVariableToAnother2() {

        // 1. We initialize a new Person variable, luke, to a Person object
        Person luke = new Person("Luke", "Skywalker", LocalDate.parse("1990-12-12"));

        // 2. We initialize a new Person variable, newLuke, with the value
        //    of the previous Person variable, luke
        Person newLuke = luke;

        // 3. Now we update the newLuke variable's firstName property to "Jedi Master"
        newLuke.setFirstName("Jedi Master");

        // 4. When I print the value of the luke variable's firstName property,
        //    what do you expect to see?
        System.out.println("Original First Name: " + luke.getFirstName());

        // 5. When I print the value of the newLuke variable's firstName property,
        //    what do you expect to see?
        System.out.println("New First Name: " + newLuke.getFirstName());
    }
}