package A17.Maps;

import A17.Tiles.ForestTile;
import A17.Tiles.SwampTile;
import A17.Tiles.Tile;
import A17.Tiles.WaterTile;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WildernessMap implements Map {

    private final String[] types = {"Water", "Forest", "Swamp"};


    @Override
    public Tile createTile(String type){
        return switch (type){
            case "Swamp" -> new SwampTile();
            case "Forest" -> new ForestTile();
            case "Water" -> new WaterTile();
            default -> null;
        };
    }


    @Override
    public String[] getTypes(){
        return types;
    }
}
