package A09.ConcreteStrategies;

import A09.SortingStrategy;

import java.util.ArrayList;

public class SelectionSort implements SortingStrategy {

    // Algoritmi kopioitu: https://www.geeksforgeeks.org/selection-sort-algorithm-2/
    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> integersToSort){
        int n = integersToSort.size();

        for (int i = 0; i < n - 1; i++){

            int min = i;    // Pienimmän arvon oletettu indeksi

            for (int j = i + 1; j < n; j++){
                if (integersToSort.get(j) < integersToSort.get(min)){ // Jos nykyisen indeksin arvo on pienimpi kuin pienin löydetty arvo
                    min = j;                                          // päivittää pienimmän arvon indeksiä
                }
            }

            // Jos pienempi arvo löytyi
            // vaihtaa arvojen paikkaa listassa.
            if (min != i){
                int temp = integersToSort.get(i);
                integersToSort.set(i, integersToSort.get(min));
                integersToSort.set(min, temp);
            }
        }

        return integersToSort;
    }

}
