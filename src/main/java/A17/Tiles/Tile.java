package A17.Tiles;


import javafx.scene.shape.Rectangle;

public interface Tile {

    public char getCharacter();

    public String getType();

    public Rectangle getTileRender(int tileSize);

    public void setTraversed(boolean traversed);

}
