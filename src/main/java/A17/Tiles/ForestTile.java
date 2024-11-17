package A17.Tiles;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ForestTile implements Tile {

    private boolean traversed = false;

    @Override
    public char getCharacter() {
        return 'F';
    }

    @Override
    public String getType() {
        return "Forest";
    }

    @Override
    public Rectangle getTileRender(int tileSize){
        Rectangle tile = new Rectangle(tileSize, tileSize);
        tile.setFill(Color.GREEN);
        return tile;
    }

    public boolean isTraversed() {
        return traversed;
    }

    public void setTraversed(boolean traversed) {
        this.traversed = traversed;
    }

}
