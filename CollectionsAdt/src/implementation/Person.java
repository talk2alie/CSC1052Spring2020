package implementation;

public class Person {
    private String firstName;
    private String lastName;
    private String birthDate;

    public Person(String firstName, String lastName, String birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object other) {
        if(other == null) {
            return false;
        }

        Person otherPerson = (Person) other;
        return otherPerson.firstName.equals(firstName) &&
               otherPerson.lastName.equals(lastName) &&
               otherPerson.birthDate.equals(birthDate);
    }
}