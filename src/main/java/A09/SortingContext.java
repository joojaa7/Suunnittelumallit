package A09;

import java.util.ArrayList;

public class SortingContext {

    private SortingStrategy sortingStrategy;

    public SortingContext (SortingStrategy sortingStrategy){
        this.sortingStrategy = sortingStrategy;
    }

    public void setSortingStrategy(SortingStrategy sortingStrategy){
        this.sortingStrategy = sortingStrategy;
    }

    public ArrayList<Integer> sort(ArrayList<Integer> integersToSort){
        return sortingStrategy.sort(integersToSort);
    }

}
