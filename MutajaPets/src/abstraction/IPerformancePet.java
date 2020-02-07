package abstraction;

/**
 * Specifies the properties of performance pet
 */
public interface IPerformancePet {
    ITrick[] getTricks();
    void train();
    boolean hasTrick(ITrick trick);
    boolean ranksHigherThan(IPerformancePet other);
}