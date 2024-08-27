package A01;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map map = createMap();
        System.out.println("Enter the size of the map: ");
        int size = sc.nextInt();
        map.display(size);
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
