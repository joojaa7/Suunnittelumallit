package A01;

import java.util.Random;

public class Game {

    public static void main(String[] args) {
        Map map = createMap();
        map.display();
    }

    public static Map createMap() {
        Random random = new Random();
        int coinflip = random.nextInt(2);
        if (coinflip == 0) {
            return new CityMap();
        }
        return new WildernessMap();
    }



}
