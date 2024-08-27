package A01;

import java.util.ArrayList;

public abstract class Map {

    public abstract char createTile();

    public void display() {
        int size = 9;
        ArrayList<Character> tiles = new ArrayList<>();
        for (int i = 0; i < size * size; i++) {
            tiles.add(createTile());
        }
        for (int j = 0; j < size; j++) {
            for (int k = 0; k < size; k++) {
                System.out.print(tiles.get(j * size + k));
            }
            System.out.println();
        }
    }

}
