package A01;

import java.util.Random;

public class CityMap extends Map{

    char[] tiles = {'R', 'F', 'B'};
    Random random = new Random();

    @Override
    public char createTile() {
        int index = random.nextInt(3);
        return tiles[index];
    }
}
