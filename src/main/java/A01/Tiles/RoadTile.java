package A01.Tiles;

import A01.Tile;

public class RoadTile implements Tile {
    @Override
    public char getCharacter() {
        return 'R';
    }

    @Override
    public String getType() {
        return "Road";
    }
}
