package A20;

import java.util.Iterator;


public class Main {

    public static void main(String[] args){

        var fib = new FibonacciSequence();
        Iterator<Integer> iterator = fib.iterator();

        for (int i = 0; i < 10; i++){
            System.out.println(iterator.next());
        }
        // FibonacciSequence manages the 'state' of the sequence.
        // Sequence is shared across multiple iterators because of this.
        // Could just move the current and previous fields to FibonacciIterator class to 'fix' it.

    }

}
