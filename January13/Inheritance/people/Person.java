package people; // This statement indicates the compilation unit in this file, Person, is in the package people

import java.time.LocalDate;

/**
 * Represents a person
 */
public class Person {

    // Class Fields - A field shared (static) by all objects from the class
    // While obnjects created from this class can have different 
    // values for their fields, every object created from class 
    // will have the same value for this field
    public static final int MINIMUM_AGE = 16;

    private static int count = 0;

    // Fields - These are variables that hold data 
    // for the resulting objects from this class
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    /**
     * A method that has the same name as the class
     * is called a constructor. It will be used to
     * create new objects from this class.
     * 
     * A constructor that has no parameters is called the default constructor
     */ 
    public Person() {  this(null, null, null); }

    /**
     * A method that has the same name as the class
     * is called a constructor. It will be used to
     * create new objects from this class.
     * 
     * A constructor can also have multiple parameters (the variables between 
     * the opening and closing parenthesis after the method name)
     * 
     * Each parameter, like any other variable, has a data type and a name
     */ 
    public Person(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;   
        this.birthDate = birthDate; 
        
        count++;
    }

    /**
     * This is a mutator (or transformer or setter) method. Methods of this
     * type do nothing but modify the value of a given field. In this 
     * case, the firstName field
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * This is an accessor (or observer or getter) method. Methods of this type
     * return the value of a given field, without modifying it. They observe or 
     * get the value of the field
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    // Collectively, the fields and methods of a class are called 
    // the members of the class

    // EXERCISE: Write code to implement the accessor and mutators for the 
    // other fields here

    /**
     * Besides accessors and mutators, a class can also have methods
     * that perform relevant operations for its object. This method, 
     * for example, checks whether the person represented by the current 
     * object is older by the person represented by the given object
     * @param other
     * @return
     */
    public boolean isOlderThan(Person other) {
        return birthDate.getYear() < other.birthDate.getYear();
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString()
    {
        return firstName + " " + lastName;
    }
    // EXERCISE: What are some methods that you think a person object might need?
    // Implement them here
}