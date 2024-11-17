package A17.Maps;

import A17.Tiles.Tile;

import java.util.ArrayList;
import java.util.List;

public interface Map {


    public Tile createTile(String type);

    public String[] getTypes();



}
