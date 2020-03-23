package implementation;

/**
 * SearchResult
 */
public class SearchResult {
    private boolean isSuccessful;
    private int location;

    public SearchResult(boolean isSuccessful, int location) {
        this.isSuccessful = isSuccessful;
        this.location = location;
    }

    public boolean isSuccessful() {
        return isSuccessful;
    }

    public int location() {
        return location;
    }
}