package A01;

import A01.Tiles.*;

import java.util.Random;

public class WildernessMap extends Map{

    Random random = new Random();

    @Override
    public Tile createTile() {
        int index = random.nextInt(3);
        return switch (index) {
            case 0 -> new SwampTile();
            case 1 -> new ForestTile();
            case 2 -> new WaterTile();
            default -> null;
        };
    }
}
