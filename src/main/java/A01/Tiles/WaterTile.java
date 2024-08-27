package A01.Tiles;

import A01.Tile;

public class WaterTile implements Tile {
    @Override
    public char getCharacter() {
        return 'W';
    }

    @Override
    public String getType() {
        return "Water";
    }
}
