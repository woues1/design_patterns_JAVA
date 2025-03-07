package Iterator;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    private int previous = 0;
    private int current = 1;

    @Override
    public boolean hasNext() {
        return true; // Infinite sequence
    }

    @Override
    public Integer next() {
        int nextValue = previous + current;
        previous = current;
        current = nextValue;
        return previous;
    }
}