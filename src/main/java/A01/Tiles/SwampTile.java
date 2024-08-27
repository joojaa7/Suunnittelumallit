package A01.Tiles;

import A01.Tile;

public class SwampTile implements Tile {

    @Override
    public char getCharacter() {
        return 'S';
    }

    @Override
    public String getType() {
        return "Swamp";
    }
}
