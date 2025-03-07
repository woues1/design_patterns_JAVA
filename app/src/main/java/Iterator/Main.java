package Iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        FibonacciSequence fibonacciSequence = new FibonacciSequence();
        Iterator<Integer> iterator = fibonacciSequence.iterator();

        for (int i = 0; i < 10; i++) {
            if (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }
}