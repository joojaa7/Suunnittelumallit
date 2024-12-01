package A20;

import java.util.Iterator;

public class FibonacciSequence implements Sequence {

    private int previous = 1;
    private int current = 1;


    public int getCurrent() {
        return current;
    }

    public int getPrevious() {
        return previous;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public void setPrevious(int previous) {
        this.previous = previous;
    }

    @Override
    public Iterator<Integer> iterator(){
        return new FibonacciIterator(this);
    }
}
