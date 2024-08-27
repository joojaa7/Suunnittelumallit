package A01;

import A01.Tiles.BuildingTile;
import A01.Tiles.ForestTile;
import A01.Tiles.RoadTile;

import java.util.Random;

public class CityMap extends Map{

    Random random = new Random();

    @Override
    public Tile createTile() {
        int index = random.nextInt(3);
        return switch (index) {
            case 0 -> new RoadTile();
            case 1 -> new ForestTile();
            case 2 -> new BuildingTile();
            default -> null;
        };
    }
}
