package abstraction;

/**
 * Specfies the logical properties of a pet
 */
public interface IPet {
    String getName();
    String getBreed();

    void makeSound();
    boolean isAsleep();
}