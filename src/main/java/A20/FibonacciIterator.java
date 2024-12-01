package A20;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {

    private final FibonacciSequence fib;

    public FibonacciIterator(FibonacciSequence fibonacciSequence){
        this.fib = fibonacciSequence;
    }

    @Override
    public boolean hasNext() {
        return true;    // Always has next, because of infinite sequence (up to 2,1b).
    }

    @Override
    public Integer next() {
        int current = fib.getCurrent();
        int previous = fib.getPrevious();
        int next = current + previous;
        fib.setCurrent(next);
        fib.setPrevious(current);
        return next;
    }
}
