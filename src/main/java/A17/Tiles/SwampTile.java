package A17.Tiles;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class SwampTile implements Tile {

    private boolean traversed = false;

    @Override
    public char getCharacter() {
        return 'S';
    }

    @Override
    public String getType() {
        return "Swamp";
    }

    @Override
    public Rectangle getTileRender(int tileSize){
        Rectangle tile = new Rectangle(tileSize, tileSize);
        tile.setFill(Color.DARKCYAN);
        return tile;
    }

    public boolean isTraversed() {
        return traversed;
    }

    public void setTraversed(boolean traversed) {
        this.traversed = traversed;
    }
}
