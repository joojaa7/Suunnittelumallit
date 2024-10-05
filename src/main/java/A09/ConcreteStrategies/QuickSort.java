package A09.ConcreteStrategies;

import A09.SortingStrategy;

import java.util.ArrayList;
import java.util.Collections;

public class QuickSort implements SortingStrategy {


    // Algoritmi kopioitu: https://www.geeksforgeeks.org/quick-sort-algorithm/
    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> integersToSort) {
        quickSort(integersToSort, 0, integersToSort.size() - 1);
        return integersToSort;
    }

    private void quickSort(ArrayList<Integer> arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(ArrayList<Integer> arr, int low, int high) {
        int pivot = arr.get(high);      // Valitsee arvon, johon vertaa muita arvoja.
        int i = low - 1;

        for (int j = low; j < high; j++) {  // Käy koko listan läpi.
            if (arr.get(j) <= pivot) {  // Tarkistaa onko indeksin arvo pienempi kuin arvo johon verrataan.
                i++;
                swap(arr, i, j);    // Vaihtaa indeksien arvojen paikkaa.
            }
        }

        swap(arr, i + 1, high);     // Vaihtaa verrattavan arvon paikkaa pienien arvojen viereen.

        return i + 1;   // Palauttaa pivotin indeksin.
    }

    private void swap(ArrayList<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }
}