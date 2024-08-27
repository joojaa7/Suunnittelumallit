package A01;

import java.util.Random;

public class WildernessMap extends Map{

    char[] tiles = {'S', 'W', 'F'};
    Random random = new Random();

    @Override
    public char createTile() {
        int index = random.nextInt(3);
        return tiles[index];
    }
}
