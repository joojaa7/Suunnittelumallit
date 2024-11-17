package A17.Maps;

import A17.Tiles.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CityMap implements Map {

    private final String[] types = {"Road", "Forest", "Building"};


    @Override
    public Tile createTile(String type){
        return switch (type){
            case "Road" -> new RoadTile();
            case "Forest" -> new ForestTile();
            case "Building" -> new BuildingTile();
            default -> null;
        };
    }


    @Override
    public String[] getTypes(){
        return types;
    }

}
