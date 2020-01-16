import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Scanner;

import people.*;
/**
 * ClassRoom
 */
public class ClassRoom {

    public static void main(String[] args) {

        File file = new File("students.txt");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }

        Student penny = new Student("Penny", "Robinson", LocalDate.parse("2001-01-28"));
        Person judy = new Person("Judy", "Robinson", LocalDate.parse("2000-04-04"));
        Student sarah = new Student("Sarah", "Alahmadi", LocalDate.parse("1991-12-12"));
        Person john = new Student("John", "Jacobs", LocalDate.parse("2000-04-04"));

        printInfo(penny, judy, sarah, john);
        
        Roster r = new Roster();
    }

    public static void printInfo(Person... people){
        for(Person person : people) {
            System.out.println(person.toString());
        }
    }
}