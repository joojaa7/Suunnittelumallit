package A09.ConcreteStrategies;

import A09.SortingStrategy;

import java.util.ArrayList;

public class BubbleSort implements SortingStrategy {

    // Algoritmi kopioitu:  https://www.geeksforgeeks.org/bubble-sort-algorithm/
    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> integersToSort) {
        int i, j, temp;
        int n = integersToSort.size();
        boolean swapped;

        for (i = 0; i < n - 1; i++) {
            swapped = false;    // Aina kun aloittaa uuden kierroksen swapped asetetaan oletusarvoon
            for (j = 0; j < n - i - 1; j++) {
                if (integersToSort.get(j) > integersToSort.get(j + 1)) {    // Tarkistaa onko nykyisen indeksin arvo suurempi kuin seuraavan indeksin arvo.

                    temp = integersToSort.get(j);
                    integersToSort.set(j, integersToSort.get(j + 1));   // Vaihtaa seuraavan indeksin paikan nykyisen indeksin paikalle.
                    integersToSort.set(j + 1, temp);    // Siirtää nykyisen indeksin yhdellä eteenpäin
                    swapped = true;
                }
            }

            if (!swapped) { // Jos indeksin paikkaa ei vaihdettu, tiedetään että seuraava indeksin arvo on isompi ja aloitetaan alusta.
                break;
            }
        }
        return integersToSort;
    }
}
