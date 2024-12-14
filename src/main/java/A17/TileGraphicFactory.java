package A17;

import A17.Maps.CityMap;
import A17.Maps.Map;
import A17.Maps.WildernessMap;
import A17.Tiles.*;

import java.util.HashMap;
import java.util.Random;

public class TileGraphicFactory {

    private static final HashMap<String, Tile> tileWarehouse = new HashMap<>();
    private static final Map map = new CityMap();
    private static final Random random = new Random();


    public static Tile getTileObject(){
        String type = map.getTypes()[random.nextInt(map.getTypes().length)];
        Tile tile = tileWarehouse.get(type);
        if (tile == null){
            tile = map.createTile(type);
            tileWarehouse.put(type, tile);
        }
        return tile;
    }

}
