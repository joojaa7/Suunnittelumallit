package A17.Tiles;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class WaterTile implements Tile {

    private boolean traversed = false;

    @Override
    public char getCharacter() {
        return 'W';
    }

    @Override
    public String getType() {
        return "Water";
    }

    @Override
    public Rectangle getTileRender(int tileSize){
        Rectangle tile = new Rectangle(tileSize, tileSize);
        tile.setFill(Color.BLUE);
        return tile;
    }

    public boolean isTraversed() {
        return traversed;
    }

    public void setTraversed(boolean traversed) {
        this.traversed = traversed;
    }
}
