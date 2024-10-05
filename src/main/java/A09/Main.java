package A09;

import A09.ConcreteStrategies.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args){

        SortingContext sortingContext = new SortingContext(new BubbleSort());
        Random random = new Random();
        ArrayList<Integer> unsortedBubbleSmallList = new ArrayList<>();
        ArrayList<Integer> unsortedBubbleLargeList = new ArrayList<>();
        ArrayList<Integer> unsortedQuickSmallList = new ArrayList<>();
        ArrayList<Integer> unsortedQuickLargeList = new ArrayList<>();
        ArrayList<Integer> unsortedSelectionSmallList = new ArrayList<>();
        ArrayList<Integer> unsortedSelectionLargeList = new ArrayList<>();
        int small = 1000;
        int large = 100000;
        long start;
        long stop;

        for (int i = 0; i < small; i++){
            unsortedBubbleSmallList.add(random.nextInt(1000));
        }

        for (int i = 0; i < large; i++){
            unsortedBubbleLargeList.add(random.nextInt(10000));
        }

        for (int i = 0; i < small; i++){
            unsortedQuickSmallList.add(random.nextInt(1000));
        }

        for (int i = 0; i < large; i++){
            unsortedQuickLargeList.add(random.nextInt(10000));
        }

        for (int i = 0; i < small; i++){
            unsortedSelectionSmallList.add(random.nextInt(1000));
        }

        for (int i = 0; i < large; i++){
            unsortedSelectionLargeList.add(random.nextInt(10000));
        }

        start = System.currentTimeMillis();
        sortingContext.sort(unsortedBubbleSmallList);
        stop = System.currentTimeMillis();
        System.out.println("Small bubblesort time: " + ((stop - start)) + " milliseconds.");

        start = System.currentTimeMillis();
        sortingContext.sort(unsortedBubbleLargeList);
        stop = System.currentTimeMillis();
        System.out.println("Large bubblesort time: " + ((stop - start) / 1000 ) + " seconds.");

        sortingContext.setSortingStrategy(new QuickSort());

        start = System.currentTimeMillis();
        sortingContext.sort(unsortedQuickSmallList);
        stop = System.currentTimeMillis();
        System.out.println("Small quicksort time: " + ((stop - start)) + " milliseconds.");

        start = System.currentTimeMillis();
        sortingContext.sort(unsortedQuickLargeList);
        stop = System.currentTimeMillis();
        System.out.println("Large quicksort time: " + ((stop - start)) + " seconds.");

        sortingContext.setSortingStrategy(new SelectionSort());

        start = System.currentTimeMillis();
        sortingContext.sort(unsortedSelectionSmallList);
        stop = System.currentTimeMillis();
        System.out.println("Small selectionsort time: " + ((stop - start)) + " milliseconds.");

        start = System.currentTimeMillis();
        sortingContext.sort(unsortedSelectionLargeList);
        stop = System.currentTimeMillis();
        System.out.println("Large selectionsort time: " + ((stop - start) / 1000 ) + " seconds.");



    }

}
