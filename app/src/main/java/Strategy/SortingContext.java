package Strategy;


public class SortingContext {
    private SortingStrategy strategy;

    public SortingContext(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortArray(int[] arr) {
        strategy.sort(arr);
    }
}