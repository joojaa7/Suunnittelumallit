package A04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherStation extends Thread{

    private final List<Observer> observers = new ArrayList<>();
    private final Random random = new Random();
    private int temp;

    public WeatherStation() {
        this.temp = random.nextInt(-20, 21);
    }

    public void addObserver(WeatherObserver ob) {
        observers.add(ob);
    }

    public void removeObserver(WeatherObserver ob) {
        System.out.println("Observer " + ob.getName() + " removed.");
        observers.remove(ob);
    }

    public void run() {
        try {
            while (true) {
                Thread.sleep(random.nextInt(1000, 5001));
                temp += random.nextInt(-1, 2);
                if (temp <= -50) {
                    temp = -50;
                }
                if (temp >= 50) {
                    temp = 50;
                }
                notifyStatus();
            }
        } catch (InterruptedException ignored) {
        }
    }

    public void notifyStatus(){
        for (Observer ob : observers) {
            ob.update(temp);
        }
    }



}
