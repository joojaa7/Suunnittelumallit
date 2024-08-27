package A01.Tiles;

import A01.Tile;

public class ForestTile implements Tile {
    @Override
    public char getCharacter() {
        return 'F';
    }

    @Override
    public String getType() {
        return "Forest";
    }
}
